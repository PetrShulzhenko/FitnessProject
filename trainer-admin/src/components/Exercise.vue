<template>
    <div>
        <div class="exercise">
            <p>{{index + 1}}</p>
            <textarea v-model="exercise.name" type="text" placeholder="Название" ></textarea>
            <input v-model="exercise.reps" type="text" placeholder="Повторы" >
            <input v-model="exercise.PDO" type="text" placeholder="ПДО" >
            <input v-model="exercise.rest" type="text" placeholder="Отдых" >
            <textarea  v-model="exercise.comment" type="text" placeholder="Коммент" ></textarea>
            <input v-model="exercise.linkYouTube" type="text" placeholder="Ссылка" >
            <button class="delete"
                    @click="remove"> &times; </button>
        </div>
    </div>
</template>
  
  <script>
    
  export default {
    name: 'exercise',
    props: {
        exercise: Object,
        index: Number
    },
    methods: {
        remove: function(){
            this.$emit('removeExercise', this.exercise.id);
        }
    }
    }
  </script>

<style scoped>
    .exercise{
        box-shadow: 0 1px 4px 0 rgba(0, 0, 0, 0.3);
        background-color: #fafafa;
        margin: 10px;
        display: flex;
        justify-content: space-evenly;
        align-items: center;
    }
    .exercise input,textarea{
        width: 125px;
        height: 25px;
        background-color: #fdfdfd;
        border-bottom: 2px solid rgb(238, 222, 166);
        border-right: 1px solid rgb(238, 227, 189);
        border-top: 1px solid rgb(238, 227, 189);
        border-left: 1px solid rgb(238, 227, 189);
    }
    .exercise input:focus{
        outline: none;
        border-left: 5px solid rgb(241, 213, 111);
        border-top: 1px solid rgb(238, 227, 189);
        border-right: 1px solid rgb(238, 227, 189);
        box-shadow: none;
        height: 25px;
    }
    .exercise textarea:focus{
        outline: none;
        border-left: 5px solid rgb(241, 213, 111);
        border-top: 1px solid rgb(238, 227, 189);
        border-right: 1px solid rgb(238, 227, 189);
        box-shadow: none;
        height: 25px;
    }
    .delete{
        color: #000;
        font-size: 25px;
        font-weight: bold;
        cursor: pointer;
        border-radius: 30px;
        border: 0;
        background-color: rgb(252, 62, 62);
        height: 30px;
        width: 30px;
        display: flex;
        justify-content: center;
        align-items: baseline;
    }
</style>