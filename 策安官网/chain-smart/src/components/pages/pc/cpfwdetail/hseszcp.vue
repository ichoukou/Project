<template>
  <div class="all"><img style="width:100%;height:auto;" v-lazy="pcurl+'img_banner_hseshuzi.png'">
    <div class="cats w">
      <Row>
        <Col >
        <p class="cats_title">HSE 协同管理平台</p>
        <div class="cats_content">为系统解决企业HSE信息化方面所面临的挑战，策安通过汲取先进风险管理和架构思想、开发了数字化HSE协同平台（Polis）来帮助完成企业级数字化HSE管理转型。该平台具有高度灵活性、集成性、专业性和智能化的特点。
        </div>
        </Col>
        <Col >
        <p class="cats_line"></p>
        </Col>
      </Row>
    </div>
    <div class="w">
      <Row >
        <Col >
        <p class="circle"></p>
        <p class="lhx_title">灵活性</p>
        </Col>
        <Col>
        <div class="lhx_content">Polis平台采用“大平台、小应用”的架构方式，产品具备高度可配置性，适应企业级差异化的应用需求。Polis平台已经内嵌工作流、报表、GIS引擎、移动、管理仪表盘、知识库等专业应用工具，同时采用松耦合的架构方式支持在不影响用户正常使用的前提下，逐步上线HSE应用功能的部署方式。
        </div>
        </Col>
      </Row>
    </div>
    <div class="w">
      <Row>
        <Col >
        <p class="circle"></p>
        <p class="jcx_title">集成性</p>
        </Col>
        <Col>
        <div class="jcx_content">Polis平台满足多种API及OPC接口协议规范，支持与企业外围管理信息系统，如主流ERP软件、前端SCADA工控系统以及工业移动终端、RFID等各类典型物联网设备进行无缝集成，满足各类管理数据及现场数据实时交换的需求。
        </div>
        </Col>
      </Row>
      <Row>
        <Col class="img_sjfa w" >
        <div ><img v-lazy = "jcx" class="gsjj_picture"></div>
        </Col>
      </Row>
    </div>
    <div class="w" style="margin-top:20px;">
      <Row>
        <Col>
        <p class="circle"></p>
        <p class="zyx_title">专业性</p>
        </Col>
        <Col>
        <div class="zyx_content">我们已将一系列HSE管理成功实践方法和支持性工具内嵌到Polis平台中，如基于RCA（根本原因分析）的事故事件调查功能，针对风险辨识与评价蝴蝶结风险管理工具，针对危险化学品管理的专业SDS数据库，针对作业许可的JSA风险辨识及应对措施知识库等。这些不同层次、不同功能的风险管控方法及实用工具都在Polis平台中进行了实现。
        </div>
        </Col>
      </Row>
      <Row class="w">
        <Col  class="img_sjfa">
        <div><img v-lazy = "zyx" class="gsjj_picture"></div>
        </Col>
      </Row>
    </div>
    <div>
      <Row class="w" style="margin-top:20px;">
        <Col >
        <p class="circle"></p>
        <p class="znh_title">智能化</p>
        </Col>
        <Col >
        <div class="znh_content">通过多线程数据接入、专业风险算法处理、可视化技术、评价技术、监测技术、模拟技术等专业技术工实现对HSE风险数据的及时获取、分析处置及流转反馈，以此支持Polis平台实现事前能感知、事中能处置、事后能分析的功能特性。
        </div>
        </Col>
      </Row>
      <Row style="margin-bottom: 10vh;">
        <Col  class="img_sjfa w">
        <div><img v-lazy = "znh" class="gsjj_picture"></div>
        </Col>
      </Row>
    </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      num: 1,
      pcurl:'http://oss.chain-smart.com/assets/',
      jcx:'http://oss.chain-smart.com/assets/img_jichengxing.png',
     zyx:'http://oss.chain-smart.com/assets/img_zhuanyexing.png',
     znh:'http://oss.chain-smart.com/assets/img_zhinenghua.png',
    }
  },
  methods: {
    getData(index) {
      this.num = index;
    },
    fsy() {
    },
  },
  mounted() {
  }
}

