<template>
    <div id="mBody">
        <header id="meunhua">
            <div class="logo"><img src="http://oss.chain-smart.com/assetM/icon_logo@3x.png"></div>
            <!-- <div class="search" @click="swiper()"><img src="../assetM/icon_seach@2x.png"></div> -->
            <div class="menu" @click="menu()"><img src="http://oss.chain-smart.com/assetM/icon_menu.png"></div>
        </header>
        <Content>
            <div>
                <!-- 菜单导航 -->
                <div class="menuContent" v-show="showMenu">
                    <p class="close" @click="close()">×</p>
                    <ul class="menuUl">
                        <li @click="shouye()">首页</li>
                        <li @click="gyca()">关于策安</li>
                        <li :class="{active:num == 1}">
                            <span @click="cpfw(1)">典型产品及服务&nbsp;&nbsp;</span>
                            <span @click="cpmore()" class="zhankai">{{jia}}</span>
                            <ul class="pxrj" v-show="showCprj">
                                <li :class="{active:num1 == 1}">
                                    <span @click="cpfw(2)" >培训与咨询&nbsp;&nbsp;</span>
                                    <span @click="Px1()" class="zhankai">{{jia1}}</span>
                                    <div v-show="showPx1">
                                       <p @click="pxkc()">HSE培训课程</p>
                                        <p @click="lhjx()">量化绩效咨询</p>
                                    </div>
                                </li>
                                <p class="menuline" v-show="line1"></p>
                                <li :class="{active:num2 == 1}">
                                    <span @click="cpfw(3)">数字化方案&nbsp;&nbsp;</span>
                                    <span @click="Px2()" class="zhankai">{{jia2}}</span>
                                    <div v-show="showPx2">
                                        <p @click="ydfs()">移动放射源广域智能监控系统</p>
                                        <p @click="fxyd()">风险的移动作业许可(RWP)</p>
                                        <p @click="fwcz()">危险固废处置监控(WDM)</p>
                                        <p @click="zlaq()">工程项目承包商质量安全管理系统(PSSQM)</p>
                                        <p @click="xtgl()">HSE协同管理平台</p>
                                    </div>
                                </li>
                                <p class="menuline" v-show="line2"></p>
                                <li :class="{active:num3 == 1}">
                                    <span @click="cpfw(4)">专业软件与行业数据库&nbsp;&nbsp;</span>
                                    <span @click="Px3()" class="zhankai">{{jia3}}</span>
                                    <div v-show="showPx3">
                                        <p @click="msds()">MSDS专业数据库</p>
                                    </div>
                                </li>
                                <p class="menuline" v-show="line3"></p>
                            </ul>
                        </li>
                        <li @click="khal()">客户案例</li>
                        <li @click="xwdt()">新闻动态</li>
                        <li @click="lxwm()">联系我们</li>
                    </ul>
                </div>
                <router-view  v-bind:num="id"/>
            </div>
        </Content>
        <footer>
            <div class="logo"><img v-lazy="murl+'img_logo_w@3x.png'"></div>
            <div class="content">
                <ul>
                    <li>
                        <img v-lazy="murl+'icon_footer_dianhua@3x.png'" class="phone">
                        <p>公司电话：400-017-8016</p>
                    </li>
                    <li>
                        <img v-lazy="murl+'icon_footer_dizhi@3x.png'" class="phone">
                        <p>公司地址：上海市徐汇区百色路100号，28号楼</p>
                    </li>
                    <li>
                        <img v-lazy="murl+'icon_footer_jiaofu@3x.png'" class="phone">
                        <p>烟台交付中心：山东省烟台市开发区长江路161号，天马中心A-705室</p>
                    </li>
                    <li>
                        <img v-lazy="murl+'icon_shenyang_footer@3x.png'"  class="phone">
                        <p>沈阳办事处：沈阳市沈河区市府路290号摩根凯利大厦A座1209室</p>
                    </li>
                    <li>
                        <img v-lazy="murl+'icon_footer_youxiang@3x.png'" class="phone">
                        <p>电子邮箱：cj@chain-smart.com</p>
                    </li>
                </ul>
            </div>
            <div class="line"></div>
            <div class="botton">
                <div >
                    <p>友情链接</p>
                    <div class="yqlj"><img v-lazy="murl+'icon_dnv_hui@3x.png'"></div>
                </div>
                <div class="sm" >
                    <span>扫码加关注</span>
                    <div class="smgz"><img v-lazy="murl+'img_erweima@3x.png'"></div>
                </div>
            </div>
        </footer>
        <div class="copyright">
            <p>Copyright © 2017 上海策安能源科技有限公司</p>
            <p>沪ICP备17025253号-1</p>
        </div>
    </div>
