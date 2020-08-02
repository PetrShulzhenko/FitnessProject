<template>
    <div class="exercise-item">
      <span>{{index+1}}</span>
      <div class="item exercise-title">
        {{exercise.title}}</div>
      <div class="item">
        <span>Подходы</span>
        {{exercise.sets}}</div>
      <div class="item">
        <span>ПДО</span>
        {{exercise.PDO}}   
      </div>
      <div class="item">
        <span>Отдых</span>
        {{exercise.rest}}</div>
      <form :action="exercise.link" target="_blank">
          <button>
              <img src="../images/youtube_logo.png" width="50px">
          </button>
      </form>
      
      <button class="details" v-on:click="details">
        <span>Комментарий</span>
      </button>
      <div class="wrapper">
        <div class="modal" v-bind:class="{'is-shown': detailsStatus}">
            <p> {{exercise.details}} </p>
            <span class="close" title="Close Modal"
            v-on:click="details" >&times;</span>
        </div>
      </div>
    </div>
</template>

<script>
    export default {
        name: "exercise",
        props: ["exercise", "index"],
        data(){
            return{
                detailsStatus: true
            }
        },
        methods: {
            details: function(){
                this.detailsStatus = !this.detailsStatus;
            }
        }
    }
</script>

<style scoped>
  .exercise-item {
    font-size: 17px;
    box-shadow: 0 1px 4px 0 rgba(0, 0, 0, 0.3);
    border-radius: 10px;
    background-color: #fafafa;
    padding: 5px;
    margin: 15px 20px;
    min-height: 50px;
    display: flex;
    align-items: center;
    justify-content: space-around;
  }
  .exercise-title{
      width: 200px;
      word-wrap: break-word;  
  }
  button{
  cursor: pointer;
  background-color: #fafafa;
  }
  button:hover{
    transform: scale(1.05);
  }
  .details{
    display: flex;
    align-items: center;
    justify-content: center;
    padding: 10px 40px;
    border-radius: 7px;
    border: 2px solid rgb(240, 218, 138);
    background-color: #fafafa;
    font-size: 17px;
  }
  
  .item span{
    font-size: 15px;
    color: gray;
    opacity: 0.7;
    position: relative;
    top: -17px;
    left: 10px;
  }

  /*    DETAILS  */
  .is-shown {
  display: none; 
}
.wrapper{
    position: absolute;
    top: 0;
    left: 10vw;
}
.modal{
    position: fixed; 
    z-index: 1; 
    background-color: #fefefe;
    margin: 5px auto 5px auto; 
    border: 1px solid #888;
    width: 80%;
    height: 80%;
    opacity: 0.95;
}
.modal p{
    text-align: center;
}
  .close {
  position: absolute;
  right: 25px;
  top: 0;
  color: #000; 
  font-size: 35px;
  font-weight: bold;
}

.close:hover,
.close:focus {
  color: red;
  cursor: pointer;
}
button{
  border: 0;
}
/* Add Zoom Animation */
.animate {
  -webkit-animation: animatezoom 0.6s;
  animation: animatezoom 0.6s
}

@-webkit-keyframes animatezoom {
  from {-webkit-transform: scale(0)} 
  to {-webkit-transform: scale(1)}
}
  
@keyframes animatezoom {
  from {transform: scale(0)} 
  to {transform: scale(1)}
}

</style>