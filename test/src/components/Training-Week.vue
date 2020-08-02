<template>
    <div class="week">
        <div>
            <p class="week-number">Неделя {{index+1}}</p>
        </div>
        <trainingDays :trainingDays="trainingWeek.trainingDays" class="days"/>
    </div>
</template>

<script>
    import trainingDays from './Training-Days.vue' 

    export default {
        name: "trainingWeek",
        components: {
            trainingDays
        },
        props: ["trainingWeek", "index"]
    }
</script>

<style scoped>
    .week{
        width: 100%;
        box-shadow: 0 0px 2px 0 rgba(0, 0, 0, 0.3);
        border-radius: 10px;
        background-color: #fafafa;
        margin-bottom: 40px;
        padding-bottom: 5px;
    }
    .week-number{
        font-size: 20px;
        padding: 20px 0 5px 25px;
        margin-left: 20px;
    }
    
    .days{
        margin: 10px;
    }
</style>