<template>
  <div class="indexPad">
    <div><img v-lazy="padurl+'img_banner_lianxiwomen@2x.png'"></div>
    <!-- 加入我们 -->
    <div class="aside1">
      <p class="f11 bold">{{recurits.rec_title}}</p>
      <p class="salary">{{recurits.rec_payment}}</p>
      <p class="line"></p>
      <p class="f11 bold">职位描述</p>
      <div
        class="gw_content linehei martop_m"
        v-html="recurits.rec_content"
      ></div>
      <!-- <p class="f10 bold gwyq">岗位描述</p>
<p v-html="recurits.rec_content"></p>
<p class="f10 bold gwyq">岗位要求</p>
<p v-html="recurits.demand"></p> -->
    </div>
    <div class="ptop1"></div>
    <div class="aside1 bold f11 cente">
      <p>如有意向，请将简历</p>
      <p>发送至邮箱：cj@chain-smart.com</p>
    </div>
  </div>
</template>
<script>
import { getJrwmDetail } from "@/api/api";
export default {
  data() {
    return {
         padurl:"http://oss.chain-smart.com/assetPad/",
      num: 1,
      rec_id: 1,
      recurits: {}
    };
  },
  methods: {
    getData(index) {
      this.num = index;
    },
    getList() {
      let param = {
        keyValue: this.rec_id
      };
      getJrwmDetail(param)
        .then(res => {
          var code = res.status;
          if (code == 200) {
            this.recurits = res.data.data.data;
          } else {
            this.$Message.error(res.data.error);
          }
        })
        .catch(error => {
          console.log(res.data.error);
        });
    }
  },
  mounted: function() {
    this.rec_id = this.$route.params.id;
    this.getList();
  }
};
</script>
<style scoped>
img {
  width: 100%;
  height: auto;
}
.salary {
  color: #5dc0c1;
  margin-top: 10px;
}
.gwyq {
  margin-top: 14px;
}
.cente {
  text-align: center;
}
</style>
