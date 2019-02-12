import Vue from 'vue'
import Router from 'vue-router'
import home from '@/components/home'
import index from '@/components/pages/index'
import order from '@/components/pages/broadcast_order'
import direct from '@/components/pages/broadcast_direct'
import detail from '@/components/pages/broadcast_detail'
import my from '@/components/pages/my'
import search from '@/components/pages/search'
import store from '../vuex/store'
Vue.use(Router)
const router = new Router({
    routes: [
        { path: '*', redirect: '/home/index' },
        {
            path: '/home',
            component: home,
            children: [
                { path: '/home/index', name: 'index', component: index },
                { path: '/home/broadcast_order', name: 'order', component: order },
                { path: '/home/broadcast_direct', name: 'direct', component: direct },
                { path: '/home/my', name: 'my', component: my },
            ]
        },
        { path: '/search', name: 'search', component: search },
        { path: '/broadcast_detail', name: 'detail', component: detail },
    ]
})

router.beforeEach((to, from, next) => {
    // 只有在找不到params时才"出此下策"
    if (Object.keys(to.params).length === 0) {
        // 从store中取出付给params，此处注意路径未必完全吻合，以你的为准
        Object.assign(to.params, store.state.paramMap[to.name] || {})
    }
    // 存储一下params备用
    store.commit('REFRESHPARAM', { key: to.name, value: to.params })
    next() // 千万不要忘了，否则导航会被“掐死”在这儿。:-D
})


export default router;