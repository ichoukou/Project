<template>
<div> 

      <Content>
 <router-view/>
      </Content>

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

  },
  mounted: function () {
  },
}
</script>
<style>

</style>
<style scoped>

</style>
