<template>
  <div class="all"><img style="width:100%;height:auto;" v-lazy="pcurl+'img_banner_kehuanli.png'">
    <div class="khal_area">
      <!-- 图片内容 -->
      <Row class="ryzz_row w">
        <Col>
          <div class="khal_pc_outer">
            <div v-for="(item,index) in cases" v-if="item.state=='启用'" class="ryzz_content" @click="khaldetail(item.case_id)">
              <!-- <div>{{item.case_img_pc}}</div> -->
              <div style="overflow: hidden;"><img v-lazy="item.case_img_pc"  class="pckhimg"></div>
              <div class="ryzz_wz">
                <p class="ryzz_wz1">{{item.case_title}}</p>
                <p class="ryzz_wz2" style="height:80px;" v-if="item.case_synopsis.length>50">{{item.case_synopsis.slice(0,50)}}...</p>
                <p class="ryzz_wz2" style="height:80px;"  v-else>{{item.case_synopsis}}</p>
              </div>
            </div>
          </div>
        </Col>
      </Row>
    </div>
  </div>
</template>
<script>
import { getKhal } from '@/api/api';
export default {
  data() {
    return {
      num: 1,
      cases: [],
      pcurl:'http://oss.chain-smart.com/assets/',
    }
  },
  methods: {
    getData(index) {
      this.num = index;
    },
    khaldetail(id) {
      this.$router.push({ name: 'khaldetail', params: { id: id } });
    },
    getList() {
      getKhal().then(res => {
        var code = res.status;
        if (code == 200) {
          let dataList = res.data.data.rows.dataList;
          this.cases=dataList;
        } else {
          this.$Message.error(res.data.error);
        }
      })
        .catch(error => {
          console.log(res.data.error);
        });
    }
  },
  mounted() {
    this.getList();
  }
}

</script>
<style scoped>
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
.khal_pc_outer {
  display: flex;
  display: -webkit-flex;
  justify-content: space-between;
  align-items: center;
  flex-wrap: wrap;
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
  width: 32%;
  margin: 4vh 0;
  cursor: pointer;
}

.ryzz_wz1 {
  font-size: 18px;
  font-weight: 600;
  margin-top: 2vh;
}
.ryzz_wz2 {
  color: #808080;
  font-size: 14px;
  margin-top: 2vh;
  line-height: 28px;
}
.pckhimg{
   /* width: 100%;
  height: auto;
  max-width: 100%;
  max-height: 100%; */
  width:100%;height:auto;
  display: block;transition-duration:0.5s;
  transition-timing-function:linear;
  }
.pckhimg:hover{transform:scale(1.2, 1.2);} 
</style>
