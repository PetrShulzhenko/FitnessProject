<template>
    <div>
        <div  v-bind:key="client.id" v-for="client in clients">
            <client v-bind:client="client" />
        </div>
        
    </div>
</template>

<script>
    import client from './Client.vue'
    
    export default{
        name: 'clients',
        components:{
            client
        },
        props: ["clients"]
    }
</script>