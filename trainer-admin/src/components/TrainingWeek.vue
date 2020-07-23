<template>
    <div>
        <div class="header">
                <p>Неделя {{index+1}}</p>
                <button class="delete"
                        @click="remove"> 
                        &times; </button>
        </div>
        <trainingDays :trainingDays="trainingWeek.trainingDays"
                       class="days"/>
                       
    </div>
</template>
  
  <script>
  import trainingDays from '../components/TrainingDays.vue'
  
  export default {
    name: 'trainingWeek',
    components: {
      trainingDays
    },
    props: ["trainingWeek","index"],
    methods: {
        remove: function(){
            this.$emit('removeWeek', this.trainingWeek.id);
        }
    }
  }
  </script>

  <style scoped>
      .header{
          display: flex;
          align-items: center;
      }
      .header p {
        margin-left: 20px;
        font-size: 20px;
      }
      .days{
          margin: 10px;
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
        align-items: center;
        margin-left: auto;
        margin-right: 35px;
    }
  </style>