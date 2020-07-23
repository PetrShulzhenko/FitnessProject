<template ref="NewProgram">
    <div>
        <header >
            <div class="header">
                <router-link tag="button" class="button-back" to="/">
                    <img src="../images/back-test.png" width="50px">
                </router-link>
                <h1>Составить программу для {{client.name}}</h1>
            </div>
        </header>
        <main>
            <trainingWeeks :trainingWeeks="trainingWeeks"
                            v-if="client.isTrainingPlan" />
            <div class="profile">
                <profile :class="{'dietProfile': !client.isTrainingPlan}"
                    :client="client" :wrapper1="false" :wrapper2="true" :key="client.id" class="profile"/>
            </div>
        </main>   

        <diet :client="client"
              :diet="dietPlan" 
              class="diet" 
              v-if="client.isDietPlan"/>

        <button class="sendClient" @click="completeProgram"> <span>Отправить клиенту </span> </button>

        <div class="comment">
            <p>Комментарий к программе:</p>        
            <textarea type="text" v-model="comment" class="comment-input">   </textarea>
        </div>  
    </div>
</template>
  
<script>
  import profile from '../components/Profile.vue'
  import trainingWeeks from '../components/TrainingWeeks.vue'
  import diet from '../components/Diet.vue'

  export default {
    name: 'NewProgram',
    components: {
      profile,
      trainingWeeks,
      diet
    },
    props:["client"],
    data(){
        return{
            isCompleted: false,
            comment: '',
            dietPlan:{
                protein: '',
                fat: '',
                carbohydrates: '',
                breakfast: {
                    p: '',
                    c: '',
                    f: ''
                }, 
                lunch1: {
                    p: '',
                    c: '',
                    f: ''
                },
                lunch2: {
                    p: '',
                    c: '',
                    f: ''
                },
                snacks: {
                    p: '',
                    c: '',
                    f: ''
                },
                dinner: {
                    p: '',
                    c: '',
                    f: ''
                }
            },
            trainingWeeks: [
                {
                    id: 1,
                    trainingDays: [
                        {   
                            id: 1,
                            name: '',
                            exercises: [
                                {
                                    id: 1,
                                    name: '',
                                    reps: '',
                                    PDO: '',
                                    comment: '',
                                    rest: '',
                                    linkYouTube: ''
                                }
                            ]
                        },
                        {   
                            id: 2,
                            name: '',
                            exercises: [
                                {
                                    id: 1,
                                    name: '',
                                    reps: '',
                                    PDO: '',
                                    comment: '',
                                    rest: '',
                                    linkYouTube: ''
                                }
                            ]
                        },
                        {
                            id: 3,
                            name: '',
                            exercises: [
                                {
                                    id: 1,
                                    name: '',
                                    reps: '',
                                    PDO: '',
                                    comment: '',
                                    rest: '',
                                    linkYouTube: ''
                                }
                            ]
                        },
                        {
                            id: 4,
                            name: '',
                            exercises: [
                                {
                                    id: 1,
                                    name: '',
                                    reps: '',
                                    PDO: '',
                                    comment: '',
                                    rest: '',
                                    linkYouTube: ''
                                }
                            ]
                        },
                        {
                            id: 5,
                            name: '',
                            exercises: [
                                {
                                    id: 1,
                                    name: '',
                                    reps: '',
                                    PDO: '',
                                    comment: '',
                                    rest: '',
                                    linkYouTube: ''
                                }
                            ]
                        },
                        {
                            id: 6,
                            name: '',
                            exercises: [
                                {   
                                    id: 1,
                                    name: '',
                                    reps: '',
                                    PDO: '',
                                    comment: '',
                                    rest: '',
                                    linkYouTube: ''
                                }
                            ]
                        },
                        {
                            id: 7,
                            name: '',
                            exercises: [
                                {   
                                    id: 1,
                                    name: '',
                                    reps: '',
                                    PDO: '',
                                    comment: '',
                                    rest: '',
                                    linkYouTube: ''
                                }
                            ]
                        }

                    ]
                }
            ]
        }
    },
    beforeRouteLeave (to, from, next) {
        this.prepareToLeave();
        next();
    },
   /* beforeRouteEnter( to, from, next){
        axios.get('!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!')
        .then( res => {
            this.comment = res.comment;
            this.trainingWeeks = res.trainingWeeks;
        })
        .catch(err => console.log(err));
        next();
    }, */
    methods:{
        completeProgram: function(){
            console.log('test');
        } ,
      /*
        completeProgram: function(){
            this.isCompleted = true;
            axios
                .put('!!!!!!!!!!!', {
                    isCompleted: this.isCompleted,
                    comment: this.comment,
                    trainingWeeks: this.trainingWeeks
                })
                .then(res => console.log(res))
                .catch(err => console.log(err));
        },
        saveData: function(){
            axios
                .put('!!!!!!!!!!!', {
                    comment: this.comment,
                    trainingWeeks: this.trainingWeeks
                })
                .then(res => console.log(res))
                .catch(err => console.log(err));
            }  */
    
        prepareToLeave: function(){
            //saveData();
            const defaultTrainingWeeks = [
                {
                    id: 1,
                    trainingDays: [
                        {
                            id: 1,
                            name: '',
                            restDay: false,
                            exercises: [
                                {
                                    id: 1,
                                    name: '',
                                    reps: '',
                                    PDO: '',
                                    comment: '',
                                    rest: '',
                                    linkYouTube: ''
                                }
                            ]
                        },
                        {
                            id: 2,
                            name: '',
                            restDay: false,
                            exercises: [
                                {
                                    id: 1,
                                    name: '',
                                    reps: '',
                                    PDO: '',
                                    comment: '',
                                    rest: '',
                                    linkYouTube: ''
                                }
                            ]
                        },
                        {
                            id: 3,
                            name: '',
                            restDay: false,
                            exercises: [
                                {
                                    id: 1,
                                    name: '',
                                    reps: '',
                                    PDO: '',
                                    comment: '',
                                    rest: '',
                                    linkYouTube: ''
                                }
                            ]
                        },
                        {
                            id: 4,
                            name: '',
                            restDay: false,
                            exercises: [
                                {
                                    id: 1,
                                    name: '',
                                    reps: '',
                                    PDO: '',
                                    comment: '',
                                    rest: '',
                                    linkYouTube: ''
                                }
                            ]
                        },
                        {
                            id: 5,
                            name: '',
                            restDay: false,
                            exercises: [
                                {
                                    id: 1,
                                    name: '',
                                    reps: '',
                                    PDO: '',
                                    comment: '',
                                    rest: '',
                                    linkYouTube: ''
                                }
                            ]
                        },
                        {
                            id: 6,
                            name: '',
                            restDay: false,
                            exercises: [
                                {
                                    id: 1,
                                    name: '',
                                    reps: '',
                                    PDO: '',
                                    comment: '',
                                    rest: '',
                                    linkYouTube: ''
                                }
                            ]
                        },
                        {
                            id: 7,
                            name: '',
                            restDay: false,
                            exercises: [
                                {
                                    id: 1,
                                    name: '',
                                    reps: '',
                                    PDO: '',
                                    comment: '',
                                    rest: '',
                                    linkYouTube: ''
                                }
                            ]
                        }

                    ]
                }
            ] ;
            this.trainingWeeks = defaultTrainingWeeks;
        }
    }
}
</script>

