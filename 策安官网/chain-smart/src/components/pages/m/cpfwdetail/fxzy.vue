<template>
  <div class="indexBody">
    <div><img v-lazy="murl+'ydzyhk.png'"></div>
    <!-- 现状分析 -->
  <div class="aside1">
      <p class="f12 bold">现状分析</p>
       <p class="cpContent justify colorCon linehei f9">1、高危作业活动风险高、管理难度大，是导致事故发生的主要原因，也是各企业高度关注的安全重点难点。<br>
2、目前各行业、各企业对于高危作业普遍采用作业许可管理的方式，即通过许可审核进行风险控制把关。<br>
3、在不同时期，作业许可管理对作业环节中的各关键点控制力度不同，科学技术的发展与管理概念的不断更新，也为作业许可管理的精细化和水平的提升提供了条件。</p>
          <div class="gycaLogo"><img v-lazy="murl+'img_zuoyeheke1@3x.png'"></div>
    </div>

  <div class="bggray aside2">
      <p class="f12 bold">解决方案</p>
      <div class="pad10"><img v-lazy="murl+'img_zuoyexuke2@3x.png'"></div>
    </div>

      <div class="aside2">
      <p class="f12 bold">运用分析</p>
      <div><img v-lazy="murl+'fimg_fenxi1@3x.png'"></div>
    <!-- </div>
      <div class="ptop1"></div>
           <div class="aside2">
      <p class="f12 bold">运用分析</p> -->
      <div><img v-lazy="murl+'fimg_fenxi2@3x.png'"></div>
    <!-- </div>
      <div class="ptop1"></div>
           <div class="aside2">
      <p class="f12 bold">运用分析</p> -->
      <div><img v-lazy="murl+'fimg_fenxi2 copy@3x.png'"></div>
    <!-- </div>
          <div class="ptop1"></div>
           <div class="aside2">
      <p class="f12 bold">运用分析</p> -->
      <div><img v-lazy="murl+'fimg_fenxi2 copy 2@3x.png'"></div>
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
.cppb {
  width: 70%;
  text-align: center;
  margin: 0 auto;
  padding-bottom: 10px;
}
.ptop {
  margin-top: 14px;
}

.khalContent > p:last-child {
  margin-top: 5px;
  font-size: 0.8rem;
}
.jszb {
  padding: 12px 0;
}
.jszb li {
  line-height: 35px;
  border-bottom: 1px solid #ccc;
}
.jszb li>span:first-child {
  font-size: 0.8rem;
  display:inline-block;
  width:28%;
}
.jszb li:first-child {
  background: rgba(93, 192, 193, 0.1);
  border:none;
}
.rtag li>span:first-child{
width:45%;
}
.xzfx3{
  padding:10px 0;
}
</style>
