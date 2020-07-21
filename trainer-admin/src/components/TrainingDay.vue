<template>
    <div>
        <div class="header">
            <span class="number">День {{index +1}}</span> 
            <input v-model="trainingDay.name" type="text" placeholder="Название дня" class="day-name" >

            <button 
                    @click="restDay"
                    class="rest-day">
                        <span>День отдыха?</span>
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