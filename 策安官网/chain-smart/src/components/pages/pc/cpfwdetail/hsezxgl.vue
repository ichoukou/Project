<template>
<div class="all"><img style="width:100%;height:auto;"  v-lazy="pcurl+'img_banner_hseguanli.png'">
  <!-- 衡量工具 -->
  <div>
    <Row>
      <Col span="16" offset="4">
        <p class="hlgj_title">量化绩效咨询</p>
      </Col>
    </Row>
    <Row class="w">
      <Col>
        <div class="hlgj_content">区别于传统仅凭经验对企业HSE管理进行评估、诊断的方式，我们采用经著名能源、制造、工程、食品、农业等企业验证的全量化HSE绩效评估工具-BSP(Best Safety Practice)卓越安全绩效评价系统来对企业的HSE管理进行岗位级颗粒度的问题诊断及改善咨询。
        </div>
        <div class="hlgj_content">BSP的衡量基准涵盖了ISO9001、ISO14001、OHSAS18001以及PAS55等国际标准的要求，能有效帮助企业规划其HSE管理完善路线图。BSP涵盖十七个要素，是一套全量化的企业级HSE管理诊断及改善指南工具，在70多个国家上万家企业成功应用。
        </div>
      </Col>
    </Row>
    <Row class="w">
      <Col class="hlgj_img">
      <!-- <img v-lazy="hljz" class="gsjj_picture"> -->
      <img v-lazy="pcurl+'img_henglianggongju.png'" class="gsjj_picture">
      </Col>
    </Row>
    <Row class="w">
      <Col >
        <div class="hlgj_content  hlgj_content1">BSP量化评估特性可以将企业HSE绩效评估结果通过管理成熟度模型按各个评估要素量化地展现出来，并支持各单位间的对 标比较，直观形象地找出管理短板，方便企业总结管理提升重点工作。
        </div>
      </Col>
    </Row>
    <Row>
      <Col span="16" offset="5" class="hlgj_img">
       <!-- <img v-lazy="bsplh" class="gsjj_picture"> -->
       <img v-lazy="pcurl+'img_hengliang2.png'" class="gsjj_picture">
      </Col>
    </Row>
  </div>
  <!-- 咨询方法 -->
  <div class="zxff">
    <Row>
      <Col span="16" offset="4">
        <p class="zxff_title">咨询方法</p>
      </Col>
    </Row>
    <Row class="w">
      <Col>
        <div class="zxff_content">以BSP量化评估为驱动的整体咨询过程包括以下5个方面，这一在各行业普遍应用的“成功实践方法”已经被证明是企业寻找HSE管理短板及改善HSE绩效的有效方法。
        </div>
      </Col>
    </Row>
    <Row class="w">
      <Col class="hlgj_img">
        <img v-lazy="pcurl+'img_zixun.png'" class="gsjj_picture">
      </Col>
    </Row>
  </div>
</div>
</template>
<script>
export default {
  data() {
return {
  num:1,
  // hljz:require('@/assets/img_henglianggongju.png'),
  // bsplh:require('http://oss.chain-smart.com/assets/img_hengliang2.png'),
  // zxff:require('http://oss.chain-smart.com/assets/img_zixun.png'),
pcurl:'http://oss.chain-smart.com/assets/',
    }
  },
  methods: {
      getData(index) {
        this.num = index;
      },
      fsy(){
      },
},
  mounted() {
  }
}

</script>
<style scoped>
.hlgj_title{
  margin: 0 auto;
  text-align: center;
  font-size: 32px;
  font-weight: 600;
  /* font-family: PingFangSC-Medium; */
  margin-top: 10vh;
}
.hlgj_content{
  font-size: 14px;
  /* font-family: PingFangSC-Regular; */
  color: #808080;
  line-height: 28px;
  margin-top: 3vh;
  margin-bottom: 3vh;
}
.hlgj_content1 {
  margin-top: 0 !important; 
}
.hlgj_img{
  margin-top: 2vh;
  margin-bottom: 10vh;
  text-align: center;
}
.hlgj_img2{
  padding-top:80%;
  background-size:contain;    
  background-position:center;
  margin-top: 0vh;
  margin-bottom: 8vh;
}
.zxff{
  background-color:  #F0F0F0;
}
.zxff_title{
  margin: 0 auto;
  text-align: center;
  font-size: 32px;
  font-weight: 600;
  /* font-family: PingFangSC-Medium; */
  margin-top: 10vh;
}
.zxff_content{
  font-size: 14px;
  /* font-family: PingFangSC-Regular; */
  color: #808080;
  line-height: 28px;
  margin-top: 3vh;
  margin-bottom: 3vh;
  text-align: center;
}
.gsjj_picture {
  width:auto;
 height:auto;
 max-width:100%;
 max-height:100%;
}
</style>