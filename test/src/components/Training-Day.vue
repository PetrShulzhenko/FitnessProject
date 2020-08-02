<template>
    <div class="wrapper">
        <h2 class="day-title"><span>{{index+1}}.</span>  {{trainingDay.dayTitle}}</h2>
        <exercises :exercises="trainingDay.exercises" />
    </div>
</template> 

<script>
    import exercises from './Exercises.vue'

    export default {
        name: "trainingDay",
        components: {
            exercises
        },
        props: ["trainingDay","index"]
    }
</script>

<style scoped>
    .wrapper{
        box-shadow: 0 1px 4px 0 rgba(0, 0, 0, 0.3);
        border-radius: 5px;
        background-color: #fdfdfd;
        margin: 10px;
        padding: 10px;
        padding-bottom: 20px;
        margin-bottom: 30px;
    }
    .day-title{
        margin-left: 30px;
        font-weight: normal;
        font-size: 25px;
    }
    .day-title span{
        margin-right: 10px;
    }

</style>