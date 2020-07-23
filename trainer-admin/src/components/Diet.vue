<template>
    <div :class="{'dietWrapper': !client.isTrainingPlan,
                   'wrapper': client.isTrainingPlan}">
        <p class="header">Программа питания:</p>
        <main>
            <div class="card main-card">
                <p> Вес: {{client.profile.weight}}</p>
                <label for="protein"> 
                    Белки
                    <input type="text" id="protein">
                </label>                
                <label for="fat"> 
                    Жиры
                    <input type="text" id="fat">                
                </label>
                <label for="carbs"> 
                    Углеводы
                    <input type="text" id="carbs">
                </label>
            </div>

            <section class="meals">
                <div class="card">
                    <p> Завтрак</p>
                    <label for="protein"> 
                        Белки
                        <input type="text" id="protein">
                    </label>                
                    <label for="fat"> 
                        Жиры
                        <input type="text" id="fat">                
                    </label>
                    <label for="carbs"> 
                        Углеводы
                        <input type="text" id="carbs">
                    </label>
                </div>

                <div class="card">
                    <p> Обед 1</p>
                    <label for="protein"> 
                        Белки
                        <input type="text" id="protein">
                    </label>                
                    <label for="fat"> 
                        Жиры
                        <input type="text" id="fat">                
                    </label>
                    <label for="carbs"> 
                        Углеводы
                        <input type="text" id="carbs">
                    </label>
                </div>

                <div class="card">
                    <p> Перекус</p>
                    <label for="protein"> 
                        Белки
                        <input type="text" id="protein">
                    </label>                
                    <label for="fat"> 
                        Жиры
                        <input type="text" id="fat">                
                    </label>
                    <label for="carbs"> 
                        Углеводы
                        <input type="text" id="carbs">
                    </label>
                </div>

                <div class="card">
                    <p> Обед 2</p>
                    <label for="protein"> 
                        Белки
                        <input type="text" id="protein">
                    </label>                
                    <label for="fat"> 
                        Жиры
                        <input type="text" id="fat">                
                    </label>
                    <label for="carbs"> 
                        Углеводы
                        <input type="text" id="carbs">
                    </label>
                </div>

                <div class="card">
                    <p> Ужин</p>
                    <label for="protein"> 
                        Белки
                        <input type="text" id="protein">
                    </label>                
                    <label for="fat"> 
                        Жиры
                        <input type="text" id="fat">                
                    </label>
                    <label for="carbs"> 
                        Углеводы
                        <input type="text" id="carbs">
                    </label>
                </div>
            </section>    
        </main>
    </div>
</template>

<script>
    export default{
        name: 'diet',
        props:{
            client: Object,
            diet:Object
        }
    }

</script>

<style scoped> 
    .wrapper{
        width: 90%;        
        margin: 80px 0px;
    }
    .dietWrapper{
        width: 90%;        
        margin: -70px 0px 80px 0;
    }
    .header{
        font-size: 30px;
        margin-left: 150px;
    }
    main{
        display: flex;
        align-items: center;
        justify-content: center;
        flex-direction: column;
    }
    .card{
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;
        width: 300px;
        box-shadow: 0 2px 6px 0 rgba(0,0,0,0.3);
        border-radius: 15px;
        padding: 35px;
        height: 300px;
        margin: 25px 15px;

    }
    .card p{
        font-size: 22px;
        margin: 0;
    }
    .card label,input{
        display: block;
    }
    .card label{
        margin: 18px;
        font-size: 18px;
    }
    .card input{
        margin-top: 5px;
        height: 20px;
        background-color: #fdfdfd;
        border-bottom: 3px solid rgb(238, 222, 166);
        border-right: 1px solid rgb(238, 227, 189);
        border-top: 1px solid rgb(238, 227, 189);
        border-left: 1px solid rgb(238, 227, 189);
    }

    .card input:focus{
        outline: none;
        border-left: 6px solid rgb(240, 218, 138);
        border-top: 0;
        border-right:0 ;
        box-shadow: none;
        height: 20px;
    }
    .meals{
        display: flex;
        flex-direction: row;
        flex-wrap: wrap;
        justify-content: space-evenly;
    }

</style>