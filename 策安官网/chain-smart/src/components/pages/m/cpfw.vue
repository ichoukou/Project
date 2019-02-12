<template>
  <div class="indexBody">
    <div><img v-lazy="murl+'img_banner_chanpinfuwu@3x.png'"></div>
    <div class="new_m" style="font-size:0.9rem;border-top:none">
      <p :class="{active:num == 1}" @click="getData(1)">全部</p>
      <p :class="{active:num == 2}" @click="getData(2)">培训与咨询</p>
      <p :class="{active:num == 3}" @click="getData(3)">数字化方案</p>
      <p :class="{active:num == 4}" @click="getData(4)">专业软件与行业数据库</p>
    </div>
    <!-- 内容 -->
    <div class="cpfwContent">
      <div v-if="num==1 || num==3" @click="ydfs()" >
        <div><img src="http://oss.chain-smart.com/assetM/icon_fansheyuan@3x.png"></div>
        <p>移动放射源<br>广域智能监控系统</p>
      </div>
      <div v-if="num==1 || num==3" @click="fxyd()">
        <div><img v-lazy="murl+'icon_rwp@3x.png'"></div>
        <p class="fxyd">移动作业许可<br>(RWP)</p>
      </div>
      <div v-if="num==1 || num==3" @click="fwcz()">
        <div><img v-lazy="murl+'icon_wdm@3x.png'"></div>
        <p class="gfcz">危险固废处置<br>监控(WDM)</p>
      </div>
      <div v-if="num==1 || num==3" @click="zlaq()">
        <div><img v-lazy="murl+'icon_pssqm@3x.png'"></div>
        <p>工程项目承包商<br>质量安全管理系统(PSSQM)</p>
      </div>
      <div v-if="num==1 || num==2" @click="pxkc()">
        <div><img src="http://oss.chain-smart.com/assetM/icon_hsepeixun@3x.png"></div>
        <p>HSE教育<br>培训</p>
      </div>
      <div v-if="num==1"  @click="msds()">
        <div><img v-lazy="murl+'icon_msds@3x.png'"></div>
        <p>MSDS专业<br>数据库</p>
      </div>
      <div v-if="num==4"  @click="msds()">
        <div><img v-lazy="murl+'icon_msds@3x.png'"></div>
        <p>MSDS专业<br>数据库</p>
      </div>
      <div v-if="num==1" @click="xtgl()">
        <div><img v-lazy="murl+'icon_hsextguanlipingtai@3x.png'"></div>
        <p>HSE协同<br>管理平台</p>
      </div>
      <div v-if="num==3" @click="xtgl()">
        <div><img v-lazy="murl+'icon_hsextguanlipingtai@3x.png'"></div>
        <p>HSE协同<br>管理平台</p>
      </div>
      <div v-if="num==1 || num==2" @click="lhjx()">
        <div><img v-lazy="murl+'icon_lianghua@3x.png'"></div>
        <p class="ydfs">量化绩效<br>咨询</p>
      </div>
      <!-- //两个空元素，方便排版 -->
        <div >
        <div></div>
        <p class="ydfs"></p>
        <p></p>
      </div>
           <div v-if="num==4">
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
       murl:"http://oss.chain-smart.com/assetM/",
      num: 1,
    }
  },
  methods: {
    getData(index) {
      this.num = index;
    },
    ydfs() {
      this.$router.push({ name: "mfsy" })
    },
    fxyd() {
      this.$router.push({ name: "mfxzy" })
    },
    fwcz() {
      this.$router.push({ name: "mfwcz" })
    },
    zlaq() {
      this.$router.push({ name: "mzlaq" })
    },
    pxkc() {
      this.$router.push({ name: "mpxkc" })
    },
    msds() {
      this.$router.push({ name: "mmsds"})
    },
    xtgl() {
      this.$router.push({ name: "mxtgl" })
    },
    lhjx() {
      this.$router.push({ name: "mlhjx" })
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
  margin: 0.5rem 4%; 
  display: flex;
  justify-content: space-around;
  flex-wrap: wrap;
}
.cpfwContent > div {
  width: 33%;
  text-align: center;
  font-weight: bold;
  font-size: 0.8rem;
  padding: 1rem 0;
}
.cpfwContent > div > div {
  width: 45%;
  margin: 0 auto;
  height: 8vh;
}
.cpfwContent > div  > p{
  margin-top: 1vh;
}
.fxyd {
  /* margin-top: 9%; */
}
.gfcz {
  /* margin-top: 7%; */
}
.ydfs {
  /* margin-top: 4%; */
}
</style>
