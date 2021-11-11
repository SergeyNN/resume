import { createApp } from 'vue'
import Vue from 'vue'
import App from './App.vue'
import './registerServiceWorker'
import router from './router'
import store from './store'
import { BootstrapVue, IconsPlugin } from 'bootstrap-vue'
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'
import 'bootstrap/dist/js/bootstrap'
import 'bootstrap-vue/dist/bootstrap-vue-icons.css'
// import 'materialize-css/sass/materialize.scss'
// import 'materialize-css/dist/css/materialize.css'
// import 'materialize-css/dist/js/materialize'
import 'font-awesome/css/font-awesome.css'


// import 'bootstrap/dist/css/bootstrap.css'
// import "bootstrap";
// import 'bootstrap-vue/dist/bootstrap-vue.css'

createApp(App).use(store).use(router).mount('#app')
