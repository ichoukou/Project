<template>
  <div class="indexBody">
    <div class="swiper-container shouyecontainer">
      <div class="swiper-wrapper shouye">
        <div class="swiper-slide" v-for="(item,index) in lunbos" @click="pictureDetail(item.banner_img_mobile)" v-if="index<=4&&item.state=='启用'">
          <img :src="item.banner_img_mobile">
          </div>
      </div>
      <div class="swiper-pagination"></div>
    </div>
    <!-- 产品及服务范围 -->
    <div class="cpfw pad">
      <p class="cpTitle">产品及服务范围</p>
      <p class="cpContent colorCon linehei f9">作为数字化HSE产品/服务提供商，我们致力于提供全方位的HSE管理提升及信息化（含物联网）建设服务。</p>
      <div>
        <div class="hsesz_m"><img v-lazy="murl+'icon_hseshuzi@3x.png'"></div>
        <div class="hsesz_m"><img v-lazy="murl+'icon_hseguanli@3x.png'"></div>
      </div>
      <div>
        <p>HSE数字产品</p>
        <p>HSE管理咨询</p>
      </div>
    </div>
    <!-- 典型产品及服务 -->
    <div class="pad_nobottom">
      <div class="dxcpfw flex">
        <p class="cpTitle">典型产品及服务</p>
        <p class="more_m flex" @click="productMore()">More&nbsp;&nbsp;&nbsp;<span>></span></p>
      </div>
      <p class="cpContent colorCon linehei f9">作为数字化HSE产品/服务提供商，我们致力于提供全方位的HSE管理提升及信息化（含物联网）建设服务。</p>
    </div>
    <div class="wrap">
      <div class="wraper" @click="cpfw(2)">
        <div class="peixun_m"><img v-lazy="murl+'img_peixun@3x.png'"></div>
        <p class="cppx">培训与咨询</p>
        <p class="cpContent justify colorCon linehei f9">我们采用先进的多标兼容全量化风险评估模型以及基于岗位风险分析结果定制的培训产品为行业客户提供从诊断、咨询、培训到符合性辅导及鉴证的全面专家服务，为企业提升HSE绩效提供基于行业实践的快速通道和高效方法。</p>
      </div>
      <div class="wraper" @click="cpfw(3)">
        <div class="peixun_m"><img v-lazy="murl+'img_shuzi@3x.png'"></div>
        <p class="cppx">数字化方案</p>
        <p class="cpContent justify colorCon linehei f9">安全环保与高效生产协调统一的卓越化运营一直是各行业客户尤其是高危行业客户的关注重点。您将了解我们如何利用HSE协同平台、可视化技术、商业智能、专业算法工具、专业数据库以及物联网等技术手段来帮助客户达成这一目标。</p>
      </div>
      <div class="wraper" @click="cpfw(4)">
        <div class="peixun_m"><img v-lazy="murl+'img_zhuanyeruanjian@3x.png'"></div>
        <p class="cppx">专业软件与行业数据库</p>
        <p class="cpContent justify colorCon linehei f9">通过跨平台协作、联合工业项目以及认证合作伙伴关系，我们联合DNV GL、ChemWatch等著名HSE咨询厂商为您的企业提供更专业的风险算法软件和风险数据库工具，这将成为您HSE数字化产品应用架构中强有力的业务驱动引擎。</p>
      </div>
    </div>

      <!-- 客户案例 -->
      <div class="ptop1"></div>
      <!-- <div class="wraper"> -->
      <div class="pad_nobottom" >
        <div class="dxcpfw flex">
          <p class="cpTitle">客户案例</p>
          <p class="more_m flex" @click="khalMore()">More&nbsp;&nbsp;&nbsp;<span>></span></p>
        </div>
        <p class="cpContent2 justify colorCon linehei f9">作为数字化HSE产品/服务提供商，我们致力于提供全方位的HSE管理提升及信息化（含物联网）建设服务。</p>
      </div>  

      <!-- 轮播 -->
      <div class="swiper-container khcontainer" >
        <div class="swiper-wrapper khslide" >
          <div class="swiper-slide"  v-for="(item,index) in cases" v-if="item.state=='启用'" @click="khaldetail(item.case_id)">
            <img :src="item.case_img_mobile">
                     <div class="bold f10 ptop ">{{item.case_title}}</div>
               <div class="f8 ptop2_m colorCon" >{{item.case_synopsis.slice(0,15)}}...</div>
          </div>
          </div>
          <div class="swiper-pagination"></div>
      </div>
    <!-- 新闻动态 -->
    <div class="ptop1"></div>
      <!-- <div class="pad"> -->
      <div class="pad_nobottom">
        <p class="cpTitle">新闻动态</p>
        <p class="cpContent colorCon linehei f9">作为数字化HSE产品/服务提供商，我们致力于提供全方位的HSE管理提升及信息。</p>
      </div>
    <div class="new_m">
      <p :class="{active:num == 1}" @click="getData(1)">企业新闻</p>
      <p :class="{active:num == 2}" @click="getData(2)">行业新闻</p>
    </div>  
