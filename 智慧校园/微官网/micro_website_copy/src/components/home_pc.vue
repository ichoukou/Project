<template>
  <div class="list">
    <!-- 头部 -->
    <div class="heard">
<div class="top">
<div class="logo"><img src="http://res.weiunity.com/template/xuexiao1/images/logo.jpg" alt="LOGO"></div>
<div class="xnx3top_right_imagediv"><img src="http://res.weiunity.com/template/xuexiao1/images/bg01.jpg"></div>
</div>
</div>

<div class="rz_bw_nav001_m">
<div class="nav">
<!-- <div class="nav_main"> -->
  <div >
<ul id="nav_all">
<li><a @click="lianjie(0)">首页</a></li>
<li class="spale"><img src="http://res.weiunity.com/template/xuexiao1/images/navbg2.jpg" width="2" height="61"></li>
<li><a @click="lianjie(1)">学校简介</a></li>
<li class="spale"><img src="http://res.weiunity.com/template/xuexiao1/images/navbg2.jpg" width="2" height="61"></li>
<li><a @click="lianjie(2)">校园新闻</a></li>
<li class="spale"><img src="http://res.weiunity.com/template/xuexiao1/images/navbg2.jpg" width="2" height="61"></li>
<li><a @click="lianjie(3)">教育科研</a></li>
<li class="spale"><img src="http://res.weiunity.com/template/xuexiao1/images/navbg2.jpg" width="2" height="61"></li>
<li ><a @click="lianjie(4)">学校设置</a></li>
<li class="spale"><img src="http://res.weiunity.com/template/xuexiao1/images/navbg2.jpg" width="2" height="61"></li>
<li><a @click="lianjie(5)">党建工作</a></li>
<li class="spale"><img src="http://res.weiunity.com/template/xuexiao1/images/navbg2.jpg" width="2" height="61"></li>
<li><a @click="lianjie(6)">校园风光</a></li>
<li class="spale"><img src="http://res.weiunity.com/template/xuexiao1/images/navbg2.jpg" width="2" height="61"></li>
<li><a @click="lianjie(7)">师资队伍</a></li>
<li class="spale"><img src="http://res.weiunity.com/template/xuexiao1/images/navbg2.jpg" width="2" height="61"></li>
<li><a @click="lianjie(8)">部门机构</a></li>
<li class="spale"><img src="http://res.weiunity.com/template/xuexiao1/images/navbg2.jpg" width="2" height="61"></li>
<li><a @click="lianjie(9)">活动专栏</a></li>
<li class="spale"><img src="http://res.weiunity.com/template/xuexiao1/images/navbg2.jpg" width="2" height="61"></li>
</ul>
</div>
</div>
</div>

    <!-- 头部 -->
      <Content>
 <router-view/>
      </Content>
<!-- 底部 -->
<footer style="">
<div class="bottom">
地址：江西省萍乡市建设西路 电话：7086099<br>
版权所有 © 2009 学校演示站1 All Rights Reserved 技术支持:<a href="http://wang.market" target="_black">网市场</a>
</div>
</footer>
  </div>
</template>
<script>
import Vue from 'vue'
import { Tabbar, TabbarItem, Group, Cell,Search } from 'vux'
export default {
  components: {
    Tabbar,
    TabbarItem,
    Group,
    Cell,
    Search
  },
  data() {
    return {
       results: [],
      value: ''
    }
  },
  methods: {
lianjie(index){
  if(index==1){
     this.$router.push({ name: "introduce" })
     }else if(index==2){
     this.$router.push({ name: "news" })
     }else if(index==3){
     this.$router.push({ name: "education" })
     }else if(index==4){
     this.$router.push({ name: "introduce" })
     }else if(index==5){
     this.$router.push({ name: "setting" })
     }else if(index==6){
     this.$router.push({ name: "view" })
     }else if(index==7){
     this.$router.push({ name: "party" })
     }else if(index==8){
     this.$router.push({ name: "department" })
     }else if(index==9){
     this.$router.push({ name: "activity" })
     }else{
       this.$router.push({ name: "index" })
     }
}
  },
  mounted: function () {
  },
}
</script>
<style>

</style>
<style scoped>

</style>
