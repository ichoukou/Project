<template>
  <div class="all">
    <div class="logo_pc">
<Carousel autoplay v-model="value2" loop :autoplay-speed="autoplaySpeed">
  <div v-for="(item,index) in lunbos" v-if="index<=4&&item.state=='启用'">
  <CarouselItem >
    <div class="demo-carousel" @click="pictureDetail(item.banner_img_pc)"><img :src="item.banner_img_pc" style="width:100%;height:auto;">
    </div>
    </CarouselItem>
    </div>
</Carousel>
    </div>
    <!-- 产品及服务范围 原:业务领域 -->
    <div class="yw">
      <div class="lxwm">
        <p class="phone">联系我们</p>
        <p class="phone1">400-017-8016</p>
        <!-- <div class="phone2" v-lazy:background-image = "dianhua"></div> -->
        <div class="phone2" ></div>
      </div>
      <Row >
        <Col :lg="{ span: 14, offset: 5 }">
        <div class="ywly">
          <div class="ywzt">产品及服务范围</div>
        </div>
        </Col>
      </Row>
      <Row class="hse w">
        <Col :lg="{ span: 8, offset: 2  }" >
        <div class="hsesz"><img v-lazy="pcurl+'icon_hseshuzi.png'" class="gsjj_picture"></div>
        </Col>
        <Col :lg="{ span: 8, offset: 4 }">
        <div class="hsesz1"><img v-lazy="pcurl+'icon_hseguanli.png'" class="gsjj_picture"></div>
        </Col>
      </Row>
      <Row class="hse w">
        <Col :lg="{ span: 8, offset: 2  }">
        <div class="hsezt">HSE数字产品</div>
        <div class="hse_content">通过我们的HSE协同平台、行业风险数据库、专业算法及强大的软硬件集成产品来提升您和您企业的知情决策能力</div>

        </Col>
        <Col :lg="{ span:8, offset: 4 }">
        <div class="hsezt">HSE管理咨询</div>
        <div class="hse_content">从无序到有序、从合规至卓越，我们的HSE风险评估审核、管理咨询及培训服务将显著改善您企业的HSE绩效水平</div>
        </Col>

      </Row>
    </div>
    <!-- 典型产品及服务 原:产品服务-->
    <div class="cpfw_pc">
      <Row>
        <Col :lg="{ span: 14, offset: 5 }">
        <div class="ywly">
          <div class="ywzt">典型产品及服务</div>
          <div class="sy_title">作为数字化HSE产品/服务提供商，我们致力于提供全方位的HSE管理提升及信息化（含物联网）建设服务。</div>
        </div>
        </Col>
      </Row>
      
      <div class="w">
      <Row>
        <Col :lg="{ span: 12}" class="pxzx_content">
        <div class="zxpx">培训与咨询</div>
        <div class="ywcontent_center">我们采用先进的多标兼容、全量化风险评估模型，以及基于岗位风险分析结果定制的培训产品，为行业客户提供从诊断、咨询、培训到符合性辅导及鉴证的全面专家服务，为企业提升HSE绩效提供基于行业实践的快速通道和高效方法。</div>
        <div class="addmore">
          <span class="more_pc" @click="pxzx()">more</span>
          <img class="icon_more" v-lazy="pcurl+'icon_add_nor.png'" @click="pxzx()">
          <div style="clear:both;"></div>
        </div>
        </Col>
        <Col :lg="{ span: 10, offset: 2}">
        <img v-lazy="pcurl+'img_peixun.png'" class="gsjj_picture">
        </Col>
      </Row>
      <Row>
        <Col :lg="{ span: 10}" style="margin-top:-60px;">
        <img v-lazy="pcurl+'img_shuzifangan.png'" class="gsjj_picture">
        </Col>
        <Col :lg="{ span: 12,offset: 2}" class="pxzx_content">
        <div class="zxpx">数字化方案</div>
        <div class="ywcontent_center">安全环保与高效生产协调统一的卓越化运营一直是各行业客户尤其是高危行业客户的关注重点。您将了解我们如何利用HSE协同平台、可视化技术、商业智能、专业算法工具、专业数据库以及物联网等技术手段来帮助客户达成这一目标。</div>
        <div class="addmore">
          <span class="more_pc" @click="szfa()">more</span>
          <img class="icon_more" v-lazy="pcurl+'icon_add_nor.png'" @click="szfa()">
          <div style="clear:both;"></div>
        </div>
        </Col>
      </Row>
      <Row style="margin-top:20px;">
        <Col :lg="{ span: 12}" class="pxzx_content">
        <div class="zxpx">专业软件与行业数据库</div>
        <div class="ywcontent_center">通过跨平台协作、联合工业项目以及认证合作伙伴关系，我们联合DNV GL、ChemWatch等著名HSE咨询厂商为您的企业提供更专业的风险算法软件和风险数据库工具，这将成为您HSE数字化产品应用架构中强有力的业务驱动引擎。</div>
        <div class="addmore">
          <span class="more_pc" @click="zyrj()">more</span>
          <img class="icon_more" v-lazy="pcurl+'icon_add_nor.png'" @click="zyrj()">
          <div style="clear:both;"></div>
        </div>
        </Col>
        <Col :lg="{ span: 10, offset: 2}" style="margin-top:-60px;">
        <img v-lazy="pcurl+'img_zhuanyeruanjian.png'" class="gsjj_picture">
        </Col>
      </Row>
    </div>
    <Row>
      <Col span="4" offset="10" class="cpfw_pc_more">
      <div class="cpfw_pc_more_picture"   @click="cpfw_pcmore()"></div>
      </Col>
    </Row>
    <Row>
      <Col>
      <div class="line w"></div>
      </Col>
    </Row>
    <!-- 客户案例 -->
    <Row class="khal_pc w">
      <col>
      <Row>
        <Col>
        <div class="ywzt">客户案例</div>
        <div class="sy_title">作为数字化HSE产品/服务提供商，我们致力于提供全方位的HSE管理提升及信息化（含物联网）建设服务。</div>
        </Col>
      </Row>
      <Row class="khal_pc_case">
        <Col  class="pckhlunbo_outer">
        <!-- <div class="khal_pc_outer">
          <div v-for="(item,index) in cases" v-if='index<=2&&cases!=null' style="width:32%;cursor:pointer" @click="khaldetail(item.case_id)">
            <img :src="item.case_img_pc" style="width:100%;">
              <p class="fromto">{{item.case_title}}</p>
              <p class="fromto_content" v-if="item.case_synopsis.length>55">{{item.case_synopsis.slice(0,55)}}...</p>
              <p class="fromto_content"  v-else>{{item.case_synopsis}}</p>
          </div>
        </div> -->
            <div class="swiper-container pckhcontainer">
        <div class="swiper-wrapper pckhslide">
            <div class="swiper-slide" v-for="(item,index) in cases" v-if="index<=4&&item.state=='启用'" style="cursor:pointer;" @click="khaldetail(item.case_id)">
             <div style="overflow: hidden;"> <img :src="item.case_img_pc" style="width:100%;height:auto;" class="pckhimg"></div>
          
             <p class="fromto">{{item.case_title}}</p> 
             <p class="fromto_content" v-if="item.case_synopsis.length>45">{{item.case_synopsis.slice(0,45)}}...</p>
             <p class="fromto_content" v-else>{{item.case_synopsis}}</p>
              </div>
        </div>
    </div>
    <div class="swiper-button-prev" ></div>
    <div class="swiper-button-next" ></div>
        </Col>
      </Row>
      <Row>
        <Col span="4" offset="10" class="cpfw_pc_more">
        <div class="cpfw_pc_more_picture" @click="khal_pcmore"></div>
        </Col>
      </Row>
      </Col>
    </Row>
        </div>
    <!-- 在线留言 -->
    <div class="zxly_pc">
      <Row class="w" >
        <Col>
        <p class="zxzt">在线留言</p>
        <p class="zsxx">请留下您的真实信息，让我们能够及时联系您</p>
        <div style="margin-top:20px">
          <Form ref="formInline" :model="formItem"  inline>
            <FormItem prop="title">
              <Input v-model="formItem.lw_company" placeholder="公司" style="width:600px;" class="zxly_pc_input_text" />
            </FormItem><br>
            <FormItem>
              <Input v-model="formItem.lw_name" placeholder="姓名" style="width:180px;" class="zxly_pc_input_text" />
            </FormItem>
            <FormItem>
              <Input v-model="formItem.lw_phone" placeholder="电话" style="width:180px;margin:0 16px;" class="zxly_pc_input_text" />
            </FormItem>
            <FormItem>
              <Input v-model="formItem.lw_email" placeholder="邮箱" style="width:180px;" class="zxly_pc_input_text" />
            </FormItem><br>
            <FormItem>
              <Input v-model="formItem.lw_remark" type="textarea" placeholder="备注" style="width:600px;" class="zxly_pc_input_text zxly_pc_input_textarea" />
            </FormItem><br>
            <p class="tip">* 注：您的个人信息我们会进行加密处理，请放心</p>
            <!-- <br> -->
            <FormItem>
              <Button shape="circle" style="width:180px;margin-left: 420px;" @click="handleSubmit('formItem')" class="zxly_pc_input_btn">确认提交</Button>
            </FormItem>
          </Form>

        </div>

        </Col>
      </Row>
    </div>
    <!-- 新闻动态 -->
    <Row>