</script>
<style scoped>
.zxyy {
  margin-top: 12vh;
}
.zxyy_title {
  margin: 0 auto;
  text-align: left;
  font-size: 32px;
  font-weight: 600;
  /* font-family: PingFangSC-Medium; */
  color: #232323;
  margin-top: 6vh;
  margin-bottom: 0vh;
}
.zxyy_content {
  font-size: 14px;
  /* font-family: PingFangSC-Regular; */
  color: #808080;
  text-align: justify;
  line-height: 28px;
  margin-top: 2vh;
  margin-bottom: 2vh;
}
.zxyy_img {
  background: url(`${pcurl}img_zhuanxingyiyi.png`) no-repeat;
  padding-top: 80%;
  background-size: contain;
  background-position: center;
}
.fzqs1 {
  background-color: #f0f0f0;
}
.fzqs_title {
  margin: 0 auto;
  text-align: left;
  font-size: 32px;
  font-weight: 600;
  /* font-family: PingFangSC-Medium; */
  color: #232323;
  margin-top: 12vh;
  margin-bottom: 0vh;
}
.fzqs_content1 {
  font-size: 14px;
  /* font-family: PingFangSC-Regular; */
  color: #808080;
  text-align: justify;
  line-height: 28px;
  margin-top: 2vh;
  margin-bottom: 2vh;
}
.fzqs_img1 {
  background: url("http://oss.chain-smart.com/assets/img_fazhanqushi.png") no-repeat;
  padding-top: 80%;
  background-size: contain;
  background-position: center;
}
.fzqs_content2 {
  font-size: 14px;
  /* font-family: PingFangSC-Regular; */
  color: #808080;
  text-align: justify;
  line-height: 28px;
  margin-top: 10vh;
  margin-bottom: 2vh;
}
.fzqs2 {
  background-color: #f0f0f0;
}
.fzqs_img2 {
  background: url("http://oss.chain-smart.com/assets/img_fazhanqushi2.png") no-repeat;
  padding-top: 80%;
  background-size: contain;
  background-position: center;
}
.cats_title {
  margin: 0 auto;
  text-align: center;
  font-size: 32px;
  font-weight: 600;
  /* font-family: PingFangSC-Medium; */
  color: #232323;
  margin-top: 12vh;
  margin-bottom: 4vh;
}
.cats_content {
  font-size: 14px;
  /* font-family: PingFangSC-Regular; */
  color: #808080;
  text-align: justify;
  text-indent: 2em;
  line-height: 28px;
  margin-top: 2vh;
  margin-bottom: 6vh;
}
.cats_line {
  border-bottom: 1px solid #eee;
  margin-bottom: 8vh;
text-align: left;
}
.circle {
  background: #5dc0c1;
  height: 11px;
  width: 11px;
  line-height: 20px;
  text-align: center;
  -moz-border-radius: 11px;
  -webkit-border-radius: 11px;
  border-radius: 11px;
  margin-top: 10px;
  display: inline-block;
}
.lhx_title {
  margin-left: 20px;
  text-align: left;
  font-size: 20px;
  font-weight: 600;
  /* font-family: PingFangSC-Semibold; */
  color: #232323;
  display: inline-block;
}
.lhx_content {
  font-size: 14px;
  /* font-family: PingFangSC-Regular; */
  color: #808080;
  text-align: justify;
  line-height: 28px;
  margin-top: 4vh;
  margin-bottom: 12vh;
}
.jcx_title {
  margin-left: 20px;
  text-align: left;
  font-size: 20px;
  font-weight: 600;
  /* font-family: PingFangSC-Semibold; */
  color: #232323;
  display: inline-block;
}
.jcx_content {
  font-size: 14px;
  /* font-family: PingFangSC-Regular; */
  color: #808080;
  text-align: justify;
  line-height: 28px;
  margin-top: 4vh;
  margin-bottom: 4vh;
}
.jcx_img {
  /* background: url("http://oss.chain-smart.com/assets/img_jichengxing.png") no-repeat; */
  padding-top: 30%;
  background-size: contain;
  background-position: center;
  margin-top: 0vh;
  margin-bottom: 8vh;
}
.zyx_title {
  margin-left: 20px;
  text-align: left;
  font-size: 20px;
  font-weight: 600;
  /* font-family: PingFangSC-Semibold; */
  color: #232323;
  display: inline-block;
}
.zyx_content {
  font-size: 14px;
  /* font-family: PingFangSC-Regular; */
  color: #808080;
  text-align: justify;
  line-height: 28px;
  margin-top: 4vh;
  margin-bottom: 4vh;
}
.zyx_img {
  /* background: url("http://oss.chain-smart.com/assets/img_zhuanyexing.png") no-repeat; */
  padding-top: 40%;
  background-size: contain;
  background-position: center;
  margin-top: 2vh;
  margin-bottom: 12vh;
}
.znh_title {
  margin-left: 20px;
  text-align: left;
  font-size: 20px;
  font-weight: 600;
  /* font-family: PingFangSC-Semibold; */
  color: #232323;
  display: inline-block;
}
.znh_content {
  font-size: 14px;
  /* font-family: PingFangSC-Regular; */
  color: #808080;
  text-align: justify;
  line-height: 28px;
  margin-top: 4vh;
  margin-bottom: 2vh;
}
.znh_img {
  /* background: url("http://oss.chain-smart.com/assets/img_zhinenghua.png") no-repeat; */
  padding-top: 60%;
  background-size: contain;
  background-position: center;
  margin-top: 0vh;
  margin-bottom: 8vh;
}
.img_sjfa{
margin-top: 3vh;
text-align: center;
}
.gsjj_picture{
  width:auto;
 height:auto;
 max-width:100%;
 max-height:100%;
}
</style>