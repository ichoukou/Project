<template>
  <div class="all"><img
      style="width:100%;"
      src="http://oss.chain-smart.com/assets/img_banner_kehuanli.png"
    >
    <div style="margin-bottom:10vh" class="w">
    <Row  style="padding-top:10vh">
      <Col >
      <p class="whxm">{{caseDetail.case_title}}</p>
      </Col>
    </Row>
    <Row class="khdetail_content">
      <Col >
      <p class="ryzz_wz2" v-html="caseDetail.case_content"></p>
      </Col>
    </Row>
    <!-- <Row>
      <Col span="16" offset="4">
      <div><img src="http://oss.chain-smart.com/assets/img_anlixiangqing1.png" class="gsjj_picture" style="margin-top:5vh"></div>
      </Col>
    </Row> -->
    <!-- <Row>
      <Col span="16" offset="4" class="ryzz_wz2" style="margin-top: 5vh"> 公司讯，上海策安于2017年3月与万华化学集团签订移动执法平台项目合同，计划通过6个月时间的定制工作为万华化学集团提供一套集安全管理、生产管理、移动监察于一体的移动管理平台。该平台的成功上线将有力提升万华化学集团在生产移动监管执法过程中的便统一性和捷性。 万华化学集团股份有限公司（简称“万华化学”），是中国少有的一家拥有MDI制造技术自主知识产权的企业，经过近40年的发展，万华化学已成为技术先进、产能较大、颇具综合竞争力的MDI供应商，拥有较大规模、工艺先进、配套完整的C3/C4石化产业链，是产业链完整、品种齐全的ADI制造商，全球第二大TPU制造商，国内较大PUD制造商，国内较大聚醚多元醇与聚氨酯系统料制造商。 公司讯，上海策安于2017年3月与万华化学集团签订移动执法平台项目合同，计划通过6个月时间的定制工作为万华化学集团提供一套集安全管理、生产管理、移动监察于一体的移动管理平台。该平台的成功上线将有力提升万华化学集团在生产移动监管执法过程中的便统一性和捷性。 万华化学集团股份有限公司（简称“万华化学”），是中国少有的一家拥有MDI制造技术自主知识产权的企业，经过近40年的发展，万华化学已成为技术先进、产能较大、颇具综合竞争力的MDI供应商，拥有较大规模、工艺先进、配套完整的C3/C4石化产业链，是产业链完整、品种齐全的ADI制造商，全球第二大TPU制造商，国内较大PUD制造商，国内较大聚醚多元醇与聚氨酯系统料制造商。
      </Col>
    </Row> -->

    <!-- <Row class="ryzz_row" style="margin-top: 5vh">
      <Col span="16" offset="4">
      <Row :gutter="16">
        <Col span="8">
        <div class="ryzz_content"><img src="../../../assets/img_anlixiangqing2.png" class="gsjj_picture">
        </div>
        </Col>
        <Col span="8">
        <div><img src="../../../assets/img_anlixiangqing3.png" class="gsjj_picture">
        </div>
        </Col>
        <Col span="8">
        <div><img src="../../../assets/img_anlixiangqing4.png" class="gsjj_picture">
        </div>
        </Col>
      </Row>
      </Col>
    </Row> -->
    <!-- <Row>
      <Col span="16" offset="4" class="ryzz_wz2" style="margin-top: 5vh"> 公司讯，上海策安于2017年3月与万华化学集团签订移动执法平台项目合同，计划通过6个月时间的定制工作为万华化学集团提供一套集安全管理、生产管理、移动监察于一体的移动管理平台。该平台的成功上线将有力提升万华化学集团在生产移动监管执法过程中的便统一性和捷性。 万华化学集团股份有限公司（简称“万华化学”），是中国少有的一家拥有MDI制造技术自主知识产权的企业，经过近40年的发展，万华化学已成为技术先进、产能较大、颇具综合竞争力的MDI供应商，拥有较大规模、工艺先进、配套完整的C3/C4石化产业链，是产业链完整、品种齐全的ADI制造商，全球第二大TPU制造商，国内较大PUD制造商，国内较大聚醚多元醇与聚氨酯系统料制造商。 公司讯，上海策安于2017年3月与万华化学集团签订移动执法平台项目合同，计划通过6个月时间的定制工作为万华化学集团提供一套集安全管理、生产管理、移动监察于一体的移动管理平台。该平台的成功上线将有力提升万华化学集团在生产移动监管执法过程中的便统一性和捷性。 万华化学集团股份有限公司（简称“万华化学”），是中国少有的一家拥有MDI制造技术自主知识产权的企业，经过近40年的发展，万华化学已成为技术先进、产能较大、颇具综合竞争力的MDI供应商，拥有较大规模、工艺先进、配套完整的C3/C4石化产业链，是产业链完整、品种齐全的ADI制造商，全球第二大TPU制造商，国内较大PUD制造商，国内较大聚醚多元醇与聚氨酯系统料制造商。
      </Col>
    </Row> -->
    </div>
  </div>
</template>
<script>
import { getKhalDeatail, getImg } from "@/api/api";
export default {
  data() {
    return {
      num: 1,
      case_id: 1,
      caseDetail: {},
      contentDis: "inline",
      imgurl: ""
    };
  },
  methods: {
    getData(index) {
      this.num = index;
    },
    getList() {
      let param = {
        keyValue: this.case_id
      };
      getKhalDeatail(param)
        .then(res => {
          var code = res.status;
          if (code == 200) {
            this.caseDetail = res.data.data.data;
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
    this.case_id = this.$route.params.id;
    this.getList();
  }
};
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
.gsjj_picture {
  width: auto;
  height: auto;
  max-width: 100%;
  max-height: 100%;
}
.ryzz_wz1 {
  font-size: 14px;
  font-weight: bold;
}

.ryzz_wz2 {
  color: #808080;
  font-size: 14px;
}

.whxm {
  font-size: 32px;
  font-weight: 600;
  line-height: 28px;
}
.khdetail_content {
  margin-top: 5vh;
}

</style>
