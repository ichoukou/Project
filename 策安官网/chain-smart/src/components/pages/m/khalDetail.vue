<template>
  <div class="indexBody">
    <div><img v-lazy="murl+'img_banner_khal@3x.png'"></div>
    <!-- 客户案例详情 -->
    <div class="aside1">
      <p class="f12 bold">{{caseDetail.case_title}}</p>
      <p class="ptop justify khdetail_content_m colorCon f9" v-html="caseDetail.case_content">
      </p>
    </div>
  </div>
</template>
<script>
import { getKhalDeatail, getImg } from "@/api/api";
export default {
  data() {
    return {
       murl:"http://oss.chain-smart.com/assetM/",
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
  mounted: function() {
    this.case_id = this.$route.params.id;
    this.getList();
  }
};
</script>
<style scoped>
img {
  width: 100%;
  height: auto;
}
.khdetail_content_m {
  line-height: 26px;
}
</style>
