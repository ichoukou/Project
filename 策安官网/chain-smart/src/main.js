import Vue from 'vue'
import App from './App'
import router from './router/index'
import iView from 'iview'
import axios from 'axios'
import "babel-polyfill"
import Vuex from 'vuex'

import 'iview/dist/styles/iview.css' // 使用 CSS
import './style/global.css' // 使用自定义 CSS
import './style/iconfont.css' // 使用自定义字体CSS
import './style/common.css' // 使用自定义字体CSS
// import 'swiper/dist/idangerous.swiper.css'
import 'swiper/dist/css/swiper.min.css'
Vue.config.productionTip = false
Vue.prototype.$http = axios
Vue.use(iView) // 必不可少的
Vue.use(Vuex)
import vueLazy from "vue-lazyload"
// Vue.use(VueLazyload)
var userAgent = window.navigator.userAgent;
if (userAgent.indexOf('NET') != -1) {
    //ie浏览器不兼容懒加载组件处理
    Vue.directive('lazy', function(el, binding) {
        el.src = binding.value
    })
} else {
    //实现图片懒加载
    Vue.use(vueLazy, {
        preLoad: 2.0,
        attempt: 3,
        // loading: require('@/assets/loading.jpg'),
        // listenEvents: ["scroll"],
        lazyComponent: true
    });
}
// Vue.use(VueLazyload, {
//     preLoad: 1.3,
//     // error: require('@/assets/error.jpg'),
//     // loading: require('@/assets/loading.jpg'),
// })
/* eslint-disable no-new */
router.afterEach((to, from, next) => {
    window.scrollTo(0, 0);
})
new Vue({
    el: '#app',
    router,
    components: { App },
    template: '<App/>'
})