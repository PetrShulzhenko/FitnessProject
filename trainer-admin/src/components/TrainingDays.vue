<template>
    <div>
        <div v-for="(trainingDay, i) in trainingDays" 
            :key="trainingDay.id"
            class="day">
            <trainingDay :trainingDay="trainingDay"
                         :index="i" 
                         @removeDay="removeDay"   />
        </div>
        <div class="addDay">
            <button @click="addDay">
                Добавить тренировочный день</button>
        </div>
    </div>
</template>
  
  <script>
  import trainingDay from '../components/TrainingDay.vue'
  
  export default {
    name: 'trainingDays',
    components: {
      trainingDay
    },
    props: ["trainingDays"],
    methods:{
        addDay: function(){
            const addDayDefault = {
                            id:1,
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
                        };
            addDayDefault.id = Date.now();
            this.trainingDays.push(addDayDefault);

        },
        removeDay: function(id){
            this.trainingDays = this.trainingDays.filter(td => td.id !== id);
        }

    }
  }
  </script>

<style scoped>
    .day{
        box-shadow: 0 1px 4px 0 rgba(0, 0, 0, 0.3);
        background-color: #fdfdfd;
        margin: 10px;
        margin-bottom: 20px;
        padding: 5px;
    }
    .addDay button{
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