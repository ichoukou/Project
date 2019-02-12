<template>
<div class="mall">
  <div >
    <img src="../../../assets/kclist1.jpg"/> </div>
    <group-title style="background:#fff!important;border:1px solid #fff">4 columns</group-title>
    <grid :show-lr-borders="false">
      <grid-item :label="$t('Grid')" v-for="i in 3" :key="i">
        <img slot="icon" >
      </grid-item>
    </grid>
</div>
</template>
<script>
import Vue from 'vue'
import { Tabbar, TabbarItem, Group, Cell,Search,Grid, GridItem, GroupTitle  } from 'vux'
export default {
  components: {
    Tabbar,
    TabbarItem,
    Group,
    Cell,
    Search,Grid, GridItem, GroupTitle 
  },
  data() {
    return {
       results: [],
      value: ''
    }
  },
  methods: {

  },
  mounted: function () {
  },
}
</script>
<style>
html {
background:#fff!important;
}
</style>
<style scoped>

.grid-center {
  display: block;
  text-align: center;
  color: #666;
}
.weui-grids {
  background-color: #fff;
}
</style>
