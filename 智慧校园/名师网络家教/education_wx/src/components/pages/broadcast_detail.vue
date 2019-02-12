<template>
  <div style="postion:relative">
    <!-- 头部 -->


  <div style="position:relative;">
  
<div style="width:60px;height:60px;background:rgba(0, 0, 0, 0.4);border-radius:50%; margin: auto; position: absolute;  
            top: 0; left: 0; bottom: 0; right: 0; " v-show="showbf">
    <div style="width: 0;height: 0;border-top: 20px solid transparent;border-left: 25px solid #fff;border-bottom: 22px solid transparent;margin: auto;  
            position: absolute;  
            top: 0; left: 0; bottom: 0; right: 0; "></div>
</div>
         <!-- <img src="http://m.iqiyipic.com/image/20181212/ed/e7/v_122495983_m_601_480_270.webp" style="width:100%;"> -->
 <img src="../../assets/mskc1.jpg" style="width:100%;">

    <!-- <img src="@/assets/big.jpg" style="width:100%;"> -->
    <p style="width:100%;height:30px;position:absolute;bottom:5px;background:rgba(0, 0, 0, 0.4);text-align:center;color:#fff;font-size:0.9rem;line-height:30px;">
      {{kaik}}
    </p>
  </div>

<!-- 课程介绍 -->
    <tab>
      <tab-item selected @on-item-click="onItemClick(1)">课程介绍</tab-item>
      <tab-item @on-item-click="onItemClick(2)">老师简介</tab-item>
    </tab>
     <div v-if="num==1">
  <div style="background:#fff;padding:3% 5%;">
      <p style="font-size:0.9rem;font-weight:bold">申教授教你与父亲相处的正确方式</p>
      <div class="flex" style="font-size:0.8rem;margin-top:10px;"><p><span style="color:gray">主讲人：</span><span style="color:green">申何勇</span></p><p style="color:gray;margin-left:20%;"> 报名人数：2000人</p></div>
  </div>

<div style="margin-top:5px;background:#fff;padding:3%;">
  <p style="margin:0 auto;text-align:center;margin-bottom:10px;">课程介绍</p>
  <img src="http://oss.chain-smart.com/assetM/img_peixun_biaoge@2x.png" style="width:100%;height:auto">
</div>
     </div>

     <div v-if="num==2" style="margin-bottom:40px;">
        <img src="@/assets/timg1.jpg" style="width:100%;height:auto">
     </div>

<div style="position: fixed;bottom: 0;width: 100%;z-index: 100;height:40px;background:#ddd;siaplay:flex;padding:0 3%" v-show="showBm">
  <p style="width:50%;line-height:40px"><span style="color:#ffa523;">免费</span> <span style="margin-left:20px;color:gray;font-size:0.8rem">2000人已报名</span></p><x-button mini type="primary" style="position:absolute;top:7px;right:8%">免费报名</x-button>
  </div>





</div>
</template>

<script>
import Vue from 'vue'
import { Search, Group, Cell, XButton,Swiper,Tab, TabItem,SwiperItem,Panel } from 'vux'


export default {
  components: {
    Search,
    Group,
    Cell,
    XButton,
    Swiper,Tab, TabItem,SwiperItem,Panel
  },
  data() {
    return {
   num:1,
   showbf:false,
   kaik:"",
   showBm:false,
    }
  },
  methods:{
    onItemClick(num){
       if(num==1){
            this.num=1
       }else{
         this.num=2;
       }
    }
  },
  mounted: function () {
          let id=this.$route.params.id;
          if(id==0){
   this.showbf=false;
   this.kaik="等待开课";
   this.showBm=true;
         
}else if(id==1){
this.showbf=true;
this.kaik="正在直播";
this.showBm=false;
          }
  },


}
</script>
<style>
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
