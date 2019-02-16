<template>
  <div>

<section  style="background-image: url(http://www.qhfx.edu.cn/app/static/images/xy_img/dingbu21.jpg);padding:10px 0;" class="dingbu">
    <div  class="dbContainer">
      <div class="dbfont">{{header}}</div>
    </div>
</section>

<div style="max-width:1200px;margin:0 auto;">
    <ul class="news">
      <div v-for="(item,index) in newlist" @click="detail()">
      <li style="font-size:16px">
      
        <div style="width:30%;max-width:150px;float:left"><img :src="item.img"></div>
        <div style="width:60%;float:left;">
          <p class="newtitle" >{{item.title}}</p>
        <p style="margin-top:15px;color:#bbb;">{{item.time}}</p></div>
        <div style="clear:both"></div>
      </li>
       <div class="clear"></div>
      </div>
    </ul>
    </div>

        <div style="margin:0 auto;text-align:center" v-show="pageContainer"><Page :total="100" /></div>

  </div>
</template>
<script>
import Vue from 'vue'
import VueScroller from "vue-scroller";
Vue.use(VueScroller);
import { Grid, GridItem, GroupTitle,Tabbar, TabbarItem, Group, Cell,Panel,  Radio} from 'vux'
export default {
    props:['header'],
    components: {
 Grid, GridItem, GroupTitle,Tabbar, TabbarItem, Group, Cell,Panel, Radio, VueScroller,
  },
  data() {
    return {
      pageContainer:true,
       type: '5',
      newlist: [{
        img: require('@/assets/new1.jpg'),
       title: '一个好家长就是一个好榜样，一个好家庭就是一种好教育。',
        time: '2018.10.13',
        url:'newsDetail',
      }, {
        img: require('@/assets/new1.jpg'),
        title: '一个好家长就是一个好榜样，一个好家庭就是一种好教育。',
        time: '2018.10.13',
        url:'newsDetail',
      }],
     footer: {
        title: this.$t('more'),
        url: 'http://vux.li'
      }

    };
  },
  methods: {
    detail(){
if ((navigator.userAgent.match(/(phone|pad|pod|iPhone|iPod|ios|iPad|Android|Mobile|BlackBerry|IEMobile|MQQBrowser|JUC|Fennec|wOSBrowser|BrowserNG|WebOS|Symbian|Windows Phone|iPad)/i))) {
this.$router.push({name:'detail',params:{header:this.header}})
}else{
this.$router.push({name:'newsDetailpc',params:{header:this.header}})
      }
    },
// // 下拉刷新
//     refresh(done) {
//       this.list = [];
//       this.page = 1;
//       this.params.page = this.page;
//       this.params.rows = 10;
//     axios.get("/static/ceshi.json").then(function(res) {
//           var code = res.data.code;
//           this.list = res.data.info;        
      
//       });
//     },
//     // 上拉加载
//     infinite(done) {
//         console.log("infinite"+this.page);
//       this.page = this.page + 1;
//       this.params.page = this.page;
//       this.params.rows = 10;
//     axios.get("/static/ceshi.json").then(function(res) {
//       console.log(res.data.data.parts.PartsUpper);
//             // var code = res.data.code;
//             // this.$vux.loading.hide();
//             // this.list = this.list.concat(res.data.info);
//             // if(res.data.info.length<10){//小于10条的时候认为没有下一页，结束
//             //     done(true);
//             // }else{
//             // done(false);
//             // }                
//         } 
//         }); 
//     }

  },
  mounted: function() {
   
if ((navigator.userAgent.match(/(phone|pad|pod|iPhone|iPod|ios|iPad|Android|Mobile|BlackBerry|IEMobile|MQQBrowser|JUC|Fennec|wOSBrowser|BrowserNG|WebOS|Symbian|Windows Phone|iPad)/i))) {
 this.header=this.$route.params.header;
this.pageContainer=false;
}
// let id=this.$route.params.id;
// let titles=[{id:1,title:'校园新闻'},{id:2,title:'校园新闻'},{id:3,title:'党建之窗'},{id:4,title:'教师发展'},{id:5,title:'学生园地'},{id:6,title:'教育科研'},{id:7,title:'德育之窗'},{id:8,title:'平安校园'},{id:9,title:'家校互动'}];
// let newarray=titles.filter(item=>item.id==id);
// this.newheader=newarray[0].title;
  }

};
</script>
<style>


</style>
<style scoped>

@media screen and (min-width: 768px) and (max-width: 991px) {
.newtitle{
  font-size:16px;
}
}
@media screen and (min-width: 992px) {
.newtitle{
  font-size:16px;
  margin-top:25px;
}
}
.news{
  max-width:1200px
}
.news li{
  border-top:1px solid #bbb;
  list-style:none;
}
.news li>div{
  float:left;
margin-left:3%;
padding:10px 0;
  }
  .entry-content::after {
    content: ".";
    display: block;
    height: 0px;
    clear: both;
    visibility: hidden;
    overflow: hidden;
}
.newtitle{
    font-size: 14px;
    line-height: 1.2;
    overflow: hidden;
    text-overflow: ellipsis;
    display: -webkit-box;
    -webkit-box-orient: vertical;
    -webkit-line-clamp: 2;
}
</style>
