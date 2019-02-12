<template>
  <div class="list">
    <!-- 头部 -->
      <Content>
 <router-view/>
      </Content>
<!-- 底部 -->
<footer style="margin-top:50px;">
    <tabbar>
         <tabbar-item link="/home/index" >
        <span slot="label" >首页</span>
      </tabbar-item>
      <tabbar-item  link="/home/broadcast_order" >
        <span slot="label">点播</span>
      </tabbar-item>
      <tabbar-item  link="/home/broadcast_direct">
        <span slot="label">直播</span>
      </tabbar-item>
      <tabbar-item  link="/home/my">
        <span slot="label">我的</span>
      </tabbar-item>
    </tabbar>
</footer>
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
    setFocus () {
      this.$refs.search.setFocus()
    },
    resultClick (item) {
      window.alert('you click the result item: ' + JSON.stringify(item))
    },
    getResult (val) {
      console.log('on-change', val)
      this.results = val ? getResult(this.value) : []
    },
    onSubmit () {
      this.$refs.search.setBlur()
      this.$vux.toast.show({
        type: 'text',
        position: 'top',
        text: 'on submit'
      })
    },
    onFocus () {
      console.log('on focus')
    },
    onCancel () {
      console.log('on cancel')
    },
        direct(){
      this.$router.push({name:"direct"});
      
    },
  },
  mounted: function () {
  },
}
</script>
<style>
.weui-tabbar__item.vux-tabbar-simple{
  height:40px!important;
line-height:40px!important;
}
.weui-tabbar__label{
height:40px!important;
line-height:40px!important;
}

.weui-tabbar__item.weui-bar__item_on .weui-tabbar__label
{
    color:#999999!important;
}
</style>
<style scoped>
header {
  height: 44px;
  background: green;
  line-height: 44px;
  color: #fff;
  text-align: center;
}
.weui-tabbar__item{
border-top:1px solid #ccc;
border-bottom:1px solid #ccc;
border-right:1px solid #ccc;
}
.weui-tabbar__item:last-child{
border-right:1px solid #ccc;
}
</style>
