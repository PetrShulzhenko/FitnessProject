<template>
  <div>
    <h1 class="title"> Заявки на составление программ</h1>
    <clients v-bind:clients="clients" />
    <br><br><br><br>
    
  </div>
</template>

<script>
import clients from '../components/Clients.vue'
import axios from 'axios'

export default {
  name: 'trainerHome',
  components:{
            clients
        },
  created() {
    this.fetchData();
  },
  methods: {
    fetchData: function(){
      axios.get('!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!')
        .then( res => this.clients = res.data)
        .catch(err => console.log(err));
    }
  },
  data(){
        return{
              clients: [
                    {
                        id: 1,
                        name: 'Владимир Шаньков',
                        programType: 'Тренировки + Питание',
                        isTrainingPlan: true,
                        isDietPlan: true,
                        profile: {
                            height: '175cm',
                            weight: '70kg',
                            age: '60лет',
                            trainingExperience: '40лет',
                            previousProgram: 'МатАнализ',
                            health: 'Нет противопоказаний',
                            muscleTarget: 'Пресс',
                            dietTarget: 'Сушка',
                            specialProgram: 'нет',
                            photo:'../image/shankov.jpg',
                            equipment: 'www.mipt.ru',
                            activityLevel: '3 пары в день веду'
                        }
                    },
                    {
                        id: 2,
                        name: 'Сергей Резниченко',
                        programType: 'Питание',
                        isTrainingPlan: false,
                        isDietPlan: true,
                        profile: {
                            height: '175cm',
                            weight: '70kg',
                            age: '60лет',
                            trainingExperience: '40лет',
                            previousProgram: 'МатАнализ',
                            health: 'Нет противопоказаний',
                            muscleTarget: 'Пресс',
                            dietTarget: 'Сушка',
                            specialProgram: 'нет',
                            photo:'../image/shankov.jpg',
                            equipment: 'www.mipt.ru',
                            activityLevel: '3 пары в день веду'
                        }
                    },
                    {
                        id: 3,
                        name: 'Алекс Антипов',
                        programType: 'Тренировки',
                        isTrainingPlan: true,
                        isDietPlan: false,
                        profile: {
                            height: '175cm',
                            weight: '70kg',
                            age: '60лет',
                            trainingExperience: '40лет',
                            previousProgram: 'МатАнализ',
                            health: 'Нет противопоказаний',
                            muscleTarget: 'Пресс',
                            dietTarget: 'Сушка',
                            specialProgram: 'нет',
                            photo:'../image/shankov.jpg',
                            equipment: 'www.mipt.ru',
                            activityLevel: '3 пары в день веду'
                        }
                      },
                        {
                        id: 4,
                        name: 'Алекс Антипов',
                        programType: 'Тренировки',
                        profile: {
                            height: '175cm',
                            weight: '70kg',
                            age: '60лет',
                            trainingExperience: '40лет',
                            previousProgram: 'МатАнализ',
                            health: 'Нет противопоказаний',
                            muscleTarget: 'Пресс',
                            dietTarget: 'Сушка',
                            specialProgram: 'нет',
                            photo:'../image/shankov.jpg',
                            equipment: 'www.mipt.ru',
                            activityLevel: '3 пары в день веду'
                        }
                      },
                        {
                        id: 5,
                        name: 'Алекс Антипов',
                        programType: 'Тренировки',
                        profile: {
                            height: '175cm',
                            weight: '70kg',
                            age: '60лет',
                            trainingExperience: '40лет',
                            previousProgram: 'МатАнализ',
                            health: 'Нет противопоказаний',
                            muscleTarget: 'Пресс',
                            dietTarget: 'Сушка',
                            specialProgram: 'нет',
                            photo:'../image/shankov.jpg',
                            equipment: 'www.mipt.ru',
                            activityLevel: '3 пары в день веду'
                        }
                      },
                        {
                        id: 6,
                        name: 'Алекс Антипов',
                        programType: 'Тренировки',
                        profile: {
                            height: '175cm',
                            weight: '70kg',
                            age: '60лет',
                            trainingExperience: '40лет',
                            previousProgram: 'МатАнализ',
                            health: 'Нет противопоказаний',
                            muscleTarget: 'Пресс',
                            dietTarget: 'Сушка',
                            specialProgram: 'нет',
                            photo:'../image/shankov.jpg',
                            equipment: 'www.mipt.ru',
                            activityLevel: '3 пары в день веду'
                        }
                      },
                        {
                        id: 7,
                        name: 'Алекс Антипов',
                        programType: 'Тренировки',
                        profile: {
                            height: '175cm',
                            weight: '70kg',
                            age: '60лет',
                            trainingExperience: '40лет',
                            previousProgram: 'МатАнализ',
                            health: 'Нет противопоказаний',
                            muscleTarget: 'Пресс',
                            dietTarget: 'Сушка',
                            specialProgram: 'нет',
                            photo:'../image/shankov.jpg',
                            equipment: 'www.mipt.ru',
                            activityLevel: '3 пары в день веду'
                        }
                      },
                        {
                        id: 8,
                        name: 'Алекс Антипов',
                        programType: 'Тренировки',
                        profile: {
                            height: '175cm',
                            weight: '70kg',
                            age: '60лет',
                            trainingExperience: '40лет',
                            previousProgram: 'МатАнализ',
                            health: 'Нет противопоказаний',
                            muscleTarget: 'Пресс',
                            dietTarget: 'Сушка',
                            specialProgram: 'нет',
                            photo:'../image/shankov.jpg',
                            equipment: 'www.mipt.ru',
                            activityLevel: '3 пары в день веду'
                        }
                      },
                        {
                        id: 9,
                        name: 'Алекс Антипов',
                        programType: 'Тренировки',
                        profile: {
                            height: '175cm',
                            weight: '70kg',
                            age: '60лет',
                            trainingExperience: '40лет',
                            previousProgram: 'МатАнализ',
                            health: 'Нет противопоказаний',
                            muscleTarget: 'Пресс',
                            dietTarget: 'Сушка',
                            specialProgram: 'нет',
                            photo:'../image/shankov.jpg',
                            equipment: 'www.mipt.ru',
                            activityLevel: '3 пары в день веду'
                        }
                      },
                        {
                        id: 10,
                        name: 'Алекс Антипов',
                        programType: 'Тренировки',
                        profile: {
                            height: '175cm',
                            weight: '70kg',
                            age: '60лет',
                            trainingExperience: '40лет',
                            previousProgram: 'МатАнализ',
                            health: 'Нет противопоказаний',
                            muscleTarget: 'Пресс',
                            dietTarget: 'Сушка',
                            specialProgram: 'нет',
                            photo:'../image/shankov.jpg',
                            equipment: 'www.mipt.ru',
                            activityLevel: '3 пары в день веду'
                        }
                    }
                ]
            }
        }
    }
</script>

<style scoped>
 .title{
   margin-left: 30px  ;
   font-size: 30px;
 }
</style>