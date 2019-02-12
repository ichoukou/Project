<template>
<div class="all"><img style="width:100%;height:auto;"  v-lazy="pcurl+'gcxmcb.png'">
<Row class="wxgf_intro">
    <Col class="w">
       <div>工程项目承包商质量安全管理系统主要是对工程承包商在场作业期间全生命周期的管理，管理对象包括人员、机具（设备和车辆）、设施；管理业务包含入场，施工现场，奖罚及考核，出场。</div>
    </Col>
</Row>
      <!-- 设计方案-->
      <p class="ryzz">设计方案</p>
<Row class="w">
    <Col style="text-align:center;"  >
       <div><img v-lazy="pcurl+'img_pssqm_shejifangan.png'" class="gsjj_picture" style="margin-top:30px"></div>
    </Col>
</Row>
<!-- 运用分析  -->
<div class="yyfx">
<p class="ryzz">运用分析</p>
<Row class="ryzz_row w" style="margin-top:4vh;">
  <Col >
       <Row :gutter="16" >
         <Col span="8" style="text-align:center;" >
            <div class="ryzz_content"><img v-lazy="pcurl+'img_pssqm_fenxi1.png'" class="gsjj_picture">
            </div>
         </Col>
          <Col span="8" style="text-align:center;">
            <div><img v-lazy="pcurl+'img_pssqm_fenxi2.png'" class="gsjj_picture">
            </div>
         </Col> 
          <Col span="8" style="text-align:center;">
            <div><img v-lazy="pcurl+'img_pssqm_fenxi3.png'" class="gsjj_picture">
            </div>
         </Col>
       </Row>
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
  pcurl:'http://oss.chain-smart.com/assets/',
    }
  },
  methods: {
      getData(index) {
        this.num = index;
      },
},
  mounted: function() {
  }
}

</script>
<style scoped>

.ryzz{
  margin:0 auto;
  text-align:center;
  font-size: 32px;
  font-weight: 600;
}
.gsjj_picture{
  width:auto;
  height:auto;
  max-width:100%;
  max-height:100%;
}
.wxgf_intro{
font-size:14px;
color: #808080;
margin: 10vh 0;
line-height: 28px;
/* text-indent: 2em; */
}
.yyfx{
    background: #F0F0F0;
    padding: 10vh 0;
 
}
</style>
