<template>
  <div class="indexPad">
   <div><img v-lazy="padurl+'img_banner_xinwen@2x.png'"></div>
    <!-- 新闻动态详情 -->
    <div class="aside1 raletve">
      <p class="f11 bold">{{newDetail.news_title}}</p>
     <p class="create"><span>{{newDetail.news_time}}</span><span style="margin-left:15%">来源：{{newDetail.copyfrom}}</span></p>
        <!-- <div class="imgwidth"><img v-lazy="news.news_img"></div> -->
        <!-- <div class="imgwidth">   <img :src="imgurl"></div> -->
        <p v-html="newDetail.news_content" class="newcontent colorCon linehei"></p>
<!-- 新闻推荐 -->
<!-- <div class="xwtj" v-show="xwtjform">
<div class="flex justbetween"><p>新闻推荐</p><p @click="close()">x</p></div>
<div class="newDeatail">
  <div><img src="@/assetPad/img_xinwenxiangqing2@2x.png">
  <p>策安将与东富龙合作研发医…</p>
  </div>
  <div><img src="@/assetPad/img_xinwenxiangqing3@2x.png">
   <p>策安将与东富龙合作研发医…</p>
  </div>
  <div><img src="@/assetPad/img_xinwenxiangqing4@2x.png"></div>
</div>
</div> -->
    </div>
  </div>
</template>
<script>
import { getNewsDetail,getImg } from "@/api/api";
export default {
  data() {
    return {
         padurl:"http://oss.chain-smart.com/assetPad/",
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
close(){
  this.xwtjform=false;
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
            let imgobj=JSON.parse(res.data.data.data.news_img);
            this.imgurl=getImg(imgobj[0].fileId);
          } else {
            this.$Message.error(res.data.error);
          }
        })
        .catch(error => {
          this.$Message.error(res.data.error);
        });
  },
  },
  mounted () {
this.newId=this.$route.params.id;
  this.getList();
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
margin-bottom: 14px;
margin-top:10px;
}
.xwtj{
position: absolute;
width:100%;
height:243px;
bottom:0;
background: rgba(0,0,0,0.50);
z-index:1000;
padding:25px;
color:#fff;
}
.raletve{
  position:relative
}
.newDeatail{
display:flex;
margin:0 5%;
justify-content: space-between;
margin-top:20px;
}
.newDeatail>div{
  width:30%;
}
.newcontent{
  margin:20px 0;
}
.imgwidth{
  width:70%;margin:0 auto;
}
</style>