<!-- 新闻 -->
    <div class="pad" style="padding-top:0;">
      <div class="xwContent flex" v-for="(item,index) in news"   @click="xwxq(item.news_id)">
        <div>
          <div class="xwDate" v-if="item.news_time!=null">
            <p>{{item.news_time.slice(8,10)}}</p>
            <p>{{item.news_time.slice(0,4)}}/{{item.news_time.slice(5,7)}}</p>
          </div>
        </div>
        <div>
          <p class="xwContent_title bold f10 ">{{item.news_title}}</p>
           <p class="martop_m colorCon" v-if="item.description.length>34">{{item.description.slice(0,34)}}...</p>
          <p class="martop_m colorCon" v-else>{{item.description}}</p>
        </div>
      </div>

    </div>
    <p class="loadmore" @click="loadmore()">{{moredata}}</p>
    <!-- 在线留言 -->
   <div class="zxly" @click="showForm()">
      <div class="zxly1">
        <div><img v-lazy="murl+'icon_liuyan@3x.png'"></div>
        <p>在线留言</p>
      </div>
    </div> 

    <Modal class="zxlyForm"  v-model="zxly">
      <div class="formTitle">
        <p class="f12 bold">在线留言</p>
        <p>请留下您的真实信息，让我们能够及时联系您</p>
      </div>
      <div class="formCell" >
        <Form :model="formItem">
          <input type="text" v-model="formItem.lw_company" placeholder="公司名称">
           <input type="text" v-model="formItem.lw_name" placeholder="姓名"  >
          <!-- <input type="text" placeholder="负责人"> -->
          <input type="text" v-model="formItem.lw_phone" placeholder="电话">
          <input type="text" v-model="formItem.lw_email" placeholder="邮箱">
          <textarea type="textarea" v-model="formItem.lw_remark" placeholder="备注" rows="5"></textarea>
          <p >
            <i>*</i>&nbsp;&nbsp;注：您的个人信息我们会进行加密处理，请放心</p>
        </Form>
      </div>
       <div slot="footer">
            <Button style="background: #5dc0c1;color:#fff;border-radius:20px;" size="large" long  @click="handleSubmit('formItem')">确认提交</Button>
        </div>
</Modal>

  </div>
