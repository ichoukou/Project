<template>
  <div class="all" ><img style="width:100%;height:auto;" v-lazy="pcurl+'img_banner_guanyucean.png'">
    <!-- 公司简介 -->
    <div class="w">
    <Row>
      <Col class="gsjj">
      <Row :gutter="24" type="flex" align="middle">
        <Col span="13">
        <p class="gsjj_title">公司简介</p>
        <p class="gsjj_content">上海策安能源科技有限公司（以下简称“策安”）成立于2010年，是上海市专精特新企业，高新技术成果转换项目落地企业、上海嘉定区小巨人企业。策安致力于企业级数字化HSE（健康、安全、环保）产品的研发与定制交付，是顶尖运营风险咨询商及权威标准发布机构DNV GL（挪威船级社）在国内数字化风险咨询领域的核心合作伙伴。策安的交付团队均来自行业顶尖的IT咨询商、标准制定机构及硬件研发厂商，并专注为石油、化工、煤矿、建筑、电力等高危行业客户提供更安全、更稳定、更智能的数字化HSE产品，同时我们也帮助制造、零售以及公共事业领域的客户实现更优良的HSE绩效。<br>策安的服务与产品涵盖HSE管理咨询以及HSE数字化产品两个领域，是国内少数专注在HSE领域，且具备全产业交付能力（Total Solution）的产品、服务提供商。<br><br>策安视生命、环境以及您的事业为无价之宝，守护生命、环境以及您事业就是守护您的未来，我们有信心将您前进道路上的运行风险转化为可持续发展的强大动力。</p>
        </Col>
        <Col span="11"> 
        <div class="gsjj_logo" ><img v-lazy="pcurl+'img_gongsijianjie.png'" class="gsjj_picture">
        </div>
        </Col>
      </Row>
      </Col>
    </Row>
    <Row>
      <Col>
      <div class="line"></div>
      </Col>
    </Row>
    <!-- 荣誉资质  -->
    <div class="ryzz_area">
      <p class="ryzz">荣誉资质</p>
      <Row class="ryzz_row">
        <Col >
        <Row :gutter="16">
          <div v-for="(item,index) in ryzzs">
          <Col span="6">
          <div class="ryzz_content">
            <img v-lazy="item.ry_img" class="gsjj_picture">
            <div class="ryzz_div1">
              <p class="ryzz_wz1">{{item.place}}</p>
              <p class="ryzz_wz1">{{item.company}}</p>
              <p class="ryzz_wz2">{{item.time}}</p>
            </div>
          </div>
          </Col>
          </div>
        </Row>
        </Col>
      </Row>
    </div>
    </div>
    <!-- 交付保障 -->
    <div class="jfbz">
      <p class="ryzz">交付保障</p>
      <Row class="ryzz_row">
        <Col class="w">
        <div class="ca_introduce">策安是英国UKAS ISO－9001认证企业，并与著名IT咨询及HSE风险评价机构、产品厂商保持紧密的合作关系，是包括凯捷咨询、惠普、IBM、挪威船级社、ChemWatch在内的IT咨询商、HSE风险产品厂商的战略合作伙伴。<br><br> 我们通过独特的“联合工业项目”帮助企业孵化“产业化项目”，不仅将孵化成果用于服务企业内部用户，而且将其拓广应用到外部市场，取得了良好的收益。策安注重新产品的研发，每年用于研发新品的费用高达总收入的10%以上，我们通过与著名风险咨询机构的“互融机制”保持自身对HSE风险咨询行业的专业灵敏度，确保自身的专业咨询、策划及开发能力始终位于行业前列水平。我们独有的跨平台“互融机制”保障的不仅仅是策安自身的服务及产品交付能力，而且对于客户来说，选择策安的意义在于选择了一个系统化的交付生态，我们的项目管控覆盖包括
          <span class="zysq">专员售前支持、交付质量管控、组织保障、交付时间保障、“0首付”提前进场交付、售后运维等多个阶段</span>，我们强大的跨平台交付调度及合作机制，能保证达成您对您产品及项目交付的期望。我们相信策安以及我们的交付生态系统有能力为您和您的事业保驾护航。
        </div>
        </Col>
      </Row>
      <Row class="ryzz_row">
        <Col class="w">
        <div style="text-align:center;"><img v-lazy="pcurl+'img_jiaofubaozhang.png'" class="gsjj_picture"></div>
        </Col>
      </Row>
    </div>
    <!-- 我们的客户 -->
    <div class="ryzz_area">
      <p class="ryzz">我们的客户</p>
      <Row class="ryzz_row">
        <Col class="w">
        <div class="ca_introduce">策安专注数字化HSE服务及产品交付，我们的客户涵盖石油、化工、工程、电力、制造、食品等行业，不同行业的客户无一不认同策安在数字化HSE领域内“深耕、创新、专业、务实”的交付价值观。以下是策安的部分客户。</div>
        </Col>
      </Row>
      <div class="kh_picture w">
          <ul>
          <li><img v-lazy="pcurl+'img_kehu1.png'" class="gsjj_picture"></li>
          <li><img v-lazy="pcurl+'img_kehu2.png'" class="gsjj_picture"></li>
          <li><img v-lazy="pcurl+'img_kehu3.png'" class="gsjj_picture"></li>
          <li><img v-lazy="pcurl+'img_kehu4.png'" class="gsjj_picture"></li>
          <li><img v-lazy="pcurl+'img_kehu5.png'" class="gsjj_picture"></li>
          <li><img v-lazy="pcurl+'img_kehu6.png'" class="gsjj_picture"></li>
          <li><img v-lazy="pcurl+'img_kehu7.png'" class="gsjj_picture"></li>
          <li><img v-lazy="pcurl+'img_kehu8.png'" class="gsjj_picture"></li>
          <li><img v-lazy="pcurl+'img_kehu9.png'" class="gsjj_picture"></li>
          <li><img v-lazy="pcurl+'img_kehu10.png'" class="gsjj_picture"></li>
         <li><img v-lazy="pcurl+'img_kehu11.png'" class="gsjj_picture"></li>
          <li><img v-lazy="pcurl+'img_kehu12.png'" class="gsjj_picture"></li>
          <div style="clear:both"></div>
          </ul>
        </div>
    </div>
  </div>
