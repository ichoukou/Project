<template>
  <div class="list">
    <!-- 头部 -->
    <div class="header">
      直播大厅
    </div>
    <!-- 轮播 -->
        <swiper loop auto :list="demo06_list" :index="demo06_index" @on-index-change="demo06_onIndexChange" dots-position="center"></swiper>
   <!-- 直播切换 -->
    <div>
     <tab :line-width=0.5 active-color='#fc378c' v-model="index">
        <tab-item class="vux-center" :selected="demo2 === item" v-for="(item, index) in list2" @on-item-click="broadcastab(index)" :key="index">{{item}}</tab-item>
      </tab>
    </div>
    <!-- 内容 -->

   <div style="background:#fff;margin-top:10px;padding:2% 3%;" class="mfgk" @click="detail()" v-show="showorder">
     <div class="flex" style="justify-content:space-between"><p>{{mfzb}}</p><p style="color:#ddd;font-size:0.7rem">2000人已报名</p></div>
     <p style="border-bottom:1px solid #ddd;margin:7px 0"></p>
     <span style="color:green;display:inline-block;border:1px solid green;font-size:0.7rem;border-radius:4px;">{{ddkk}}</span><span style="font-size:0.8rem;display:inline-block;margin-left:5px;">{{jknr}}</span>
     <p style="font-size:0.7rem;margin-top:5px;"><span style="color:blue">{{time}}</span> &nbsp;&nbsp;&nbsp;&nbsp;主讲人：{{zjr}}</p>
   <div style="position:relative;margin-left:90%;margin-top:-35px;"> <x-icon type="ios-arrow-forward" size="25" style="color:#fff"></x-icon></div>
   </div>


<div  v-if="num==0"> 
<!-- 名师讲堂 -->
<div style="background:#fff;margin-top:10px;padding-bottom:10px;">
<div class="flex" style="justify-content:space-between;padding:2% 3%"><p style="font-size:0.9rem;font-weight:bold;">直播预告</p><p style="font-size:0.7rem;color:#ddd">更多课程</p></div>
    <div class="flex" style="justify-content:space-between;margin:0 2%;">
           <div style="width:48%;position:relative;" @click="detail()">
          <div style="position:relative">
               <div style="position:absolute;width:100%;height:20px;background:rgba(0, 0, 0, 0.4);bottom:5px;font-size:0.8rem;color:#fff;text-align:center">“四字法”作文指导课</div>
               <img src="@/assets/mskc1.jpg" style="width:100%;border-radius:4px"></div>
                      <p style="font-size:0.8rem;display:flex"><span style="font-weight:bold;width:60%">主讲人：栾老师</span><span style="text-align:right;color:#bbb;width:40%">200人报名</span></p>
               <p style="font-size:0.8rem">2019-03-26 20:00</p>
           </div>
           <div style="width:48%;position:relative;" @click="detail()">
                <div style="position:relative">
               <div style="position:absolute;width:100%;height:20px;background:rgba(0, 0, 0, 0.4);bottom:5px;font-size:0.8rem;color:#fff;text-align:center">特色课程之二生物实验课</div>
               <img src="@/assets/mskc2.jpg" style="width:100%;border-radius:4px"></div>
                      <p style="font-size:0.8rem;display:flex"><span style="font-weight:bold;width:60%">主讲人：姜老师</span><span style="text-align:right;color:#bbb;width:40%">100人报名</span></p>
               <p style="font-size:0.8rem">2018-02-26 20:00</p>
           </div>
    </div>

        <div class="flex" style="display:flex;justify-content:space-between;margin:15px 2%">
           <div style="width:48%;position:relative;" @click="detail()">
       <div style="position:relative">
               <div style="position:absolute;width:100%;height:20px;background:rgba(0, 0, 0, 0.4);bottom:5px;font-size:0.8rem;color:#fff;text-align:center">政治教育课</div>
               <img src="@/assets/mskc3.jpg" style="width:100%;border-radius:4px"></div>
                      <p style="font-size:0.8rem;display:flex"><span style="font-weight:bold;width:60%">主讲人：张老师</span><span style="text-align:right;color:#bbb;width:40%">500人报名</span></p>
               <p style="font-size:0.8rem">2019-02-26 20:00</p>
           </div>
           <div style="width:48%;position:relative;" @click="detail()">
             <div style="position:relative">
               <div style="position:absolute;width:100%;height:20px;background:rgba(0, 0, 0, 0.4);bottom:5px;font-size:0.8rem;color:#fff;text-align:center">特色地理课</div>
               <img src="@/assets/mskc4.jpg" style="width:100%;border-radius:4px"></div>
                      <p style="font-size:0.8rem;display:flex"><span style="font-weight:bold;width:60%">主讲人：李老师</span><span style="text-align:right;color:#bbb;width:40%">400人报名</span></p>
               <p style="font-size:0.8rem">2019-01-26 08:00</p>
           </div>
    </div>

    <!-- <div class="flex" style="justify-content:space-between;margin:0 2%;">
           <div style="width:48%">
             <div style="position:relative">
               <div style="position:absolute;width:100%;height:20px;background:rgba(0, 0, 0, 0.4);bottom:5px;font-size:0.8rem;color:#fff;text-align:center">特色历史课</div>
               <img src="@/assets/mskc5.jpg" style="width:100%;border-radius:4px"></div>
           <p style="font-size:0.8rem;display:flex"><span style="font-weight:bold;width:60%">主讲人：赵老师</span><span style="text-align:right;color:#bbb;width:40%">300人报名</span></p>
          <p style="font-size:0.8rem">2019-01-20 09:00</p>
           </div>
           <div style="width:48%">
    <div style="position:relative">
               <div style="position:absolute;width:100%;height:20px;background:rgba(0, 0, 0, 0.4);bottom:5px;font-size:0.8rem;color:#fff;text-align:center">职业教育课</div>
               <img src="@/assets/mskc6.jpg" style="width:100%;border-radius:4px"></div>
                      <p style="font-size:0.8rem;display:flex"><span style="font-weight:bold;width:60%">主讲人：马老师</span><span style="text-align:right;color:#bbb;width:40%">600人报名</span></p>
               <p style="font-size:0.8rem">2018-12-26 16:00</p>
           </div>
    </div> -->

