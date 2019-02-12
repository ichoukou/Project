<template>
  <div class="indexPad">
    <div><img v-lazy="padurl+'img_banner_kehuanli@2x.png'"></div>
    <!-- 客户案例详情 -->
    <div class="aside1">
      <p  class="f11 bold">{{caseDetail.case_title}}</p>
      <p class="ptop justify khdetail_content_pad colorCon" v-html="caseDetail.case_content">
      </p>
    </div>
  </div>
</template>
<script>
import { getKhalDeatail,getImg } from "@/api/api";
export default {
  data() {
    return {
         padurl:"http://oss.chain-smart.com/assetPad/",
      num: 1,
                  case_id:1,
      caseDetail:{},
         contentDis:"inline",
      imgurl:'',
    };
  },
  methods: {
    getData(index) {
      this.num = index;
    },
         getList() {
      let param = {
        keyValue: this.case_id,
      };
      getKhalDeatail(param).then(res => {
          var code = res.status;
          if (code == 200) {
                this.caseDetail = res.data.data.data;
            let imgobj=JSON.parse(res.data.data.data.news_img);
            this.imgurl=getImg(imgobj[0].fileId);
          } else {
            this.$Message.error(res.data.error);
          }
        })
        .catch(error => {
          this.$Message.error(res.data.error);
        });
  },
  },
  mounted: function () {
     this.case_id=this.$route.params.id;
 this.getList();
  }
};
</script>
<style scoped>
img {
  width: 100%;
  height: auto;
}
.khdetail_content_pad {
  line-height: 26px;
}
</style>
