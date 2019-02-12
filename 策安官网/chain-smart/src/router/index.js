import Vue from 'vue'
import Router from 'vue-router'
// pc端
import home_pc from '@/components/home_pc'
import index from '@/components/pages/pc/index' //首页
import gyca from '@/components/pages/pc/gyca' //关于策安
import cpfw from '@/components/pages/pc/cpfw' //产品服务
import fsy from '@/components/pages/pc/cpfwdetail/fsy' //放射源
import ydzyhk from '@/components/pages/pc/cpfwdetail/ydzyhk' //移动作业许可
import gfcz from '@/components/pages/pc/cpfwdetail/gfcz' //固废处置
import zlaq from '@/components/pages/pc/cpfwdetail/zlaq' //质量安全管理
import pxkc from '@/components/pages/pc/cpfwdetail/pxkc' //hse培训课程
import msds from '@/components/pages/pc/cpfwdetail/msds' //msds培训课程
import khal from '@/components/pages/pc/khal' //客户案例
import khaldetail from '@/components/pages/pc/khaldetail' //客户案例详情
import xwdt from '@/components/pages/pc/xwdt' //新闻动态
import xwdtdetail from '@/components/pages/pc/xwdtdetail' //新闻动态详情
import lxwm from '@/components/pages/pc/lxwm' //联系我们
import jrwmdetail from '@/components/pages/pc/jrwmdetail' //加入我们详情
import hsezxgl from '@/components/pages/pc/cpfwdetail/hsezxgl' //hse咨询管理
import hseszcp from '@/components/pages/pc/cpfwdetail/hseszcp' //hse数字产品
// 手机
import home_m from '@/components/home_m'
import mindex from '@/components/pages/m/index' //首页
import mgyca from '@/components/pages/m/gyca' //关于策安
import mcpfw from '@/components/pages/m/cpfw' //产品服务
import mkhal from '@/components/pages/m/khal' //产品服务
import mxwdt from '@/components/pages/m/xwdt' //新闻动态
import mlxwm from '@/components/pages/m/lxwm' //联系我们
import mfsy from '@/components/pages/m/cpfwdetail/fsy' //放射源
import mfxzy from '@/components/pages/m/cpfwdetail/fxzy' //风险作业
import mfwcz from '@/components/pages/m/cpfwdetail/fwcz' //废物处置
import mzlaq from '@/components/pages/m/cpfwdetail/zlaq' //质量安全
import mmsds from '@/components/pages/m/cpfwdetail/msds' //msds
import mpxkc from '@/components/pages/m/cpfwdetail/pxkc' //hse培训课程
import mxtgl from '@/components/pages/m/cpfwdetail/xtgl' //hse协同管理
import mlhjx from '@/components/pages/m/cpfwdetail/lhjx' //量化绩效
import mjrwmDetail from '@/components/pages/m/jrwmDetail' //加入我们详情
import mkhalDetail from '@/components/pages/m/khalDetail' //客户案例详情
import mxwDetail from '@/components/pages/m/xwDetail' //新闻详情
// Pad
import home_pad from '@/components/home_pad'
import padindex from '@/components/pages/pad/index' //首页
import padgyca from '@/components/pages/pad/gyca' //关于策安
import padcpfw from '@/components/pages/pad/cpfw' //产品服务
import padkhal from '@/components/pages/pad/khal' //产品服务
import padxwdt from '@/components/pages/pad/xwdt' //新闻动态
import padlxwm from '@/components/pages/pad/lxwm' //联系我们
import padjrwmDetail from '@/components/pages/pad/jrwmDetail' //加入我们详情
import padkhalDetail from '@/components/pages/pad/khalDetail' //客户案例详情
import padxwDetail from '@/components/pages/pad/xwDetail' //新闻详情
import padfsy from '@/components/pages/pad/cpfwdetail/fsy' //放射源
import padfxzy from '@/components/pages/pad/cpfwdetail/fxzy' //风险作业
import padfwcz from '@/components/pages/pad/cpfwdetail/fwcz' //废物处置
import padzlaq from '@/components/pages/pad/cpfwdetail/zlaq' //质量安全
import padmsds from '@/components/pages/pad/cpfwdetail/msds' //msds
import padpxkc from '@/components/pages/pad/cpfwdetail/pxkc' //hse培训课程
import padxtgl from '@/components/pages/pad/cpfwdetail/xtgl' //hse协同管理
import padlhjx from '@/components/pages/pad/cpfwdetail/lhjx' //量化绩效
Vue.use(Router)
export default new Router({
    routes: [
        // pc端
        { path: '/home_pc', redirect: '/home_pc/pc/index' },
        {
            path: '/home_pc',
            component: home_pc,
            children: [
                { path: '/home_pc/pc/index', name: '', component: index },
                { path: '/home_pc/pc/gyca', name: 'gyca', component: gyca },
                { path: '/home_pc/pc/cpfw', name: 'cpfw', component: cpfw },
                { path: '/home_pc/pc/cpfwdetail/fsy', name: 'fsy', component: fsy },
                { path: '/home_pc/pc/cpfwdetail/ydzyhk', name: 'ydzyhk', component: ydzyhk },
                { path: '/home_pc/pc/cpfwdetail/gfcz', name: 'gfcz', component: gfcz },
                { path: '/home_pc/pc/home_m/zlaq', name: 'glaq', component: zlaq },
                { path: '/home_pc/pc/cpfwdetail/pxkc', name: 'pxkc', component: pxkc },
                { path: '/home_pc/pc/cpfwdetail/msds', name: 'msds', component: msds },
                { path: '/home_pc/pc/khal', name: 'khal', component: khal },
                { path: '/home_pc/pc/khaldetail', name: 'khaldetail', component: khaldetail },
                { path: '/home_pc/pc/xwdt', name: 'xwdt', component: xwdt },
                { path: '/home_pc/pc/xwdtdetail', name: 'xwdtdetail', component: xwdtdetail },
                { path: '/home_pc/pc/lxwm', name: 'lxwm', component: lxwm },
                { path: '/home_pc/pc/jrwmdetail', name: 'jrwmdetail', component: jrwmdetail },
                { path: '/home_pc/pc/cpfwdetail/hsezxgl', name: 'hsezxgl', component: hsezxgl },
                { path: '/home_pc/pc/cpfwdetail/hseszcp', name: 'hseszcp', component: hseszcp },
            ]
        },

        { path: '*', redirect: '/home_pc/pc/index' },
        // 手机端
        { path: '/home_m', component: home_m, redirect: '/home_m/m/index' },
        { path: '*', redirect: '/home_m' },
        {
            path: '/home_m',
            component: home_m,
            children: [
                { path: '/home_m/m/index', name: 'mindex', component: mindex },
                { path: '/home_m/m/gyca', name: 'mgyca', component: mgyca },
                { path: '/home_m/m/cpfw', name: 'mcpfw', component: mcpfw },
                { path: '/home_m/m/khal', name: 'mkhal', component: mkhal },
                { path: '/home_m/m/xwdt', name: 'mxwdt', component: mxwdt },
                { path: '/home_m/m/lxwm', name: 'mlxwm', component: mlxwm },
                { path: '/home_m/m/cpfwdetail/fsy', name: 'mfsy', component: mfsy },
                { path: '/home_m/m/cpfwdetail/fxzy', name: 'mfxzy', component: mfxzy },
                { path: '/home_m/m/cpfwdetail/fwcz', name: 'mfwcz', component: mfwcz },
                { path: '/home_m/m/cpfwdetail/zlaq', name: 'mzlaq', component: mzlaq },
                { path: '/home_m/m/cpfwdetail/msds', name: 'mmsds', component: mmsds },
                { path: '/home_m/m/cpfwdetail/pxkc', name: 'mpxkc', component: mpxkc },
                { path: '/home_m/m/cpfwdetail/xtgl', name: 'mxtgl', component: mxtgl },
                { path: '/home_m/m/cpfwdetail/lhjx', name: 'mlhjx', component: mlhjx },
                { path: '/home_m/m/jrwmDetail', name: 'mjrwmDetail', component: mjrwmDetail },
                { path: '/home_m/m/khalDetail', name: 'mkhalDetail', component: mkhalDetail },
                { path: '/home_m/m/xwDetail', name: 'mxwDetail', component: mxwDetail },

            ]
        },
        // pad
        { path: '/home_pad', component: home_pad, redirect: '/home_pad/pad/index' },
        { path: '*', redirect: '/home_pad' },
        {
            path: '/home_pad',
            component: home_pad,
            children: [
                { path: '/home_pad/pad/index', name: 'padindex', component: padindex },
                { path: '/home_pad/pad/gyca', name: 'padgyca', component: padgyca },
                { path: '/home_pad/pad/cpfw', name: 'padcpfw', component: padcpfw },
                { path: '/home_pad/pad/khal', name: 'padkhal', component: padkhal },
                { path: '/home_pad/pad/xwdt', name: 'padxwdt', component: padxwdt },
                { path: '/home_pad/pad/lxwm', name: 'padlxwm', component: padlxwm },
                { path: '/home_pad/pad/jrwmDetail', name: 'padjrwmDetail', component: padjrwmDetail },
                { path: '/home_pad/pad/khalDetail', name: 'padkhalDetail', component: padkhalDetail },
                { path: '/home_pad/pad/xwDetail', name: 'padxwDetail', component: padxwDetail },
                { path: '/home_pad/pad/cpfwdetail/fsy', name: 'padfsy', component: padfsy },
                { path: '/home_pad/pad/cpfwdetail/fxzy', name: 'padfxzy', component: padfxzy },
                { path: '/home_pad/pad/cpfwdetail/fwcz', name: 'padfwcz', component: padfwcz },
                { path: '/home_pad/pad/cpfwdetail/zlaq', name: 'padzlaq', component: padzlaq },
                { path: '/home_pad/pad/cpfwdetail/padsds', name: 'padmsds', component: padmsds },
                { path: '/home_pad/pad/cpfwdetail/pxkc', name: 'padpxkc', component: padpxkc },
                { path: '/home_pad/pad/cpfwdetail/xtgl', name: 'padxtgl', component: padxtgl },
                { path: '/home_pad/pad/cpfwdetail/lhjx', name: 'padlhjx', component: padlhjx },
            ],
        }
    ]
})