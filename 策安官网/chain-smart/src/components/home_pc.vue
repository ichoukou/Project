<template>
  <div class="layout">
    <!-- <Layout> -->
      <div class="header" id="meunhua">
        <div class="w">
          <Menu mode="horizontal"  class="topMenu" :theme="theme1"  ref="leftMenu"  :active-name="active" @on-select="menuSelect" >
            <div class="layout-logo" ></div>   
            <div class="layout-nav">
              <MenuItem class="menuItem" name="/home_pc/pc/index" > 首页 </MenuItem>
              <MenuItem class="menuItem"  name="/home_pc/pc/gyca" >关于策安</MenuItem>
              <MenuItem class="menuItem"  name="/home_pc/pc/cpfw" >产品服务</MenuItem>
              <MenuItem class="menuItem"  name="/home_pc/pc/khal">客户案例</MenuItem>
              <MenuItem class="menuItem"  name="/home_pc/pc/xwdt">新闻动态</MenuItem>
              <MenuItem class="menuItem"  name="/home_pc/pc/lxwm">联系我们</MenuItem>
              <MenuItem class="menuItem" name="/" id="dvn"><a target="_blank" href="https://www.dnvgl.com/"><div class="dnv"></div></a></MenuItem>
            </div>
          </Menu>   
        </div>
      </div>   
 <Content>
 <div style="min-width:1024px;">
          <router-view/>
        </div>
      </Content>
      <!-- 联系我们 -->
<div class="lxwm" >
  <div class="lxwm_content w" >
    <div style="float:left">
       <img v-lazy="pcurl+'img_logo_w.png'" >
       <ul style="margin-top: 4vh;">
              <li class="lxfs">
                <img v-lazy="pcurl+'ion_dianhua_footer.png'" class="gsjj_picture">
                <p class="gswz1">服务电话：400-017-8016</p>
                <div style="clear:both"></div>
              </li>
              <li class="lxfs">
                <img v-lazy="pcurl+'icon_dizhi_footer.png'" class="gsjj_picture">
                <p class="gswz1">公司地址：上海市徐汇区白色路100号，28号楼</p>
                <div style="clear:both"></div>
              </li>
              <li class="lxfs">
                <img v-lazy="pcurl+'icon_jiaofu_footer.png'" class="gsjj_picture">
                <p class="gswz1">烟台交付中心：山东省烟台市开发区长江路161号，天马中心A-705室</p>
                <div style="clear:both"></div>
              </li>
              <li class="lxfs">
                <img v-lazy="pcurl+'icon_shenyang_footer.png'" class="gsjj_picture">
                <p class="gswz1">沈阳办事处：沈阳市沈河区市府路290号摩根凯利大厦A座1209室</p>
                <div style="clear:both"></div>
              </li>
              <li class="lxfs">
                <img v-lazy="pcurl+'icon_youxiang_footer.png'"  style="margin-top:2px;" class="gsjj_picture">
                <p class="gswz1">电子邮箱：cj@chain-smart.com</p>
                <div style="clear:both"></div>
              </li>

        </ul>
    </div>
    <div style="float:right;text-align:center"><img v-lazy="pcurl+'img_erweima.png'" >
    <p class="smgz">扫码加关注</p>
    <div class="yqlj_outer"><div class="yqlj" style="float:left;">友情链接：</div><a target="_blank" href="https://www.dnvgl.com/" style="float:right;"><img src="http://oss.chain-smart.com/assets/icon_dnv_hui.png"></a></div>
    </div>
    <div style="clear:both"></div>
  </div>
</div>
      <!-- <Footer class="layout-footer-center">Copyright © 2017 上海策安能源科技有限公司 <a href="http://www.miitbeian.gov.cn" style="color:#blue" target="_blank">沪ICP备17025253号-1</a></Footer> -->
      <Footer class="layout-footer-center">Copyright © 2017 上海策安能源科技有限公司 <a href="http://www.miitbeian.gov.cn" style="color: #808080;" target="_blank">沪ICP备17025253号-1</a></Footer>
    <!-- </Layout> -->
  </div>
