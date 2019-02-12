<template>
<div class="all"><img style="width:100%;height:auto;"  v-lazy="pcurl+'gfcz.png'">
<Row class="wxgf_intro">
    <Col class="w">
       <div>危险固废处置监控系统解决方案为产废单位设计，是一套针对固废的产生、内部转移存储、外运处置全过程监管控制的解决方案。通过该方案的实施，能快速识别本单位所产生固废的基本信息，转移存储信息，外运处置信息；优化管理层对固废产、转、储、运过程的监管，减少执行层对固废产、转、储 、运过程中人工处理环节，降低出错概率。</div>
    </Col>
</Row>
<Row >
  <Col class="sjfa">
    <!-- 设计方案-->
    <p class="ryzz">设计方案</p>
  <Row>
    <Col class="img_sjfa w">
       <div><img v-lazy="pcurl+'img_shejifangan.png'" class="gsjj_picture"></div>
    </Col>
  </Row>
  </Col>
</Row>
<!-- 运用分析  -->
<div class="yyfx">
<p class="ryzz" >运用分析</p>
<Row class="w">
    <Col style="text-align:center;">
       <div><img v-lazy="pcurl+'img_yunyongfenxi.png'" class="gsjj_picture" style="margin-bottom:30px;"></div>
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
  mounted(){
  }
}

</script>
<style scoped>
.sjfa{
  margin-bottom:10vh;
}
.ryzz{
  text-align:center;
  font-size:26px;
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
line-height: 28px;
margin:10vh 0;
color: #808080;
}
.img_sjfa{
margin-top: 3vh;
text-align: center;
}
.yyfx{
    background: #F0F0F0;
    padding: 10vh 0;
}
</style>
