<template>
<div class="all"><img style="width:100%;height:auto;"  v-lazy="pcurl+'img_banner_msds.png'">
      <!-- 介绍 -->
<Row class="cp_picture1 w">
    <Col>
       <div class="msds_intro">
           策安与权威的化学品数据库产品及服务提供商ChemWatch合作为我们的专业客户提供完整的MSDS数据库定制、集成、及推送服务，产品及服务涵盖100万个化学品的MSDS查询、标签查询、仓储管理、风险评估管理、MSDS制作、标签制作、法规查询以及物流管理。该服务配套软件可以切换近100个国家标准、47种语言，是中国政府首要认可的数据库，是国家安监局化学品登记中心（NRCC）、进出口检验检疫局（CIQ）、民航总局、海事局等政府机构广泛使用和认可的权威数据源。
       </div>
    </Col>
</Row>
    <div class="mds_zhcx">
    <p class="gold">GOLDFFX化学品综合查询管理软件</p>
    <Row class="cp_picture w" type="flex" algin="middle">
    <Col span="10"  offset="2">
        <div style="text-align: center;">
        <!-- <img v-lazy="msds1" class="gsjj_picture"> -->
        <img v-lazy="pcurl+'img_msds1.png'" class="gsjj_picture">
        </div>
    </Col>
        <Col span="11" offset="1" >
        <div >
        <p class="msds1_title">可查询80万种化学品的：</p>
            <p class="hxp_line"></p>
        <ul class="msds1_content">
            <li><i></i><span>专家 MSDS</span></li>
            <li><i></i><span>供应商 MSDS </span></li>
            <li><i></i><span>MINI MSDS</span> </li>
            <li><i></i><span>标签 </span></li>
            <li><i></i><span>生态、环境、毒理、运输、个人防护、医生建议、消防等报告</span></li>
            <li><i></i><span>仓储管理报告</span></li>
            <li><i></i><span>风险评估报告</span></li>
            <li><i></i><span>支持150个国家标准，54种语言</span></li>
        </ul>
        </div>
    </Col>
    </Row>
    </div>

    <div class="mds_zd">
    <p class="ryzz">AuthorITE  MSDS自动撰写软件</p>
    <Row class="cp_picture w">
        <Col span="11">
        <ul class="msds1_content" style="margin-top:7vh">
            <li><i></i><span> 软件自动撰写MSDS</span></li>
            <li><i></i><span>仅需几分钟便可撰写一份 MSDS </span></li>
            <li><i></i><span> 支持GHS，CLP(REACH)，DSD/DPD，WHIMS等各大安全生产  </span> </li>
            <li><i></i><span>及管理法律和标准  </span></li>
            <li><i></i><span>支持150个国家标准，54种语言</span></li>
        </ul>
    </Col>
    <Col span="11" offset="1" >
        <div style="text-align: center;">
        <!-- <img v-lazy="msds2" class="gsjj_picture"> -->
        <img v-lazy="pcurl+'img_msds2.png'" class="gsjj_picture">
        </div>
    </Col>
    </Row>
    </div>

    <div class="gold3">
    <p class="ryzz">Galleria化学品法规数据库</p>
    <Row class="cp_picture w">
        <Col span="11" offset="1" >
            <div style="text-align: center;">
            <!-- <img v-lazy="msds3" class="gsjj_picture"> -->
            <img v-lazy="pcurl+'img_msds3.png'" class="gsjj_picture">
            </div>
        </Col>
        <Col span="11" offset="1">
        <ul class="msds1_content" style="margin-top:5vh">
            <li><i></i><span>权威的化学品法规数据库 </span></li>
            <li><i></i><span>收录80多个国家的化学品相关法规</span></li>
            <li><i></i><span> 数据实时更新  </span> </li>
            <li><i></i><span> 收录REACH所有卷宗的数据库 </span></li>
        </ul>
    </Col>
    </Row>
    </div>
  <div class="mds_zd">
    <p class="ryzz">D-Gen化学品标签撰写软件</p>
    <Row class="cp_picture w" style="margin-top:5vh;">
        <!-- <Col span="8" offset="5" class="bq"> -->
        <Col span="12" >
        <ul class="msds1_content" style="margin-top:7vh">
                <li><i></i><span>40种标签模板 </span></li>
            <li><i></i><span>客户可以定制个性化模板  </span></li>
            <li><i></i><span> 可从您的ERP系统提取数据(使用说明、使用日期、产品批号等)</span> </li>
            <li><i></i><span> 可按照国际标准创建产品条码 – 包括二维码  </span></li>
            <li><i></i><span>支持多种语言和格式</span></li>
        </ul>
    </Col>
    <Col span="11" offset="1" >
        <div style="text-align: left;">
            <img v-lazy="pcurl+'img_msds4.png'" class="gsjj_picture">
         </div>
    </Col>
    </Row>
    </div>

    <div class="gold3">
    <p class="ryzz">COBRA化学品风险评估软件</p>
    <Row class="cp_picture w">
        <Col span="12"  >
            <div class="msds5"></div>
        </Col>
        <Col span="11" offset="1">
        <ul class="msds1_content" style="margin-top:7vh">
                <li><i></i><span>仅需30秒便可制作一份风险评估报告 </span></li>
            <li><i></i><span> 采用国际通用的ILO 和 UN 标准 </span></li>
            <li><i></i><span>  分级风险控制方案   </span> </li>
            <li><i></i><span> 可登录收纳 超过700,000 种化学品类别的数据库</span></li>
        </ul>
    </Col>
    </Row>
    </div>