<style scoped>
     @import url('https://fonts.googleapis.com/css2?family=Montserrat&display=swap');
    .header{
        display: flex;
    }
    .header h1{
        font-family: 'Montserrat', sans-serif;
        font-weight: 400;
    }
    .button-back{
        margin: 10px 15px 10px 15px;
        background-color: #fafafa;
        border: 0;
        cursor: pointer;
    }
    main{
        display: flex;
    }
    .profile{
        margin-right: 10px;
    }
    .dietProfile{
        margin-left: 90vw;
    }
    .sendClient{
        position: fixed;
        top: 40vh;
        left: 89vw;
        display: flex;
        align-items: center;
        justify-content: center;
        padding: 10px 50px;
        border-radius: 7px;
        border: 0;
        background-color: #3d5af1;
        width: 150px;
        color: white;
        font-size: 20px;
        cursor: pointer;
    }
    .sendClient:hover{
        transform: scale(1);
        background-color: #2044f5;
    }
    .comment{
        width: 90%;
        font-size: 25px;
        display: flex;
        justify-content: center;
        flex-direction: row;
        margin-bottom: 150px;
            }
    .comment p{
        margin-right: 30px;
    }
    .comment-input{
        border-bottom: 3px solid rgb(238, 222, 166);
        border-right: 1px solid rgb(238, 227, 189);
        border-top: 1px solid rgb(238, 227, 189);
        border-left: 1px solid rgb(238, 227, 189);  
        width: 500px;
        min-height: 100px;  
    }
    .comment-input:focus{
        outline: none;
        box-shadow: none;
        border-bottom: 5px solid rgb(241, 214, 116);
    }
</style>