<div class="ywly">
        <div class="ywzt">新闻动态</div>
        <div class="ywzt_title sy_title">作为数字化HSE产品/服务提供商，我们致力于提供全方位的HSE管理提升及信息化（含物联网）建设服务。</div>
      </div>
    </Row>
    <Row>
      <Col :lg="{ span: 2, offset: 9 }" style="text-align:center" :class="{active:num == 1}" class="qyxw">
      <span @click="getData(1)">企业新闻</span>
      </Col>
      <Col :lg="{ span: 2, offset: 2 }" style="text-align:center" :class="{active:num == 2}"  class="hyxw">
      <span @click="getData(2)">行业新闻</span>
      </Col>
    </Row>

    <Row class="xw_content w" v-if="num==1">
      <Col>
        <Row :gutter="16" class="xw_outer1">
          <div v-for="(item,index) in news" v-if="index<=3&&item.state=='启用'">
            <Col span="12" class="xw_outer">
              <div @click="xwxq(item.news_id)">
                <Row type="flex" align="middle" class="xw_area">
                  <Col span="4">
                    <div class="xw_rili">
                      <div class="xw_date" v-if="item.news_time!=null">
                        <p style="font-size:28px">{{item.news_time.slice(8,10)}}</p>
                        <p style="font-size:14px">{{item.news_time.slice(0,4)}}/{{item.news_time.slice(5,7)}}</p>
                      </div>
                    </div>
                  </Col>
                  <Col span="18" offset="2" >
                    <div class="xwdt" >
                      <p class="fromto2">{{item.news_title}}</p>
                        <p v-if="item.description.length>45">{{item.description.slice(0,45)}}...</p>
                      <p v-else>{{item.description}}</p>
                    </div>
                  </Col>
                </Row>
              </div>
            </Col>
          </div>
        </Row>
      </Col>
    </Row>

   <Row class="xw_content w" v-if="num==2">
      <Col>
        <Row :gutter="16" class="xw_outer1">
          <div v-for="(item,index) in companyNews" v-if='index<=3&&news!=null'>
            <Col span="12" class="xw_outer">
              <div @click="xwxq(item.news_id)">
                <Row type="flex" align="middle" class="xw_area">
                  <Col span="4">
                    <div class="xw_rili">
                      <div class="xw_date" v-if="item.news_time!=null">
                        <p style="font-size:28px">{{item.news_time.slice(8,10)}}</p>
                        <p style="font-size:14px">{{item.news_time.slice(0,4)}}/{{item.news_time.slice(5,7)}}</p>
                      </div>
                    </div>
                  </Col>
                  <Col span="18" offset="2" >
                    <div class="xwdt" >
                      <p class="fromto2">{{item.news_title}}</p>
                      <p v-if="item.description.length>45">{{item.description.slice(0,45)}}...</p>
                      <p v-else>{{item.description}}</p>
                    </div>
                  </Col>
                </Row>
              </div>
            </Col>
          </div>
        </Row>
      </Col>
    </Row>
    
    <Row>
      <Col span="4" offset="10" class="cpfw_pc_more">
      <div class="cpfw_pc_more_picture" @click="xw_more()"></div>
      </Col>
    </Row>
  </div>
