<template>
  <div>
    <!-- 头部 -->
    <div class="header">
      <div class="classes">
        <div >
                    <div>
              <span style="display:inline-block">名师辅导</span>
              <!-- <x-icon type="ios-arrow-down" size="25" style="position:absolute;top:10px;"></x-icon> -->
            </div>
          </div>
        <div style="text-align:center;" >高一</div>
        <div>
              <div  @click="search()">
              <span style="display:inline-block"> 搜索</span>
              <x-icon type="ios-search-strong" size="25" style="position:absolute;top:10px;"></x-icon>
            </div>
          </div>
      </div>
    </div>
<!-- content内容 -->
    <div>
      <!-- 菜单导航 -->
      <div class="menuContent" v-show="showMenu">
        <div class="closeHeader">
          <p class="close" @click="close()">×</p>
        </div>
        <ul class="menuUl">
          <li @click="shouye()">
            <p>小学</p>
            <div style="margin:15px 0">
              <div class="xiaoxue">
                <p>一年级</p>
                <p>二年级</p>
                <p>三年级</p>
              </div>
              <div class="xiaoxue" style="margin-top:10px;">
                <p>四年级</p>
                <p>五年级</p>
                <p style="border:none;color:#fff">六年级</p>
              </div>
            </div>
          </li>
          <li @click="gyca()">
            <p>初中</p>
            <div style="margin:15px 0">
              <div class="xiaoxue">
                <p>六年级</p>
                <p>七年级</p>
                <p>八年级</p>
              </div>

            </div>

          </li>
          <li @click="khal()">
            <p>高中</p>
            <div style="margin:15px 0">
              <div class="xiaoxue">
                <p>高一</p>
                <p>高二</p>
                <p>高三</p>
              </div>
            </div>
          </li>
        </ul>
      </div>
    </div>

    <!-- 学科 -->
    <div class="allject">
      <tab :line-width=2 active-color='#fc378c' v-model="index">
        <tab-item class="vux-center" :selected="demo2 === item" v-for="(item, index) in list2" @click="demo2 = item" :key="index">{{item}}</tab-item>
      </tab>
  
     

     <swiper >
        <swiper-item  :key="index">
              	   <card >

      <div slot="content" class="card-demo-flex card-demo-content01">

 
           <popover placement="bottom">
                   <div slot="content" class="popover-demo-content">
       <group >

           <radio title="type" v-model="coures" :options="['全部课程', '校本课']"></radio>
    </group>     
  </div>
         <div class="vux-1px-r">
            <span style="display:inline-block">全部课程</span>
            <x-icon type="ios-arrow-down" size="20" style="position:absolute;top:0px;"></x-icon>
        </div>
         </popover>

               <popover placement="bottom">
                   <div slot="content" class="popover-demo-content">
       <group >

           <radio title="type" v-model="type" :options="['全部知识', '基础知识与运用', '古诗文阅读', '现代文阅读', '写作']"></radio>
    </group>     
  </div>

        <div class="vux-1px-r">
          <span>全部知识</span>
             <x-icon type="ios-arrow-down" size="20" style="position:absolute;top:0px;"></x-icon>
          <br/>
        </div>
          </popover>


      <popover placement="bottom">
                   <div slot="content" class="popover-demo-content">
                        <group>
      <radio :selected-label-style="{color: 'green'}"  :options="radio002" v-model="radio002Value" @on-change="change"></radio>
    </group>
  </div>
        <div class="vux-1px-r">
          <span>全部老师</span>
             <x-icon type="ios-arrow-down" size="20" style="position:absolute;top:0px;"></x-icon>
        </div>
 </popover>



               <popover placement="bottom">
                   <div slot="content" class="popover-demo-content">
       <group >

           <radio title="type" v-model="sort" :options="['排序方式', '按时间排序', '按点赞率排序', '按点击率排序']"></radio>
    </group>     
  </div>

        <div class="vux-1px-r">
          <span>排序方式
          </span>
             <x-icon type="ios-arrow-down" size="20" style="position:absolute;top:0px;"></x-icon>
        </div>
 </popover>


      </div>
     </card>
<div class="weui-panel__bd" style="background:#fff;margin-bottom:55px;">
  <a href="#!/component/cell" @click="detail()" class="weui-media-box weui-media-box_appmsg"><div class="weui-media-box__hd"><img src="../../assets/order1.jpg" alt="" class="weui-media-box__thumb" style="width:100%"></div> <div class="weui-media-box__bd"><h4 class="weui-media-box__title">第20课《劝学》</h4><p class="weui-media-box__desc" style="margin-top:5px">主要讲解《劝学》，本文注重以对话表现人物，生动传神，富于情趣。仅寥寥数语，就是人感受到三位人物
