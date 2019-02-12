<template>
  <div class="indexBody">
    <div><img v-lazy="murl+'img_banner_zhilianganquan@3x.png'"></div>
    <div class="aside1">
      <p class="justify colorCon linehei f9">工程项目承包商质量安全管理系统主要是对工程承包商在场作业期间全生命周期的管理，管理对象包括人员、机具（设备和车辆）、设施；管理业务包含入场，施工现场，奖罚及考核，出场。</p>
    </div>
       <div class="ptop1"></div>
    <div class=" aside2">
      <p class="f12 bold">设计方案</p>
      <div class="pad10" ><img v-lazy="murl+'img_pssqm1@3x.png'"></div>
    </div>
    <div class="ptop1"></div>
           <div class="bggray aside2">
      <p class="f12 bold">运用分析</p>
      <div class="zlxzfx"><img v-lazy="murl+'img_pssqm_fenxi1@3x.png'"></div>
        <div class="zlxzfx"><img v-lazy="murl+'img_pssqm_fenxi2@3x.png'"></div>
          <div class="zlxzfx"><img v-lazy="murl+'img_pssqm_fenxi3@3x.png'"></div>

    </div>

  </div>
</template>
<script>
export default {
  data() {
    return {
       murl:"http://oss.chain-smart.com/assetM/",
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
.zlxzfx{
  margin-top:10px;
}
</style>
