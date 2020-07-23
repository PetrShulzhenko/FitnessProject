<template>
    <div :class="{'dynamic-rest-day': trainingDay.restDay,
                    'day-wrapper': !trainingDay.restDay}">
        <div class="header">
            <span class="number">День {{index +1}}</span> 
            <input v-model="trainingDay.name" type="text" placeholder="Название дня" class="day-name" >

            <button 
                    @click="restDay"
                    class="rest-day">
                        <span v-show="!trainingDay.restDay">День отдыха</span>
                        <span v-show="trainingDay.restDay">Не день отдыха</span>
            </button>
            <button 
                    class="delete"
                    @click="remove"> Удалить день </button>
        </div>
        <div>
            <exercises :exercises="trainingDay.exercises"
                        class="exercises"  />
        
        </div>
    </div>
</template>
  
  <script>
  import exercises from '../components/Exercises.vue'
  
  export default { 
    name: 'trainingDay',
    components: {
      exercises
    },
    props: ["trainingDay", "index"],
    methods:{
        restDay: function(){
            this.trainingDay.restDay = !this.trainingDay.restDay;
            if( this.trainingDay.restDay){
                this.trainingDay.name = 'Отдых';
                this.trainingDay.exercises = [];
            }
            else{
                this.trainingDay.name = '';
            }
        },
        remove: function(){
            this.$emit('removeDay', this.trainingDay.id);
        }
    }
  }
  </script>

<style scoped>
    .day-wrapper{
        box-shadow: 0 1px 4px 0 rgba(0, 0, 0, 0.3);
        background-color: #fdfdfd;
        margin: 10px;
        margin-bottom: 20px;
        padding: 5px;
    }
    .dynamic-rest-day{
        box-shadow: 0 1px 4px 0 rgba(0, 0, 0, 0.3);
        background-image: radial-gradient(rgb(181, 231, 88),rgb(224, 245, 182));
        border-radius: 10px;
        padding: 0;
        margin: 10px;
        margin-bottom: 20px;
    }
    .exercises{
        margin: 10px;
    }
    .header{
        display: flex;
        align-items: center;
        margin: 10px;
    }
    .day-name{
        width: 150px;
        margin: 5px 5px 3px 5px;
    }
    .number{
        margin-left: 5px;
    }
    .rest-day{
        display: flex;
        align-items: center;
        justify-content: center;
        padding: 5px 10px;
        border-radius: 5px;
        cursor: pointer;
        background-color: yellowgreen;
        border: 0;
        margin-left: auto;
        margin-right: 35px;
    }
    .delete{
        display: flex;
        align-items: center;
        justify-content: center;
        padding: 5px 10px;
        border-radius: 5px;
        cursor: pointer;
        background-color: rgb(252, 62, 62);
        border: 0;
        
    }
</style>