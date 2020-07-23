<template>
  <div>
  <keep-alive>
    <router-view/>
  </keep-alive>
  
  </div>
</template>

<script>


export default {
  name: 'App',
  components: {
    
  }
}
</script>

<style>
  @import url('https://fonts.googleapis.com/css2?family=Open+Sans&display=swap');
  body{
    font-family: 'Open Sans', sans-serif;
    box-sizing: border-box;
    background-color: #fafafa;
    margin: 0;
    padding: 0;
  }
  button:hover{
    transform: scale(1.1);
  }
  button{
    font-family: 'Open Sans', sans-serif;
  }
</style>
