<template>
    <div class="days">
        <div v-bind:key="trainingDay.id" v-for="(trainingDay,i) in trainingDays" class="day">
            <trainingDay :trainingDay="trainingDay"
                         :index="i"/>
        </div>
    </div>
</template>

<script>
    import trainingDay from './Training-Day.vue'

    export default { 
        name: "trainingDays",
        components: {
            trainingDay
        },
        props: ["trainingDays"]
    }
</script>

<style scoped>
    
</style>