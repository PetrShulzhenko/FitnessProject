<template>
    <div class="comment-wrapper">
        <div class="header" @click='comment'>
            <div class="header-content">
            <p>Комментарий к программе!</p>
            <img src="../images/down-arrow.webp" alt="Стрелка вниз" width="50px"
                 :style="`transform: rotate(${rotation}deg);`">
            </div>
        </div>
        
        <main class="main" v-show="commentStatus" >
            <div class="static-comment">
                <p>Привет, <span class="client-name">{{client.name}}</span>! Спасибо за то, что решил обратиться ко мне за программой. Я очень хочу, чтобы каждый мой клиент получил результат. Поэтому я долго работал над тем, чтобы мои программы были самыми подробными. </p>
                <ul> <span class="ul-header">
                     Для того, чтобы эта программа была действительно эффективной, тебе следует соблюдать следующие указания:
                     </span>
                    <li>Обязательно смотри видео о том, как правильно выполнять указанное упражнение по кнопке YouTube в программе</li>
                    <li>Обязательно выполняй всё по технике и МЕДЛЕННО. Концентрируйся на том, чтобы чувствовать мышцу, прожимать её всеми силами.</li>
                    <li>Во время тяжелых недель ты должен стараться повышать рабочие веса. По весам - работай на ощущения, чтобы вписываться в указанные повторения.</li>
                    <li>Записивай свой результат на прошлых тренировках и постоянно старайся повысить вес хотя бы на 500 г – 1 кг, когда чувствуешь, что уже готов к этому. Но будь готов к тому, что чем ты сильнее, тем тяжелее повышать веса.</li>
                    <li>Обязательно соблюдай питание КАЖДЫЙ ДЕНЬ. Ведь это 70% успеха!</li>
                    <li> Спи не менее 8-ми часов.</li>
                    <li>Перед каждой тренировкой обязательна разминка. В РАЗМИНКУ ВХОДИТ И ГИПЕРЭКСТЕНЗИЯ!</li>

                    <li> Программа составлена с учетом периодизации. (Тяжелые тренировочные недели и легкие). </li>
                    <li>Разминочные подходы с весом около 30% от рабочих весов</li>
                    <li>ПДО - абривеатура понятия Повторений До Отказа. Означает, сколько повторений должно оставаться до наступления отказа в последнем подходе. "0" - отказ. "1" - 1 остановка за 1 повтор до отказа 2 - остановка за 2 повтора до отказа и т.д. То есть, если указано "3х10, ПДО 2". - Значит, что подбираешь такой вес, с которым ты мог бы сделать 12 раз (но это в отказ) и делаешь 10 ,как я указал</li>
                    <li>ТЯЖЕЛУЮ неделю мы делаем 4 НЕДЕЛИ ПОДРЯД. После чего делаем 1 ЛЕГКУЮ НЕДЕЛЮ. И потом по новой.</li>
                    <li>В тяжелые недели повышаем рабочие веса. </li>
                    <li>В легкую неделю сокращаем вес снарядов примерно до 50%. Тренировка чисто на ощущениях, на легке, для пампа.</li>
                    <li>Что такое отказ? Допустим, указано 8 повторений с отказом. Берешь такой вес, чтобы 8-е повторение было из последних сил. Без запаса на 9-е. Но ни в коем случае не нарушай технику выполнения!</li>
                    <li>Дропсет - это когда ты делаешь 1 подход с тяжелым весом, без отдыха скидываешь 30% веса, снова делаешь на максимум, опять минус 30% веса, и снова продолжаешь подход.</li>
                    <li>Пример: Жим лежа 10+дропсет. Делаешь 100х10, без отдыха 60хМАКС, и тут же 30хМАКС</li>
                    <li>Если написано "В каждом подходе повышаешь вес" - Это работа по принципу пирамиды.. 80Х12, 90Х10, 110Х8</li>

                    <li>Питание очень важно соблюдать. Ведь это ресурсы для роста мыщц.</li>
                    <li> Выпивай минимум 2 литра воды в день.</li>
                    <li> Белок учитываем только <span :style="{fontWeight: 'bold'}"> животного происхождения</span> !</li>
                    <li>Если до этого ты ел намного меньше/больше, то повышай/понижай бжу постепенно, чтобы не получить проблемы с ЖКТ.</li>
                    <li> По БЖУ нужно вкалдываться в норму в каждом приеме, как я указал.</li>
                    <li>Если не выходит столько съедать за один прием – можно подключать 1 небольшой доп. перекус. </li>
                    <li>Можно дополнять сложные углеводы простыми. Так будет легче добирать их. В рационе может присутсвовать 30% простых углеводов.</li>
                    <li>Ни в коем случае не пренебрегай клетчаткой (овощами).</li>
                    <li>Добавлять простые углеводы (наприм. банан) без проблем можно после тренировки. </li>
                    <li>В дни отдыха простые углеводы добавляй в завтрак или первый обед.</li>
                    <li>Время между приемами неважно, главное всё съесть за день. Но, последний прием за 2,5 часов до сна.</li>
                    <li> Если есть гейнер или протеин, то учитывай их бжу, как из еды. Это не волшебный порошок, а те же нутриенты, как с продуктов.</li>
                </ul>
            </div>
            <div class="personal-comment">
                <p>{{comment}}</p>
            </div>
        </main>
    </div>
