<template>
    <div class="client">
        <div class="line">
            <div class="client-name">{{client.name}}</div>
            <div class="client-programType">{{client.programType}}</div>
           
            <profile v-bind:client="client" :wrapper1="true" :wrapper2="false" />
            
            <router-link :to="{ name: 'NewProgram', 
                                params: {client: client,
                                          name: client.name }
                              }"   
                                tag="button" class="newProgram-button">
                <p>Составить программу</p>
            </router-link>
        </div>                     
    </div>
</template>

<script>
    import profile from './Profile.vue'
    
    export default{
        name: "client",
        props: ["client"],
        components: {
            profile
        },
        methods: {
            wrapperStatus1Change: function(){
                this.wrapperStatus1 = !this.wrapperStatus1;
            }
        }
    }
</script>

<style scoped>
    .client{
        margin: 0 20px 30px 20px;
        }
    .line{
        background-color: #fafafa;
        box-shadow: 0 1px 4px 0 rgba(0, 0, 0, 0.3);
        padding: 10px;
        display: flex;
        align-items: center;
        justify-content: space-around;
        border-radius: 20px;
    }
    .client-name{
        width: 100px;
    }
    .client-programType{
        width: 50px;
    }
    button{
        border: 0;
        cursor: pointer;
    }
    button:hover{
       transform: scale(1.1);
    }
    
    .newProgram-button{
        display: flex;
        align-items: center;
        justify-content: center;
        padding: 10px 50px;
        border-radius: 7px;
        background-color: rgb(240, 218, 138);
    }
    .newProgram-button p{
        margin: 0;
        padding: 0;
        font-size: 17px;
        font-weight: 500;
    }
    .wrapper{
        display: flex;
    }

</style> 