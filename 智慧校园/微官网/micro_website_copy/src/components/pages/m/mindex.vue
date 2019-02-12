<template>

<div class="mall">
  <div ><img src="../../../assets/banner.jpg"/> </div>
   <!-- <div ><img src="http://res.weiunity.com/template/xuexiao1/images/a01.jpg"/> </div> -->
  
  <!-- <div style="width:100%;background:black;padding:3%;border:1px solid red">

    <div style="width:30%;height:250px;background:#349FD3">
   
    <img src="../../../assets/website_name1.png" style="width:70%"/>

      <div><span>学校概况</span></div>

      </div>
  </div> -->

           <!-- <div >
                <div style="width:30%;height:100px;background:#349FD3;color:#fff"><span>学校概况</span></div>>
                <div style="width:30%"></div>
                <div style="width:30%"></div>
           </div> -->

<!-- 第一行 -->
  <div class="cpfwContent" style="padding-top:12px;">
      <div  @click="lianjie(1)" style="background:#349FD3;">
        <div><img src="../../../assets/website_name1.png"></div>
        <p>学校概况</p>
      </div>
      <div  @click="lianjie(2)" style="background:#6388D6;">
        <div><img src="../../../assets/website_name1.png"></div>
        <p class="fxyd">校园动态</p>
      </div>
      <div  @click="lianjie(3)" style="background:#8665D8;">
        <div><img src="../../../assets/website_name1.png"></div>
        <p class="gfcz">学校公告</p>
      </div>
  </div>

<!-- 第二行 -->
  <div class="cpfwContent" style="padding-top:12px;">
      <div  @click="lianjie(4)" style="background:#7ECC16;">
        <div><img src="../../../assets/website_name1.png"></div>
        <p>德育之窗</p>
      </div>
      <div  @click="lianjie(5)" style="background:#0FC358;">
        <div><img src="../../../assets/website_name1.png"></div>
        <p class="fxyd">创建之窗</p>
      </div>
      <div  @click="lianjie(6)" style="background:#EBB413;">
        <div><img src="../../../assets/website_name1.png"></div>
        <p class="gfcz">教育科研</p>
      </div>
  </div>

<!-- 第二行 -->
  <div class="cpfwContent" style="padding-top:12px;">
      <div  @click="lianjie(7)" style="background:#F98846;">
        <div><img src="../../../assets/website_name1.png"></div>
        <p>信息公开</p>
      </div>
      <div  @click="lianjie(8)" style="background:#F35262;">
        <div><img src="../../../assets/website_name1.png"></div>
        <p class="fxyd">学生作品</p>
      </div>
      <div  @click="lianjie(9)" style="background:#339ED4;">
        <div><img src="../../../assets/website_name1.png"></div>
        <p class="gfcz">活动专栏</p>
      </div>
  </div>
</div>

</template>
<script>
import Vue from 'vue'
import { Tabbar, TabbarItem, Group, Cell,Search } from 'vux'
export default {
  components: {
    Tabbar,
    TabbarItem,
    Group,
    Cell,
    Search
  },
  data() {
    return {
       results: [],
      value: ''
    }
  },
  methods: {
lianjie(index){
  if(index==1){
     this.$router.push({ name: "introduce" })
     }else if(index==2){
     this.$router.push({ name: "news" })
     }else if(index==3){
     this.$router.push({ name: "education" })
     }else if(index==4){
     this.$router.push({ name: "introduce" })
     }else if(index==5){
     this.$router.push({ name: "setting" })
     }else if(index==6){
     this.$router.push({ name: "view" })
     }else if(index==7){
     this.$router.push({ name: "party" })
     }else if(index==8){
     this.$router.push({ name: "department" })
     }else {
     this.$router.push({ name: "activity" })
     }
}
  },
  mounted: function () {
  },
}
</script>
<style>

</style>
<style scoped>
img {
  width: 100%!important;
  height: auto!important;
}

.cpfwContent {
  display: flex!important;
  justify-content: space-around!important;
  flex-wrap: wrap!important;
  border:1px solid black;
 background:black;
 padding-top:12px;
}
.cpfwContent > div {
  width: 31%!important;
  text-align: center!important;
  font-weight: bold!important;
  font-size: 0.8rem!important;
  padding: 1.5rem 0 0.5rem 0!important;
border-radius:4px;
height:80px;
 
}
.cpfwContent > div > div {
  width: 35%!important;
  margin: 0 auto!important;
  height: 35px!important;

}
.cpfwContent > div  > p{
  margin-top: 10px!important;
  color:#fff;
  font-size:1.2rem;
}
</style>
