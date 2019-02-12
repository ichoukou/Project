<template>
  <!-- 新闻动态 -->
  <div class="all"><img style="width:100%;height:auto;" v-lazy="pcurl+'img_banner_xinwen.png'">
    <Row class="xwxq_area w">
      <Col >
      <Row>
        <Col span="17" class="xwxq_content">
        <p class="caxm" v-if="newDetail.news_title!=null">{{newDetail.news_title}}</p>
        <p class="sjly" v-if="newDetail.news_time!=null">{{newDetail.news_time}}&nbsp;&nbsp;&nbsp;&nbsp;来源：{{newDetail.copyfrom}}</p>
            <!-- <img :src="imgurl" class="gsjj_picture"> -->
        <div class="gsx" v-html="newDetail.news_content"></div>
        </Col>
        <Col span="6" offset="1" class="xwtj">
        <div class="xwtj_title">新闻推荐</div>
        <div class="xwtj_content" v-for="(item,index) in commandNews" @click="newsDetail(item.news_id)">
          <!-- <img :src="" class="gsjj_picture"> -->
               <img v-lazy="item.news_img_pc" class="gsjj_picture">
          <p>{{item.news_title}}</p>
        </div>
        <!-- <div class="xwtj_content">
          <img src="@/assets/img_xinwenxiangqing3.png" class="gsjj_picture">
          <p>策安与万华签订移动执法平台项目</p>
        </div>
        <div class="xwtj_content">
          <img src="@/assets/img_xinwenxiangqing4.png" class="gsjj_picture">
          <p>策安将为万华定制危废在线监管方案</p>
        </div> -->
        </Col>
      </Row>
      </Col>
    </Row>
  </div>
</template>
<script>
// import * as data from '@/components/data/data';
import { getNewsDetail,getImg } from "@/api/api";
import { getNews } from "@/api/api";
export default {
  data() {
    return {
      num: 1,
      newId:1,
      newDetail:{},
      contentDis:"inline",
       imgurl:'',
       commandNews:[],
           pcurl:'http://oss.chain-smart.com/assets/',
      //  cNews:[]
    }
  },
  methods: {
    getData(index) {
      this.num = index;
    },
        getList() {
      let param = {
        keyValue: this.newId,
        is_commend:this.is_commend
      };
      getNewsDetail(param).then(res => {
          var code = res.status;
          if (code == 200) {
            this.newDetail = res.data.data.data;
            // let imgobj=JSON.parse(res.data.data.data.news_img);
            // this.imgurl=getImg(imgobj[0].fileId);
          } else {
            this.$Message.error(res.data.error);
          }
        })
        .catch(error => {
          this.$Message.error(res.data.error);
        });

              getNews().then(res => {
          var code = res.status;
          if (code == 200) {
            let news = res.data.data.rows.dataList;
            this.commandNews=news.filter(function(x){
                return x.is_commend=='是';
            });
        //     this.commandNews = commandNew.map(item => {
        //     let obj = item;
        //     let imgId = JSON.parse(item.news_img_pc)[0].fileId;
        //     obj.imgCommandurl = `http://47.92.141.242:8888/website/file/getFileById/?contentDis=inline&fileId=${imgId}`;
        //     return obj;
        //  });
          } else {
            this.$Message.error(res.data.error);
          }
        })
        .catch(error => {
          this.$Message.error(res.data.error);
        });
  },
  // 查看新闻详情
  newsDetail(id){
      // this.$router.push({ name: "xwdtdetail",params:{id:id} });
      this.newId=id;
       this.getList();
      }
  },
  mounted(){
 this.newId=this.$route.params.id;
  this.getList();
  },
}
</script>
<style scoped>
.kjzc {
  margin-top: 10vh;
}
.kjzc .zc {
  cursor: pointer;
}
.kjzc .zc span {
  font-size: 16px;
  color: #555;
}
.kjzc .active span {
  color: #207fe8;
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
.xwxq_area {
  margin-top: 10vh;
  margin-bottom: 10vh;
}
.caxm {
  font-weight: 600;
  font-size: 32px;
}
.sjly {
  margin-top: 2vh;
  font-size: 14px;
  color: #808080;
}
.gsx {
  margin-top: 4vh;
  font-size: 14px;
  color: #808080;
  text-align: justify;
  line-height: 28px;
}
.xwtj {
  border-left: 1px solid #eee;
  padding: 0 3%;
}
.xwtj_title {
  font-size: 18px;
  line-height: 18px;
  font-weight: 600;
  text-indent: 0.5em;
  border-left: 4px solid #9b9b9b;
  margin-top: 1vh;
}
.xwtj_content {
  margin-top: 2vh;
  font-size: 16px;
  font-weight: 600;
  letter-spacing: 0.1px;
  text-align: justify;
  cursor: pointer;
}
</style>
