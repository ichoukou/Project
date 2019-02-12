import Vue from 'vue'
import Router from 'vue-router'
import home_pc from '@/components/home_pc'
import index from '@/components/pages/index'
import news from '@/components/pages/news'
import introduce from '@/components/pages/introduce'
import education from '@/components/pages/education'
import setting from '@/components/pages/setting'
import party from '@/components/pages/party'
import activity from '@/components/pages/activity'
import view from '@/components/pages/view'
import teachers from '@/components/pages/teachers'
import department from '@/components/pages/department'
// 移动端访问
import home_m from '@/components/home_m'
import mindex from '@/components/pages/m/mindex'
import store from '../vuex/store'
Vue.use(Router)
const router = new Router({
    routes: [
        { path: '/home_pc',redirect: '/home_pc/index'},
        {
            path: '/home_pc',
            component: home_pc,
            children: [
                { path: '/home_pc/index', name: 'index', component: index },
                { path: '/home/introduce', name: 'introduce', component: introduce },
                { path: '/home/news', name: 'news', component: news },
                { path: '/home/education', name: 'education', component: education },
                { path: '/home/setting', name: 'setting', component: setting },
                { path: '/home/view', name: 'view', component: view },
                { path: '/home/teachers', name: 'teachers', component: teachers },
                { path: '/home/party', name: 'party', component: party },
                { path: '/home/department', name: 'department', component: department },
                { path: '/home/activity', name: 'activity', component: activity },
            ]
        },

        { path: '*', redirect: '/home_pc/index' },
        // 手机端
        { path: '/home_m', component: home_m, redirect: '/home_m/m/mindex' },
        { path: '*', redirect: '/home_m' },
     {
         path: '/home_m',
         component: home_m,
         children: [
         { path: '/home_m/mindex', name: 'mindex', component: mindex },
         ]
     }
   

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