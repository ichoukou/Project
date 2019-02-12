<template>
  <div class="indexPad">
    <div><img v-lazy="padurl+'img_banner_rwp@2x.png'"></div>
    <!-- 现状分析 -->
    <div class="aside1">
      <p class="f11 bold">现状分析</p>
      <p class="cpContent justify colorCon linehei">1、高危作业活动风险高、管理难度大，是导致事故发生的主要原因，也是各企业高度关注的安全重点难点。<br> 2、目前各行业、各企业对于高危作业普遍采用作业许可管理的方式，即通过许可审核进行风险控制把关。
        <br> 3、在不同时期，作业许可管理对作业环节中的各关键点控制力度不同，科学技术的发展与管理概念的不断更新，也为作业许可管理的精细化和水平的提升提供了条件。
      </p>
      <div><img v-lazy="padurl+'img_xianzhuang@2x@2x.png'"></div>
    </div>

    <div class="bggray aside2 pad10">
      <p class="f11 bold">解决方案</p>
      <div class="pad10"><img v-lazy="padurl+'img_rwp_jiejue@2x.png'"></div>
    </div>

    <div class="aside2">
      <p class="f11 bold pad10">运用分析</p>
      <div class="flex yufx">
        <div><img v-lazy="padurl+'fimg_fenxi1@2x.png'"></div>
        <div><img v-lazy="padurl+'img_fenxi2@2x.png'"></div>
        <div><img v-lazy="padurl+'img_fenxi3@2x.png'"></div>
        <div><img v-lazy="padurl+'img_fenxi4@2x.png'"></div>
      </div>
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
.yufx {
  justify-content: space-between;
  margin-left:-1%;
}
.yufx > div {
  width: 23%;
}
</style>
