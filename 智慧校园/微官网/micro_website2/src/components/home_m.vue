<template>
  <div>
<router-view/>
<!-- 底部导航 -->
      <tabbar style="position:fixed;">
      <tabbar-item link="/home_m/m/index">
        <img slot="icon" src="http://www.jnbwx.com.cn/Public/Home/bowen/images/wx/icon-home.png">
        <span slot="label">首页</span>
      </tabbar-item>
      <tabbar-item link="/home_m/m/view">
        <img slot="icon" src="http://www.jnbwx.com.cn/Public/Home/bowen/images/wx/iocn-pindao.png">
        <span slot="label">视界探索</span>
      </tabbar-item>
      <tabbar-item link="/home_m/m/yqlj">
        <img slot="icon" src="http://www.jnbwx.com.cn/Public/Home/bowen/images/wx/icon-video.png">
        <span slot="label">友情链接</span>
      </tabbar-item>
      <tabbar-item link="/home_m/m/map">
        <img slot="icon" src="http://www.jnbwx.com.cn/Public/Home/bowen/images/wx/icon-map.png">
        <span slot="label">导航</span>
      </tabbar-item>
    </tabbar>
  </div>

</template>
<script>
import Vue from 'vue'
import { Grid, GridItem, GroupTitle, Tabbar, TabbarItem, Group, Cell, Swiper } from 'vux'

export default {
  components: {
    Grid, GridItem, GroupTitle, Tabbar, TabbarItem, Group, Cell, Swiper
  },
  data() {
    return {

    }
  },
  methods: {
  },
  mounted: function () {
  },
}
</script>
<style>
</style>
