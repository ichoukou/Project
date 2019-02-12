<template>
  <div class="indexPad">
    <div><img v-lazy="padurl+'img_banner_wdm@2x.png'"></div>
    <!--  -->
    <div class="aside1">
      <p class="justify colorCon linehei">危险固废处置监控系统解决方案为产废单位设计，是一套针对固废的产生、内部转移存储、外运处置全过程监管控制的解决方案。 通过该方案的实施，能快速识别本单位所产生固废的基本信息，转移存储信息，外运处置信息； 优化管理层对固废产、转、储、运过程的监管，减少执行层对固废产、转、储 、运过程中人工处理环节，降低出错概率。</p>
    </div>
    <div class="ptop1"></div>
    <div class="aside2">
      <p class="f11 bold">现状分析</p>
      <div class="pad10"><img v-lazy="padurl+'img_shejifangan@2x@2x.png'"></div>
    </div>
    <div class="ptop1"></div>
    <div class="bggray aside2">
      <p class="f11 bold">运用分析</p>
      <div class="pad10"><img v-lazy="padurl+'img_yunyongfenxi@2x@2x.png'"></div>
    </div>

  </div>
</template>
<script>
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
</style>
