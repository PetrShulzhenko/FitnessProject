<template>
  <div id="app">
    
    <Nav></Nav>
    <router-view/>
    
  </div>
</template>

<script>
import Nav from './components/Nav-Footer.vue'

export default {
  name:'app',
  components:{
    Nav

  },
  data () {
    return {
      
    }
  }
}
</script>

<style>
.buttonTest{
  background-image: url('./images/School_Diary-512.png') ;
  background-repeat: no-repeat;
  background-size: cover;
  width: 60px;
  height: 60px;
}
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