</template>
<script>
import Vue from "vue";
export default {
    data() {
        return {
            murl:"http://oss.chain-smart.com/assetM/",
            showMenu: false,
            showCprj: false,
            num: 0,
            num1:0,
            num2:0,
            num3:0,
            jia: "+",
            jia1: "+",
            jia2: "+",
            jia3: "+",
            showPx1: false,
            showPx2: false,
            showPx3: false,
            line1: false,
            line2: false,
            line3: false,
            id:1,
        }
    },
    methods: {
        menu() {
            this.showMenu = true;
              document.getElementById("meunhua").style.zIndex=0;
        },
        close() {
            this.showMenu = false;
            document.getElementById("meunhua").style.zIndex=1000;
        },
         ydfs() {
      this.$router.push({ name: "mfsy" })
      this.showMenu = false;
    },
    fxyd() {
      this.$router.push({ name: "mfxzy" })
      this.showMenu = false;
    },
    fwcz() {
      this.$router.push({ name: "mfwcz" })
      this.showMenu = false;
    },
    zlaq() {
      this.$router.push({ name: "mzlaq" })
      this.showMenu = false;
    },
    pxkc() {
      this.$router.push({ name: "mpxkc" })
      this.showMenu = false;
    },
    msds() {
      this.$router.push({ name: "mmsds"})
      this.showMenu = false;
    },
    xtgl() {
      this.$router.push({ name: "mxtgl" })
      this.showMenu = false;
    },
    lhjx() {
      this.$router.push({ name: "mlhjx" })
      this.showMenu = false;
    },
        shouye() {
            this.$router.push({ name: "mindex" });
            this.showMenu = false;
        },
        gyca() {
            this.$router.push({ name: "mgyca" });
            this.showMenu = false;
        },
        cpfw(id) {
            this.id=id;
            this.$router.push({ name: "mcpfw" });
            this.showMenu = false;
        },
        khal() {
            this.$router.push({ name: "mkhal" });
            this.showMenu = false;
        },
        xwdt() {
            this.$router.push({ name: "mxwdt" });
            this.showMenu = false;
        },
        lxwm() {
            this.$router.push({ name: "mlxwm" });
            this.showMenu = false;
        },
        cpmore() {
            if (this.jia == "+") {
                this.jia = "-";
                this.showCprj = true;
                this.num = 1;
            } else {
                this.jia = "+";
                this.showCprj = false;
                this.num = 0;
            }
        },
        Px1() {
            if (this.jia1 == "+") {
                this.jia1 = "-";
                this.showPx1 = true;
                this.line1 = true;
                this.num1 = 1;
            } else {
                this.jia1 = "+";
                this.showPx1 = false;
                this.line1 = false;
                this.num1 = 0;
            }
        },
        Px2() {
            if (this.jia2 == "+") {
                this.jia2 = "-";
                this.showPx2 = true;
                this.line2 = true;
                this.num2 = 1;
            } else {
                this.jia2 = "+";
                this.showPx2 = false;
                this.line2 = false;
                this.num2 = 0;
            }
        },
        Px3() {
            if (this.jia3 == "+") {
                this.jia3 = "-";
                this.showPx3 = true;
                this.line3 = true;
                this.num3 = 1;
            } else {
                this.jia3 = "+";
                this.showPx3 = false;
                this.line3 = false;
                this.num3 = 0;
            }
        },
    },
    mounted() {
    window.onscroll=function(){
          let  scroll= document.documentElement.scrollTop||document.body.scrollTop;
           if(scroll>5){
              document.getElementById("meunhua").style.background="#fff";
                  document.getElementById("meunhua").style.zIndex=1000;
         }else{
           document.getElementById("meunhua").style.background="#fff";
             document.getElementById("meunhua").style.zIndex=0 ;
         }

    }
    }
}
</script>
<style scoped>
header {
  padding: 0.8rem 5%;
  display: flex;
  position: fixed;
  background: transparent;
    top:0;
    box-shadow: 0 0 4px 0 rgba(0,0,0,.1), 0 2px 3px 0 rgba(0,0,0,.1);
}
header .logo {
  width: 50%;
  height: auto;
}
header .search {
  width: 1.8rem;
  height: auto;
  position: absolute;
  right: 4rem;
}
header .menu {
  width: 1.8rem;
  height: auto;
  position: absolute;
  right: 1rem;
}
.pad {
  padding: 1.5rem 5%;
}
.pad_nobottom {
  padding: 1.5rem 5% 0;
}
img {
  width: 100%;
  height: auto;
}
footer {
  padding: 1.5rem 5%;
  background: #333333;
}
footer .logo {
  width: 50%;
  height: auto;
}
footer .phone {
  width: 7%;
  height: auto;
  margin-right: 1rem;
  margin-top: -1%;
}
footer .content {
  padding: 0.3rem 0;
}
footer .content li {
  display: flex;
  align-items: flex-start;
  color: #fff; 
  padding: 0.2rem 0;
}
footer .content li p {
  /* margin-top: 0.3rem; */
  font-size: 0.8rem;
}
footer .line {
  border: 0.5px solid #666;
  margin-top: 0 !important;
}
.menuline {
  border: 0.5px solid #666;
}
footer .yqlj {
  width: 55%;
  margin-top: 0.5rem;
}
.botton {
  color: #fff;
  display: flex;
  justify-content: space-around;
  padding-top: 0.2rem;
}
.smgz {
  width: 40%;
  height: auto;
  margin-left: 0.8rem;
}
.sm {
  display: flex;
  justify-content: flex-end;
}
.copyright {
  background: #222;
  color: #808080;
  padding: 0.8rem 0;
}
.copyright p {
  text-align: center;
}
/* 导航内容 */
.menuContent {
  background: #333333;
  position: absolute;
  z-index: 10000;
  width: 100%;
  height: 100%;
  left: 0;
  top: 0;
  overflow:auto;
position:fixed;
}
.menuUl {
  text-align: center;
  margin-top: 8vh;
}
.menuUl > li {
  padding: 12px 0;
  color: #ccc;
  font-size: 1.3rem;
}
.close {
  color: #fff;
  /* font-size: 26px; */
  font-size: 1.8rem;
  position: absolute;
  top: 5px;
  right: 1.4rem;
}
.menuUl li > span:last-child {
  color: #fff;
  font-size: 26px;
}
.pxrj {
  font-size: 1.1rem;
  color: #999;
  text-align: center;
}
.pxrj li {
  padding: 12px 0;
  /* border:1px solid red; */
}
.pxrj li p {
  padding: 10px 0;
  text-align: left;
  margin-left: 10%;
  position: relative;
  font-size: 0.9rem;
  /* border:1px solid #000; */
}
.pxrj li p::before {
  content: ".";
  color: #fff;
  left: -12px;
  top: 5px;
  position: absolute;
}
.menuUl .active {
  background: #444;
}
.menuUl .active > :first-child{
    color: #fff;
}
.menuUl .active > :nth-child(2){
    color: #fff;
}
.pxrj .active {
  background: #555;
}
.pxrj .active > :first-child{
    color: #fff;
}
.pxrj .active > :nth-child(2){
    color: #fff;
}
.zhankai {
    display: inline-block;
    width: 1rem;
}
</style>

