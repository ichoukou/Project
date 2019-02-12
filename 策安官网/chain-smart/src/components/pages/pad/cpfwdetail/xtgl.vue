<template>
  <div class="indexPad">
    <div><img v-lazy="padurl+'img_banner_xietongguanli@2x.png'"></div>
    <div class="aside1">
      <p class="justify colorCon linehei">为系统解决企业HSE信息化方面所面临的挑战，策安通过汲取先进风险管理和架构思想、 开发了数字化HSE协同平台（Polis）来帮助完成企业级数字化HSE管理转型。该平台具有高度灵活 性、集成性、专业性和智能化的特点。
      </p>
      <div class="pad10">
        <p class="bold pad10">灵活性</p>
      </div>
      <p class="justify colorCon linehei">Polis平台采用“大平台、小应用”的架构方式，产品具备高度可配置性，适应企业级差异化的应用需求。Polis平台已经内嵌工作流、报表、GIS引擎、移动、管理仪表盘、知识库等专业应用工具，同时采用松耦合的架构方式支持在不影响用户正常使用的前提下，逐步上线HSE应用功能的部署方式。
      </p>
      <div class="pad10">
        <p class="bold pad10">集成性</p>
      </div>
      <p class="justify colorCon linehei">Polis平台满足多种API及OPC接口协议规范，支持与企业外围管理信息系统，如主流ERP软件、前端SCADA工控系统以及工业移动终端、RFID等各类典型物联网设备进行无缝集成，满足各类管理数据及现场数据实时交换的需求。
      </p>
      <div class="jcx"><img v-lazy="padurl+'img_jichengxing@2x@2x.png'"></div>
      <div class="pad10">
        <p class="bold pad10">专业性</p>
      </div>
      <p class="justify  colorCon linehei">我们已将一系列HSE管理成功实践方法和支持性工具内嵌到Polis平台中，如基于RCA（根本原因分析）的事故事件调查功能，针对风险辨识与评价蝴蝶结风险管理工具，针对危险化学品管理的专业SDS数据库，针对作业许可的JSA风险辨识及应对措施知识库等。这些不同层次、不同功能的风险管控方法及实用工具都在Polis平台中进行了实现。
      </p>
      <div class="jcx"><img v-lazy="padurl+'img_zhuanyexing@2x@2x.png'"></div>
      <div class="pad10">
        <p class="bold pad10">智能化</p>
      </div>
      <p class="justify colorCon linehei">通过多线程数据接入、专业风险算法处理、可视化技术、评价技术、监测技术、模拟技术等专业技术工实现对HSE风险数据的及时获取、分析处置及流转反馈，以此支持Polis平台实现事前能感知、事中能处置、事后能分析的功能特性。
      </p>
      <div class="jcx"><img v-lazy="padurl+'img_zhinenghua@2x@2x.png'"></div>
    </div>
</div>
</template>
<script>
import jquery from 'jquery';
export default {
  data() {
    return {
         padurl:"http://oss.chain-smart.com/assetPad/",
    }
  },
  methods: {
  },
  mounted: function () {
  }
}

</script>
<style scoped>
img {
  width: 100%;
  height: auto;
}
.pad10 > p::before {
  content: "";
  width: 8px;
  height: 8px;
  color: #5dc0c1;
  background: #5dc0c1;
  border-radius: 50%;
  display: inline-block;
  margin-right: 20px;
}
.pad10 > p {
  /* color: #232323; */
  /* font-size: 1rem; */
}
.jcx {
  margin-top: 14px;
}
</style>
