<template>
  <div class="all"><img style="width:100%;height:auto;" v-lazy="pcurl+'img_banner_lianxiwomen.png'">
    <div class="kjzc w">
      <Row>
        <!-- <Col  style="padding: 0 1.5%;"> -->
        <Col>
        <Row class="cpfw_yt">
          <Col span="10" class="zc_1 zc" :class="{active:num == 1}">
          <div>
            <span @click="getData(1)">联系我们</span>
          </div>
          </Col>
          <Col span="10" offset="4" class="zc_2 zc" :class="{active:num == 2}">
          <div>
            <span @click="getData(2)">加入我们</span>
          </div>
          </Col>
        </Row>
        </Col>
      </Row>
      <!-- 联系我们列表 -->
      <div v-if="num==1" class="lxwmpc w">
        <Row>
          <!-- <Col  style="padding:0 1.5%;"> -->
          <Col>
          <Row type="flex" align="middle">
            <Col span="11">
            <ul>
              <li class="lxfs">
                <img v-lazy="pcurl+'icon_news_wangzhi.png'" class="gsjj_picture'">
                <p class="gswz1" style="margin-left: 3%;">公司网址：www.chain-smart.com</p>
              </li>
              <li class="lxfs">
                <img v-lazy="pcurl+'icon_news_dianhua.png'" style="margin-top:2px;" class="gsjj_picture">
                <p class="gswz1">公司电话：</p>
                <p class="gsphone">021-64238586(上海)<br>0535-56931523(烟台)<br>024-22731055(沈阳)</p>
              </li>
              <li class="lxfs">
                <img v-lazy="pcurl+'icon_news_dizhifuwudianhua.png'" class="gsjj_picture">
                <p class="gswz1">服务电话：400-017-8016</p>
              </li>
              <li class="lxfs">
                <img v-lazy="pcurl+'icon_news_dizhi.png'" class="gsjj_picture">
                <p class="gswz1">公司地址：(上海)上海市徐汇区白色路100号，28号楼</p>
              </li>
              <li class="lxfs">
                <img v-lazy="pcurl+'icon_news_jiaofu.png'" style="margin-top:1px;" class="gsjj_picture">
                <p class="gswz1">烟台交付中心：山东省烟台市开发区长江路161号，天马中心A-705室</p>
              </li>
              <li class="lxfs">
                <img v-lazy="pcurl+'icon_shenyang.png'" style="margin-left:-1%;margin-top:-2px;" class="gsjj_picture">
                <p class="gswz1" style="margin-left: 3%;">沈阳办事处：沈阳市沈河区市府路290号摩根凯利大厦A座1209室</p>
              </li>
              <li class="lxfs lxfs_last">
                <img v-lazy="pcurl+'icon_news_youxiang.png'" style="margin-top:3px;" class="gsjj_picture">
                <p class="gswz1">电子邮箱：cj@chain-smart.com</p>
              </li>
            </ul>
            </Col>
            <Col span="11" offset="2">
            <div><img v-lazy="pcurl+'img_ditu1.png'" class="gsjj_picture"></div>
            <div><img v-lazy="pcurl+'img_ditu2.png'" class="gsjj_picture"></div>
            <div><img v-lazy="pcurl+'img_ditu3.png'" class="gsjj_picture"></div>
            </Col>
          </Row>
          </Col>
        </Row>
      </div>
      <!-- 加入我们列表 -->
      <div v-if="num==2" class="w">
        <div v-for="(item,index) in recruitList" @click="ckxq(item.rec_id)">
        <Row  > 
    <Col class="zpxx_outer" >
      <Row  type="flex" align="middle" class="zpxx_inner" >
        <Col span="8">
          <p class="position">{{item.rec_title}}</p>
          <p class="salary">{{item.rec_payment}}&nbsp;&nbsp;</p>
        </Col>
        <Col span="8" class="requirement">
          <p >{{item.rec_education}}  | {{item.rec_working_life}}</p>
        </Col >
        <Col span="8">
          <button class="details_button" @click="ckxq(item.rec_id)">查看详情</button>
        </Col>
      </Row>  
        </Col>
        </Row>
        </div>
      </div>

    </div>
  </div>
</template>
<script>
import { getJrwm } from "@/api/api";
// import * as data from '@/components/data/data';
export default {
  data() {
    return {
      num: 1,
      recruitList: [],
     pcurl:'http://oss.chain-smart.com/assets/',
      // recurits:data.recurits,
    }
  },
  methods: {
    getList() {
      getJrwm().then(res => {
        var code = res.status;
        if (code == 200) {
          this.recruitList = res.data.data.rows.dataList;
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
      this.$router.push({ name: "jrwmdetail", params: { id: id } });
    }
  },
  mounted: function () {
    this.getList();
  }
}

</script>
<style scoped>
.kjzc {
  margin-top: 10vh;
  margin-bottom: 10vh;
}
.cpfw_yt {
  border-bottom: 1px solid #eee;
  font-size: 18px;
  font-weight: 600;
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
.lxfs {
  list-style: none;
  display: flex; /*IE9下兼容不好*/
  display: -webkit-flex; /*webkit浏览器 safari*/
  align-items: flex-start;
  border-bottom: 1px solid #eee;
  padding: 3vh 0;
}
.lxfs_last {
  border-bottom: 1px solid #fff !important;
}
.gswz1 {
  margin-left: 4%;
  font-size: 15px;
}
.gsphone {
  font-size: 15px;
}
.zpnr {
  list-style: none;
  margin-bottom: 2vh;
}
.position {
  font-size: 16px;
  font-weight: 600;
}
.salary {
  color: #5dc0c1;
  font-size: 16px;
  font-weight: 600;
}
.requirement {
  font-size: 14px;
  text-align: center;
  font-weight: 600;
}
.details_button {
  position: absolute;
  width: 190px;
  height: 40px;
  right: 0;
  top: 50%;
  margin-top: -20px;
  border-radius: 78px;
  background: none;
  border: 1px solid #5dc0c1;
  font-size: 15px;
  font-weight: 600;
  color: #5dc0c1;
  outline: none;
  cursor: pointer;
}
.details_button:hover {
  background: #5dc0c1;
  color: #fff;
}
.zpxx_outer {
  padding: 0 1.5% !important;
}
/*因边框原来的颜色设置的和鼠标经过时的背景颜色一致，因此鼠标经过时只需改背景无需改边框*/
.zpxx_outer:hover {
  background-color: #f0f0f0;
}
.zpxx_inner {
  border-bottom: 1px solid #f0f0f0;
  padding: 3vh 0;
}
.lxwmpc{
  margin-top:5ch
}
</style>
