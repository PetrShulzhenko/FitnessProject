document.getElementById("login-form").addEventListener('submit',postLogin);

function postLogin(e) { 
    e.preventDefault();

    //For clients
    if( document.getElementById('type-client').checked ){
        console.log('client picked');
        var login = document.getElementById("login").value;
        var password = document.getElementById("password").value;
        var params = "login=" + login + "&password=" + password; 
    
        var xhr = new XMLHttpRequest();
        xhr.open('POST', 'SERVER FILE HERE !!!!!!', true);
        xhr.setRequestHeader('Content-type','application/x-www-form-urlencoded');
    
        xhr.onload = function(){
            if( (this.status == 200) && (JSON.parse(this.responseText) == true) ) {
                window.location.href = "../test/src/pages/Home.vue";
            }
            else {
                alert("Что-то пошло не так..");
            }
        }
    
        xhr.send(params);
    }

    //For trainers
    if( document.getElementById('type-trainer').checked ){
        console.log('trainer picked');
        var login = document.getElementById("login").value;
        var password = document.getElementById("password").value;
        var params = "login=" + login + "&password=" + password; 
    
        var xhr = new XMLHttpRequest();
        xhr.open('POST', 'SERVER FILE HERE !!!!!!', true);
        xhr.setRequestHeader('Content-type','application/x-www-form-urlencoded');
    
        xhr.onload = function(){
            if( (this.status == 200) && (JSON.parse(this.responseText) == true) ) {
                window.location.href = "../test/src/pages/Home.vue";
            }
            else {
                alert("Что-то пошло не так..");
            }
        }
    
        xhr.send(params);
    }
}

