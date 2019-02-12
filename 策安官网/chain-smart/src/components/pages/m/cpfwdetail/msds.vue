<template>
  <div class="indexBody">
    <div><img v-lazy="murl+'img_banner_msds@3x.png'"></div>
    <div class="aside1">
      <p class="justify colorCon linehei f9">策安与权威的化学品数据库产品及服务提供商ChemWatch合作为我们的专业客户提供完整的MSDS数据库 定制、集成、及推送服务，产品及服务涵盖100万个化学品的MSDS查询、标签查询、仓储管理、风险评估管理 、MSDS制作、标签制作、法规查询以及物流管理。该服务配套软件可以切换近100个国家标准、47种语言，是中国政府首要认可的数据库，是国家安监局化学品登记中心（NRCC）、进出口检验检疫局（CIQ）、民航总局、海 事局等政府机构广泛使用和认可的权威数据源。
      </p>
    </div>
    <!-- 化学软件 -->
    <div class="ptop1"></div>
<!-- 化学软件1 -->
    <div class="aside2">
      <p class="f12 bold">GOLDFFX化学品综合查询管理软件</p>
      <div class="pad10 wid70 "><img v-lazy="murl+'img_msds1@3x.png'"></div>
      <p class="f10 bold">可查询80万种化学品的：</p>
      <div class="line"></div>
      <div class="pad10">
        <p>
          <span>专家 MSDS</span>
        </p>
      </div>
      <div class="pad10">
        <p>
          <span>供应商 MSDS</span>
        </p>
      </div>
      <div class="pad10">
        <p>
          <span>MINI MSDS</span>
        </p>
      </div>
      <div class="pad10">
        <p>
          <span>标签</span>
        </p>
      </div>
      <div class="pad10">
        <p>
          <span>生态、环境、毒理、运输、个人防护、医生建议、消防等报告</span>
        </p>
      </div>
      <div class="pad10">
        <p>
          <span>仓储管理报告</span>
        </p>
      </div>
      <div class="pad10">
        <p>
          <span>风险评估报告</span>
        </p>
      </div>
      <div class="pad10">
        <p>
          <span>支持150个国家标准，54种语言</span>
        </p>
      </div>
    </div>
<!-- 化学软件2 -->
    <div class="aside2 bggray">
      <p class="f12 bold">AuthorITE  MSDS自动撰写软件</p>
      <div class="pad10 wid80"><img v-lazy="murl+'img_msds2@3x.png'"></div>
     <div class="pad10">
        <p>
          <span>软件自动撰写MSDS</span>
        </p>
      </div>
      <div class="pad10">
        <p>
          <span>仅需几分钟便可撰写一份 MSDS供应商 MSDS</span>
        </p>
      </div>
      <div class="pad10">
        <p>
          <span>支持GHS，CLP(REACH)，DSD/DPD，WHIMS等各大安全生产
及管理法律和标准</span>
        </p>
      </div>
      <div class="pad10">
        <p>
          <span>支持150个国家标准，54种语言</span>
        </p>
      </div>
  </div>
<!-- 化学软件3 -->
    <div class="aside2">
      <p class="f12 bold">Galleria化学品法规数据库</p>
      <div class="pad10 wid80"><img v-lazy="murl+'img_msds3@3x.png'"></div>
     <div class="pad10">
        <p>
          <span>权威的化学品法规数据库</span>
        </p>
      </div>
      <div class="pad10">
        <p>
          <span>收录80多个国家的化学品相关法规</span>
        </p>
      </div>
      <div class="pad10">
        <p>
          <span>数据实时更新</span>
        </p>
      </div>
      <div class="pad10">
        <p>
          <span>收录REACH所有卷宗的数据库</span>
        </p>
      </div>
  </div>
<!-- 化学软件4-->
    <div class="aside2 bggray">
      <p class="f12 bold">D-Gen化学品标签撰写软件</p>
      <div class="pad10 wid30"><img v-lazy="murl+'img_msds4@3x.png'"></div>
     <div class="pad10">
        <p>
          <span>40种标签模板 </span>
        </p>
      </div>
      <div class="pad10">
        <p>
          <span>客户可以定制个性化模板</span>
        </p>
      </div>
      <div class="pad10">
        <p>
          <span>可从您的ERP系统提取数据(使用说明、使用日期、产品批号等)数据实时更新</span>
        </p>
      </div>
      <div class="pad10">
        <p>
          <span>可按照国际标准创建产品条码 – 包括二维码</span>
        </p>
      </div>
        <div class="pad10">
        <p>
  <span>支持多种语言和格式</span>
        </p>
      </div>
  </div>
<!-- 化学软件5-->
    <div class="aside2">
      <p class="f12 bold">COBRA化学品风险评估软件</p>
      <div class="pad10 wid80"><img v-lazy="murl+'img_msds5@3x.png'"></div>
     <div class="pad10">
        <p>
          <span>仅需30秒便可制作一份风险评估报告</span>
        </p>
      </div>
      <div class="pad10">
        <p>
          <span>采用国际通用的ILO 和 UN 标准</span>
        </p>
      </div>
      <div class="pad10">
        <p>
          <span>采用国际通用的ILO 和 UN 标准</span>
        </p>
      </div>
      <div class="pad10">
        <p>
          <span>可登录收纳 超过700,000 种化学品类别的数据库</span>
        </p>
      </div>
  </div>

 </div>
</template>
<script>
export default {
  data() {
    return {
       murl:"http://oss.chain-smart.com/assetM/",
    }
  },
  methods: {
  },
  mounted () {
  }
}

</script>
<style scoped>
img {
  width: 100%;
  height: auto;
}
.wid70 {
  width: 70%;
  margin: 0 auto;
}
.wid80 {
  width: 80%;
  margin: 0 auto;
}
.pad10 > p {
  position: relative;
  /* border:1px solid #000; */
  width:100%;
  font-size:0.9rem;
}
.pad10 > p span {
  margin-left: 10%;
  display: inline-block;
}
.pad10 > p::before {
  content: url("http://oss.chain-smart.com/assetM/icon_msds_yuan.png");
  color: blue;
  position: absolute;
}
.wid30{
  width:30%;
  margin: 0 auto;
}
</style>
