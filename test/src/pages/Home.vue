<template>
    <div class="home">
      <dateButtonHeader  class="header-button"/>

      <comment :client="client" :comment="comment"/>

      <div v-if="client.isTrainingPlan" 
          class="trainingProgram">

        <h1>Программа тренировок :</h1>
        <trainingWeeks v-bind:trainingWeeks ="trainingWeeks" 
        class="training-weeks"/>

      </div>
      <br><br>
      <dietPlan v-bind:dietPlan ="dietPlan" 
                v-if="client.isDietPlan"/>
      
    </div>
    
  </template>
  
  <script>
 import dateButtonHeader from '../components/Date-Button-Header.vue'
 import trainingWeeks from '../components/Training-Weeks.vue'
 import dietPlan from '../components/Diet-Plan.vue'
 import comment from '../components/Comment.vue'
// import axios from 'axios'
  export default {
    name: 'Home',
    components:{
      dateButtonHeader,
      trainingWeeks,
      dietPlan,
      comment
    },
    data() {
      return{
        client: {
          name: 'Владимир',
          isTrainingPlan: true,
          isDietPlan: true
        },
        comment: 'В этом блоке персональный комментарий к данной программе, который может потребоваться при составлении',
        trainingWeeks: [ 
          {
            id: 1,
            trainingDays: [
            { 
              dayTitle: "День спины",
              exercises: [
                  {
                  id: 1,
                  title: "Жим гантелей в наклоне",
                  link: "https://www.youtube.com/watch?v=43jdsq8IUHI",
                  sets: "3x12",
                  PDO: "2",
                  details: "fsffsfd fdsfsdfds fsdfsdfdsf fsdfdsfsdfsd sfd sdfdsfsdf asdsad dfsdfd",
                  rest: "3 min"
                  },
                  {
                  id: 2,
                  title: "Подтягивания",
                  link: "https://www.youtube.com/watch?v=6LyagkoRWYA",
                  sets: "2x12",
                  PDO: "5",
                  details: "fsffsfd fdsfsdfds fsdfsdfdsf fsdfdsfsdfsd sfd sdfdsfsdf asdsad dfsdfd",
                  rest: "1 min"
                  },
                  {
                  id: 3,
                  title: "Сведение в кроссовере лежа на наклонной скамье",
                  link: "https://www.youtube.com/watch?v=6LyagkoRWYA",
                  sets: "3x12",
                  PDO: "2",
                  details: "fsffsfd fdsfsdfds fsdfsdfdsf fsdfdsfsdfsd sfd sdfdsfsdf asdsad dfsdfd ",
                  rest: "3 min"
                  },
                  {
                  id: 4,
                  title: "Тяга верхнего блока узким хватом",
                  link: "https://www.youtube.com/watch?v=6LyagkoRWYA",
                  sets: "1x12",
                  PDO: "1",
                  details: "fsffsfd fdsfsdfds fsdfsdfdsf fsdfdsfsdfsd sfd sdfdsfsdf asdsad dfsdfd",
                  rest: "2 min"
                  },
                  {
                  id: 5,
                  title: "Разгибания на трицепс в блоке стоя c прямой рукоятью",
                  link: "https://www.youtube.com/watch?v=6LyagkoRWYA",
                  sets: "1x12",
                  PDO: "1",
                  details: "fsffsfd fdsfsdfds fsdfsdfdsf fsdfdsfsdfsd sfd sdfdsfsdf asdsad dfsdfd",
                  rest: "2 min"
                  },
                  {
                  id: 6,
                  title: "Подъем гантелей на бицепс сидя на наклонной скамье",
                  link: "https://www.youtube.com/watch?v=6LyagkoRWYA",
                  sets: "1x12",
                  PDO: "1",
                  details: "fsffsfd fdsfsdfds fsdfsdfdsf fsdfdsfsdfsd sfd sdfdsfsdf asdsad dfsdfd",
                  rest: "2 min"
                  },
                  {
                  id: 7,
                  title: "Жим штанги лежа",
                  link: "https://www.youtube.com/watch?v=6LyagkoRWYA",
                  sets: "1x12",
                  PDO: "1",
                  details: "fsffsfd fdsfsdfds fsdfsdfdsf fsdfdsfsdfsd sfd sdfdsfsdf asdsad dfsdfd",
                  rest: "2 min"
                  }
                    ]          
            },
            {
              dayTitle: "День ног",
              exercises: [
                  {
                  id: 1,
                  title: "тяга",
                  link: "https://www.youtube.com/watch?v=43jdsq8IUHI",
                  sets: "3x12",
                  PDO: "2",
                  details: "fsffsfd fdsfsdfds fsdfsdfdsf fsdfdsfsdfsd sfd sdfdsfsdf asdsad dfsdfd",
                  rest: "3 min"
                  },
                  {
                  id: 2,
                  title: "трицепс",
                  link: "https://www.youtube.com/watch?v=6LyagkoRWYA",
                  sets: "2x12",
                  PDO: "5",
                  details: "fsffsfd fdsfsdfds fsdfsdfdsf fsdfdsfsdfsd sfd sdfdsfsdf asdsad dfsdfd",
                  rest: "1 min"
                  },
                  {
                  id: 3,
                  title: "бицепс",
                  link: "https://www.youtube.com/watch?v=6LyagkoRWYA",
                  sets: "3x12",
                  PDO: "2",
                  details: "fsffsfd fdsfsdfds fsdfsdfdsf fsdfdsfsdfsd sfd sdfdsfsdf asdsad dfsdfd ",
                  rest: "3 min"
                  },
                  {
                  id: 4,
                  title: "жим",
                  link: "https://www.youtube.com/watch?v=6LyagkoRWYA",
                  sets: "1x12",
                  PDO: "1",
                  details: "fsffsfd fdsfsdfds fsdfsdfdsf fsdfdsfsdfsd sfd sdfdsfsdf asdsad dfsdfd",
                  rest: "2 min"
                  }
                    ]          
            }
            ]
          }
        ],
        dietPlan: {
          weight: "77kg",
          calories: 2100,
          protein: 120,
          fat: 80,
          carbohydrates: 270,
          breakfast: {
            p: 15,
            c: 50,
            f: 10
          }, 
          lunch1: {
            p: 25,
            c: 30,
            f: 20
          },
          lunch2: {
            p: 35,
            c: 30,
            f: 30
          },
          snacks: {
            p: 45,
            c: 10,
            f: 40
          },
          dinner: {
            p: 55,
            c: 15,
            f: 50
          }
        }
      }
    }
    /*created() {
      axios.get('https://jsonplaceholder.typicode.com/todos?_limit=5')
        .then( res => this.exercises = res.data)
        .catch(err => console.log(err));
    }*/
  }
  </script>
  
  <style >
    @import url('https://fonts.googleapis.com/css2?family=Montserrat&display=swap');
  .header-button{
    margin-left: 40vw;
  }
  .trainingProgram h1{
      font-family: 'Montserrat', sans-serif;
      font-weight: 400;
      margin-left: 185px;
  }
  .training-weeks{
    margin-left: auto;
  }
  </style>
  