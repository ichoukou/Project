<template>
  <div class="indexPad">
    <div><img v-lazy="padurl+'img_banner_pssqm@2x.png'"></div>
    <div class="aside1">
      <p class="justify colorCon linehei">工程项目承包商质量安全管理系统主要是对工程承包商在场作业期间全生命周期的管理，管理对象包括人员、机具（设备和车辆）、设施；管理业务包含入场，施工现场，奖罚及考核，出场。</p>
    </div>
       <div class="ptop1"></div>
    <div class="aside2">
      <p class="f11 bold pad10">设计方案</p>
      <div class="pad10" ><img v-lazy="padurl+'img_pssqm_shejifangan@2x@2x.png'"></div>
    </div>
    <div class="ptop1"></div>
           <div class="bggray aside2">
      <p class="f11 bold">运用分析</p>
      <div class="flex zlaq">
      <div><img v-lazy="padurl+'img_pssqm_fenxi1@2x.png'"></div>
        <div><img v-lazy="padurl+'img_pssqm_fenxi2@2x.png'"></div>
          <div><img v-lazy="padurl+'img_pssqm_fenxi3@2x.png'"></div>
      </div>
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
.zlaq{
  margin-top:10px;
  margin-left:-1%;
}
</style>
