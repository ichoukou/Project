<template>
  <div style="padding-bottom:40px;" class="indexPad">
    <div><img v-lazy="padurl+'img_banner_lianxiwomen@2x.png'"></div>
    <div class="new_pad" style="border-top:none">
      <p :class="{active:num == 1}" @click="getData(1)">联系我们</p>
      <p :class="{active:num == 2}" @click="getData(2)">加入我们</p>
    </div>
    <!-- 联系我们列表 -->
    <div class="pad_pad flex justbetween" v-if="num==1" style="align-items: center">
      <ul class="pad_lxwm">
        <li>
          <img v-lazy="padurl+'icon_news_wangzhi@2x.png'" >
          <p>公司网址：www.chain-smart.com</p>
        </li>
        <li>
          <img v-lazy="padurl+'icon_news_dianhua@2x.png'">
          <p>公司电话：</p>
          <p>021-6423858(上海)<br>0535-56931523(烟台）<br>024(22731055)(沈阳)</p>
        </li>
        <li>
          <img v-lazy="padurl+'icon_news_dizhifuwudianhua@2x.png'">
          <p>服务电话：400-017-8016</p>
        </li>
        <li>
          <img v-lazy="padurl+'icon_news_dizhi@2x.png'">
          <p>公司地址：上海市徐汇区白色路100号，28号楼</p>
        </li>
        <li>
          <img v-lazy="padurl+'icon_news_jiaofu@2x.png'">
          <p>烟台交付中心：山东省烟台市开发区长江路161号，天马中心A-705室</p>
        </li>
        <li>
          <img v-lazy="padurl+'icon_shenyang@2x.png'">
          <p>沈阳办事处：沈阳市沈河区市府路290号摩根凯利大厦A座1209室</p>
        </li>
        <li>
          <img v-lazy="padurl+'icon_news_youxiang@2x.png'" >
          <p>电子邮箱：cj@chain-smart.com</p>
        </li>
      </ul>
      <div class="pad_ditu">
         <img v-lazy="padurl+'img_ditu1@2x.png'">
        <img v-lazy="padurl+'img_ditu2@2x.png'">
        <img v-lazy="padurl+'img_ditu3@2x.png'">
      </div>
    </div>
   
  <!-- 加入我们列表 -->
<div class="padlianxi justbetween" v-if="num==2"> 
   <ul class="pad_jrwm" >
     <li v-for="(item,index) in recruitList"  @click="ckxq(item.rec_id)" >
      <div class="flex alignCenter">
        <p class="bold" style="width:220px">{{item.rec_title}}</p>
        <p class="f8 xueli">{{item.rec_education}}  | {{item.rec_working_life}}</p>
      </div>
      <div class="flex alignCenter" style="width:25%">
        <p class="bold" style="color: #5DC0C1;width:70% " >{{item.rec_payment}}</p>   
        <div class="jiantou"><img v-lazy="padurl+'icon_jiantou_XINWEN.png'" ></div>
      </div> 
     </li>
   </ul>
       <p class="loadmore" @click="jzgd()" v-show="loadmore">{{moredata}}</p>
   </div>

    </div>
</template>
<script>
import { getJrwm } from "@/api/api";
export default {
  data() {
    return {
         padurl:"http://oss.chain-smart.com/assetPad/",
      num: 1,
    recruitList: [],
            moredata:'点击加载更多',
          loadmore:false,
                     page: {
        total: 0,
        current: 1,
        pageSize: 5
      },
    }
  },
  methods: {
            jzgd(){
      this.page.pageSize= this.page.pageSize * 2;
this.getList()
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
        if(records<=this.page.pageSize){
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
    getData(index) {
      this.num = index;
    },
    ckxq(id) {
      this.$router.push({ name: "padjrwmDetail", params: { id: id } });
    }

  },
  mounted: function () {
       this.getList();
  }
}

</script>
<style scoped>
img {
  width: 100%;
  height: auto;
}
.pad_lxwm{
  width:48%;
}
.pad_lxwm>li{
  display:flex;
  align-items: flex-start;
  padding: 0.8rem 0;
  color:#232323;
  border-bottom:1px solid #eee;
}
.pad_lxwm>li>img{
  width: 6%;
  height: auto;
  margin-right:5px;
}
.pad_lxwm>li>p{
/* margin-top:0.4rem; */
}
.pad_ditu{
  width:50%;
}
/* 加入我们 */
.pad_jrwm>li{
 display:flex;
 justify-content: space-between;
 align-items: center;
 border-bottom:1px solid #ccc;
 line-height:80px; 
}
.alignCenter{
  align-items: center;
}
.xueli{
 margin-left:15px;
}
.jiantou{
  margin-left:20px;
  height: 22px;
  line-height: 22px;
  margin-top:-2px;
}
.padlianxi{
padding:0 3%;
}
.loadmore{
margin:20px 0;font-size:1rem;
}
</style>