</template>
<script>
import Vue from "vue";
export default {
  methods: {
    getParams() {
      // 这个方法里定义好，高亮和路由
      let path = this.$route.matched[1].path; // 获取到地址拦上#号后面的url地址
      if (path.indexOf("/home_pc/pc/cpfw") != -1) {
        // 是否包含，-1是包含，0不包含
        sessionStorage.setItem("value", "/home_pc/pc/cpfw");
      } else if (path.indexOf("/home_pc/pc/khal") != -1) {
        sessionStorage.setItem("value", "/home_pc/pc/khal");
      } else if (path.indexOf("/home_pc/pc/ditch") != -1) {
        sessionStorage.setItem("value", "/home_pc/pc/ditch");
      } else if (path.indexOf("/home_pc/pc/index") != -1) {
        sessionStorage.setItem("value", "/home_pc/pc/index");
      }else if(path.indexOf("/home_pc/pc/xwdt") != -1){
         sessionStorage.setItem("value", "/home_pc/pc/xwdt");
      }
    },
    menuSelect(name) {
        this.$router.push({ path: name });
    },
  },
  data() {
    return {
      pcurl:'http://oss.chain-smart.com/assets/',
       theme1: 'light',
      isLogin: false,
      user: {},
      personalUrl: "",
      active: sessionStorage.getItem("value")
    };
  },
  mounted() {
    //     let path = this.$route.matched[1].path;
    // if (path.indexOf("/home_pc/pc/index") != -1) {
    //   alert("111");
    //   sessionStorage.setItem("value", "/home_pc/pc/pc/index");
    // }
        window.onscroll=function(){
          let  scroll= document.documentElement.scrollTop||document.body.scrollTop;
         if(scroll>5){
              document.getElementById("meunhua").style.background="#fff";
         }else{
           document.getElementById("meunhua").style.background="transparent";
         }
    }
  },
  //监听路由的变化：在本页面监听所有点击事件路由的变化
  watch: {
    $route: "getParams"
  },
  updated() {
    this.active = sessionStorage.getItem("value");
  },
beforeCreate() {
    let path = this.$route.matched[1].path;
    if (path.indexOf("/home_pc/pc/index") != -1) {
      sessionStorage.setItem("value", "/home_pc/pc/index");
    }
  }
};
</script>
<style scoped>
.header {
  width: 100%;
  background: transparent;
  z-index:10000;
  position:fixed;
  top:0;
  /* position: fixed;
  top: 0;
  border:1px solid #000;
  z-idnex: 100; */
  box-shadow:  0 0 4px 0 rgba(0,0,0,.1), 0 2px 3px 0 rgba(0,0,0,.1);
}
.top_header_div {
  width: 100%;
  height: 40px;
  padding: 10px 50px;
}
.top_header_div span {
  display: inline-block;
  background: #308bd8;
  padding: 1px 8px;
  font-size: 14px;
  color: #fff;
  margin-right: 110px;
  margin-top: -20px;
}
.menuItem {
  /* padding: 0 15px !important; */
  padding: 0 14px !important;
  font-size: 16px;
  height: 80px !important;
  line-height: 80px !important;
  margin-left: 3px !important;
}
.menuItem:first-child{
  margin-left: 35px !important; 
}
.topMenu {
  padding: 8px 0px;
  background: transparent;
  /* height: 100%; */
  height: 80px;
  width: 100%;
  /* border:1px solid #000; */
/* position:fixed; */
}
.ivu-layout-header {
  height: 80px !important;
}
.ivu-menu-primary.ivu-menu-horizontal .ivu-menu-item-active,
.ivu-menu-primary.ivu-menu-horizontal .ivu-menu-item:hover,
.ivu-menu-primary.ivu-menu-horizontal .ivu-menu-submenu-active,
.ivu-menu-primary.ivu-menu-horizontal .ivu-menu-submenu:hover {
  background: none !important;
  font-weight: bold;
  border-bottom: 3px solid #fff;
}
.ivu-menu-light.ivu-menu-horizontal .ivu-menu-item{
  /* color: #232323; */
  font-size: 16px;
  font-weight: 549;
  /* font-family: Microsoft YaHei!important; */
}

