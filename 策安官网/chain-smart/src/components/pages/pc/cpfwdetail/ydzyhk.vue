<template>
<div class="all"><img style="width:100%;height:auto;"  v-lazy="pcurl+'ydzyhk.png'">
  <!-- 现状分析 -->
    <div class="cp">
      <p class="ryzz">现状分析</p>
        <Row>
            <Col  class="fx_content w">
            1、高危作业活动风险高、管理难度大，是导致事故发生的主要原因，也是各企业高度关注的安全重点难点。<br>
            2、目前各行业、各企业对于高危作业普遍采用作业许可管理的方式，即通过许可审核进行风险控制把关。<br>
            3、不同时期的作业许可管理对作业环节中各关键点控制力度不同，科学技术的发展与管理概念的不断更新，也为作业许可管理的精细化和水平的提升提供了条件。
            </Col>
        </Row>
        <Row class="w">
            <Col style="text-align: center;">
              <div><img v-lazy="pcurl+'img_xianzhuang.png'" class="gsjj_picture"></div>
            </Col>
        </Row>
    </div>
    <!-- 解决方案 -->
    <div class="jfbz">
      <p class="ryzz" >解决方案</p>
      <Row class="ryzz_row w">
        <Col style="text-align: center;">
            <div><img v-lazy="pcurl+'img_jiejuefangan.png'" class="gsjj_picture" style="margin-bottom:20px;"></div>      
        </Col>
      </Row>
    </div>
    <!-- 运用分析  -->
    <div class="cp">
      <p class="ryzz">运用分析</p>
      <Row class="ryzz_row w">
        <Col>
            <Row :gutter="16">
              <Col span="6" style="text-align: center;">
                  <div class="ryzz_content"><img v-lazy="pcurl+'img_fenxi1.png'" class="gsjj_picture">
                  </div>
              </Col>
                <Col span="6" style="text-align: center;">
                  <div><img v-lazy="pcurl+'img_fenxi2.png'" class="gsjj_picture">
                  </div>
              </Col> 
                <Col span="6" style="text-align: center;">
                  <div><img v-lazy="pcurl+'img_fenxi3.png'" class="gsjj_picture">
                  </div>
              </Col>
                <Col span="6" style="text-align: center;">
                  <div><img v-lazy="pcurl+'img_fenxi4.png'" class="gsjj_picture">
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
    columns1: [
                    {
                        title: '技术参数',
                        key: 'name'
                    },
                    {
                        title: '规格指标',
                        key: 'age'
                    },
        
                ],
                data1: [
                    {
                        name: 'John Brown',
                        age: 18,
                        address: 'New York No. 1 Lake Park',
                        date: '2016-10-03'
                    },
                    {
                        name: 'Jim Green',
                        age: 24,
                        address: 'London No. 1 Lake Park',
                        date: '2016-10-01'
                    },
                    {
                        name: 'Joe Black',
                        age: 30,
                        address: 'Sydney No. 1 Lake Park',
                        date: '2016-10-02'
                    },
             
                ]
    }
  },
  methods: {
      getData(index) {
        this.num = index;
      },
},
  mounted() {
  }
}

</script>
<style scoped> 
.cp {
  margin-top: 10vh;
  margin-bottom: 8vh;
}
.ryzz{
  margin:0 auto;text-align:center;
  font-size: 32px;
  font-weight: 600;
}
.gsjj_picture{
  width:auto;
 height:auto;
 max-width:100%;
 max-height:100%;
}
.fx_content{
  font-size: 14px;
  margin-top: 3vh;
  margin-bottom: 5vh;
  line-height: 28px;
  color: #808080;
}
.jfbz{
background: #F0F0F0;
padding: 10vh 0;
}
.ryzz_row {
  margin-top: 5vh;
}
</style>