</template>
<script>
import * as data from '@/components/data/data';
export default {
  data() {
    return {
        pcurl:'http://oss.chain-smart.com/assets/',
      ryzzs:data.ryzzs,
      gsjj:require('@/assets/img_gongsijianjie.png'),
      // jfbz:require('@/assets/img_jiaofubaozhang.png'),
      // img1:require('@/assets/img_kehu1.png'),
      // img2:require('@/assets/img_kehu2.png'),
      // img3:require('@/assets/img_kehu3.png'),
      // img4:require('@/assets/img_kehu4.png'),
      // img5:require('@/assets/img_kehu5.png'),
      // img6:require('@/assets/img_kehu6.png'),
      // img7:require('@/assets/img_kehu7.png'),
      // img8:require('@/assets/img_kehu8.png'),
      // img9:require('@/assets/img_kehu9.png'),
      // img10:require('@/assets/img_kehu10.png'),
      // img11:require('@/assets/img_kehu11.png'),
      // img12:require('@/assets/img_kehu12.png'),
    }
  },
  methods: {

  },
  mounted() {
  }
}

</script>
<style scoped>
/* 公司简介 */
.gsjj {
  box-shadow: 0 1px 20px 0 rgba(0, 0, 0, 0.1);
  margin-top: 10vh;
  padding: 30px 30px 30px 40px;
}
.gsjj_title {
  font-size: 32px;
  font-weight: 600;
  margin-top: -2vh;
}
.gsjj_content {
  font-size: 14px;
  color: #808080;
  line-height: 24px;
  margin-top: 1.5vh;
}
.gsjj_picture {
  width:100%;
  /* width: auto;
  height: auto;
  max-width: 100%;
  max-height: 100%; */
}
.line {
  border: 0.5px solid #eee;
  margin-top: 10vh;
}
/* 荣誉资质  */

.ryzz_area {
  margin: 10vh 0;
}
.ryzz {
  margin: 0 auto;
  text-align: center;
  font-size: 32px;
  font-weight: 600;
}
.ryzz_content {
  text-align: center;
}
.ryzz_div1 {
  position: absolute;
  width: 100%;
  padding: 1vh 0;
  top: 50%;
  left: 50%;
  transform: translateX(-50%) translateY(-50%); /*IE10 firefox Opera*/
  -webkit-transform: translateX(-50%) translateY(-50%); /*chrome safari*/
  -ms-transform: translateX(-50%) translateY(-50%); /*IE9及之前*/
}
.ryzz_wz1 {
  font-size: 16px;
  font-weight: 600;
}
.ryzz_wz2 {
  font-size: 18px;
  color: #808080;
}
.ryzz_row {
  margin-top: 4vh;
}
.jfbz {
  background: #f0f0f0;
  padding: 10vh 0;
}
.ca_introduce {
  font-size: 14px;
  line-height: 28px;
  text-align: justify;
  color: #808080;
}
.zysq {
  font-weight: 600;
}
.kh_picture {
  margin-top: 3vh;
}
.kh_picture li{
float:left;
width:18%;
margin-left:2.5%;
}
.kh_picture li:first-child{
margin-left:0;
}
.kh_picture li:nth-child(6){
margin-left:0;
}
.kh_picture li:nth-child(11){
margin-left:0;
}
.gsjj_logo {
  text-align: center;
  margin: 2vh 0;
}
</style>
