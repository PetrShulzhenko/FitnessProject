import VueRouter from 'vue-router'
import Home from './pages/Home'
import NewProgram from './pages/NewProgram'


export default new VueRouter({
    routes:[
        {
            path:'/',
            component: Home,
            name: 'Home'
        },
        {
            path: '/NewProgram/:name',
            name: 'NewProgram',
            component: NewProgram,
            props: true
          }
    ],
    mode: 'history'

})