<template>
  <div class="grid_list;position:relative;margin:0;padding:0;">
    <!-- banner图 -->
    <div class="swiper-container shouyecontainer" v-if="bannerList.length>1">
      <div class="swiper-wrapper shouye">
        <div class="swiper-slide" v-for="(item,index) in bannerList">
          <img :src="item.img" class="bannerImg">
           <div class="honorName">{{item.title}}</div>
          </div>
      </div>
      <div class="swiper-pagination swiperm_pagination"></div>
    </div>
<div style="position:relative" v-else><img :src="bannerList[0].img" class="bannerImg"> <div class="honorName">{{bannerList[0].title}}</div></div>
<!-- 座右铭 -->
   <div><img src="http://www.qhfx.edu.cn/app/upload/image/top_img/dianji03.png"></div>
<!-- 通知公告 -->
    <div class="swiper-container notice-container">
        <div class="swiper-wrapper notice-wrapper">
            <div class="swiper-slide" v-for="(item,index) in notices">
              <div style="width:8%;text-align:left"><img src="@/assets/notice.png" style="width:28px"></div>
              <div style="width:15%;">{{notice}}</div>
              <div style="width:35%;color:#bbb;" @click="detail(notice)">{{item.title}}</div>
              <div style="width:27%;height:20px;line-height:25px;color:#bbb;">{{item.time}}</div>
              <div style="width:15%;color: #2d8cf0;" @click="notice_more()">more</div>
              </div>
        </div>
    </div>
<!-- 九宫格  -->
<div>          
    <grid>
      <div>
      <grid-item :label="item.name" v-for="(item,index) in list1" @on-item-click="list(item.name)">
    <img slot="icon" :src="item.img">
            </grid-item>
      </div>
    </grid>
</div>

    
    <p class="copy_right">版权所有：烟台第一小学</p>


    
    </div>
<!-- 底部导航 -->
  
</template>

