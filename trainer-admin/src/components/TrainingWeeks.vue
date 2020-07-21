<template>
    <div class="wrapper">
        <div v-for="(trainingWeek, i) in trainingWeeks" 
            :key="trainingWeek.id"
             class="week">
            <trainingWeek  :trainingWeek="trainingWeek"
                            :index="i"
                            @removeWeek="removeWeek" />
        </div>
        <div class="addWeek">
            <button @click="addWeek">
                Добавить неделю</button>
        </div>
    </div>
</template>
  
  <script>
  import trainingWeek from '../components/TrainingWeek.vue'
  
  export default {
    name: 'trainingWeeks',
    components: {
      trainingWeek
    },
    props: ["trainingWeeks", "client"],
    methods:{
        addWeek: function(){
            const addWeekDefault = {
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
                        };
            addWeekDefault.id = Date.now();
            this.trainingWeeks.push(addWeekDefault);
        },
        removeWeek: function(id){
            this.trainingWeeks = this.trainingWeeks.filter(td => td.id !== id);
        }

    }
  }
  </script>

  <style scoped>
    .wrapper{
        width: 100%;
        display: flex;
        flex-direction: column;
        align-items: center;
    }
    .week{
        width: 90%;
        box-shadow: 0 2px 4px 0 rgba(0, 0, 0, 0.3);
        background-color: #fafafa;
        margin: 10px;
        margin-bottom: 40px;
        padding-bottom: 5px;
    }
    .addWeek button{
        width: 250px;
        display: flex;
        align-items: center;
        justify-content: center;
        padding: 10px 20px;
        border-radius: 7px;
        border: 2px solid rgb(240, 218, 138);
        background-color: rgb(243, 230, 180);
        margin: 5px auto;
        cursor: pointer;
    }
  </style>