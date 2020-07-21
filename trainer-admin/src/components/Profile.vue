<template>
    <div>
        <button class="details-button" v-on:click="details" >
            <p>Анкета</p>            
        </button>

        <div :class="{'wrapper1': wrapper1,
                      'wrapper2': wrapper2}">
                <div class="modal" v-bind:class="{'is-shown-details': detailsStatus}">
                    <span class="close" title="Close Modal"
                    v-on:click="details" >&times;</span>
                            
                    <p class="name">{{client.name}}</p>
                    <p class="type">{{client.programType}}</p>
                    <p>Рост: {{client.profile.height}}</p>
                    <p>Вес: {{client.profile.weight}}</p>
                    <p>Возраст: {{client.profile.age}}</p>
                    <p>Тренировочный стаж: {{client.profile.trainingExperience}}</p>
                    <p>Предыдущая программа: {{client.profile.previousProgram}}</p>
                    <p>Состояние здоровья/Противопоказания: {{client.profile.health}}</p>
                    <p>Целевая мышечная группа: {{client.profile.muscleTarget}}</p>
                    <p>Цель питания: {{client.profile.dietTarget}}</p>
                    <p>Специализированная программа: {{client.profile.specialProgram}}</p>
                    <p>Фото: {{client.profile.photo}}</p>
                    <p>Спортзал: <a :href="client.profile.equipment">Сайт спортзала</a></p>
                    <p>Повседневная активность: {{client.profile.activityLevel}}</p>
                   
                </div>
        </div>
        
    
    </div>
</template>
  
<script>
  
  
  export default {
    name: "profile",
    props: {
        client: Object,
        wrapper1: {
            type: Boolean,
            default: true
        },
        wrapper2: {
            type:Boolean,
            default: true
        }

    },
    data(){
            return{
                detailsStatus: true
            }
        },
    methods: {
            details: function(){
                this.detailsStatus = !this.detailsStatus;
            }       
        }
  }
</script>

<style scoped>
    .name{
        display: flex;
        justify-self: start;
        margin: 10px 0 0 25px;
        font-size: 25px;
    }
    .type{
        display: flex;
        justify-self: start;
        margin: 5px 0 0 25px;
        font-size: 15px;
    }
    button{
        border: 0;
        cursor: pointer;
    }
    button:hover{
       transform: scale(1.1);
    }
    .details-button{
        width: 60px;
        display: flex;
        align-items: center;
        justify-content: center;
        padding: 10px 50px;
        border-radius: 7px;
        border: 2px solid rgb(240, 218, 138);;
        background-color: #fafafa;
    }
    .details-button p{
        margin: 0;
        padding: 0;
        font-size: 15px;
    }
    
    /* Modal details */
.is-shown-details{
        display: none;
    }
.close{
        color: #000;
        font-size: 35px;
        font-weight: bold;
        cursor: pointer;
    }
    /* for Client.vue */
.wrapper1{
    position: absolute;
    top: 0;
    left: 20vw;
}
/* for NewProgram.vue */
.wrapper2{
    position: relative;
    top: -10vh;
    left: -40vw;
}
.modal{
    position: fixed; 
    z-index: 1; 
    background-color: #fefefe;
    margin: 5px auto 5px auto; 
    border: 1px solid #c5e3f6;
    width: 50%;
    min-height: 80%;
    opacity: 0.97;
    border-radius: 5px;
    font-size: 17px;
}
.modal p{
    text-align: left;
    margin-left: 10%;
    overflow-wrap: normal;
    margin-right: 10%;
}
  .close {
  position: absolute;
  right: 25px;
  top: 0;
  color: #000;
  font-size: 35px;
  font-weight: bold;
}

.close:hover,
.close:focus {
  color: red;
  cursor: pointer;
}
button{
  border: 0;
}
/* Add Zoom Animation */
.animate {
  -webkit-animation: animatezoom 0.6s;
  animation: animatezoom 0.6s
}

@-webkit-keyframes animatezoom {
  from {-webkit-transform: scale(0)} 
  to {-webkit-transform: scale(1)}
}
  
@keyframes animatezoom {
  from {transform: scale(0)} 
  to {transform: scale(1)}
}
</style>