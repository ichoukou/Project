<template>
  <div class="indexPad">
    <div><img v-lazy="padurl+'img_banner_kehuanli@2x.png'"></div>
    <!-- <div class="new_pad" style="border-top:none;font-size:1.1rem">
      <p
        :class="{active:num == 1}"
        @click="getData(1)"
      >污水处理</p>
      <p
        :class="{active:num == 2}"
        @click="getData(2)"
      >核辐射监测</p>
      <p
        :class="{active:num == 3}"
        @click="getData(3)"
      >海洋资源监控</p>
    </div> -->
    <!-- 内容 -->
    <Row class="ryzz_row">
      <Col
        span="22"
        offset="1"
      >
      <Row :gutter="16" >
        <div
          v-for="(item,index) in cases"
          @click="khalDetail(item.case_id)"
        >
          <Col
            span="8"
            class="ryzz_content"
          >
          <div>
            <!-- <img v-lazy="item.case_img" class="gsjj_picture"> -->
            <img
              :src="item.case_img_pad"
              class="gsjj_picture"
            >
            <div class="ryzz_wz">
              <p class="ryzz_wz1">{{item.case_title}}</p>
              <p class="ryzz_wz2" v-if="item.case_synopsis.length>48">{{item.case_synopsis.slice(0,48)}}...</p>
              <p class="ryzz_wz2" v-else>{{item.case_synopsis}}</p>
            </div>
          </div>
          </Col>
        </div>
        <!-- <Col span="8" class="ryzz_content">
          <div>
            <img src="../../../assets/khal2.png" class="gsjj_picture">
            <div class="ryzz_wz">
              <p class="ryzz_wz1">安全质量监控平台系统</p>
              <p class="ryzz_wz2">承包商的全生命周期管理，管理对象包括人员、机具、设施等；管理业务包含入场，现场施工，奖罚及考核，出场。</p>
            </div>
          </div>
          </Col>-->

      </Row>
      </Col>
    </Row>
  <p class="loadmore" v-show="loadmore" @click="jzgd()">{{moredata}}</p>
  </div>
</template>
<script>
import { getKhal } from "@/api/api";
import * as data from "@/components/data/data";
export default {
  data() {
    return {
         padurl:"http://oss.chain-smart.com/assetPad/",
      num: 1,
      cases: [],
         loadmore:false,
       moredata:'点击加载更多',
           page: {
        total: 0,
        current: 1,
        pageSize: 5
      },
    };
  },
  methods: {
        jzgd(){
      this.page.pageSize= this.page.pageSize * 2;
this.getList()
    },
    getList() {
             let param = {
         pageNo:this.page.current,
        pageSize:this.page.pageSize,
       query:[{"query_condition":"=", "control_type":"selector","field_code":"state","value":"1"}]
       }
      getKhal(param)
        .then(res => {
          var code = res.status;
          if (code == 200) {
          this.cases= res.data.data.rows.dataList;
              if(this.cases.length>4){
             this.loadmore=true;
             }
         let records=res.data.data.rows.pagination.totalRecords;
        if(records<=this.page.pageSize){
           this.moredata="暂无客户案例";
          }else{
            this.moredata="点击加载更多";
          }
            // this.cases = dataList.map(item => {
            //   let obj = item;
            //   let imgId = JSON.parse(item.case_img_pad)[0].fileId;
            //   obj.imgUrl = `http://47.92.141.242:8888/website/file/getFileById/?contentDis=inline&fileId=${imgId}`;
            //   return obj;
            // });
          } else {
            this.$Message.error(res.data.error);
          }
        })
        .catch(error => {
          console.log(res.data.error);
        });
    },
    khalDetail(id) {
      this.$router.push({ name: "padkhalDetail", params: { id: id } });
    },
    getData(index) {
      this.num = index;
    }
  },
  mounted: function() {
    this.getList();
  }
};
</script>
<style scoped>
img {
  width: 100%;
  height: auto;
}
.khal_area {
  margin: 6vh 0;
}
.kjzc {
  margin-top: 10vh;
  margin-bottom: 5vh;
}
.kjzc .zc {
  cursor: pointer;
}
.kjzc .zc span {
  font-size: 16px;
  color: #cccccc;
}
.kjzc .active span {
  color: #68c4c5;
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
.ryzz_content {
  margin-top: 3vh;
}
.gsjj_picture {
  width: auto;
  height: auto;
  max-width: 100%;
  max-height: 100%;
}
.ryzz_row {
   margin: 3vh 0;
}
.ryzz_wz1 {
  /* font-size: 0.9rem; */
  font-weight: bold;
  margin: 10px 0;
}
.ryzz_wz2 {
  color: #808080;
  font-size: 0.8rem;
  line-height: 24px;
}
.loadmore{
margin:20px 0;font-size:1rem;
}
</style>
