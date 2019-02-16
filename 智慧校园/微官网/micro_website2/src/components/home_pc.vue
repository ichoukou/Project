<template>
  <div>
    <header>
      <div class="headerContainer">
        <div class="headerLogo"><img src="http://www.qhfx.edu.cn/app/static/images/logo-white-260X53.png"></div>
        <ul class="navlist">
            <li @click="shouye()">首页</li>
            <li style="position:relative" @mouseenter="enter()" @mouseleave="leave()">学校概况
        
								<div id="show-list" v-show="xxgm" >
					<ul class="intro">
						<li @click="xxry(2,'学校荣誉')">学校荣誉</li>
             <li @click="detail(21,'组织机构')">组织机构</li>
              <li @click="detail(22,'校风校训')">校风校训</li>
             <li @click="detail(23,'学校简介')"> 学校简介</li>
             <li @click="detail(24,'走进校园')"> 走进校园</li></ul>
				</div>
        </li>
            <li @click="menus(2,'校园动态')">校园动态</li>
            <li @click="menus(3,'党建之窗')">党建之窗</li>
            <li @click="xxry(3,'教师发展')">教师发展</li>
            <li @click="menus(5,'学生园地')">学生园地</li>
            <li @click="menus(6,'教育科研')">教育科研</li>
            <li @click="menus(7,'德育之窗')">德育之窗</li>
            <li @click="menus(8,'平安校园')">平安校园</li>
            <li @click="menus(9,'家校互动')">家校互动</li>
        </ul>
        <div class="clear"></div>
      </div>
    </header>
    <Content>
      <router-view v-bind:header="menutitle"/>
    </Content>
  </div>
</template>
<script>
import Vue from "vue";
export default {
  methods: {
 index(){
   this.$router.push({ name: "pcindex"});
    // this.$router.push({ name: "noticeadd", params: { name: this.name } });
 },
 shouye(){
this.$router.push({name:'index_pc'});
 },
 xxry(id,meunheader){
 this.menutitle=meunheader;
 this.$router.push({name:'honorpc'});
 },
enter(){
this.xxgm=true;
},
leave(){
this.xxgm=false;
},
menus(id,meunheader){
  this.menutitle=meunheader;
     this.$router.push({ path: '/home_pc/newsList/'+id});
},
detail(id,meunheader){
  this.menutitle=meunheader;
  this.$router.push({path:'/home_pc/newsDetail'});
},
  },
  data() {
    return {
      menutitle:'校园新闻',
      xxgm:false,
      introList:[{name:'学校介绍',link:'/#/profile'},{name:'走进校园',link:'/#/profile'},{name:'办学方向',link:'/#/profile'},{name:'办学理念',link:'/#/profile'}],
      // navList: [
        // { link: '/home_pc/pc/index', name: '首页' },
        // { link: '/home_m/m/introduce', name: '学校简介' },
        // { link: '/newsList/4', name: '校园新闻' },
        // { link: '/newsList/4', name: '党建之窗' },
        // { link: '/newsList/4', name: '教资队伍' },
        // { link: '/newsList/4', name: '学生园地' },
        // { link: '/newsList/4', name: '教育科研' },
        // { link: '/newsList/4', name: '德育之窗' },
        // { link: '/newsList/4', name: '平安校园' },
        // { link: '/newsList/4', name: '家校互动' },
      // ],
    };
  },
  mounted() { },
};
</script>
<style scoped>
header {
  width: 100%;
  background: rgba(102, 51, 153, 0.8) url() repeat top center scroll;
}
.headerContainer {
  width: 1200px;
  height: 100px;
  line-height: 100px;
  margin: 0 auto;
}
.headerLogo {
  padding-top: 20px;
  float: left;
}
.navlist {
  float: right;
}
.navlist li {
  float: left;
  margin-left: 25px;
  color: #fff;
  font-size: 16px;
  list-style:none;
  cursor:pointer;
}
.navlist>li>a{
  color:#fff;
}
#show-list {
    position: absolute;
    z-index: 999;
    top: 66px;
    left: -40px;
}
#show-list li {
    width: 90px;
    height: 40px;
    font-size: 14px;
    line-height: 40px;
     background:#fff;
     color:rgba(102, 51, 153, 0.8);
    border-bottom: 1px solid #bbb;
    padding-bottom: 0;
    text-align:center;
}
.intro li>a{
color: rgba(102, 51, 153, 0.8)
}
</style>
