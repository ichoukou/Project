<template>
  <div >
<div style="width:100%;height:auto;position:relative">
 <Carousel autoplay v-model="value2" loop :autoplay-speed="autoplaySpeed" height="450px">
        <CarouselItem v-for="(item,index) in bannerList">
            <div class="demo-carousel" style="position:relative;border:1px solid #000">
              <img :src="item.img" style="width:100%">
                   <p class="swiperTitle">{{item.title}}</p>
            </div>
        </CarouselItem>
    </Carousel>
</div>
    <div class="mingyan"></div>
    <!-- 通知公告 -->
    <div class="swiper-container noticepc-container">
        <div class="swiper-wrapper notice-wrapper">
            <div class="swiper-slide" v-for="(item,index) in notices">
              <div style="width:2%;text-align:left;"><img src="@/assets/notice.png" style="width:28px"></div>
              <div style="width:6%;">通告通知</div>
              <div style="width:44%;color:#bbb;cursor:pointer" @click="detail()">{{item.title}}</div>
              <div style="width:45%;height:20px;line-height:25px;color:#bbb;">{{item.time}}</div>
              <div style="width:3%;color: #2d8cf0;cursor:pointer" @click="more('通告通知')">more</div>
              </div>
        </div>
    </div>
    <!-- 内容 -->
    <div class="Container">
      <div class="row">
        <!-- 校园新闻 -->
        <div class="newContainer shadow">
          <div class="newtitle">
            <p class="newnName">校园新闻</p>
            <p class="more" @click="more('校园新闻')">more>></p>
            <div class="clear"></div>
          </div>
          <div>
            <div class="newImg"><img src="http://www.qhfx.edu.cn/app/upload/month_1901/thb_238178201901041758258656.jpg"></div>
            <ul class="news">
              <li v-for="(item,index) in news" v-if='index<=5&&news!=null'>
                <span @click="detail('校园新闻')">{{item.title}}</span>
                <span class="newTime">{{item.time}}</span>
              </li>
            </ul>
            <div class="clear"></div>
          </div>
        </div>
        <!-- 党建之窗 -->
        <div class="partyContainer shadow">
          <div class="newtitle">
            <p class="newnName">党建之窗</p>
            <p class="more" @click="more('党建之窗')">more>></p>
            <div class="clear"></div>
          </div>
          <ul class="news">
            <li v-for="(item,index) in news" v-if='index<=5&&news!=null'>
              <span v-if="item.title.length>20" @click="detail('党建之窗')">{{item.title.slice(0,20)}}</span>
              <span v-else @click="detail('党建之窗')">{{item.title}}</span>
              <span class="newTime">{{item.time}}</span>
            </li>
          </ul>
        </div>
        <div class="clear"></div>
      </div>
      <!-- 学生园地/教学科研/德育之窗 -->
      <div class="row xsyd">
        <div class="students shadow" v-for="i in Students">
          <div class="newtitle">
            <p class="newnName">{{i.name}}</p>
            <p class="more" @click="more('德育之窗')">more>></p>
            <div class="clear"></div>
          </div>
          <ul class="news">
            <li v-for="(item,index) in news" v-if='index<=5&&news!=null'>
              <span v-if="item.title.length>16">{{item.title.slice(0,16)}}</span>
              <span v-else>{{item.title}}</span>
              <span class="newTime">{{item.time}}</span>
            </li>
          </ul>
        </div>
        <div class="clear"></div>
      </div>
      <!-- 平安校园/家校互动 -->
      <div class="row">
         <div class="safeCamp shadow" v-for="i in safes">
               <div class="newtitle">
            <p class="newnName">{{i.name}}</p>
            <p class="more" @click="more(i.name)">more>></p>
            <div class="clear"></div>
          </div>

          <div class="topSafe">
          <div class="safeImg"><img :src="i.img"/></div>
          <div class="safeDes"><p>{{i.title.slice(1,18)}}</p><p>{{i.des.slice(0,55)}}</p></div>
          <div class="clear"></div>
          </div>
              <ul class="news">
            <li v-for="(item,index) in news" v-if='index<=4&&news!=null'>
              <span v-if="item.title.length>35">{{item.title.slice(0,35)}}</span>
              <span v-else>{{item.title}}</span>
              <span class="newTime">{{item.time}}</span>
            </li>
          </ul>
         </div>
          <div class="clear"></div>
      </div>
      <!-- 教师风范 -->
      <div class="teachers">
                 <div class="newtitle" style="padding:20px 20px 10px 20px;">
            <p class="newnName">教师风范</p>
            <p class="more" @click="more('教师风范')">more>></p>
            <div class="clear"></div>
          </div>
          <p class="line"></p>
          <div>
           <div class="honory" v-for="(item,index) in honorList">
          <div class="honoryTitle">
            <div class="honorName">{{item.name}}</div>
            <img :src="item.img" class="honorImg"></div>
        </div>
            <div class="clear"></div>
          </div>
      </div>
      <!-- 友情链接 -->
  <div class="teachers">
                 <div class="newtitle" style="padding:20px 20px 10px 20px;">
            <p class="newnName">友情链接</p>
            <div class="clear"></div>
          </div>
          <p class="line"></p>
          <div>
          <div class="yqljimg" v-for="(item,index) in yqlj"><img :src="item.img"></div>
           <div class="clear"></div>
          </div>
  </div>
    </div>
  </div>