</div>
<!-- 互动课堂
<div style="background:#fff;margin-top:10px;padding-bottom:10px;">
<div class="flex" style="justify-content:space-between;padding:2% 3%"><p style="font-size:0.9rem;font-weight:bold;">互动课堂</p><p style="font-size:0.7rem;color:#ddd">更多课程</p></div>
    <div class="flex" style="justify-content:space-between;margin:0 2%;">
           <div style="width:48%">
             <div style="position:relative">
               <div style="position:absolute;width:100%;height:20px;background:rgba(0, 0, 0, 0.4);bottom:5px;font-size:0.8rem;color:#fff;text-align:center">特色历史课</div>
               <img src="@/assets/mskc5.jpg" style="width:100%;border-radius:4px"></div>
           <p style="font-size:0.8rem;display:flex"><span style="font-weight:bold;width:60%">主讲人：赵老师</span><span style="text-align:right;color:#bbb;width:40%">300人报名</span></p>
          <p style="font-size:0.8rem">2019-01-20 09:00</p>
           </div>
           <div style="width:48%">
    <div style="position:relative">
               <div style="position:absolute;width:100%;height:20px;background:rgba(0, 0, 0, 0.4);bottom:5px;font-size:0.8rem;color:#fff;text-align:center">职业教育课</div>
               <img src="@/assets/mskc6.jpg" style="width:100%;border-radius:4px"></div>
                      <p style="font-size:0.8rem;display:flex"><span style="font-weight:bold;width:60%">主讲人：马老师</span><span style="text-align:right;color:#bbb;width:40%">600人报名</span></p>
               <p style="font-size:0.8rem">2018-12-26 16:00</p>
           </div>
    </div>

        <div class="flex" style="display:flex;justify-content:space-between;margin:15px 2%">
           <div style="width:48%">

                 <div style="position:relative">
               <div style="position:absolute;width:100%;height:20px;background:rgba(0, 0, 0, 0.4);bottom:5px;font-size:0.8rem;color:#fff;text-align:center">中小学心里课</div>
               <img src="@/assets/mskc7.jpg" style="width:100%;border-radius:4px"></div>
                      <p style="font-size:0.8rem;display:flex"><span style="font-weight:bold;width:60%">主讲人：王老师</span><span style="text-align:right;color:#bbb;width:40%">200人报名</span></p>
               <p style="font-size:0.8rem">2018-01-26 10:00</p>
           </div>
    </div>
</div> -->

</div>
<!-- 正在直播 -->
    <div v-if="num==1" style="margin-top:10px;">

<div class="weui-panel__bd" style="background:#fff">
  <a href="#!/component/cell" @click="detail()" class="weui-media-box weui-media-box_appmsg"><div class="weui-media-box__hd"><img src="../../assets/order1.jpg" alt="" class="weui-media-box__thumb" style="width:100%"></div> <div class="weui-media-box__bd"><h4 class="weui-media-box__title">高一化学</h4> <p class="weui-media-box__desc" style="margin-top:5px">物质量的计算专题公开课，主要讲解物质量的计算相关知识。
