<template>
  <div class="indexPad">
    <div ><img v-lazy="padurl+'img_banner_guanyucean@2x.png'"></div>
    <!-- 公司简介 -->
    <div class="wraper">
      <p class="gsjj bold">公司简介</p>
      <div class="flex justbetween">
        <p class="cpContent justify colorCon linehei" style="width:50%;">上海策安能源科技有限公司（以下简称“策安”）成立于2010年，是上海市专精特新企业，高新技术成果转换项目落地企业、上海嘉定区小巨人企业。策安致力于企业级数字化HSE（健康、安全、环保）产品的研发与定制交付，是顶尖运营风险咨询商及权威标准发布机构DNV GL（挪威船级社）在国内数字化风险咨询领域的核心合作伙伴。策安的交付团队均来自行业顶尖的IT咨询商、标准制定机构及硬件研发厂商，并专注为石油、化工、煤矿、建筑、电力等高危行业客户提供更安全、更稳定、更智能的数字化HSE产品，同时我们也帮助制造、零售以及公共事业领域的客户实现更优良的HSE绩效。 
        <div class="peixun" style="width:45%;margin-top:14px;"><img v-lazy="padurl+'img_gongsijianjie@2x.png'"></div>
      </div>
      <p class="justify colorCon linehei">策安的服务与产品涵盖HSE管理咨询以及HSE数字化产品两个领域，是国内少数专注在HSE领域，且具备全产业交付能力（Total Solution）的产品、服务提供商。<br><br>
        策安视生命、环境以及您的事业为无价之宝，守护生命、环境以及您事业就是守护您的未来，我们有信心将您前进道路上的运行风险转化为可持续发展的强大动力。
      </p>
    </div>
    <!-- 荣誉资质 -->
    <div class="rypad">
      <p class="ryTitle bold">荣誉资质</p>
      <!-- 轮播 -->
      <div class="swiper-container padrycontainer">
        <div class="swiper-wrapper padryslide">
          <div class="swiper-slide" style="position:relative" v-for="(item,index) in ryzzs " v-if="index<=6">
            <!-- <img v-lazy="item.ry_img"> -->
            <img :src="item.ry_img">
            <div class="ryzz_div1">
              <p class="ryzz_wz1">{{item.place}}</p>
              <p class="ryzz_wz1">{{item.company}}</p>
              <p class="ryzz_wz2">{{item.time}}</p>
            </div>
          </div>
        </div>
        <div class="swiper-pagination"></div>
      </div>

    </div>
    <!-- 交付保障 -->
    <div class="bggray rypad">
      <p class="gsjj bold">交付保障</p>
      <p class="cpContent justify colorCon linehei">策安是英国UKAS ISO－9001认证企业，并与著名IT咨询及HSE风险评价机构、产品厂商保持紧密的合作关系，是包括凯捷咨询、惠普、IBM、挪威船级社、ChemWatch在内的IT咨询商、HSE风险产品厂商的战略合作伙伴。
        <br><br>
        我们通过独特的“联合工业项目”帮助企业孵化“产业化项目”，不仅将孵化成果用于服务企业内部用户，而且将其拓广应用到外部市场，取得了良好的收益。策安注重新产品的研发，每年用于研发新品的费用高达总收入的10%以上，我们通过与著名风险咨询机构的“互融机制”保持自身对HSE风险咨询行业的专业灵敏度，确保自身的专业咨询、策划及开发能力始终位于行业前列水平。我门独有的跨平台“互融机制”保障的不仅仅是策安自身的服务及产品交付能力，而且对于客户来说，选择策安的意义在于选择了一个系统化的交付生态，我们的项目管控覆盖包括<b style="color:#111111">专员售前支持、交付质量管控、组织保障、交付时间保障、“0首付”提前进场交付、售后运维</b>等多个阶段，我们强大的跨平台交付调度及合作机制，能保证达成您对您产品及项目交付的期望。我们相信策安以及我们的交付生态系统有能力为您和您的事业保驾护航。
      </p>
      <div class="jfLogo"><img v-lazy="padurl+'img_jiaofubaozhang@2x.png'"></div>
    </div>
    <!-- 我们的客户 -->
    <div class="aside1">
      <p class="gsjj bold">我们的客户</p>
      <p class="cpContent justify colorCon linehei">策安专注数字化HSE服务及产品交付，我们的客户涵盖石油、化工、工程、电力、制造、食品等行业，不同行业的客户无一不认同策安在数字化HSE领域内“深耕、创新、专业、务实”的交付价值观。以下是策安的部分客户。</p>
      <div class="khall">
        <div class="wmkh"><img v-lazy="padurl+'img_kehu1@2x.png'"></div>
        <div class="wmkh"><img v-lazy="padurl+'img_kehu2@2x.png'"></div>
        <div class="wmkh"><img v-lazy="padurl+'img_kehu3@2x.png'"></div>
        <div class="wmkh"><img v-lazy="padurl+'img_kehu4@2x.png'"></div>
      </div>
      <div class="khall">
        <div class="wmkh"><img v-lazy="padurl+'img_kehu5@2x.png'"></div>
        <div class="wmkh"><img v-lazy="padurl+'img_kehu6@2x.png'"></div>
        <div class="wmkh"><img v-lazy="padurl+'img_kehu7@2x.png'"></div>
        <div class="wmkh"><img v-lazy="padurl+'img_kehu8@2x.png'"></div>
      </div>
      <div class="khall">
        <div class="wmkh"><img v-lazy="padurl+'img_kehu10@2x.png'"></div>
        <div class="wmkh"><img v-lazy="padurl+'img_kehu11@2x.png'"></div>
        <div class="wmkh"><img v-lazy="padurl+'img_kehu12@2x.png'"></div>
        <div class="wmkh"><img v-lazy="padurl+'img_kehu13@2x.png'"></div>
      </div>
    </div>
  </div>
