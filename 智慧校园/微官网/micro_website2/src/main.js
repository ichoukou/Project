// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import FastClick from 'fastclick'
import VueRouter from 'vue-router'
import router from './router/index'
import App from './App'
import axios from 'axios'
import iView from 'iview';
import 'iview/dist/styles/iview.css';
import './style/global.css' // 使用自定义 CSS
import Vuex from 'vuex';
import vuexI18n from 'vuex-i18n';
Vue.use(Vuex);
Vue.use(iView);
const store = new Vuex.Store({
    modules: {
        i18n: vuexI18n.store
    }
});


Vue.use(vuexI18n.plugin, store);
const translationsEn = {
    "content": "This is some {type} content"
};

FastClick.attach(document.body)

Vue.config.productionTip = false
Vue.prototype.$http = axios
import 'swiper/dist/css/swiper.min.css'
import { LoadingPlugin } from 'vux'
Vue.use(LoadingPlugin)
import { ToastPlugin } from 'vux'
Vue.use(ToastPlugin)
var userAgent = window.navigator.userAgent;
if (userAgent.indexOf('NET') != -1) {
    //ie浏览器不兼容懒加载组件处理
    Vue.directive('lazy', function(el, binding) {
        el.src = binding.value
    })
}



new Vue({
    router,
    render: h => h(App)
}).$mount('#app-box')