</template>
<script>
import Swiper from 'swiper';
import { savePoliceInfo,getNews,getKhal,getLunbo} from "@/api/api";
export default {
  data() {
    return {
      murl:"http://oss.chain-smart.com/assetM/",
             page: {
        total: 0,
        current: 1,
        pageSize: 5
      },
   isindustry:'COMPANY',
   moredata:'点击加载更多',
      value1: 0,
      num: 1,
      zxly: false,
      cases:[],
      news:[],
           lunbos:[],
           cases_num: 3,
    formItem: {
        lw_company: '',
        lw_name: '',
        lw_phone: '',
        lw_email: '',
        lw_remark: '',
      },
    };
  },
  methods: {
    loadmore(){
this.page.pageSize= this.page.pageSize * 2;
this.getList();
    },
        handleSubmit(name) {
      savePoliceInfo(this.formItem).then((res) => {
        var code = res.status;
        if (code == 200) {
          alert("您的信息已提交成功！");
          this.zxly=false;
           this.formItem={};
        }
      }).catch((error) => {
        console.log(error);
      });
    },
    pictureDetail(imgid){
      let id=imgid[imgid.length-5];
      if(id==1){
         this.$router.push({ name: "mgyca" });
      }else if(id==3){
           this.$router.push({ name: "mxtgl" });
      }else if(id==4){
            this.$router.push({ name: "mfsy" });
      }
},
    cpfw(id){
      this.$router.push({ name: "mcpfw",params:{id:id}});
    },
    gyca() {
      this.$router.push({ name: "mgyca" });
    },
    xtgl() {
      this.$router.push({ name: "mxtgl" });
    },
    fsy() {
      this.$router.push({ name: "mfsy" });
    },
    getData(index) {
      this.num = index;
            if(index==1){
        this.isindustry='COMPANY';
      }else{
        this.isindustry='INDUSTRY';
      }
         this.page.current=1;
         this.page.pageSize=5;
      this.getList();
    },
    showForm() {
      this.zxly = true;
    },
    close() {
      this.zxly = false;
    },
    productMore() {
      this.$router.push({ name: "mcpfw" });
    },
    khalMore() {
      this.$router.push({ name: "mkhal" });
    },
    xwxq(id){
      this.$router.push({name:"mxwDetail",params:{id:id}});
    },
           khaldetail(id) {
      this.$router.push({ name: 'mkhalDetail',params:{id:id} });
    },
        getList(){
                     getLunbo().then(res => {
          var code = res.status;
          if (code == 200) {
             this.lunbos = res.data.data.rows.dataList;
          } else {
            this.$Message.error(res.data.error);
          }
        })
        .catch(error => {
          this.$Message.error(res.data.error);
        });
            getKhal().then(res => {
        var code = res.status;
        if (code == 200) {
          this.cases= res.data.data.rows.dataList;
          this.cases_num= res.data.data.rows.dataList.length;
        } else {
          this.$Message.error(res.data.error);
        }
      })
        .catch(error => {
          console.log(res.data.error);
        });

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
           this.news=res.data.data.rows.dataList;
           let records=res.data.data.rows.pagination.totalRecords;
        if(records<=this.page.pageSize){
           this.moredata="暂无更多新闻数据";
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

        }
  },
  mounted() {
    this.getList();
    // 首页轮播
    let syswiper=new Swiper('.shouyecontainer', {
      loop: true,
      autoplay: 3000,
      autoplayDisableOnInteraction : false,
      direction: 'horizontal',
      pagination: '.swiper-pagination',
      observer:true,
       onSlideChangeEnd: function(swiper){ 
　　　swiper.update();  
      syswiper.startAutoplay();
　　   syswiper.reLoop();  
}
    });
    // 客户案例轮播
    let mymSwiper=new Swiper('.khcontainer', {
      autoplay: 3000,
      loop: true,
      slidesPerView: 'auto',
      loopedSlides: 4, //在loop模式下使用slidesPerview:'auto'，还需使用该参数设置所要用到的loop个数(一般设置为本来slide的个数)
      direction: 'horizontal',
        autoplayDisableOnInteraction : false,
      pagination: '.swiper-pagination',
      spaceBetween : '4%',
      centeredSlides: true,
       observer:true,
       observeParents:false,
       onSlideChangeEnd: function(swiper){ 
　　　swiper.update();  
mymSwiper.startAutoplay();
　　   mymSwiper.reLoop();  
}
    })

  }
}
</script>
<style>
/* 全局样式 */
.zxlyForm .ivu-modal-footer {
    border-top: none!important;
    /* margin-top:0.5rem; */
    padding:0 18px 20px;
    }
.zxlyForm .ivu-modal-body {
  padding: 0 !important;
}

.justify {
  text-align: justify;
}
.pad10 {
  padding: 10px 0;
}
.rem10 {
  padding: 14px 0;
}
.rem11 {
  padding: 1.1rem 0;
}
.rem12 {
  margin: 1.2rem 0;
}
.rem13 {
  padding: 1.3rem 0;
}
.f8 {
  font-size: 0.8rem;
}
.f9 {
  font-size: 0.9rem;
}
.f10 {
  font-size: 1rem;
}
.f11 {
  font-size: 1.1rem;
}
.f12 {
  font-size: 1.2rem;
}
.f13 {
  font-size: 1.3rem;
}
.aside1 {
  margin: 14px 5%;
}
.aside2 {
  padding: 14px 5%;
}
.wraper1 {
  background: #ffffff;
  box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.1);
  border-radius: 5px;
  padding: 0.8rem;
  margin-bottom: 0.6rem;
}
.ptop {
  margin-top: 14px;
}
.ptop1 {
  width: 100%;
  height: 10px;
  background: #f0f0f0;
}
.martop_m{
  margin-top: 0.5rem;
}
.loadmore {
  text-align: center;
  margin-bottom: 1rem;
  color: #cccccc;
}
.line {
  border: 0.5px solid #ccc;
  margin: 15px 0;
}
.wraper {
  background: #ffffff;
  box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.1);
  border-radius: 8px;
  padding: 1rem;
  margin: 0.8rem 0;
}
.colorCon {
  color:#808080;
}
.linehei {
  line-height: 26px;
}
/* 首页轮播样式 */
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
.shouyecontainer .swiper-pagination-bullet {
  width: 17px;
  height: 2px;
  background: #ccc;
  border-radius: 0 !important;
}
.shouyecontainer .swiper-pagination-bullet-active {
  background: #fff !important;
   width: 27px;
  height: 3px;
}
.shouyecontainer {
  width: 100%;
  padding: 0 !important;
}
/* .ivu-carousel-dots-inside {
  bottom: 8px !important;
} */
.bold {
  font-weight: bold;
}
.khcontainer .swiper-pagination-bullets {
    bottom: 1.5rem !important;
}
/* img {
  width: 100%;
  height: auto;
} */
.flex {
  display: flex;
}
.demo-carousel {
  height: auto;
}
.pad {
  padding: 1.5rem 5%;
}
.pad_nobottom {
  padding: 1.5rem 5% 0;
}
.cpTitle {
  /* color: #232323; */
  font-size: 1.3rem;
  font-weight: bold;
}
.bggray {
  background: #f0f0f0;
}
.indexBody {
  position: relative;
  margin-top:15%;
}

