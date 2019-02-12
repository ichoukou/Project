<template>
  <div class="all"><img style="width:100%;height:auto;" v-lazy="pcurl+'cpfw.png'">
    <!-- 产品服务 -->
    <div class="kjzc w">
      <Row style="margin-bottom: 5vh;">
        <Col >
        <Row class="cpfw_yt">
          <Col span="3" offset="4" class="zc_1 zc" :class="{active:num == 1}">
          <div>
            <span @click="getData(1)">全部</span>
          </div>
          </Col>
          <Col span="4" class="zc_2 zc" :class="{active:num == 2}">
          <div>
            <span @click="getData(2)">培训与咨询</span>
          </div>
          </Col>
          <Col span="4" class="zc_3 zc" :class="{active:num == 3}">
          <div>
            <span @click="getData(3)">数字化方案</span>
          </div>
          </Col>
          <Col span="5" offset="1" class="zc_4 zc" :class="{active:num == 4}">
          <div>
            <span @click="getData(4)">专业软件与行业数据库</span>
          </div>
          </Col>
        </Row>
        </Col>
      </Row>
      <!-- 图片内容 -->
      <!-- 第一行 -->
      <div v-if="num==1 || num==3">
        <Row>
          <Col :lg="{ span: 6}">
          <div class="img_cpfw" @click="ydfs()">
            <!-- <img v-lazy="fsy" style="width: 31%" class="gsjj_picture"> -->
            <img v-lazy="pcurl+'icon_fansheyuan.png'" style="width: 31%" class="gsjj_picture">
            <p class="cpfw_title1">移动放射源<br>广域智能监控系统</p>
          </div>
          </Col>
          <Col :lg="{ span: 6}">
          <div class="img_cpfw" :class="{active_on:num == 2}" @click="fxyd()">
            <!-- <img v-lazy="zyhk" style="width: 31%" class="gsjj_picture" :class="{active_on:num == 2}"> -->
            <img v-lazy="pcurl+'icon_rwp.png'" style="width: 31%" class="gsjj_picture" :class="{active_on:num == 2}">
            <p class="cpfw_title1">移动作业许可<br>(RWP)</p>
          </div>
          </Col>
          <Col :lg="{ span: 6}">
          <div class="img_cpfw" :class="{active_on:num == 3}" @click="fwcz()">
            <!-- <img v-lazy="gfcz" style="width: 31%" class="gsjj_picture"> -->
            <img v-lazy="pcurl+'icon_wdm.png'" style="width: 31%" class="gsjj_picture">
            <p class="cpfw_title1" @click="fwcz()">危险固废处置<br>监控(WDM)</p>
          </div>
          </Col>
          <Col :lg="{ span: 6}">
          <div class="img_cpfw" @click="gcxm()">
            <!-- <img v-lazy="aqgl" class="gsjj_picture"> -->
            <img v-lazy="pcurl+'icon_pssqm.png'" class="gsjj_picture">
            <p class="cpfw_title1" @click="gcxm()">工程项目承包商质量<br>安全管理系统(PSSQM)</p>
          </div>
          </Col>
        </Row>
      </div>
      <!-- 第二行 -->
      <div>
        <Row>
          <div v-if="num==1 || num==2">
            <Col :lg="{ span: 6}">
            <div class="img_cpfw" @click="pxkc()">
              <!-- <img v-lazy="img_pxkc" class="gsjj_picture"> -->
              <img v-lazy="pcurl+'pxkc.png'" class="gsjj_picture">
              <p class="cpfw_title1">HSE培训课程</p>
            </div>
            </Col>
          </div>
          <div v-if="num==1">
            <Col :lg="{ span: 6}">
            <div class="img_cpfw" @click="msds()">
              <!-- <img v-lazy="img_msds" class="gsjj_picture"> -->
              <img v-lazy="pcurl+'mds.png'" class="gsjj_picture">
              <p class="cpfw_title1">MSDS专业数据库</p>
            </div>
            </Col>
          </div>
          <div v-if=" num==4">
            <Col :lg="{ span: 6}">
            <div class="img_cpfw" @click="msds()">
              <!-- <img v-lazy="msds" class="gsjj_picture"> -->
              <img v-lazy="pcurl+'mds.png'" class="gsjj_picture">
              <p class="cpfw_title1">MSDS专业数据库</p>
            </div>
            </Col>
          </div>
          <div v-if="num==1">
            <Col :lg="{ span: 6}">
            <div class="img_cpfw" @click="xtpt()">
              <!-- <img v-lazy="xtgl" style="width: 29%" class="gsjj_picture"> -->
              <img v-lazy="pcurl+'icon_hsextguanlipingtai.png'" style="width: 29%" class="gsjj_picture">
              <p class="cpfw_title1">HSE协同管理平台</p>
            </div>
            </Col>
          </div>
          <div v-if="num==3">
            <Col :lg="{ span: 6}">
            <div class="img_cpfw" @click="xtpt()">
              <!-- <img v-lazy="xtgl" style="width: 29%" class="gsjj_picture"> -->
              <img v-lazy="pcurl+'icon_lianghua.png'" style="width: 29%" class="gsjj_picture">
              <p class="cpfw_title1">HSE协同管理平台</p>
            </div>
            </Col>
          </div>
          <div v-if="num==1 || num==2">
            <Col :lg="{ span: 6}">
            <div class="img_cpfw" @click="lhjx()">
              <!-- <img v-lazy="img_lhjx" style="width: 29%" class="gsjj_picture"> -->
              <img v-lazy="pcurl+'icon_lianghua.png'" style="width: 29%" class="gsjj_picture">
              <p class="cpfw_title1">量化绩效咨询</p>
            </div>
            </Col>
          </div>
        </Row>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      pcurl:'http://oss.chain-smart.com/assets/',
      num: 1,
      // fsy: require('http://oss.chain-smart.com/assets/icon_fansheyuan.png'),
      // zyhk: require('http://oss.chain-smart.com/assets/icon_rwp.png'),
      // aqgl: require('http://oss.chain-smart.com/assets/icon_pssqm.png'),
      // gfcz: require('http://oss.chain-smart.com/assets/icon_wdm.png'),
      // img_pxkc: require('http://oss.chain-smart.com/assets/pxkc.png'),
      // img_msds: '',
      // xtgl: '',
      // img_lhjx: '',
    }
  },
  methods: {
    getData(index) {
      this.num = index;
    },
    ydfs() {
      this.$router.push({ name: "fsy" })
    },
    fxyd() {
      this.$router.push({ name: "ydzyhk" })
    },
    fwcz() {
      this.$router.push({ name: "gfcz" })
    },
    gcxm() {
      this.$router.push({ name: "glaq" })
    },
    pxkc() {
      this.$router.push({ name: "pxkc" })
    },
    msds() {
      this.$router.push({ name: "msds" })
    },
    xtpt() {
      this.$router.push({ name: "hseszcp" })
    },
    lhjx() {
      this.$router.push({ name: "hsezxgl" })
    }
  },
  mounted: function () {
    let id = this.$route.params.id;
    if (id == undefined) {
      this.num = 1;
    } else {
      this.num = id;
    }
  },

}
</script>
<style scoped>
.cpfw_area {
  margin-top: 10vh;
  margin-bottom: 6vh;
}
.kjzc {
  margin-top: 10vh;
  margin-bottom: 6vh;
}
.cpfw_yt {
  border-bottom: 1px solid #eee;
  font-size: 18px;
  font-weight: 600;
}
.kjzc .zc {
  text-align: center;
}
.kjzc .zc_4 {
  text-align: left;
}
.kjzc .zc span {
  display: inline-block;
  color: #ccc;
  cursor: pointer;
  height: 8vh;
  line-height: 8vh;
}
.kjzc .active span {
  color: #5dc0c1;
  border-bottom: 3px solid #5dc0c1;
}
.cpfw_picture {
  text-align: center;
}
.cpfw_title1 {
  position: absolute;
  font-weight: 600;
  font-size: 16px;
  line-height: 30px;
  width: 100%;
  top: 16vh;
  left: 50%;
  transform: translateX(-50%); /*IE10 firefox Opera*/
  -webkit-transform: translateX(-50%); /*chrome safari*/
  -ms-transform: translateX(-50%); /*IE9及之前*/
}
.cpfw_content {
  font-size: 14px;
}
.img_cpfw {
  text-align: center;
  height: 26vh;
}
.img_cpfw:hover {
  box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.1);
  cursor: pointer;
}
.gsjj_picture {
  width: 30%;
  height:auto;
  /* height: 35%; */
  /* max-width: 35%; */
  /* max-height: 35%; */
  cursor: pointer;
  margin-top: 4vh;
}
.hse {
  margin-top: 5vh;
}
.cpfw_content1 {
  margin-top: 20px;
}
</style>
