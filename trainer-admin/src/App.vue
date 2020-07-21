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
  body{
    box-sizing: border-box;
    background-color: #fafafa;
    margin: 0;
    padding: 0;
  }
  button:hover{
    transform: scale(1.1);
  }
</style>
