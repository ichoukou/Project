import axios from 'axios';

let base = '';

//获取系统列表
export const getSystemList=params=>{return axios.get(`${base}/api/statistic/system/list`,{params:params});};
//获取企业详情
export const getCompanyDetail=params=>{return axios.get(`${base}/api/statistic/company/detail`,{ params: params });};
//获取二级指标
export const getIndiacateList=params=>{return axios.get(`${base}/api/statistic/indicate/list`,{ params: params });};

//获取一级指标
export const getfirstList=params=>{return axios.get(`${base}/api/statistic/data/`+params);};

/**********普通用户数据***********/
//获取图表数据
export const getChart=params=>{return axios.get(`${base}/api/tdata/company/chart`,{ params: params });};
//获取企业数量
export const getCompanyCount=params=>{return axios.get(`${base}/api/tdata/company/count`,{ params: params });};
//获取企业列表
export const getCompanyList=params=>{return axios.get(`${base}/api/tdata/company/list`,{ params: params });};
//获取列表表头
export const getListHead=params=>{return axios.get(`${base}/api/tdata/company/list_tag`,{ params: params });};
//获取详情
export const getDetail=params=>{return axios.get(`${base}/api/tdata/company/detail`,{ params: params });};
//获取当前用户
export const getCurrentUser=params=>{return axios.get(`${base}/api/user/current`);};

/**
 *
 *
*任何地方可以使用以下方法进行请求
this.$http.get('/api/etrc/api/class/tax_office_first_class_list')
	.then(function(response) {
	  console.log(response);
	  alert(response);
	})
	.catch(function(response) {
	  console.log(response);
	});
**/
