import axios from 'axios';

axios.interceptors.request.use(config => {
    config.headers.common['Authorization'] = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1aWQiOiIwMTY3YzY3YWYxZTI0MDI4YjIxMTY3YzYxNzUyMDAwNSIsInJvbGVJZCI6IjAxNjcxNmVlMmRjMzQwMjhiMjExNjcxNmUzNzIwMTMxIiwiY3VycmVudFRpbWVNaWxsaXMiOiIxNTQ1Mjc3MDYwMzQ2IiwiYXBwS2V5IjoieHBvbGlzIiwidXNlck5hbWUiOiLlrpjnvZHnlKjmiLciLCJyb2xlTGlzdCI6Ilt7XCJyb2xlX2lkXCI6XCIwMTY3MTZlZTJkYzM0MDI4YjIxMTY3MTZlMzcyMDEzMVwiLFwicm9sZV9uYW1lXCI6XCJ4cG9saXPlvIDlj5HogIVcIn0se1wicm9sZV9pZFwiOlwiMDE2N2M5NDM1YzFlMmM5MTk4MmI2N2M5NDM1YzAwMDBcIixcInJvbGVfbmFtZVwiOlwi5a6Y572R5Y-q6K-76KeS6ImyXCJ9XSIsImV4cCI6NDcwMTg1OTIwMCwiYWNjb3VudCI6IndlYnNpdGVfcHJkIiwib3JnSWQiOiIwMTY3NWUzNjFmZmY0MDI4YjIxMTY3NWUxZDFjMDAwMiJ9.rR2rBkksj6rcvibGwYidWPJddZWibDg4NKE0gtBNajU";
    return config
}, error => {
    return Promise.reject(error)
})

let base = 'http://39.106.43.232:8888';
// let base = 'http://47.92.141.242:8888';
// let base = 'http://192.168.50.145:8888';
//获取在线留言
export const savePoliceInfo = params => { return axios.post(`${base}/website/api/form/website_leaveword`, params); };
//获取新闻列表
export const getNews = params => { return axios.post(`${base}/website/api/getDatas/website_news`, params); };
//获取新闻详情
export const getNewsDetail = params => { return axios.post(`${base}/website/api/getForm/website_news`, params); };
//获取客户案例
export const getKhal = params => { return axios.post(`${base}/website/api/getDatas/website_case`, params); };
//获取客户案例详情
export const getKhalDeatail = params => { return axios.post(`${base}/website/api/getForm/website_case`, params); };
//获取加入我们招聘
export const getJrwm = params => { return axios.post(`${base}/website/api/getDatas/website_recruit`, params); };
//获取加入我们招聘详情
export const getJrwmDetail = params => { return axios.post(`${base}/website/api/getForm/website_recruit`, params); };

// 获取图片
export const getImg = (params) => { return `${base}/website/file/getFileById/?contentDis=inline&fileId=` + params };

//获取轮播图
export const getLunbo = params => { return axios.post(`${base}/website/api/getDatas/website_banner`); };