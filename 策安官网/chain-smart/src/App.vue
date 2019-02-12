<template>
  <div id="app">
    <router-view/>
  </div>
</template>
<script>
export default {
  name: 'App',
  mounted() {
 if (/(iPad)/i.test(navigator.userAgent)) {
  this.$router.replace('/home_pad');
  }else if((navigator.userAgent.match(/(phone|pad|pod|iPhone|ios|Android|Mobile|BlackBerry|IEMobile|MQQBrowser|JUC|Fennec|wOSBrowser|BrowserNG|WebOS|Symbian|Windows Phone)/i))) {
  // alert(document.body.clientWidth);
  this.$router.replace('/home_m');
}else {
  this.$router.replace('/home_pc');
}
  }
}

</script>
<style >
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
}
</style>
