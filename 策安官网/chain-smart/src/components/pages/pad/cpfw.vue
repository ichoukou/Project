<template>
  <div class="indexPad">
    <div><img v-lazy="padurl+'img_banner_chanpinfuwu@2x.png'"></div>
    <div class="new_pad" style="font-size:1rem;border-top:none">
      <p :class="{active:num == 1}" @click="getData(1)">全部</p>
      <p :class="{active:num == 2}" @click="getData(2)">培训与咨询</p>
      <p :class="{active:num == 3}" @click="getData(3)">数字化方案</p>
      <p :class="{active:num == 4}" @click="getData(4)">专业软件与行业数据库</p>
    </div>
    <!-- 内容 -->
    <div class="cpfwContent rem12" style="padding-bottom:25px;height:100%;">
      <div v-if="num==1 || num==3" @click="ydfs()">
        <div><img src="http://oss.chain-smart.com/assetPad/icon_fangsheyuan@2x.png"></div>
        <p>移动放射源<br>广域智能监控系统</p>
      </div>
      <div v-if="num==1 || num==3" @click="fxyd()">
        <div><img src="http://oss.chain-smart.com/assetPad/icon_rwp@2x.png"></div>
        <p class="fxyd">移动作业许可<br>(RWP)</p>
      </div>
      <div v-if="num==1 || num==3" @click="fwcz()">
        <div><img src="http://oss.chain-smart.com/assetPad/icon_wdm@2x.png"></div>
        <p class="gfcz">危险固废处置<br>监控(WDM)</p>
      </div>
      <div v-if="num==1 || num==3" @click="zlaq()">
        <div><img src="http://oss.chain-smart.com/assetPad/icon_pssqm@2x.png"></div>
        <p>工程项目承包商<br>质量安全管理系统(PSSQM)</p>
      </div>
      <div v-if="num==1 || num==2" @click="pxkc()">
        <div><img src="http://oss.chain-smart.com/assetPad/icon_hsepeixun的副本@2x.png"></div>
        <p>HSE教育<br>培训</p>
      </div>
      <div v-if="num==1"  @click="msds()">
        <div><img src="http://oss.chain-smart.com/assetPad/icon_msds@2x.png"></div>
        <p>MSDS专业<br>数据库</p>
      </div>
      <div v-if="num==4"  @click="msds()">
        <div><img src="http://oss.chain-smart.com/assetPad/icon_msds@2x.png"></div>
        <p>MSDS专业<br>数据库</p>
      </div>
      <div v-if="num==1" @click="xtgl()">
        <div><img src="http://oss.chain-smart.com/assetPad/icon_hsextguanlipingtai的副本@2x.png"></div>
        <p>HSE协同<br>管理平台</p>
      </div>
      <div v-if="num==3" @click="xtgl()">
        <div><img src="http://oss.chain-smart.com/assetPad/icon_hsextguanlipingtai的副本@2x.png"></div>
        <p>HSE协同<br>管理平台</p>
      </div>
      <div v-if="num==1 || num==2" @click="lhjx()">
        <div><img src="http://oss.chain-smart.com/assetPad/icon_lianghua@2x.png"></div>
        <p class="ydfs">量化绩效<br>咨询</p>
      </div>
      <!-- //两个空元素，方便排版 -->
        <div v-if="num==2|| num==3|| num==4">
        <div></div>
        <p class="ydfs"></p>
        <p></p>
      </div>
           <div v-if="num==2|| num==3|| num==4">
        <div></div>
        <p class="ydfs"></p>
        <p></p>
      </div>
           <div v-if=" num==3|| num==4">
        <div></div>
        <p class="ydfs"></p>
        <p></p>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  props:['num'],
  data() {
    return {
         padurl:"http://oss.chain-smart.com/assetPad/",
        //  padurl:"http://oss.chain-smart.com/assetM/",
      num: 1,
    }
  },
  methods: {
    getData(index) {
      this.num = index;
    },
    ydfs() {
      this.$router.push({ name: "padfsy" })
    },
    fxyd() {
      this.$router.push({ name: "padfxzy" })
    },
    fwcz() {
      this.$router.push({ name: "padfwcz" })
    },
    zlaq() {
      this.$router.push({ name: "padzlaq" })
    },
    pxkc() {
      this.$router.push({ name: "padpxkc" })
    },
    msds() {
      this.$router.push({ name: "padmsds"})
    },
    xtgl() {
      this.$router.push({ name: "padxtgl" })
    },
    lhjx() {
      this.$router.push({ name: "padlhjx" })
    },

  },
  mounted(){
            let id=this.$route.params.id;
   if(id==undefined){
    this.num=1;
   }else{
     this.num=id;
   }
  }
}

</script>
<style scoped>
img {
  width: 100%;
  height: auto;
}
.cpfwContent {
  display: flex;
  justify-content: space-around;
  flex-wrap: wrap;
  border:1px solid none;
}
.cpfwContent > div {
  width: 23%;
  text-align: center;
  font-weight: bold;
  /* font-size: 1rem; */
  padding: 1rem 0;
}
.cpfwContent > div > div {
  width: 38%;
  margin: 0 auto;
  /* border: 1px solid #000; */
  height: 6vh;
}
.cpfwContent > div > p{
  width: 100%;
  margin-top: 50px;
}
/* .fxyd {
  margin-top: 9%;
}
.gfcz {
  margin-top: 7%;
}
.ydfs {
  margin-top: 4%;
} */
</style>