</p>
<p style="fon-size:0.7rem;color:#999999">2019.03.15 08:00</p>
</div></a>
  <a href="#!/component/cell" class="weui-media-box weui-media-box_appmsg"><div class="weui-media-box__hd"><img src="../../assets/order2.jpg" alt="" class="weui-media-box__thumb"></div> <div class="weui-media-box__bd"><h4 class="weui-media-box__title">第18课古诗词鉴赏</h4> <p class="weui-media-box__desc" style="margin-top:5px">高中语文必背古诗词(人教版) - 高中语文必背篇目 必修一: 《沁园春 长沙 》 毛泽东 独立寒秋,湘江北去,橘子洲头。看万山红遍,层林尽染;漫江碧透,百舸。</p>
  <p style="fon-size:0.7rem;color:#999999">2019.03.12 08:00</p>
  </div></a> 
  <a href="#!/component/cell" class="weui-media-box weui-media-box_appmsg"><div class="weui-media-box__hd"><img src="../../assets/order3.jpg" alt="" class="weui-media-box__thumb"></div> <div class="weui-media-box__bd"><h4 class="weui-media-box__title">人教版第16课《林教头风雪神庙》</h4> <p class="weui-media-box__desc" style="margin-top:5px">讲的是四大名著《水浒传》中的第十个章回，八十万禁军教头林冲刺配后，几经周折后。</p>
  <p style="fon-size:0.7rem;color:#999999">2019.03.10 08:00</p>
  </div></a>
  <a href="#!/component/cell" class="weui-media-box weui-media-box_appmsg"><div class="weui-media-box__hd"><img src="../../assets/order4.jpg" alt="" class="weui-media-box__thumb"></div> <div class="weui-media-box__bd"><h4 class="weui-media-box__title">第10课《装在套子里的人》</h4> <p class="weui-media-box__desc" style="margin-top:5px">
作者是俄国作家安东、巴浦契科夫创作的短篇小说，塑造了一个胆小怕事，性格孤僻，恐惧变革，想做一个纯粹的守法良民。
  </p>
  <p style="fon-size:0.7rem;color:#999999">2019.03.08 08:00</p>
  </div></a> 
  <a href="#!/component/cell" class="weui-media-box weui-media-box_appmsg"><div class="weui-media-box__hd"><img src="../../assets/order5.jpg" alt="" class="weui-media-box__thumb" style="width:100%"></div> <div class="weui-media-box__bd"><h4 class="weui-media-box__title" >第7课《项脊轩志》</h4> <p class="weui-media-box__desc" style="margin-top:5px">
《项脊轩志》是明代文学家归有光所作的一篇回忆性记事散文。全文以作者青年时代朝夕所居的书斋项脊轩为经，以归家几代人的人事变迁为纬，真切再现了祖母、母亲、妻子的音容笑貌，也表达了作者对于三位已故亲人的深沉怀念。
</p>
<p style="fon-size:0.7rem;color:#999999">2019.02.12 08:00</p>
</div></a>
</div>


 <panel :footer="footer" :list="list5" :type="type" @on-img-error="onImgError" ></panel>
        </swiper-item>
      </swiper>

  
    </div>
    <!-- 轮播 -->
    <!-- <swiper loop auto :list="demo06_list"  @on-index-change="demo06_onIndexChange" dots-position="center"></swiper>
    <! 课程推荐 -->
    <!-- <div class="kctjContent" > -->
      <!-- <p style="padding:12px 0;" @click="my()">
        <span style="font-weight:600;font-size:1rem">课程推荐</span>
      </p>
      <p class="line"></p>
      <ul class="kctj">
        <li>
          <p><img src="../../assets/wx.png" style="width:100%;" /></p>
          <p>Vue2.5开发去哪儿网App 从零基础入门到实战项目</p>
        </li>
        <li>
          <p><img src="../../assets/wx.png" style="width:100%;" /></p>
          <p>Vue2.5开发去哪儿网App 从零基础入门到实战项目</p>
        </li>
        <li>
          <p><img src="../../assets/wx.png" style="width:100%;" /></p>
          <p>Vue2.5开发去哪儿网App 从零基础入门到实战项目</p>
        </li>
        <li>
          <p><img src="../../assets/wx.png" style="width:100%;" /></p>
          <p>Vue2.5开发去哪儿网App 从零基础入门到实战项目</p>
        </li>
        <li>
          <p><img src="../../assets/wx.png" style="width:100%;" /></p>
          <p>Vue2.5开发去哪儿网App 从零基础入门到实战项目</p>
        </li>
      </ul>
    </div>
    <p style="width:100%;height:90px;color:#ccc;text-align:center;top:20px"><span>加载更多</span></p> --> 


  </div>

</template>