</template>
<script>
import Swiper from 'swiper';
export default {
  data() {
    return {
            autoplaySpeed: 5000,
      value2: 0,
      bannerList: [
                { img: 'http://www.qhfx.edu.cn/app/upload/image/indexphoto/2e7433ddbfb358c05d88f3ed983cd262.jpg', title: '清华附小2018-2019学年度第一学期开学典礼' },
                { img: 'http://www.qhfx.edu.cn/app/upload/image/indexphoto/e786890e2dfe9b03a719de3792500321.jpg', title: '难忘师恩，清华附小教师节献礼' },

        { img: 'http://www.qhfx.edu.cn/app/upload/image/indexphoto/022f4cc15b0c17f1a648c21790203e02.jpg', title: '清华附小2018-2019学年度第一学期开学典礼' },
        { img: 'http://www.qhfx.edu.cn/app/upload/image/indexphoto/97026657bb33f79dc7d68f6edf042bfb.jpg', title: '清华附小2018-2019学年度第一学期开学典礼' },
        { img: 'http://www.qhfx.edu.cn/app/upload/image/indexphoto/7d4466fd7dafad64de30ffb5523939ae.jpg', title: '清华附小2018-2019学年度第一学期开学典礼' },
      ],
        notices:[{title:'面向社会招聘教师',time:'2018-02-01'},{title:'征稿启事',time:'2018-02-01'}],
      news: [{ title: '烟台一中高一语文组举办2018年度硬笔书法比赛', time: '2018-08-01' },
      { title: '烟台一中高一语文组举办2018年度硬笔书法比赛', time: '2018-08-01' },
      { title: '烟台一中高一语文组举办2018年度硬笔书法比赛', time: '2018-08-01' },
      { title: '烟台一中高一语文组举办2018年度硬笔书法比赛', time: '2018-08-01' },
      { title: '烟台一中高一语文组举办2018年度硬笔书法比赛', time: '2018-08-01' },
      { title: '烟台一中高一语文组举办2018年度硬笔书法比赛', time: '2018-08-01' },
      { title: '烟台一中高一语文组举办2018年度硬笔书法比赛', time: '2018-08-01' }],
      Students: [{ name: '学生园地' }, { name: '教育科研' }, { name: '德育之窗' }],
      safes:[{name:'平安校园',title:'做做自己的首席安全官——平安校园行记全国第23个中小学生安全教育日主题宣传系列活动',img:'http://www.njjxjy.cn/uploadfile/404/20180621025756.jpg',des:'3月26日是第23个“全国中小学生安全教育日。为提高学生的安全意识，深入地推动学校的安全教育工作，促进学生平安健康成长，南京市景明佳园小学对全体学生进行了“安全教育日”主题的系列宣传和教育活动。  升旗仪式'},
      {name:'家校互动',title:'做做自己的首席安全官——平安校园行 记全国第23个中小学生安全教育日主题宣传系列活动',img:'http://www.njjxjy.cn/uploadfile/404/20180621025756.jpg',des:'3月26日是第23个“全国中小学生安全教育日。为提高学生的安全意识，深入地推动学校的安全教育工作，促进学生平安健康成长，南京市景明佳园小学对全体学生进行了“安全教育日”主题的系列宣传和教育活动。  升旗仪式'}],
           honorList: [
        { img:'http://px9z2.px9z.com/uploadfile/2016/0413/thumb_531_314_20160413040629911.jpg', name: '小学语文教学能手——何佩倩' },
        { img: 'http://px9z2.px9z.com/uploadfile/2016/0413/thumb_531_314_20160413043617597.jpg', name: '小学语文教学能手——何佩倩' },
        { img: 'http://px9z2.px9z.com/uploadfile/2016/0413/thumb_531_314_20160413043617597.jpg', name: '小学语文教学能手——何佩倩' },
        { img: 'http://px9z2.px9z.com/uploadfile/2016/0413/thumb_531_314_20160413043617597.jpg', name: '小学语文教学能手——何佩倩' },
              { img: 'http://px9z2.px9z.com/uploadfile/2016/0413/thumb_531_314_20160413043617597.jpg', name: '小学语文教学能手——何佩倩' }
      ],
      yqlj:[
        {img:require('@/assets/link2.jpg')},
           {img:require('@/assets/link2.jpg')},
              {img:require('@/assets/link2.jpg')},
                 {img:require('@/assets/link2.jpg')},
                    {img:require('@/assets/link2.jpg')},
                       {img:require('@/assets/link2.jpg')},
      ],
      
    };
  },
  methods: {
    more(title){
   this.$router.push({ name: "newsListpc",params: { header: title }})
},
detail(title){
     this.$router.push({ name: "newsDetailpc",params: { header: title }})
}
  },
  mounted: function () {
    // 首页轮播
    let bannerpcswiper = new Swiper('.bannerpc-container', {
      slidesPerView: "auto",
      loop: true,
      autoplay: 5000,
      autoplayDisableOnInteraction: false,
      direction: 'horizontal',
      pagination: '.swiper-pagination-white',
      observer: true,
      paginationClickable: true,
      nextButton: '.swiper-button-next',
      prevButton: '.swiper-button-prev',
      spaceBetween: 30,
      // effect: 'fade',
      onSlideChangeEnd: function (bannerpcswiper) {
        bannerpcswiper.update();
        bannerpcswiper.startAutoplay();
        bannerpcswiper.reLoop();
      }
    });
        // 通知公告的轮播
        let noticepcswiper = new Swiper('.noticepc-container', {
             loop: true,
      autoplay:5000,
      autoplayDisableOnInteraction : false,
      preventClicks : true,
       autoplayDisableOnInteraction : false,
        direction: 'vertical',
             observer:true,
               effect: 'fade',
     onSlideChangeEnd: function(noticepcswiper){ 
noticepcswiper.update();  
      noticepcswiper.startAutoplay();
　　   noticepcswiper.reLoop();  
}
    });
  }

};
</script>
<style>
/* .bannerpc-container img{
width:100%!important;
height:100%!important;
} */
.bannerpc-container  {
  top: -30px !important;
 height:450px!important;
}

  .honory:nth-child(2){
    margin:0 1.25%!important;
  }
  .honory:nth-child(4){
        margin:0 1.25%!important;
  }
  /* 通知公告的轮播 */
   .noticepc-container {
        width: 1200px!important;
        height: 30px!important;
    
        margin-top:20px;
    }
    .noticepc-container .swiper-slide {
        text-align: center;
        background: #fff;
        font-size:15px;
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
.row {
  margin-top: 20px;
}
.shadow {
  box-shadow: 0 1px 20px 0 rgba(0, 0, 0, 0.2);
  padding: 20px;
}
.swiper-container {
  width: 100%;
  height: 100%;
}

.swiper-slide {
  background-position: center;
  background-size: cover;
}
.mingyan {
  background-color: #e7e7e7;
  background-repeat: no-repeat;
  background-attachment: scroll;
  background-position: center center;

  padding-top: 50px;
  padding-bottom: 50px;
  margin-bottom: 0px;
  background-image: url(http://www.qhfx.edu.cn/app/upload/image/top_img/dianji03.png);
}
.swiperTitle {
  z-index: 2;
  font-size: 40px;
  right: 100px;
  bottom: 200px;
  transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, -0.00166, 0, 0, 0, 1);
  position: absolute;
  color: #fff;
  text-shadow: 0px 2px 5px rgba(0, 0, 0, 0.5);
  font-weight: 700;
}
.Container {
  max-width: 1200px;
  margin: 0 auto;
}
.newContainer {
  width: 750px;
  float: left;
}
.newImg {
  float: left;
}
.news {
  float: right;
}
.news li {
  height: 32px;
  line-height: 32px;
  font-size: 15px;
}
.newTime {
  margin-left: 20px;
  color: #bbb;
}
.newtitle {
  padding: 0 0 15px 0;
}
.newtitle p:first-child {
  float: left;
}
.newtitle p:nth-child(2) {
  float: right;
}
.newnName {
  font-size: 18px;
  font-weight: 700;
  color: #3e64c1;
}
.more {
  color: #2d8cf0;
  background: 0 0;
  text-decoration: none;
  outline: 0;
  cursor: pointer;
  transition: color 0.2s ease;
}
.partyContainer {
  float: right;
  margin-left: 20px;
  width: 430px;
  height: 270px;
}
/* 学生园地/教学科研/德育之窗  */
.students{
  width: 380px;
  float: left;
}
.education {
  margin: 0 30px;
}
.xsyd > div:nth-child(2) {
  margin: 0 30px;
}
/* 平安校园/家校互动 */
.safeCamp{
float:left;
width:585px;
}
.safeCamp:first-child{
margin-right:30px;
}
.safeCamp .newTime{
margin-left:120px;
}
.safeImg{
}
.safeImg img{
  border-radius:4px;
width:160px;
height:100px;
}
.safeImg{
  float:left;
}
.safeDes{
  width:350px;
 float:right;
}
.safeDes>p:first-child{
font-size:19px;
font-weight:bold;
margin-bottom:15px;
}
.safeDes>p:last-child{
  color:#bbb;
  font-size:15px;
}
.teachers{
margin-top:15px;
}
.line{
border-top:1px solid #bbb;
margin-bottom:15px;
}
  .honory {
    width: 19%;
    position: relative;
    margin-bottom: 10px;
    float:left;
  }

  .honorImg {
    height: 150px;
  }
  .honoryTitle {
  position: relative;
}
.honorName {
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
.yqljimg{
float:left;
width:15%;
margin-left:2%;
}
.yqljimg:first-child{
  margin-left:0;
}
.yqljimg img{
width:100%;
}
.demo-carousel {
  position: relative;
  cursor:pointer;
}
</style>

