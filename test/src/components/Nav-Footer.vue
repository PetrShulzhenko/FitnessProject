<template>
    <footer class="footer-menu">
    
        <router-link tag="button" class="footer-button footer-button-back" to="/"
        @click.native="backLight"
        :class="{'light': isBackLight}">
            <img src="../images/back-test.png" width="50px">
            <span>Назад</span>
        </router-link>
        
        <router-link tag="button" class="footer-button footer-button-homepage" to="/"
        @click.native="homeLight"
        :class="{'light': isHomeLight}">
            <img src="../images/homepage.png" width="75px" height="50px">
            <span>Главная</span>
        </router-link>

        <router-link tag="button" class="footer-button footer-button-calendar" to="/Calendar"
        @click.native="calendarLight"
        :class="{'light': isCalendarLight}">
            <img src="../images/diary.png" width="50px">
            <span>Дневник</span>
        </router-link>

        <router-link tag="button" class="footer-button footer-button-statistic" to="/Statistics"
        @click.native="statLight"
        :class="{'light': isStatLight}">
            <img src="../images/stat.png" width="50px">
            <span>Статистика</span>
        </router-link>
        
        <router-link tag="button" class="footer-button footer-button-other" to="/Other"
        @click.native="otherLight"
        :class="{'light': isOtherLight}">
            <img src="../images/other.png" width="50px">
            <span>Ещё</span>
        </router-link>  
               
    </footer>
</template>
  
<script> 

  export default {
   name: "Nav",
   data(){
       return {
          isBackLight: false,
          isHomeLight: true,
          isCalendarLight: false,
          isStatLight: false,
          isOtherLight: false,
       }
   },
   methods: {
            backLight: function(){
                this.isBackLight = true;
                this.isHomeLight= false;
                this.isCalendarLight = false;
                this.isStatLight= false;
                this.isOtherLight = false;
            },
            homeLight: function(){
                this.isBackLight = false;
                this.isHomeLight= true;
                this.isCalendarLight = false;
                this.isStatLight= false;
                this.isOtherLight = false;
            },
            calendarLight: function(){
                this.isBackLight = false;
                this.isHomeLight= false;
                this.isCalendarLight = true;
                this.isStatLight= false;
                this.isOtherLight = false;
            },
            statLight: function(){
                this.isBackLight = false;
                this.isHomeLight= false;
                this.isCalendarLight = false;
                this.isStatLight= true;
                this.isOtherLight = false;
            },
            otherLight: function(){
                this.isBackLight = false;
                this.isHomeLight= false;
                this.isCalendarLight = false;
                this.isStatLight= false;
                this.isOtherLight = true;
            },
   }
  }
  </script>
  
  <style scoped>
     .footer-menu{
    display: flex;
    justify-content: space-around;
    align-items: center;
    width: 100%;
    height: 11.5vh ;
    position: fixed;
    top: 88.5vh;  
    left: 0;
    z-index: 10;
    background-color: #f5f4f4;
    padding-top: 0px;
    padding-bottom: 0px;    
    border-top: 2px solid rgb(133, 133, 133);
    
}
.footer-button{
    background-color: #f5f4f4;
    border: 0; 
    display: flex;
    flex-direction: column;   
    align-items: center;
    justify-content: center;
    cursor: pointer;
}
.footer-button:focus{
    outline: none;
}
.footer-button:hover{
    transform: scale(1.005);
}
.footer-menu span{
    font-size: 1.2em;
}

.footer-button-calendar img{
    position: relative;
    top: -2px;
}
.footer-button-back span{
    position: relative;
    top: 5px;
}
.footer-button-homepage img{
    position: relative;
    top: -2px;
}
.light{
    border-left: 3px solid  rgb(238, 207, 94);
    border-radius: 5px;
}
  </style>
  