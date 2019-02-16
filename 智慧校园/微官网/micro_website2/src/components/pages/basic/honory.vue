<template>
  <div>
    <!-- <card :header="{title: $t('学校荣誉') }" :footer="{title: $t(''),link:'/component/panel'}"> -->
    <section  style="background-image: url(http://www.qhfx.edu.cn/app/static/images/xy_img/dingbu21.jpg);padding:10px 0;" class="dingbu">
    <div  class="dbContainer">
      <div class="dbfont">{{header}}</div>
    </div>
</section>

<div class="honorContainer">
        <Row :gutter="16">
          <div v-for="(item,index) in honorList" @click="detail()">
          <Col :xs="12" :sm="8" :md="6">
          <div class="ryzz_content">
            <img :src="item.img"  style="width:100%">
          </div>
          </Col>
          </div>
        </Row>
</div>
  </div>
</template>
<script>
import Vue from 'vue'
import * as data from '@/components/data/data';
import { Grid, GridItem, GroupTitle, Tabbar, TabbarItem, Group, Cell, Panel, Radio, Divider, Card } from 'vux'
export default {
    props:['header'],
  components: {
    Grid, GridItem, GroupTitle, Tabbar, TabbarItem, Group, Cell, Panel, Radio, Divider, Card
  },
  data() {
    return {
           ryzzs:data.ryzzs,
      honorList: [
        { img: 'http://www.qhfx.edu.cn/app/upload/month_1501/thb_238178201501141138538526.jpg', name: '山东省文明学校' },
        { img: 'http://www.qhfx.edu.cn/app/upload/month_1501/thb_238178201501141138538526.jpg', name: '山东省文明学校' },
        { img: 'http://www.qhfx.edu.cn/app/upload/month_1501/thb_238178201501141138538526.jpg', name: '山东省文明学校' },
        { img: 'http://www.qhfx.edu.cn/app/upload/month_1501/thb_238178201501141138538526.jpg', name: '山东省文明学校' },
      { img: 'http://www.qhfx.edu.cn/app/upload/month_1501/thb_238178201501141138538526.jpg', name: '山东省文明学校' },
      ],
    };
  },
  methods: {
    detail(){
      this.$router.push({name:'newsDetailpc',params:{header:this.header}});
    }
  },
  mounted: function () {

if ((navigator.userAgent.match(/(phone|pad|pod|iPhone|iPod|ios|iPad|Android|Mobile|BlackBerry|IEMobile|MQQBrowser|JUC|Fennec|wOSBrowser|BrowserNG|WebOS|Symbian|Windows Phone|iPad)/i))) {
    this.header=this.$route.params.header;
this.pageContainer=false;
}
  }
};
</script>
<style scoped>

@media screen and (min-width: 992px) {
  .honory {
    width: 25%;
    position: relative;
    margin-bottom: 10px;
  }
  .honorImg {
    height: 150px;
  }
}
@media screen and (max-width: 767px) {
  .honory {
    width: 48%;
    position: relative;
    margin-bottom: 10px;
  }
  .honorImg {
    height: 110px;
  }
}
@media screen and (min-width: 768px) and (max-width: 991px) {
  .honory {
    width: 32%;
    position: relative;
    margin-bottom: 10px;
  }
  .honorImg {
    height: 150px;
  }
}
.honorContent {
  justify-content: space-between;
  margin: 15px 4%;
  flex-flow: row wrap;
}
.honoryTitle {
  position: relative;
}
.honorNames {
  position: absolute;
  width: 100%;
  height: 20px;
  background: rgba(0, 0, 0, 0.4);
  bottom: 5px;
  font-size: 0.8rem;
  color: #fff;
  text-align: center;
}
.honorImg {
  width: 100%;
  border-radius: 4px;
}
.ryzz_content {
  text-align: center;
}
</style>
