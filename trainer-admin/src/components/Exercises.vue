<template>
    <div>
        <div v-for="(exercise, i) in exercises"
                 
                :key="exercise.id">

            <exercise :exercise="exercise" 
                      :index="i"
            @removeExercise="removeExercise"/>

        </div>

        <div class="addExercise">
            <button @click="addExercise"
                >Добавить упражнение</button>
        </div>
    </div>
</template>
  
  <script>
  import exercise from '../components/Exercise.vue'
  
  export default {
    name: 'exercises',
    components: {
        exercise
    },
    props: ["exercises"],
    data(){
        return{
            id : Date.now()
        }
    },
    methods: {
        addExercise: function(){
            const addExerciseDefault = {
                                    id: 1,
                                    name: '',
                                    reps: '',
                                    PDO: '',
                                    comment: '',
                                    rest: '',
                                    linkYouTube: ''  
            };
            addExerciseDefault.id = Date.now();
            this.exercises.push(addExerciseDefault);
        },
        removeExercise: function(id){
            this.exercises = this.exercises.filter(ex => ex.id !== id);
        }
    }
  }
  </script>

  <style scoped>
      .addExercise button{
        width: 200px;
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