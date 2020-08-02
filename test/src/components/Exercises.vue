<template>
    <div>
          <div v-bind:key="exercise.id" v-for=" (exercise,i) in exercises">
            <exercise v-bind:exercise="exercise" 
                            :index="i"/>
          </div>
    </div>
</template>         

<script>
    import exercise from './Exercise.vue'
    

    export default { 
        name: "exercises",
        components: {
            exercise
        },
        props: ["exercises"]
    }
</script>
