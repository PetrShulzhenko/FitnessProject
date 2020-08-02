<template>
    <div class="wrapper">
        <h1 class="header">Программа питания:</h1>
        <main>
            <div class="main-card">
                <div class="doughnut-chart">
                    <doughnut :data="doughnutData" :options="doughnutOptions"></doughnut>
                </div>
                <div class="doughnut-chart-legend">
                    <span class="calories">{{dietPlan.calories}} ккал</span>
                    <div class="wrapp"> 
                        <div class="label">
                            <p>{{proteinPercent}}%</p>
                            <p>{{dietPlan.protein}}g</p>
                            <p class="protein">Белки</p>
                        </div>
                        <div class="label">
                            <p>{{fatPercent}}%</p>
                            <p>{{dietPlan.fat}}g</p>
                            <p class="fat">Жиры</p>
                        </div>
                        <div class="label"> 
                            <p>{{carbPercent}}%</p>
                            <p>{{dietPlan.carbohydrates}}g</p>
                            <p class="carbs">Углеводы</p>
                        </div>
                    </div>
                </div>
            </div>

            <section class="meals">
                <barchart :data="barData" :options="barOptions" class="bar" />
                
            </section>  
        </main>
    </div>
</template>

<script>
    import Doughnut from '../components/Doughnut.js'
    import barchart from '../components/Bar-Chart.js'
    export default {
        name: "dietPlan", 
        props: ["dietPlan"],
        components:{
            Doughnut,
            barchart
        },
        computed:{
            proteinPercent: function(){
                return Math.ceil((this.dietPlan.protein/(this.dietPlan.protein + this.dietPlan.fat + this.dietPlan.carbohydrates)) * 100); 
            },
            fatPercent: function(){
                return Math.floor((this.dietPlan.fat/(this.dietPlan.protein + this.dietPlan.fat + this.dietPlan.carbohydrates)) * 100); 
            },
            carbPercent: function(){
                return Math.floor((this.dietPlan.carbohydrates/(this.dietPlan.protein + this.dietPlan.fat + this.dietPlan.carbohydrates)) * 100); 
            }
        },
        data(){
            return{
                doughnutData: {
                        labels: [ 'Белки', 'Жиры', 'Углеводы'],
                        datasets: [{
                            label: 'грамм в день',
                            data: [this.dietPlan.protein, this.dietPlan.fat, this.dietPlan.carbohydrates],
                            backgroundColor: [
                                '#775bd6',
                                '#ff304f',
                                '#28c7fa'
                            ],
                            borderColor: ['#fafafa'
                            ],
                            borderWidth: 5,
                            hoverBorderColor: '#fafafa',
                            hoverBorderWidth: 6
                        }]
                },
                doughnutOptions:{
                    legend:{
                        display: false
                    },
                    responsive: true
                },


                barData: {
                        labels: [ 'Завтрак', 'Обед 1', 'Перекус', 'Обед 2', 'Ужин'],
                        datasets: [{
                            label: 'Белки',
                            data: [this.dietPlan.breakfast.p, this.dietPlan.lunch1.p, this.dietPlan.snacks.p, this.dietPlan.lunch2.p, this.dietPlan.dinner.p],
                            backgroundColor: [
                                '#775bd6',
                                '#775bd6',
                                '#775bd6',
                                '#775bd6',
                                '#775bd6'
                            ],
                            borderColor: ['#fafafa'
                            ],
                            borderWidth: 1,
                            hoverBorderColor: '#fafafa',
                            hoverBorderWidth: 2,
                            barPercentage: 0.8
                        },
                        {
                            label: 'Жиры',
                            data: [this.dietPlan.breakfast.f,this.dietPlan.lunch1.f, this.dietPlan.snacks.f, this.dietPlan.lunch2.f, this.dietPlan.dinner.f ],
                            backgroundColor: [
                                '#ff304f',
                                '#ff304f',
                                '#ff304f',
                                '#ff304f',
                                '#ff304f'
                            ],
                            borderColor: ['#fafafa'
                            ],
                            borderWidth: 1,
                            hoverBorderColor: '#fafafa',
                            hoverBorderWidth: 2,
                            barPercentage: 0.8
                        },
                        {
                            label: 'Углеводы',
                            data: [this.dietPlan.breakfast.c, this.dietPlan.lunch1.c, this.dietPlan.snacks.c, this.dietPlan.lunch2.c, this.dietPlan.dinner.c ],
                            backgroundColor: [
                                '#28c7fa',
                                '#28c7fa',
                                '#28c7fa',
                                '#28c7fa',
                                '#28c7fa'
                            ],
                            borderColor: ['#fafafa'
                            ],
                            borderWidth: 1,
                            hoverBorderColor: '#fafafa',
                            hoverBorderWidth: 2,
                            barPercentage: 0.8
                        }
                    ]
                },
                barOptions:{
                    maintainAspectRatio: false,
                    responsive: true,
                    legend:{
                        display: true,
                        position: 'right'
                    },
                    scales: {
                                yAxes: [{
                                    beginAtZero: true,
                                    stacked: false,
                                    ticks: {
                                            suggestedMin: 0,
                                            suggestedMax: 55
                                    },
                                    gridLines: {
                                            display: true,
                                            color: "rgba(255,99,132,0.2)"
                                    }
                                }],
                                xAxes: [{
                                    gridLines: {
                                    display: false
                                            }
                                }]
                            }
                        
        }
                }
            }
        }
</script>

<style scoped>
    @import url('https://fonts.googleapis.com/css2?family=Montserrat&display=swap');
    .wrapper{
        margin-bottom: 15vh;
    }
    .header{
        font-family: 'Montserrat', sans-serif;
        font-weight: 400;
        font-size: 30px;
        margin-left: 150px;
    }
    main{
        display: flex;
        align-items: center;
        justify-content: center;
        flex-direction: column;
    }
    .main-card{
        display: flex;
        align-items: center;
        height: 400px;
    }
    .doughnut-chart{
        width: 250px;
    }
    .calories{
        position: relative;
        top: 63px;
        left: -192px;
        font-size: 30px;
    }
    .wrapp{
        display: flex;
        font-size: 20px;
        position: relative;
        top: -10px;
    }
    .wrapp p{
        margin-top: 0px;
    }
    .wrapp p:nth-child(1){
        opacity: 0.7;
        font-size: 17px;
    }
    .wrapp p:nth-child(3){
        font-size: 18px;
    }
    .wrapp .protein{
        color: #775bd6;
    }
    .wrapp .fat{
        color: #ff304f;
    }
    .wrapp .carbs{
        color: #28c7fa;
    }
    .label{
        margin-left: 70px;
        display: flex;
        flex-direction: column;
        align-items: center;
    }
    .meals{
        position: relative;
        margin: 0 auto;
        width: 1000px;
        margin-bottom: 50px;
    }
    .card{
        display: flex;
        flex-direction: column;
        justify-content: space-evenly;
        align-items: baseline;
        width: 200px;
        box-shadow: 0 2px 6px 0 rgba(0,0,0,0.3);
        border-radius: 15px;
        padding: 25px;
        height: 150px;
        margin: 10px 65px;

    }
    .info{
        margin-bottom: 15px;
    }
    .card h3{
        font-family: 'Open Sans', sans-serif;
        font-size: 22px;
        font-weight: normal;
        align-self: center;
    }
    .card p{
        font-size: 17px;
    }
   

</style>