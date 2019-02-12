<template>
  <div id="app">
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  name: 'app',
    mounted() {
if((navigator.userAgent.match(/(phone|pad|pod|iPhone|ios|Android|Mobile|BlackBerry|IEMobile|MQQBrowser|JUC|Fennec|wOSBrowser|BrowserNG|WebOS|Symbian|Windows Phone)/i))) {
 this.$router.replace('/home_m/mindex');
}else {
  this.$router.replace('/home_pc/index');
}
  }
}
</script>

<style lang="less">
@import '~vux/src/styles/reset.less';

body {
  background-color: #fbf9fe;
}
</style>


<style>