.ivu-menu-light.ivu-menu-horizontal .ivu-menu-item-active,
 .ivu-menu-light.ivu-menu-horizontal .ivu-menu-item:hover{
   border-bottom: none;
   color: #5DC0C1;
 }
.layout-logo {
  position: absolute;
  left:0;
  top: 50%;
  width: 279px;
  height: 44px;
  margin-top: -22px;
  -moz-background-size: 100% 100%;
  background-size: 100% 100%;
  background-image: url("../assets/icon_logo.png");
  background-repeat: no-repeat;
  border-radius: 3px;
}
.layout-nav {
  position: absolute;
  top:0;
  right:0;
  max-width: 720px;
  /* margin-right: 120px; */
  /* padding: 5px 0px; */
}
.topMenu.ivu-menu-light:after {
  height: 0!important;
}
.layout-footer-center {
  text-align: center;
  background: #222;
  color: #808080;
  font-size: 14px;
}

.layout-footer-center a:hover {
  color: #2d8cf0 !important;
}
.border_white {
  border: 1px solid white;
  font-size: 14px;
  border-radius: 0px;
  padding: 3px 15px;
}
.search{
  width:20px;
  height:18px;
  margin-top:20px;
  background: url("../assets/search.png");
}
.zn{
  color: #5DC0C1;
}
.logo_more{
  margin-top:20px;margin-left:15px;width:150px;
  position:absolute;top:380px;background:transparent;
  color:#fff;left:50%
}
.logo_more:hover{
  background:#fff;
  color: #5DC0C1;
}
.lxwm{
  background: #333;
  }
.lxwm_content{
  padding: 8vh 0;
  /* padding:  0; */
}
/* .gsdh{
 color: #FFFFFF;
 margin-left:20px;
 position:absolute;
 top: 50%;
 margin-top: -20px;
 width:600px;
} */

/* .companydh{
margin-top:40px;
position:relative;
height: 40px;
font-size: 16px;
line-height: 40px;
} */
/* .companydz{
 margin-top: 1vh;
 position:relative;
 height: 40px;
 font-size: 16px;
 line-height: 40px;
} */
/* .icon_footer{
  margin-top: 11px;
} */
.smgz {
  font-size: 16px;
  color: #fff;
}
.yqlj_outer {
  display: flex; /*IE9下兼容不好*/
  display: -webkit-flex;/*webkit浏览器 safari*/
  align-items:center;
  margin-top:8.5vh;
}
.yqlj{
  color:#fff;
  font-size: 16px;
}     
.dnv{
  /* width:100%; */
     /* width:85px;
     height:41px; */
  width:116px; 
  height:51px;
  /* margin-top:10px; */
  margin-top:15px;
  -moz-background-size: 100% 100%;
  background-size: 100% 100%;
  /* background-image: url("../assets/hzhb.png"); */
  background-image: url("../assets/hzhb.png.REMOTE.png");
  background-repeat: no-repeat;
  border-radius: 3px;
  /* padding-top:80%;
  background-size:contain;   */
}
.lxfs {
  width: 600px;
  list-style: none;
  /* display: flex; IE9下兼容不好 */
  /* display: -webkit-flex; webkit浏览器 safari */
  /* align-items: flex-start; */
  /* border: 1px solid #fff; */
  padding: 1vh 0;
}
.lxfs img {
  float: left;
}
.gsjj_picture {
  width: auto;
  height: auto;
  max-width: 100%;
  max-height: 100%;
}
.gswz1 {
  float: left;
  margin-left: 3%;
  margin-top: -2px;
  font-size: 16px;
  color: #FFFFFF;
  /* display:inline-block; */
  /* border:1px solid #fff; */
}
#dvn{
padding-right:0 !important;
}
</style>