<script>
import Vue from 'vue'
import Swiper from 'swiper';
import { Grid, GridItem, GroupTitle,Tabbar, TabbarItem, Group, Cell} from 'vux'
export default {
  components: {
 Grid, GridItem, GroupTitle,Tabbar, TabbarItem, Group, Cell
  },
  data () {
    return {
      notice:'通知公告',
      noticeid:10,
      show:false,
      id:3,
      info:[],
      user_id:0,
        bannerList: [
                { img:'http://www.qhfx.edu.cn/app/upload/image/indexphoto/2e7433ddbfb358c05d88f3ed983cd262.jpg', title: '清华附小2018-2019学年度第一学期开学典礼' },
                { img: 'http://www.qhfx.edu.cn/app/upload/image/indexphoto/e786890e2dfe9b03a719de3792500321.jpg', title: '难忘师恩，清华附小教师节献礼' },
        { img: 'http://www.qhfx.edu.cn/app/upload/image/indexphoto/022f4cc15b0c17f1a648c21790203e02.jpg', title: '清华附小2018-2019学年度第一学期开学典礼' },
        { img: 'http://www.qhfx.edu.cn/app/upload/image/indexphoto/97026657bb33f79dc7d68f6edf042bfb.jpg', title: '清华附小2018-2019学年度第一学期开学典礼' },
        { img: 'http://www.qhfx.edu.cn/app/upload/image/indexphoto/7d4466fd7dafad64de30ffb5523939ae.jpg', title: '清华附小2018-2019学年度第一学期开学典礼' },
      ],
      notices:[{title:'面向社会招聘教师',time:'2018-02-01'},{title:'征稿启事',time:'2018-02-01'}],
      list1:[
        {id:1,name:'学校概况',img:'http://www.jnbwx.com.cn/Public/Home/bowen/images/wx/001.png'},
      {id:2,name:'校园动态',img:'http://www.jnbwx.com.cn/Public/Home/bowen/images/wx/icon-xyxw.png'},
      {id:3,name:'党建之窗',img:'http://www.jnbwx.com.cn/Public/Home/bowen/images/wx/010.png'},
        {id:4,name:'教师发展',img:'http://www.jnbwx.com.cn/Public/Home/bowen/images/wx/002.png'},
      {id:5,name:'学生园地',img:'http://www.jnbwx.com.cn/Public/Home/bowen/images/wx/003.png'},
      {id:6,name:'教育科研',img:'http://www.jnbwx.com.cn/Public/Home/bowen/images/wx/005.png'},
       {id:7,name:'德育之窗',img:'http://www.jnbwx.com.cn/Public/Home/bowen/images/wx/006.png'},
      {id:8,name:'平安校园',img:'http://www.jnbwx.com.cn/Public/Home/bowen/images/wx/007.png'},
      {id:9,name:'家校互动',img:'http://www.jnbwx.com.cn/Public/Home/bowen/images/wx/008.png'},
       
  ]   
    }
  },
  methods:{
navDetail(index){
   this.$router.push({ name: "m_introduce" })
},
detail(title){
this.$router.push({name:"newsDetail",params:{header:title}});
},
notice_more(){
       this.$router.push({name:'newsList',params:{header:this.notice}});
},
list(title){
  if(title=="学校概况"){
    this.$router.push({name:"introduce"});
}else if(title=="教师发展"){
    this.$router.push({name:"honory",params:{header:title}});
}else{
  this.$router.push({name:"newsList",params:{header:title}});
}
},
  },
  mounted: function() {
          // banner轮播
    let bannerswiper=new Swiper('.shouyecontainer', {
      loop: true,
      autoplay:5000,
      autoplayDisableOnInteraction : false,
      preventClicks : true,
      direction: 'horizontal',
      pagination: '.swiperm_pagination',
      observer:true,
      effect: 'fade',
       onSlideChangeEnd: function(bannerswiper){ 
bannerswiper.update();  
      bannerswiper.startAutoplay();
　　   bannerswiper.reLoop();  
}
    });

    // 通知公告的轮播
        let noticeswiper = new Swiper('.notice-container', {
             loop: true,
      autoplay:5000,
      autoplayDisableOnInteraction : false,
      preventClicks : true,
       autoplayDisableOnInteraction : false,
        direction: 'vertical',
             observer:true,
               effect: 'fade',
     onSlideChangeEnd: function(noticeswiper){ 
noticeswiper.update();  
      noticeswiper.startAutoplay();
　　   noticeswiper.reLoop();  
}
    });
  },
}
</script>
<style>
.weui-grid{
  width:33.33%!important;
}
.weui-grid__icon{
  width:40px!important;
  height:40px!important;
}
.shouye > .swiper-slide {
  text-align: center;
  background: #fff;
  display: flex;
  -webkit-box-pack: center;
  -ms-flex-pack: center;
  -webkit-justify-content: center;
  justify-content: center;
  -webkit-box-align: center;
  -ms-flex-align: center;
  -webkit-align-items: center;
  align-items: center !important;
}
.shouyecontainer {
  width: 100%;
  padding: 0 !important;
}

/* 通知公告的轮播 */
   .notice-container {
        width: 100%;
        height: 30px!important;
    }
    .notice-container .swiper-slide {
        text-align: center;
        background: #fff;
        font-size:0.8rem;
        display: -webkit-box;
        display: -ms-flexbox;
        display: -webkit-flex;
        display: flex!important;;
        -webkit-box-pack: center;
        -ms-flex-pack: center;
        -webkit-justify-content: center;
        justify-content: center;
        -webkit-box-align: center;
        -ms-flex-align: center;
        -webkit-align-items: center;
        align-items: center;
        height:30px!important;
    }
    
</style>
<style scoped>
.honorName {
  position: absolute;
  width: 100%;
  height: 20px;
  bottom: 35px;
  font-size: 1rem;
  color: #fff;
  text-align: center;
}
.bannerImg{
  width:100%;
  max-width:1000px;
  min-width:180px;
    /* max-width: 500px;
    height: 190px; */
}
.grid_list{
width:100%;
}
.grid-center {
  display: block;
  text-align: center;
  color: #666;
}
.weui-grids {
  background-color: #fff;
  display:flex;flex-flow:row wrap;justify-content:center;align-items:center;
}
.copy_right{
margin:0 auto;
text-align:center;
font-size:0.8rem;
margin-top:10px;
margin-bottom:53px;
}

</style>