</template>
<script>
import Swiper from 'swiper';
import * as data from '@/components/data/data';
export default {
  data() {
    return {
         padurl:"http://oss.chain-smart.com/assetPad/",
      ryzzs:data.ryzzsPad,
    }
  },
  methods: {
  },
  mounted() {
    //荣誉资质轮播
    new Swiper('.padrycontainer', {
      autoplay: 3000,
      loop: true,
      slidesPerView: 3,
      direction: 'horizontal',
      centeredSlides: true,
      autoplayDisableOnInteraction : false,
      pagination: '.swiper-pagination',
      spaceBetween : '1%',
      
      //以下是swiper4下的用法
      // loop: true,
      // autoplay: {
      //   disableOnInteraction: false,
      // },
      // delay:3000,
      // direction: 'horizontal',
      // slidesPerView: 3,
      // spaceBetween: '1%',
      // centeredSlides: true,
      // pagination: '.swiper-pagination',
    })
  }
}

</script>
<style scoped>
img {
  width: 100%;
  height: auto;
}
.gycaLogo {
  width: 100%;
}
.gsjj {
  font-size: 1.1rem;
  padding-top: 0.8rem;
}
.ryzz {
  width: 70%;
}
.ryzzBody {
  display: flex;
  justify-content: center;
}
.rypad {
  padding: 1.5rem 3%;
}
.ryTitle {
  font-size: 1.3rem;
  margin-bottom: 0.9rem;
}
.padrycontainer {
  width: 100%;
  /* padding-top: 10px; */
  /* padding-bottom: 50px; */
  padding-bottom: 30px;
}
.padrycontainer .swiper-pagination-bullets {
    bottom: 0.2rem;
}
.padryslide > .swiper-slide {
  background-position: center;
  background-size: contain;
  /* width: 30%; */
  /* height: auto; */
}
.wmkh {
  width: 23%;
}
.khall {
  display: flex;
  justify-content: space-between;
}
.ryzz_div1 {
  position: absolute;
  width: 100%;
  top: 28%;
  text-align: center;
}
.ryzz_wz1 {
  font-size: 1rem;
  font-weight: 600;
}
.ryzz_wz2 {
  font-size: 1rem;
  color: #808080;
}
</style>