</div>
</template>
<script>
export default {
  data() {
return {
  num:1,
  pcurl:'http://oss.chain-smart.com/assets/',
    columns1: [
                    {
                        title: '技术参数',
                        key: 'name'
                    },
                    {
                        title: '规格指标',
                        key: 'age'
                    },
        
                ],
                data1: [
                    {
                        name: '视频功能',
                        age: '5路高清广角夜视，256G SD卡',
                    },
                    {
                        name: '通信方式',
                        age: '4个(全网通)/北斗卫星报文',
                    },
                    {
                        name: '定位方式',
                        age: '北斗/GPS双模',
                    },
                      {
                        name: '工作温度',
                        age: '-20℃~+80℃',
                    },
                    {
                        name: '视频功能',
                        age: '24V车载电源/内置大容量备用电池',
                    },
             
                ],
                 data2: [
                    {
                        name: '能量响应范围',
                        age: '48Kev-1.5Mev',
                    },
                    {
                        name: '剂量率测量范围',
                        age: '1uSv/h-100mSv/h',
                    },
                    {
                        name: '通讯方式',
                        age: '2.4GHz/辅助卫星/辅助蜂窝',
                    },
                      {
                        name: '工作温度',
                        age: '-40℃~+80℃',
                    },
                    {
                        name: '防护等级',
                        age: 'IP67',
                    },
                    {
                        name: '防爆型式',
                        age: '本质安全型',
                    },
                    {
                        name: '供电',
                        age: '可更换电池(>45天)',
                    },
             
                ],
                data3: [
                    {
                        name: '通信方式',
                        age: '蜂窝/2.4GHz/RJ45',
                    },
                    {
                        name: '工作温度',
                        age: '-40℃~+80℃',
                    },
                    {
                        name: '供电',
                        age: '220v市电',
                    },
             
                ],
                 data4: [
                    {
                        name: '闪烁体类型',
                        age: 'Nal(TL)',
                    },
                    {
                        name: '闪烁体规格',
                        age: '25mm*25mm',
                    },
                    {
                        name: '剂量率测量范围',
                        age: '0-300Usv/h',
                    },
                    {
                        name: '定位方式',
                        age: '北斗/GPS双模',
                    },
                    {
                        name: '通信方式',
                        age: '蜂窝/窄带/2.4GHz',
                    },
                    {
                        name: '工作温度',
                        age: '-20℃~+60℃',
                    },
                    {
                        name: '供电',
                        age: '可更换电池',
                    },
             
                ],
                data5: [
                    {
                        name: 'PC端调度系统运行环境',
                        age: 'IE8(含)以上或chrome浏览器',
                    },
                    {
                        name: '移动运用APP运行环境',
                        age: '安卓4.4(含)或IOS9.0(含)以上版本',
                    }
             
                ],
        columns2: [
                    {
                        title: '系统',
                        key: 'name'
                    },
                    {
                        title: '应用环境',
                        key: 'age'
                    },
        
                ]
        
    }
  },
  methods: {
      getData(index) {
        this.num = index;
      },
},
  mounted: function() {
  }
}

</script>
<style scoped>
.ryzz{
  margin:0 auto;
  text-align:center;
  font-size:32px;
  font-weight: 600;
}
.gsjj_picture{
  width:auto;
 height:auto;
 max-width:100%;
 max-height:100%;
}
.cp_picture{
    margin-top:5vh;
}
.cp_picture1{
    margin-top:10vh;
}
.cptitle{
    font-size:17px;
    font-weight:bold;
}
.czzk{
font-size:12px;
font-weight:bold;
}
.yyfs{
margin-top:10px;
color:#555;
}
.tab{
margin-top:10px;
border:none;
border-right:none;
}

.jfbz{
    background: #F0F0F0;
}
.msds_intro{
font-size: 14px;
color: #808080;
text-align: justify;
line-height: 28px;
}
.mds_zhcx {
    margin: 6vh 0;
}
.gold{
font-size: 32px;
font-weight: 600;
text-align: center;
margin-top: 5vh;
}
.gold3 {
  margin: 10vh 0;
}
.msds1{
 background: url("http://oss.chain-smart.com/assets/img_msds1.png") no-repeat;
 padding-top:100%;
  background-size:contain;
}
.msds2{
 background: url("http://oss.chain-smart.com/assets/img_msds2.png") no-repeat;
 padding-top:100%;
  background-size:contain;
}
.msds3{
 background: url("http://oss.chain-smart.com/assets/img_msds3.png") no-repeat;
 padding-top:60%;
  background-size:contain;
}
.msds5{
 background: url("http://oss.chain-smart.com/assets/img_msds5.png") no-repeat;
 padding-top:60%;
  background-size:contain;
}
.msds4{
 background: url("http://oss.chain-smart.com/assets/img_msds4.png") no-repeat;
 padding-top:100%;
  background-size:contain;
}
.msds1_title{
font-size: 18px;
font-weight: 600;
}
.msds1_content{
font-size: 18px;
line-height: 6vh;
list-style: none;
}
.msds1_content li{
    display: flex; /*IE9下兼容不好*/
    display: -webkit-flex;/*webkit浏览器 safari*/
    align-items:center;
}
.msds1_content i{
    color: #5DC0C1;
    display:inline-block;
    width:5px;height:5px;border-radius:50%;
    background: #5DC0C1;
}
.msds1_content span{
  display:inline-block;
  margin-left:15px;
}
.hxp_line{
  border-bottom:1px solid #eee; 
  margin:1vh 0;
}
.mds_zd{
   background: #F0F0F0; 
   padding: 10vh 0;
}
</style>
