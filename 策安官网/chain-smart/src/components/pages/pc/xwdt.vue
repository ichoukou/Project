<template>
  <div class="all"><img style="width:100%;height:auto;" v-lazy="pcurl+'img_banner_xinwen.png'">
    <!-- 新闻动态 -->
    <div class="kjzc w">
      <Row>
        <!-- <Col span="16" offset="4" style="padding:0 2%;"> -->
        <Col>
          <Row class="cpfw_yt">
            <Col span="10" class="zc_1 zc" :class="{active:num == 1}">
              <div>
                <span @click="getData(1)">企业新闻</span>
              </div>
            </Col>
            <Col span="10" offset="4" class="zc_2 zc" :class="{active:num == 2}">
              <div>
                <span @click="getData(2)">行业新闻</span>
              </div>
            </Col>
          </Row>
        </Col>
      </Row>
      <!-- 第一行 -->
      <Row class="caww" >
        <Col>
        <div  class="xw_outer"  v-for="(item,index) in news" @click="xwxq(item.news_id)"  @mouseenter="mouseEnter(index)"
           @mouseleave="mouseLeave()" :class="{newactive:index==isActive}" >
          <Row type="flex" align="middle" class="xw_area"  >
            <Col span="2">
            <div class="xw_rili" >
              <div class="xw_date" v-if="item.news_time!=null">
                <p style="font-size:28px">{{item.news_time.slice(8,10)}}</p>
                <p style="font-size:14px">{{item.news_time.slice(0,4)}}/{{item.news_time.slice(5,7)}}</p>
              </div>
            </div>
            </Col>
            <Col span="22">
            <div class="xwdt">
              <p class="fromto2">{{item.news_title}}</p>
              <p v-if="item.description.length>130">{{item.description.slice(0,130)}}...</p>
              <p v-else>{{item.description}}</p>
            </div>
            </Col>
          </Row>
        </div>
        </Col>
      </Row>

<div class="fenye"> <Page @on-change="pageChange" :total="page.total" :current="page.current" :page-size="page.pageSize" show-total></Page></div>
    </div>
  </div>
</template>
<script>
// import * as data from '@/components/data/data';
import { getNews } from "@/api/api";
export default {
  data() {
    return {
       page: {
        total: 0,
        current: 1,
        pageSize: 5
      },
      isActive:false,
      num: 1,
      news:[],
          pcurl:'http://oss.chain-smart.com/assets/',
isindustry:'COMPANY'
    }
  },
  methods: {
       pageChange(page){
      this.page.current=page;
      this.getList();
    window.scrollTo(0, 0);
    },
        getData(index) {
      this.num = index;
      if(index==1){
        this.isindustry='COMPANY';
      }else{
        this.isindustry='INDUSTRY';
      }
       this.page.current=1;
      this.getList();
    },
      //   鼠标移入
     mouseEnter(index){
       this.isActive = index;
      },
mouseLeave(){
   this.isActive=null;
},
    xwxq(id) {
        this.$router.push({ name: "xwdtdetail",params:{id:id} });
    },
    getList(){
           let param = {
        sort: 'news_time',
        sortType:"desc",
        pageNo:this.page.current,
        pageSize:this.page.pageSize,
query:[{"query_condition":"=", "control_type":"selector","field_code":"state","value":"1"},{"query_condition":"=", "control_type":"selector","field_code":"category_id","value":this.isindustry}]
      };
      getNews(param).then(res => {
          var code = res.status;
          if (code == 200) {
            // this.news = res.data.data.rows.dataList;
            this.news=res.data.data.rows.dataList;
            this.page.total=res.data.data.rows.pagination.totalRecords;
            //  this.news= datalist.filter(function (x) {
            //        return x.category_id== '公司新闻';
            //   });
            //   this.companyNews=datalist.filter(function (x) {
            //        return x.category_id== '行业新闻';
            //   });
          } else {
            this.$Message.error(res.data.error);
          }
        })
        .catch(error => {
          this.$Message.error(res.data.error);
        });
    }

  },
 mounted(){
        this.getList();
  }
}

</script>
<style>
.ivu-page-item-active{
      border-color: #5dc0c1;
  background-color: #5dc0c1!important;
}
.ivu-page-item:hover {
    border-color: #5dc0c1;
}
</style>

<style scoped>

.kjzc {
  margin-top: 10vh;
  margin-bottom: 10vh;
}
.cpfw_yt {
  border-bottom: 1px solid #eee;
  font-size: 18px;
  font-weight: 600;
  /* margin-bottom:20px; */
}
.kjzc .zc_1 {
  text-align: right;
}
.kjzc .zc span {
  display: inline-block;
  color: #ccc;
  cursor: pointer;
  height: 8vh;
  line-height: 8vh;
}
.kjzc .active span {
  color: #5dc0c1;
  border-bottom: 3px solid #5dc0c1;
}
.cpfw_picture {
  text-align: center;
}
.cpfw_content {
  margin-top: 10vh;
}
.cpfw_title {
  text-align: center;
}
.cpfw_title1 {
  font-weight: 600;
  font-size: 17px;
}
.gsjj_picture {
  width: auto;
  height: auto;
  max-width: 100%;
  max-height: 100%;
}
.ryzz_wz1 {
  font-size: 17px;
  font-weight: bold;
}
.xwdt {
  margin-left: 2vh;
}
.fromto {
  /* font-family: PingFangSC-Medium; */
  font-size: 16px;
  color: #232323;
  margin-bottom: 0.5vh;
}
.xw_outer {
  padding: 0 2% !important;
  cursor: pointer;
  /* border-bottom: 1px solid #f0f0f0; */
}
.xw_area {
  border-bottom: 1px solid #f0f0f0;
  padding: 12px 0;
  cursor:pointer;
}
/*因边框原来的颜色设置的和鼠标经过时的背景颜色一致，因此鼠标经过时只需改背景无需改边框*/
/* .newactive{
    background-color: #f0f0f0!important;
} */
.xw_outer:hover {
  background-color: #f0f0f0;
}
.newactive .xw_rili{
  opacity: 1!important;
}
.xw_rili {
  width: 100px;
  height: 84px;
  padding: 1vh 0;
  background: #5dc0c1;
  opacity: 0.5;
}
.xw_date {
  color: #fff;
  width: 100%;
  text-align: center;
}
.fromto2 {
  font-size: 16px;
  font-weight: 600;
  margin: 1vh 0;
}
.fromto2 + p {
  color: #808080;
  font-size: 14px;
  line-height: 24px;
}
.fenye{
  margin:0 auto;
  text-align:center;
  margin-top:20px;
  font-size:14px;
}
</style>