/* 产品服务 */
.cpfw {
  background: #f0f0f0;
}
.cppx {
  font-size: 1.1rem;
  font-weight: bold;
  /* color: #232323; */
}
.cpfw p:last-child {
  /* color: #808080; */
}
.cpfw .hsesz_m {
  width: 18%;
  height: auto;
  /* margin-top: 1.5rem; */
  margin-top: 0.5rem;
}
.cpfw > div {
  display: flex;
  justify-content: space-around;
}
.cpfw > div:last-child > p {
  /* color: #232323; */
  font-weight: bold;
  margin-top: 1rem;
}
.peixun_m {
  width: 100%;
}
.cpContent {
  padding: 14px 0;
}
.cpContent2 {
  padding: 14px 0 4px;
}
.dxcpfw {
  justify-content: space-between;
}
.more_m {
  padding-top: 0.2rem;
  color: #5dc0c1;
  align-items:center;
}
.wrap {
  /* background: #f0f0f0; */
  padding: 0 3% 0.1rem 3%;
}
/* 客户案例轮播 */
.khal {
  width: 70%;
}
/* .swiper-container {
  width: 100%;
  padding-top: 10px;
  padding-bottom: 50px;
} */
.khcontainer {
  width: 100%;
  padding-top: 10px;
  padding-bottom: 50px;
}
.khslide > .swiper-slide {
  background-position: center;
  background-size: contain;
  width: 60%;
  height: auto;
}
.khalWidth {
  flex: 1.2;
}
.khalContent {
  flex: 2;
  font-size: 0.8rem;
  margin-left: 1rem;
}
.khalContent:p:last-child {
  margin-top: 0.5rem;
}
/* 新闻动态 */
.new_m {
  padding-top: 0.5rem;
  border-top: 1px solid #ccc;
  border-bottom: 1px solid #ccc;
  display: flex;
  justify-content: space-around;
  font-weight: bold;
  font-size: 1rem;
  text-align: center;
  color: #ccc;
}
.new_m .active {
  color: #5dc0c1;
  border-bottom: 3px solid #5dc0c1;
  padding-bottom: 0.5rem;
}
.xwContent {
  padding: 1rem 0;
  border-bottom: 1px solid #ccc;
  align-items: center;
}
.xwContent > div:first-child {
  width: 70px;
  height: 84px;
  background: #5dc0c1;
  color: #ffffff;
  display: flex;
  justify-content: center;
  align-items: Center;
}
.xwDate {
  text-align: center;
}
.xwDate > p:first-child {
  font-size: 1.2rem;
}
.xwContent_title + p {
  font-size: 0.8rem;
}
.xwContent > div:last-child {
  flex: 1;
  margin-left: 1rem;
}
 </style>
 <style scoped>
 img {
  width: 100%;
  height: auto;
}
.ptop2_m {
  margin-top: 7px;
}
/* 在线留言 */
.zxly {
  position: absolute;
  width: 60px;
  height: 60px;
  bottom: 0.5rem;
  right: 5%;
  border-radius: 50%;
  background: rgba(93,192,193,0.5);
  display: flex;
  justify-content: center;
  align-items: Center;
}
.zxly1 {
  width: 50px;
  height: 50px;
  border-radius: 50%;
  background: #5dc0c1;
  position: relative;
}
.zxly1 p {
  /* font-size: 8px; */
  font-size: 0.5rem;
  color: #fff;
  position: absolute;
  top: 32px;
  left: 10px;
}
.zxly1 > div {
  width: 50%;
  position: absolute;
  top: 7px;
  left: 12px;
}
.zxlyForm {
  position: absolute;
  bottom: 2vh;
  width: 80%;   /*此处的宽度设置是没用的，目前用的是默认的*/
  margin: 0 5%;
  text-align: center;
  background: #fff;
  /* border-radius: 5px; */
  /* z-index: 1100; */
}
.formTitle {
  padding: 20px 0;
  background: #f0f0f0;
  border-top-left-radius: 6px !important;
  border-top-right-radius: 6px !important;
}
/* .formTitle > p:first-child {
  font-size: 1.3rem;
} */
.closeZxly {
  font-size: 26px;
  position: absolute;
  top: 0.1rem;
  right: 0.8rem;
}
.formCell {
  margin-top: 20px;
  padding: 0 18px;
}
form input {
  width: 98%;
  height: 35px;
  margin-bottom: 20px;
  border: 0.5px solid #ccc;
  border-radius: 2px;
  font-size: 0.9rem;
  text-indent: 0.9rem;
  color: #495060;
;}
form input::placeholder {
  color: #ccc;
}
form textarea {
  width: 98%;
  border: 0.5px  solid #ccc;
  border-radius: 2px;
  font-size: 0.9rem;
  text-indent: 0.9rem;
  color: #495060;
}
form textarea::placeholder {
  color: #ccc;
}
/* .formCell button {
  width: 98%;
  height: 40px;
  background: #5dc0c1;
  border-radius: 15px;
  border: none;
  color: #fff;
  margin:  0;
} *//*没用*/
textarea + p {
  margin:0.5rem 0;
}
textarea + p i {
  color: red;
}
.more_m span {
  font-size: 1.2rem;
}
</style>
