import Vue from 'vue'
import Router from 'vue-router'
// pc端
import home_pc from '@/components/home_pc'
import index_pc from '@/components/pages/pc/index' //首页
// 手机
import home_m from '@/components/home_m'
import mindex from '@/components/pages/m/index' //首页
import introduce from '@/components/pages/m/introduce' //学校简介
import map from '@/components/pages/m/map' //导航
import view from '@/components/pages/m/view' //视窗探索
import yqlj from '@/components/pages/m/yqlj' //友情链接

// 手机pc端公用页面
import honory from '@/components/pages/basic/honory' //学校荣誉
import newsList from '@/components/pages/news/newsList' //校园新闻
import newsDetail from '@/components/pages/news/newsDetail' //新闻详情
import detail from '@/components/pages/news/detail' //新闻详情
Vue.use(Router)

export default new Router({
    routes: [
        // pc端
        { path: '/home_pc', redirect: '/home_pc/pc/index' },
        { path: '*', redirect: '/home_pc/pc/index' },
        {
            path: '/home_pc',
            component: home_pc,
            children: [
                { path: '/home_pc/pc/index', name: 'index_pc', component: index_pc },
                { path: '/home_pc/newsList/:id', name: 'newsListpc', component: newsList },
                { path: '/home_pc/honory', name: 'honorpc', component: honory },
                { path: '/home_pc/newsDetail', name: 'newsDetailpc', component: newsDetail },
            ]
        },
        // 手机端
        { path: '/home_m', component: home_m, redirect: '/home_m/m/index' },
        { path: '*', redirect: '/home_m' },
        {
            path: '/home_m',
            component: home_m,
            children: [
                { path: '/home_m/m/index', name: 'mindex', component: mindex },
                { path: '/home_m/m/introduce', name: 'introduce', component: introduce },
                { path: '/home_m/m/map', name: 'map', component: map },
                { path: '/home_m/m/view', name: 'view', component: view },
                { path: '/home_m/m/yqlj', name: 'yqlj', component: yqlj },
                { path: '/home_m/news/newsList', name: 'newsList', component: newsList, meta: { keepAlive: true } },
                { path: '/home_m/news/newsDetail', name: 'newsDetail', component: newsDetail },
            ]
        },

        // 手机pc端公用页面
        { path: '/honory', name: 'honory', component: honory },
        { path: '/detail', name: 'detail', component: detail },
    ]

})