</template>

<script>
    export default {
        name: "comment",
        data(){
            return{
                commentStatus: true,
                rotation: 0
            }
        },
        props: ["client", "comment"],
        methods: {
          // eslint-disable-next-line vue/no-dupe-keys
            comment: function(){
                this.commentStatus = !this.commentStatus;
                this.rotation += 180;
            }
        }
    }
</script>

<style scoped>
    @import url('https://fonts.googleapis.com/css2?family=Montserrat&display=swap');
    .comment-wrapper{
        border-radius: 10px;
        width: 80.95%;
        margin: 0 9.05% 50px 10%;
        background-color: #fafafa;
    }
    .main{
        background-color: #fafafa;
        box-shadow: 0 0px 2px 0 rgba(0, 0, 0, 0.3);
        border-radius: 5px;
        padding: 25px 80px;
        display: flex;
        flex-direction: column;
        align-items: baseline;
    }
    .header{
        box-shadow: 0 0px 1.5px 0 rgba(0, 0, 0, 0.3);
        border-bottom: 1px solid #dddcdc;
        border-radius: 10px;
        border-bottom-left-radius: 5px;
        border-bottom-right-radius: 5px;
        cursor: pointer;
    }
    .header-content{
        display: flex;
        align-items: center;
        justify-content: space-between;
        margin: 0 50px;
        font-size: 25px;
        font-family: 'Montserrat', sans-serif;
        font-weight: 400;
    }
    .header-content img{
        -khtml-user-select: none;
        -o-user-select: none;
        -moz-user-select: none;
        -webkit-user-select: none;
        user-select: none;
    }
    .header-content img:hover{
        transform: scale(1.1);
    }
    .static-comment p{
        margin-top: 0;
        padding: 10px;
    }
    .static-comment ul{
        list-style-type: circle;
    }
    .ul-header{
        font-size: 18px;
    }
    .static-comment li{
        margin-top: 15px;
    }
    .static-comment li:nth-child(2){
        margin-top: 20px;
    }
    .static-comment li:nth-child(9){
        margin-top: 35px;
    }
    .static-comment li:nth-child(n+9){
        list-style-image: url("../images/db40-latest.png");
    }
    .client-name{
        font-size: 20px;
    }
    .static-comment li:nth-child(n+19){
        list-style-image: url("../images/apple35.png");
    }
    .static-comment li:nth-child(19){
        margin-top: 35px;
    }
    .personal-comment p{
        padding: 0 10px;
    }
</style>