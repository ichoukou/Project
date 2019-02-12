<template>
  <div class="indexBody">
    <div><img v-lazy="murl+'img_banner_lianxiwmen@3x.png'"></div>
    <div class="new_m" style="border-top:none">
      <p :class="{active:num == 1}" @click="getData(1)">联系我们</p>
      <p :class="{active:num == 2}" @click="getData(2)">加入我们</p>
    </div>
    <!-- 联系我们 -->
    <div class="content f9" v-if="num==1">
      <ul>
        <li>
          <img v-lazy="murl+'icon_news_wangzhi@3x.png'" class="phone" style="width:6%; margin-left: -1%" >
          <p>公司网址：www.chain-smart.com</p>
        </li>
        <li>
          <img v-lazy="murl+'icon_news_dianhua@3x.png'" class="phone" style="margin-top: 1%;" >
          <p>公司电话：</p>
          <p>021-6423858(上海)<br>0535-56931523(烟台）<br>024(22731055)(沈阳)</p>
        </li>
        <li>
          <img v-lazy="murl+'icon_news_dizhifuwudianhua@3x.png'" class="phone">
          <p>服务电话：400-017-8016</p>
        </li>
        <li>
          <img v-lazy="murl+'icon_news_dizhi@3x.png'" class="phone">
          <p>公司地址：上海市徐汇区百色路100号，28号楼</p>
        </li>
        <li>
          <img v-lazy="murl+'icon_news_jiaofu@3x.png'" class="phone" style="margin-top: 1%;" >
          <p>烟台交付中心：山东省烟台市开发区长江路161号，天马中心A-705室</p>
        </li>
        <li>
          <img v-lazy="murl+'icon_shenyang@3x.png'" class="phone" style="width:6%;margin-left: -1%">
          <p>沈阳办事处：沈阳市沈河区市府路290号摩根凯利大厦A座1209室</p>
        </li>
        <li>
          <img v-lazy="murl+'icon_news_youxiang@3x.png'" class="phone" style="margin-top: 1%;" >
          <p>电子邮箱：cj@chain-smart.com</p>
        </li>
      </ul>
   <div><img v-lazy="murl+'img_ditu1@3x.png'"></div>
    <div style="margin-top:10px"><img v-lazy="murl+'img_ditu2@3x.png'"></div>
     <div style="margin-top:10px;margin-bottom:15px"><img v-lazy="murl+'img_ditu3@3x.png'"></div>
    </div>
    <!-- 加入我们 -->
    <div class="aside1" v-if="num==2">
      <div class="wraper flex" style="padding-right:0;" v-for="(item,index) in recruitList"  @click="jrwm(item.rec_id)">
        <!-- <div style="width:90%"> -->
          <div style="width:100%">
          <p>{{item.rec_title}}</p>
          <div class="flex" style="align-items:center;">
            <p class="line" style="width:90%;"></p>
            <div class="jiantou"><img v-lazy="murl+'icon_jiantou_XINWEN@3x.png'"></div> 
          </div>
          <p>
            <span>{{item.rec_payment}}</span>
            <span>{{item.rec_education}}  | {{item.rec_working_life}}</span>
          </p>
        </div>
        <!-- <div class="jiantou"><img v-lazy="murl+'icon_jiantou_XINWEN@3x.png'"></div> -->
      </div>
          <p class="loadmore" @click="jzgd()" v-show="loadmore" >{{moredata}}</p>
    </div>

  </div>
</template>
<script>
import { getJrwm } from "@/api/api";
// import * as data from '@/components/data/data';
export default {
  data() {
    return {
       murl:"http://oss.chain-smart.com/assetM/",
      num: 1,
         recruitList: [],
          moredata:'点击加载更多',
          loadmore:false,
                     page: {
        total: 0,
        current: 1,
        pageSize: 5
      },
    };
  },
  methods: {
        jzgd(){
      this.page.pageSize= this.page.pageSize * 2;
this.getList()
    },
    getData(index) {
      this.num = index;
    },
    jrwm(id) {
      this.$router.push({ name: 'mjrwmDetail' , params: { id: id } });
    },
    getList() {
           let param = {
         pageNo:this.page.current,
        pageSize:this.page.pageSize,
       query:[{"query_condition":"=", "control_type":"selector","field_code":"state","value":"1"}]
       }
      getJrwm(param).then(res => {
        var code = res.status;
        if (code == 200) {
          this.recruitList = res.data.data.rows.dataList;
               if(this.recruitList.length>4){
             this.loadmore=true;
             }
             let records=res.data.data.rows.pagination.totalRecords;
            //  alert(records);
            //  alert(this.page.pageSize);
        if(records<this.page.pageSize){
           this.moredata="暂无更多招聘信息";
          }else{
            this.moredata="点击加载更多";
          }
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
    this.getList();
  }
};
</script>
<style scoped>
img {
  width: 100%;
  height: auto;
}
.content {
  margin: 0 1rem;
}
.content li {
  display: flex;
  align-items: flex-start;
  border-top: 1px solid #ccc;
  padding: 0.8rem 0;
}
.content li:first-child {
  border: none;
}
.phone {
  width: 5%;
  height: auto;
  margin-right: 0.8rem;
}
.content li p {
  /* margin-top: 0.2rem; */
  /* color: #232323; */
}
.line {
  border: 0.5px solid #ccc;
}
.wraper  > div > p:first-child {
  font-weight: bold;
  /* margin-bottom: 1rem; */
  font-size: 1rem;
}
/* .wraper > div > p:last-child {
  margin-top: 1rem;
} */
.wraper > div > p:last-child > span:first-child {
  color: #5dc0c1;
  font-size: 0.9rem;
}
.wraper > div > p:last-child > span:last-child {
  font-size: 0.8rem;
  color: #808080;
  margin-left: 0.1rem;
}
.jiantou {
  width: 8%;
  display: flex;
  justify-content: center;
  align-items: Center;
  /* border:1px solid #000; */
  /* margin-left: 0.5rem; */
}
.loadmore{
margin:20px 0;font-size:1rem;
}
</style>
