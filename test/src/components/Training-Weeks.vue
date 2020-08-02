<template>
    <div class="weeks">
        <div v-bind:key="trainingWeek.id" 
                v-for="(trainingWeek,i) in trainingWeeks" 
                class="week">
            <trainingWeek :trainingWeek="trainingWeek"
                          :index="i"  />
        </div>
    </div>
</template> 

<script>
    import trainingWeek from './Training-Week.vue'

    export default {
        name: "trainingWeeks",
        components: {
            trainingWeek
        },
        props: ["trainingWeeks"]
    }
</script>

<style scoped>
    .weeks{
        width: 100%;
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: flex-end;
    }
    .week{
        width: 90%;
    }
</style>