<script>
import Vue from 'vue'
import { Tab, TabItem, Group, Cell, Grid, GridItem, Badge, Popover, XDialog, Swiper, SwiperItem,Search, Card,Radio,Panel} from 'vux'
const list = () => [ '语文', '英语', '数学', '物理', '化学', '政治', '地理', '历史'];
const baseList = [{
  url: 'javascript:',
  img: 'https://ww1.sinaimg.cn/large/663d3650gy1fq66vvsr72j20p00gogo2.jpg',
  title: '送你一朵fua'
}, {
  url: 'javascript:',
  img: 'https://ww1.sinaimg.cn/large/663d3650gy1fq66vw1k2wj20p00goq7n.jpg',
  title: '送你一辆车'
}, {
  url: 'javascript:',
  img: 'https://static.vux.li/demo/5.jpg', // 404
  title: '送你一次旅行',
  fallbackImg: 'https://ww1.sinaimg.cn/large/663d3650gy1fq66vw50iwj20ff0aaaci.jpg'
}]
const urlList = baseList.map((item, index) => ({
  url: 'http://m.baidu.com',
  img: item.img,
  fallbackImg: item.fallbackImg,
  title: `(可点击)${item.title}`
}))
export default {
  components: {
    Tab, TabItem,
    Group,
    Cell,
    Grid,
    GridItem,
    Badge, Popover,
    XDialog,
    Swiper,
    SwiperItem,Search, Card,Radio,Panel
  },
  data() {
    return {
      coures:"全部课程",
      type:'1',
      sort:"排序方式",
         list5: [{
        src: '../../assets/lbxx.jpg',
        title: '标题一',
        desc: '由各种物质组成的巨型球状天体，叫做星球。星球有一定的形状，有自己的运行轨道。',
        url: '/component/cell'
      }, {
        src: '../../assets/lbxx.jpg',
        title: '标题一',
        desc: '由各种物质组成的巨型球状天体，叫做星球。星球有一定的形状，有自己的运行轨道。',
        url: '/component/cell'
      }],
 
          radio001: [ '全部知识','基础知识与运用', '古诗文阅读','现代文阅读','写作' ],
               type: '全部知识',
                  radio002: [ '全部老师','任振勇', '张杰','谢娜','李老师' ],
               radio002Value: '全部老师',
                   
     results: [],
      value: '',
      showMenu: false,
      list2: list(),
      demo2: '直播预告',
      index: 0,
      demo06_list: urlList,
 
    }
  },
  methods: {
    detail(){
    },
        onImgError (item, $event) {
      console.log(item, $event)
    },
    menu() {
      this.showMenu = true;
      document.getElementById("meunhua").style.zIndex = 0;
    },
    close() {
      this.showMenu = false;
      document.getElementById("meunhua").style.zIndex = 1000;
    },
    demo06_onIndexChange(index) {
      this.demo06_index = index
    },
    search(){
         this.$router.push({name:"search"});
    },

    my(){
      this.$router.push({name:"my_course"});
    },
    subjext(index){
      alert(index);
    },
        onShow () {
      console.log('on show')
    },
    onHide () {
      console.log('on hide')
    },
       change (value, label) {
      console.log('change:', value, label)
    }
  },
  mounted: function () {

  },
}
</script>
<style>
.scrollable .vux-tab-item{
 flex: 0 0 17%!important;
}
.vux-slider > .vux-indicator > a > .vux-icon-dot.active, .vux-slider .vux-indicator-right > a > .vux-icon-dot.active{
      background-color: #fff!important;
}
.weui-media-box_appmsg .weui-media-box__hd{
  width:150px!important;
  height:80px!important;
}
 .allject .vux-swiper{
  height:600px!important;
}
.vux-no-group-title{
  margin-top:0!important;
  border-top:1px solid green;
}
 .vux-popover-arrow-up{
    border-bottom: 5px solid green!important;
}
.weui-check__label{
  color:#000!important;
  font-size:0.8rem!important;
}
.vux-popover{
  left:0px!important;
  width:100%!important;
}
.vux-1px-r .vux-x-icon{
  fill:#999999!important;
}

</style>
<style scoped lang="less">
@import '~vux/src/styles/1px.less';
.header {
  height: 44px;
  background: green;
  line-height: 44px;
}
.vux-x-icon {
  fill: #fff;
}
.cell-x-icon {
  display: block;
  fill: green;
}
.icondown {
  text-align: center;
}
.classes {
  display: flex;
  line-height: 44px;
  height: 44px;
  color: #fff;
}
.classes > div {
  flex-grow: 1;
  text-align: Center;
}
.menuContent {
  background: #fff;
  position: absolute;
  z-index: 10000;
  width: 100%;
  height: 100%;
  left: 0;
  top: 0;
  overflow: auto;
  position: fixed;
}
.menuUl {
  padding: 3%;
}
.close {
  color: #fff;
  font-size: 30px;
  position: absolute;
  left: 15px;
}
.closeHeader {
  height: 44px;
  line-height: 44px;
  background: green;
}
.xiaoxue {
  display: flex;
  justify-content: space-around;
  flex-wrap: wrap;
}
.xiaoxue p {
  border: 1px solid #ddd;
  padding: 7px 20px;
}
.kctj > li {
  display: flex;
}
.kctj > li > p:first-child {
  margin-top: 15px;
  width: 35%;
}
.kctj > li > p:first-child img{
  border-radius:4px;
}
.kctj > li > p:last-child {
  width: 60%;
  margin-left: 5%;
  margin-top: 10px;
}
.kctjContent {
  margin-top: 10px;
  background: #fff;
  padding: 0 3%;
}
.line {
  border: 0.5px solid #ddd;
}
/* 切换card */
.card-demo-flex {
  display: flex;
}
.card-demo-content01 {
  padding: 10px 0;
}
.card-demo-flex > div {
  flex: 1;
  text-align: center;
  font-size: 12px;
}

</style>
