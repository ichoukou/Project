// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import FastClick from 'fastclick'
import VueRouter from 'vue-router'
import router from './router/index'
import App from './App'
import axios from 'axios'

// import './style/global.css' // 使用自定义 CSS
import Vuex from 'vuex';
import vuexI18n from 'vuex-i18n';
Vue.use(Vuex);
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
import echarts from 'echarts'
Vue.prototype.$echarts = echarts

import { LoadingPlugin } from 'vux'
Vue.use(LoadingPlugin)
import { ToastPlugin } from 'vux'
Vue.use(ToastPlugin)

router.afterEach((to, from, next) => {
        window.scrollTo(0, 0);
    })
    /* eslint-disable no-new */


new Vue({
    router,
    render: h => h(App)
}).$mount('#app-box')