<template>
  <div class="indexBody">
    <div><img v-lazy="murl+'img_banner_xwdt@3x.png'"></div>
    <!-- 客户案例详情 -->
    <div class="aside1">
      <p class="f12 bold">{{newDetail.news_title}}</p>
     <p class="create"><span>{{newDetail.news_time}}</span><span style="margin-left:15%">来源：{{newDetail.copyfrom}}</span></p>
        <!-- <img v-lazy="news.news_img"> -->
        <!-- <img v-lazy="newDetail.news_img_mobile"> -->
        <p class="colorCon f9 linehei" v-html="newDetail.news_content"></p>
    </div>
  </div>
</template>
<script>
import { getNewsDetail,getImg } from "@/api/api";
// import * as data from '@/components/data/data';
export default {
  data() {
    return {
       murl:"http://oss.chain-smart.com/assetM/",
      num: 1,
      newId:1,
          newDetail:{},
      contentDis:"inline",
      imgurl:'',
    };
  },
  methods: {
    getData(index) {
      this.num = index;
    },
        getList() {
      let param = {
        keyValue: this.newId,
        // is_commend:this.is_commend
      };
      getNewsDetail(param).then(res => {
          var code = res.status;
          if (code == 200) {
                this.newDetail = res.data.data.data;
            // let imgobj=JSON.parse(res.data.data.data.news_img);
            // this.imgurl=getImg(imgobj[0].fileId);
          } else {
            this.$Message.error(res.data.error);
          }
        })
        .catch(error => {
          this.$Message.error(res.data.error);
        });
  },
  },
  mounted: function () {
this.newId=this.$route.params.id;
  this.getList();
    this.$router.afterEach((to, from, next) => {
        window.scrollTo(0, 0)
    })
  }
};
</script>
<style scoped>
img {
  width: 100%;
  height: auto;
}
.create{
color: #808080;
margin-bottom: 8px;/*其下方的新闻内容带行高，所以这里的下外边距比上外边距小点，不然上下间距看起来亦一样*/
margin-top:10px;
}
</style>