</p>
<p style="fon-size:0.7rem;color:#999999">2019.03.20 08:00</p>
</div></a>
  <a href="#!/component/cell" class="weui-media-box weui-media-box_appmsg"><div class="weui-media-box__hd"><img src="../../assets/order2.jpg" alt="" class="weui-media-box__thumb"></div> <div class="weui-media-box__bd"><h4 class="weui-media-box__title">高一物理</h4> <p class="weui-media-box__desc" style="margin-top:5px">为什么学不好物理，主要讲解如何学好物理相关知识。</p>
  <p style="fon-size:0.7rem;color:#999999">2019.03.16 08:00</p>
  </div></a> 
  <a href="#!/component/cell" class="weui-media-box weui-media-box_appmsg"><div class="weui-media-box__hd"><img src="../../assets/order3.jpg" alt="" class="weui-media-box__thumb"></div> <div class="weui-media-box__bd"><h4 class="weui-media-box__title">高一物理</h4> <p class="weui-media-box__desc" style="margin-top:5px">速度还是加速度？游乐场中的物理学，课程主要讲解了物理加速度相关的知识。</p>
  <p style="fon-size:0.7rem;color:#999999">2019.03.15 08:00</p>
  </div></a>
  <a href="#!/component/cell" class="weui-media-box weui-media-box_appmsg"><div class="weui-media-box__hd"><img src="../../assets/order4.jpg" alt="" class="weui-media-box__thumb"></div> <div class="weui-media-box__bd"><h4 class="weui-media-box__title">高一英语</h4> <p class="weui-media-box__desc" style="margin-top:5px">
  如何应对高考英语冲刺，名师王洪滨倾力奉献，课程主要讲解了高考英语相关的知识。
  </p>
  <p style="fon-size:0.7rem;color:#999999">2019.03.09 08:00</p>
  </div></a> 
  <a href="#!/component/cell" class="weui-media-box weui-media-box_appmsg"><div class="weui-media-box__hd"><img src="../../assets/order5.jpg" alt="" class="weui-media-box__thumb" style="width:100%"></div> <div class="weui-media-box__bd"><h4 class="weui-media-box__title" >高一英语</h4> <p class="weui-media-box__desc" style="margin-top:5px">
【斐然英语】像“老外”一样思考，名师顾斐倾力奉献，课程主要讲解了英语思维相关的知识。
</p>
<p style="fon-size:0.7rem;color:#999999">2019.02.08 08:00</p>
</div></a>
</div>

 <panel :footer="footer" :list="list5" :type="type" @on-img-error="onImgError" ></panel>
 </div>
  </div>

</template>

<script>
import Vue from 'vue'
import { Search, Group, Cell, XButton,Swiper,Tab, TabItem,SwiperItem,Panel } from 'vux'
const list = () => ['直播预告', '正在直播', '直播回放'];
const baseList = [{
  img: require('@/assets/lunbo/1.jpg'),
}, {
 img: require('@/assets/lunbo/2.jpg'),
}, {
  img: require('@/assets/lunbo/3.jpg'), // 404
}]
const urlList = baseList.map((item, index) => ({
  img: item.img,
}))
export default {
  components: {
    Search,
    Group,
    Cell,
    XButton,
    Swiper,Tab, TabItem,SwiperItem,Panel,
  },
  data() {
    return {
      showorder:false,
      zjr:'张老师',
      time:'01-17 19:00',
          jknr:"特色英语课",
      mfzb:"免费直播公开课",
      ddkk:"等待开课",
            type: '3',
      list: [{
        src: 'http://somedomain.somdomain/x.jpg',
        fallbackSrc: 'http://placeholder.qiniudn.com/60x60/3cc51f/ffffff',
        title: '申教授教你与父亲相处定位正确方式',
        url: '/component/cell'
      }],
      results: [],
      value: '',
      demo06_list: urlList,
        list2: list(),
        index: 0,
         demo2: '美食',
         num:0
    }
  },
  methods: {
broadcastab(broadid){
if(broadid==1){
  this.mfzb="直播公开课";
  this.ddkk="正在直播";
  this.jknr="心里教育课";
  this.time="01-26 16:00";
  this.showorder=true;
this.zjr="李老师",
  this.num=1;
}else if(broadid==0){
   this.mfzb="直播预告课";
  this.ddkk="等在直播";
  this.jknr="特色英语课";
  this.time="01-17 19:00";
  this.zjr="张老师",
   this.showorder=false;
  this.num=0;
}
},
detail(){
  this.$router.push({name:"detail",params:{id:this.num}});
  // if(this.num==0){

  // }else if(this.num==1){
  //   this.$router.push({name:"detail",param:{id:1}});
  // }
},
// zhibo(){
//  this.$router.push({name:"detail",param:{id:1}});
// }

  },
  mounted: function () {
  },


}
</script>
<style>
.weui-media-box_appmsg .weui-media-box__hd{
  width:150px!important;
  height:80px!important;
}
.vux-slider > .vux-indicator > a > .vux-icon-dot.active, .vux-slider .vux-indicator-right > a > .vux-icon-dot.active {
    background-color: #fff!important;
    opacity:1!important;
}
.mfgk .vux-x-icon[data-v-6e037aaf]{
  fill:#ddd;
}
 .zzzb .weui-panel__hd{
   color:#000!important;
font-weight:600!important;
}
@keyframes overscale{
       0%{transform: scale(1)}
    100%{transform: scale(1.1);}
}
</style>
<style scoped>

.header {
  height: 44px;
  background: green;
  line-height: 44px;
  color: #fff;
  text-align: center;
}
</style>