</template>
<script>
import Swiper from 'swiper';
import { savePoliceInfo,getNews,getKhal,getLunbo } from "@/api/api";
export default {
  data() {
    return {
      pcurl:'http://oss.chain-smart.com/assets/',
      liuyan:'http://oss.chain-smart.com/assets/img_liuyan_bg.png',
      dianhua:'http://oss.chain-smart.com/assets/icon_dianhua_g.png',
      // prev:'http://oss.chain-smart.com/assets/icon_jiantou_huizuo.png',
      // next:'http://oss.chain-smart.com/assets/icon_jiantou_shenhuiyou.png',
      autoplaySpeed: 5000,
      value2: 0,
      num: 1,
      show_phone: false,
      formItem: {
        lw_company: '',
        lw_name: '',
        lw_phone: '',
        lw_email: '',
        lw_remark: '',
      },
      lunbos:[],
      cases:[],
      news:[],
    };
  },
  methods: {
    pictureDetail(imgid){
      let id=imgid[imgid.length-5];
      if(id==1){
         this.$router.push({ name: "gyca" });
      }else if(id==3){
           this.$router.push({ name: "hseszcp" });
      }else if(id==4){
            this.$router.push({ name: "fsy" });
      }
    },
    getData(index) {
      this.num = index;
    },
    gyca() {
      this.$router.push({ name: "gyca" });
    },
    hseszcp() {
      this.$router.push({ name: "hseszcp" });
    },
    hseglzx() {
      this.$router.push({ name: "hsezxgl" });
    },
    phone() {
      this.show_phone = true;
    },
    leave() {
      this.show_phone = false;
    },
    pxzx() {
      this.$router.push({ name: "cpfw", params: { id: 2 } });
    },
    szfa() {
      this.$router.push({ name: "cpfw", params: { id: 3 } });
    },
    zyrj() {
      this.$router.push({ name: "cpfw", params: { id: 4 } });
    },
    cpfw_pcmore() {
      this.$router.push({ name: "cpfw"});
    },
    khal_pcmore() {
      this.$router.push({ name: "khal" });
    },
    xw_more() {
      this.$router.push({ name: "xwdt" });
    },
    fsy() {
      this.$router.push({ name: "fsy" })
    },
    //新建提交相关政策
    handleSubmit(name) {
      savePoliceInfo(this.formItem).then((res) => {
        var code = res.status;
        if (code == 200) {
          alert("您的信息已提交成功！");
          this.formItem={};
        }
      }).catch((error) => {
        console.log(error);
      });
    },
    xwxq(id) {
        this.$router.push({ name: "xwdtdetail",params:{id:id} });
    },
        khaldetail(id) {
      this.$router.push({ name: 'khaldetail',params:{id:id} });
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
          this.cases = res.data.data.rows.dataList;
   
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
      };
          getNews(param).then(res => {
          var code = res.status;
          if (code == 200) {
                 let datalist=res.data.data.rows.dataList;
             this.news= datalist.filter(function (x) {
                   return x.category_id== '公司新闻';
              });
              this.companyNews=datalist.filter(function (x) {
                   return x.category_id== '行业新闻';
              });
          } else {
            this.$Message.error(res.data.error);
          }
        })
        .catch(error => {
          this.$Message.error(res.data.error);
        });
        }
  },
  mounted: function () {
         let mypcSwiper= new Swiper('.pckhcontainer', {
         autoplay: 3000,
         loop: true,
        //  pagination: '.swiper-pagination',
         nextButton: '.swiper-button-next',
         prevButton: '.swiper-button-prev',
         slidesPerView: 3,
        paginationClickable: true,
        spaceBetween: 30,
        observer:true,
        //loopedSlides: 4, //在loop模式下使用slidesPerview:'auto'，还需使用该参数设置所要用到的loop个数(一般设置为本来slide的个数)
       direction: 'horizontal',
        autoplayDisableOnInteraction : false,
       observeParents:true,
       centeredSlides: false,
            onSlideChangeStart: function(swiper){
     　　swiper.update();  
　　　mypcSwiper.startAutoplay();
    },
          });
   this.getList();
  }
}
</script>
<style>
.w{
  width:1200px;
  margin-left: auto !important;
  margin-right: auto !important;
  
  /* border:1px solid #000; */
}
.all {
  margin-top: 80px;
}
/* 客户案例轮播 */
.pckhlunbo_outer .swiper-button-prev{
  top:50%!important;
  margin-top: -22px !important;
  background-image: url(http://oss.chain-smart.com/assets/icon_jiantou_huizuo.png) !important;
  background-size: 80% 80% !important ;
  left: -60px !important;
  
}
.pckhlunbo_outer .swiper-button-next{
  top:50%!important;
  margin-top: -22px !important;
  background-image: url(http://oss.chain-smart.com/assets/icon_jiantou_shenhuiyou.png) !important;
  background-size: 80% 80% !important;
  right: -60px !important;  
}
.pckhcontainer {
        width: 90%;
        height: auto;
        /* height: 450px; */
        margin: 0 auto !important;
        
    }
    .pckhcontainer .swiper-slide {
   /* display: flex; */
        height: auto;
        -webkit-box-pack: center;
        -ms-flex-pack: center;
        -webkit-justify-content: center;
        justify-content: center;
        -webkit-box-align: center;
        -ms-flex-align: center;
        -webkit-align-items: center;
        align-items: center;
    }
 
.logo_pc .ivu-carousel-dots-inside {
  bottom: 43px !important;
}
.logo_pc .ivu-carousel-dots {
  height: 27px !important;
}
.logo_pc .ivu-carousel-dots li {
  margin: 0 5px !important;
}
/* button对应首页轮播图下方轮播条，此处设置非选中状态的样式,默认宽高是16、3，颜色是灰色，透明度是0.3*/
.logo_pc .ivu-carousel-dots li button {
  width: 30px !important;
  height: 2px !important;
  background: #fff !important;
}
/* ivu-carousel-active为轮播条为选中状态时，默认宽变为是24，颜色是灰色，透明度变为1、高不变*/
.logo_pc .ivu-carousel-dots li.ivu-carousel-active > button {
  height: 3px !important;
  width: 50px !important;
  background: #fff !important;
}
.logo_pc .ivu-carousel-arrow {
  font-size: 0.4em !important;
}
.zxly_pc_input_text .ivu-input {
  background-color: transparent;
  border: 1px solid #fff;
  border-radius: 2px;
  font-size: 14px;
  height: 40px;
  color: #fff;
}
.zxly_pc_input_textarea .ivu-input {
  height: 80px !important;
}
.zxly_pc_input_text .ivu-input::-webkit-input-placeholder {
  /* WebKit browsers */
  color: #bee5e6;
}
.zxly_pc_input_text .ivu-input:-moz-placeholder {
  /* Mozilla Firefox 4 to 18 */
  color: #bee5e6;
}
.zxly_pc_input_text .ivu-input::-moz-placeholder {
  /* Mozilla Firefox 19+ */
  color: #bee5e6;
}
.zxly_pc_input_text .ivu-input:-ms-input-placeholder {
  /* Internet Explorer 10+ */
  color: #bee5e6;
}
</style>
<style scoped>
* {
  box-sizing: border-box;
}
.pckhimg{display: block;transition-duration:0.5s;transition-timing-function:linear}
.pckhimg:hover{transform:scale(1.2, 1.2);} 
.normal_center_container {
  margin-bottom: 15px;
}
.my_card {
  border: none !important;
}
.my_card:hover {
  border: none !important;
  box-shadow: none !important;
}
ul {
  padding: 0 20px;
}
li,
li a {
  height: 42px;
  line-height: 42px;
  font-size: 16px;
  color: #555;
}
.li_more {
  height: 25px !important;
  line-height: 25px !important;
}
.card_left {
  float: left;
  width: 38px;
  height: 100%;
  background: #edf0f8;
  border-bottom-left-radius: 10px;
  border-top-left-radius: 10px;
  border-right: 1px solid #1d81e3;
  font-size: 16px;
  color: #3e64c1;
  writing-mode: lr-tb;
  padding: 20px 10px;
  background-color: #3e64c1;
  color: #fff;
  font-weight: bold;
}
.card_right {
  padding: 12px 0px 12px 50px;
}
.contactCard {
  margin-top: 15px;
  border: 1px solid #1d81e3;
  border-radius: 10px;
  padding: 0px !important;
  background-color: #f3f9fe;
  height: 124px;
  margin-right: 5px;
  cursor: pointer;
  margin-left: 7px;
}
.contactCard .ivu-card-body {
  padding: 0px !important;
}
.contactCard div li:nth-child(2),
.contactCard div li:nth-child(3) {
  list-style-type: none;
}
.contactCard div li {
  height: 30px;
  line-height: 30px;
}
.contactCard div li:nth-child(1) {
  list-style: none;
}
.my_card .contactCard .ivu-card-body {
  padding: 0px !important;
}
.tc .dow {
  margin-left: -100px;
}
.zc_d span {
  font-size: 28px;
}
.ivu-card-body {
  padding-right: 0px;
}

.logo_pc {
width:100%;
height:auto;
}
.menuItem {
  padding: 0 0 !important;
  font-size: 14px;
  height: 50px;
  line-height: 50px;
  margin-left: 0px !important;
}
.topMenu {
  padding: 10px 0px;
  background: transparent;
  height: 100%;
  width: 100%;
}
.ivu-menu-primary.ivu-menu-horizontal .ivu-menu-item-active,
.ivu-menu-primary.ivu-menu-horizontal .ivu-menu-item:hover,
.ivu-menu-primary.ivu-menu-horizontal .ivu-menu-submenu-active,
.ivu-menu-primary.ivu-menu-horizontal .ivu-menu-submenu:hover {
  background: none !important;
  font-weight: bold;
  border-bottom: 3px solid #fff;
}
.layout-nav {
  max-width: 680px;
  margin-right: 0px;
  padding: 5px 0px;
}
/* 业务数据 */
.yw {
  background: #f0f0f0;
  position: relative;
  margin-top: -20px;
  padding-bottom: 10vh;
}
.ywly {
  margin-top: 10vh;
  text-align: center;
}
.ywzt {
  font-size: 32px;
  text-align: center;
  font-weight: 600;
}
.ywcontent_center {
  font-size: 14px;
  color: #808080;
  text-align: left;
  line-height: 28px;
  margin-top: 25px;
  margin-bottom: 20px;
}
.hsesz {
  text-align: center;
  margin-top: 1vh;
}
.hsesz1 {
  text-align: center;
  margin-top: 1vh;
}
.hsezt {
  font-size: 20px;
  text-align: center;
  font-weight: 600;
}
.hse_content {
  text-align: center;
  margin-top: 20px;
  margin-bottom: 20px;
  font-size: 14px;
  color: #808080;
}
.hsetu {
  text-align: center;
}
.hse {
  margin-top: 5vh;
}
.pxtp {
  width: 525px;
  height: 510px;
  background-image: url("http://oss.chain-smart.com/assets/img_peixun.png");
}
.zxpx {
  font-size: 20px;
  margin-top: 20px;
  font-weight: 600;
}
.pxzx_content {
  margin-top: 50px;
}
.fromto {
  font-size: 18px;
  font-weight: 600;
  margin: 10px 0;
}
.fromto_content {
  color: #808080;
  font-size: 14px;
  line-height: 28px;
}
.xwdt{
  height: 95px;
}

.fromto2 {
  font-size: 15px;
  font-weight: 600;
  margin: 0 0 1vh ;
  line-height: 24px;
}

.fromto2 + p {
  color: #808080;
  font-size: 14px;
  line-height: 24px;
} 
.zxly_pc {
 background: url("http://oss.chain-smart.com/assets/img_liuyan_bg.png") no-repeat bottom; 
  background-repeat:no-repeat;
  background-position:bottom;
  background-color: #5DC0C1;
  padding: 9vh 0 7vh 0;
  font-size: 14px;
}

.zxzt {
  font-size: 32px;
  color: #ffffff;
}
.zsxx {
  font-size: 14px;
  color: #ffffff;
  margin-top: 20px;
}
.zxly_pc_input_btn {
  background-color: transparent;
  border: 1px solid #fff;
  font-size: 16px;
  color: #fff;
  margin-left: 480px;
}
.zxly_pc_input_btn:hover {
  background-color: #fff;
  border: 1px solid #5dc0c1;
  font-size: 16px;
  color: #5dc0c1;
}
.tip {
  color: #ffffff;
  font-size: 12px;
}
.contact_logo {
  background: #fff;
  width: 90px;
  height: 90px;
  text-align: center;
  right: 0;
  position: fixed;
  top: 90px;
  right: 0;
  cursor: pointer;
}
.contact_logo1 {
  width: 64px;
  height: 48px;
  margin: 0 auto;
  background: url("http://oss.chain-smart.com/assets/icon_dnv_c.png");
  position: absolute;
  top: 20%;
  left: 15%;
  border: 1px solid #ddd;
}
.contact_our {
  width: 90px;
  height: 90px;
  background: #fff;
  position: fixed;
  top: 182px;
  right: 0;
  cursor: pointer;
}
.telephone {
  width: 190px;
  height: 90px;
  background: #fff;
  position: fixed;
  top: 182px;
  right: 90px;
}
.con1 {
  font-size: 14px;
  margin-left: 32px;
  margin-top: 20px;
}
.con2 {
  font-size: 20px;
  margin-left: 32px;
}
.dianhua {
  width: 35px;
  height: 35px;
  /* background: url("http://oss.chain-smart.com/assets/icon_dianhua_g.png"); */
  text-align: center;
  margin-top: 25px;
  margin-left: 20px;
  cursor: pointer;
}
.icon_more {
  float: left;
  width: auto;
  height: auto;
  max-width: 100%;
  max-height: 100%;
  margin-left: 8px;
  cursor: pointer;
}
.more_pc {
  float: left;
  font-size: 16px;
  color: #5dc0c1;
  cursor: pointer;
  /* display: inline-block; */ 
}
.addmore {
  /* display: flex; IE9下兼容不好*/ 
  /* display: -webkit-flex; webkit浏览器 safari */
  /* align-items: center; */
}
.smgz {
  color: #fff;
  text-align: center;
}

.wscl {
  color: #5dc0c1;
}

.kjzc .zc {
  cursor: pointer;
}
.kjzc .active {
  border-bottom: 2px solid #207fe8;
}
.kjzc .zc span {
  font-size: 18px;
  color: #555;
}
.kjzc .active span {
  color: #207fe8;
}
.gsjj_picture {
  width: auto;
  height: auto;
  max-width: 100%;
  max-height: 100%;
}
.cpfw_pc_more {
  height: 40px;
  position: relative;
  margin-top: 5vh;
  margin-bottom: 10vh;
}
.cpfw_pc_more_picture {
  position: absolute;
  background: url("http://oss.chain-smart.com/assets/btn_more_line_nor.png") no-repeat;
  background-repeat:no-repeat;
  left: 50%;
  margin-left: -100px;
  width: 200px;
  height: 40px;
  cursor: pointer;
}
.cpfw_pc_more_picture:hover {
  position: absolute;
  background: url("http://oss.chain-smart.com/assets/btn_more_line_pre.png") no-repeat;
  left: 50%;
  margin-left: -100px;
  width: 200px;
  height: 40px;
  cursor: pointer;
}
.line {
  border: 0.5px solid #eee;
}
.khal_pc {
  margin-top: 10vh;
}
.khal_pc_case {
  margin-top: 15px;
}
.khal_pc_outer {
  display: flex;
  display: -webkit-flex;
  justify-content: space-between;
  align-items: center;
}
.qyxw span {
  font-weight: 600;
  font-size: 18px;
  cursor: pointer;
  color: #ccc;
}
.qyxw.active > span {
  color: #495060;
}
.hyxw  span{
  font-size: 18px;
  font-weight: 600;
  cursor: pointer;
  color: #ccc;
}
.hyxw.active > span {
  color: #495060;
}
.xw_outer {
  padding: 0 2% !important;
  cursor: pointer;
}
.xw_area {
  border-bottom: 1px solid #f0f0f0;
  border-top: 1px solid #fff;
  padding: 2vh 0;
}
.xw_outer1>:first-child>.xw_outer .xw_area {
  border-top: 1px solid #f0f0f0;
}
.xw_outer1>:nth-child(2)>.xw_outer .xw_area {
  border-top: 1px solid #f0f0f0;
}
.xw_outer:hover {
  background-color: #f0f0f0;
}
.xw_outer:hover >div .xw_area {
  border-top: 1px solid #f0f0f0 !important;
}
.xw_rili {
  width: 96px;
  height: 84px;
  padding: 1vh 0;
  background: #5dc0c1;
  opacity: 0.5;
}
/*鼠标经过xw_area,修改其子盒子下的xw_rili子盒子的样式*/
.xw_outer:hover > div .xw_rili {
  opacity: 1;
}
.xw_date {
  width: 100%;
  color: #fff;
  text-align: center;
}
.cpfw_pc_more1 {
  background: url("http://oss.chain-smart.com/assets/btn_more_line_pre.png") no-repeat;
  padding-top: 40%;
  background-size: contain;
  margin-top: 30px;
  cursor: pointer;
}
.xw_content {
  margin-top: 30px;
}
.lxwm {
  width: 200px;
  height: 60px;
  background: #fff;
  box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.1);
  position: fixed;
  top: 50%;
  margin-top: -30px;
  right: 10px;
  border-radius: 50px;
  z-index: 1000;
}
.phone {
  position: absolute;
  top: 6px;
  left: 60px;
  font-size: 14px;
}
.phone1 {
  position: absolute;
  top: 25px;
  left: 60px;
  font-size: 19px;
}
.phone2 {
  position: absolute;
  top: 50%;
  margin-top: -15px;
  left: 15px;
  background: url("http://oss.chain-smart.com/assets/icon_dianhua_g.png") no-repeat;
  width: 30px;
  height: 30px;
}
.sy_title {
  font-size: 14px;
  color: #808080;
  text-align: center;
  line-height: 28px;
  margin-top: 25px;
  margin-bottom: 20px;
}

.moreadd {
  width: 180px;
  height: 36px;
  line-height: 36px;
  border: 1px solid #fff;
  border-radius: 40px;
  text-align: center;
  position: absolute;
  top: 70%;
  left: 50%;
  margin-left: -90px;
  color: #fff;
  cursor: pointer;
  font-size: 16px;
}
.moreadd:hover {
  background: #fff;
  color: #738096;
}
.moreadd1 {
  top: 61% !important;
  left: 19% !important;
  margin-left: 0px !important;
}
.moreadd4 {
  top: 51% !important;
  left: 19% !important;
  margin-left: 0px !important;
}
.demo-carousel {
  position: relative;
  cursor:pointer;
}
</style>
