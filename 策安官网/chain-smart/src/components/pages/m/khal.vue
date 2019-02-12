<template>
  <div class="indexBody">
    <div><img v-lazy="murl+'img_banner_khal@3x.png'"></div>
    <!-- 内容 -->
    <div class="aside1">
      <div class="wraper1 flex" style="align-items:center;" v-for="(item,index) in cases"   @click="khalDetail(item.case_id)">
        <!-- <div class="khalWidth"><img v-lazy="item.case_img_mobile"></div> -->
        <img v-lazy="item.case_img_mobile" class="khalWidth" style="width:25%;height:auto;">
        <div class="khalContent">
          <p class="f10 bold">{{item.case_title}}</p>
          <p class="colorCon martop_m" v-if="item.case_synopsis.length>50">{{item.case_synopsis.slice(0,50)}}...</p>
          <p class="colorCon martop_m" v-else>{{item.case_synopsis}}</p>
        </div>
      </div>
    </div>
    <p class="loadmore" v-show="loadmore" @click="jzgd()">{{moredata}}</p>
  </div>
</template>
<script>
import { getKhal } from "@/api/api";
// import * as data from '@/components/data/data';
export default {
  data() {
    return {
       murl:"http://oss.chain-smart.com/assetM/",
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
    getData(index) {
      this.num = index;
    },
    khalDetail(id) {
      this.$router.push({ name: "mkhalDetail", params: { id: id } });
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
            this.cases = res.data.data.rows.dataList;
             if(this.cases.length>4){
             this.loadmore=true;
             }
         let records=res.data.data.rows.pagination.totalRecords;
        if(records<=this.page.pageSize){
           this.moredata="暂无客户案例";
          }else{
            this.moredata="点击加载更多";
          }
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
    this.getList();
  }
};
</script>
<style scoped>
img {
  width: 100%;
  height: auto;
}
</style>
