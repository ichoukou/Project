import axios from 'axios';

let base = '';

/**
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

//获取政策通知
export const getAllNoticeList = params => { return axios.get(`/api/notice/list`,{ params: params}); };
export const getPolicelist = params => { return axios.get(`/api/policy/list`,{ params: params}); };//获取相关政策列表
export const getDitchList = params => { return axios.get (`/api/channel/list`,{ params: params}); };//国际渠道列表
export const getachievements = params => { return axios.get (`/api/achievement/list` , {params: params});};//技术成果列表
export const getAlltelentpersonList = params =>{ return axios.get(`/api/telentperson/list`, { params: params}) ; };//专家列表
// export const getNoticeDetail = params => { return axios.get(`/api/notice/` + params ); };


export const getTelentpersonDetail = params =>{return axios.get(`/api/telentperson/` + params ); };//专家详情
export const getNav = params =>{ return axios.get(`/api/code/list`, { params: params}) ; };//导航
export const getditchdetail = params => { return axios.get (`/api/channel/` + params) ; };//国际渠道详情
export const getachievementdetail = params => { return axios.get (`/api/achievement/`+ params);};//技术成果详情
export const getdemanddetail = params => { return axios.get(`/api/demand/` + params ); }; //技术需求详情
export const getdemandList = params => { return axios.get(`/api/demand/list/`, { params: params}); };//技术需求列表
export const getCompanyList = params => { return axios.post(`/api/company/list/`, params); };//技术企业库列表
export const getcompanydetail = params => { return axios.get(`/api/company/detail?id=` +params);};//公司详情
//获取当前用户信息
export const getCurrentUserInfo = params => { return axios.get(`/api/user/getCurrent`, { params: params }); };
//获取通知公告详情
export const getNoticeDetail=params=>{return axios.get(`/api/notice/`+params);};
//获取相关政策详情
export const getPoliceDetail=params=>{return axios.get(`/api/policy/`+params);};
//获取个人中心
export const getPersonCentre = params => { return axios.get(`/api/user/getPersonCentre`); };
//删除一条发布的信息
export const deletedemand = params => { return axios.delete(`/api/demand/delete/` + params ); };
//删除一条技术成果
export const deleteachievement = params => { return axios.delete(`/api/achievement/delete/` + params ); };
