// vuex/store.js
import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
    state:{
        //定义一个存储map，key：导航name，value：导航params
        paramMap: {}
       },
    mutations:{
        REFRESHPARAM (state, paramKV) {
        //mutation，应该能看懂做的操作吧？
        Vue.set(state.paramMap, paramKV.key, paramKV.value)
        }
    }
})