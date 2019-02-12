<template>
<div class="all"><img style="width:100%;height:auto;"  v-lazy="pcurl+'img_banner_lianxiwomen.png'">
<div class="jrwmxq w" >
    <Row>
      <Col span="12" > 
        <div class="gwmc">{{recurits.rec_title}}</div>
      </Col>
      <Col span="12"> 
        <div class="gwdy">{{recurits.rec_payment}}</div>
      </Col>
    </Row>
    <Row style="margin:3vh 0;">
      <Col> 
            <div class="xq_requirement">{{recurits.rec_education}}  |  {{recurits.rec_working_life}} </div>
      </Col>
    </Row>
    <Row>
      <Col  class="jrwmxq_content">
        <Row>
          <Col class="zwms"> 
            <p>职位描述</p>
          </Col>
        </Row>
        <Row>
          <Col> 
               <div class="gw_content" v-html="recurits.rec_content"></div>
              <!-- <div class="gw">岗位描述：</div>
              <div class="gw_content" v-html="recurits.rec_content">
              </div>
              <div class="gw">岗位要求：</div>
              <div class="gw_content" v-html="recurits.demand">
              </div> -->
          </Col>
        </Row>

      </Col>
    </Row>

    <Row>
      <Col span="16" offset="4">
        <p class="send_resume">如有意向，请将简历发送至邮箱：cj@chain-smart.com</p>
      </Col>
    </Row>

  </div>
</div>
</template>
<script>
// import * as data from '@/components/data/data';
import {getJrwmDetail} from '@/api/api';
export default {
  data() {
return {
  num:1,
  rec_id:1,
  recurits:{},
    pcurl:'http://oss.chain-smart.com/assets/',
    }
  },
  methods: {
      getData(index) {
        this.num = index;
      },
      getList() {
      let param = {
        keyValue: this.rec_id,
      };
      getJrwmDetail(param).then(res => {
          var code = res.status;
          if (code == 200) {
                this.recurits = res.data.data.data;
          } else {
            this.$Message.error(res.data.error);
          }
        })
        .catch(error => {
          console.log(res.data.error);
        });
  },
},
  mounted() {
 this.rec_id=this.$route.params.id;
 this.getList();
  }
}

</script>
<style scoped>
.jrwmxq {
  margin-top: 10vh;
  margin-bottom: 8vh;
}
.gwmc{
 /* font-family: PingFangSC-Medium; */
 font-size: 32px;
 font-weight: 600;
}
.gwdy{
 /* font-family: PingFangSC-Semibold; */
 font-size: 32px;
 color: #5DC0C1;
 text-align: right;
}
.xq_requirement {
  font-size: 22px;
}
.jrwmxq_content {
  border-top: 1px solid #EEE;
  border-bottom: 1px solid #EEE;
}
.zwms {
  /* font-family: PingFangSC-Medium; */
  font-size: 20px;
  font-weight: 600;
  margin: 3vh 0;
}
.gw {
  /* font-family: PingFangSC-Medium; */
  font-size: 14px;
  font-weight: 600;
}
.gw_content {
  /* font-family: PingFangSC-Regular; */
  font-size: 14px;
  line-height: 28px;
  margin-bottom: 3vh;
}
.kjzc{
 margin-top:10vh;
}
.kjzc .zc {
  cursor: pointer;
}
.kjzc .zc span{
  font-size:16px;
  color:#555;
}
.kjzc .active span{
  color:#207FE8;
}
.cpfw_picture{
text-align:center;
}
.cpfw_content{
margin-top:10vh;
}
.cpfw_title{
text-align: center;
}
.cpfw_title1{
font-weight:600;
font-size:17px;
}
.gsjj_picture{
  width:auto;
 height:150px;
 max-width:100%;
 
}
.ryzz_wz1{
  font-size:17px;
  font-weight: bold;
}
.gswz{
  background:url("http://oss.chain-smart.com/assets/icon_news_wangzhi.png");
  width:26px;
  height:20px;
  display:inline-block;
}
.gswz1{
  margin-left:30px;
}
.send_resume {
  text-align: center;
  margin-top: 4vh;
  font-size: 20px;
  font-weight: 600;
}
</style>
