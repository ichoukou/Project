<template>
  <div id="app">
     <keep-alive>
    <router-view v-if="$route.meta.keepAlive">
    </router-view>
     </keep-alive>
       <router-view v-if="!$route.meta.keepAlive"></router-view>
  </div>
</template>
<script>
export default {
  name: 'App',
mounted(){
if ((navigator.userAgent.match(/(phone|pad|pod|iPhone|iPod|ios|iPad|Android|Mobile|BlackBerry|IEMobile|MQQBrowser|JUC|Fennec|wOSBrowser|BrowserNG|WebOS|Symbian|Windows Phone|iPad)/i))) {
this.$router.replace('/home_m');

}else{
    this.$router.replace('/home_pc');
}
}
}

</script>
<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
}
.flex{
  display:flex;
}
.dbContainer{
width:410px; margin: 0 auto;
}
.dbfont{
  font-size: 100px;text-align:left;color: #ffffff;font-weight:normal; opacity: 0.9;text-shadow: 0 3px 10px rgba(0, 0, 0, 0.5);margin-bottom:20px;
}
@media screen and (max-width: 767px) {
.dingbu{
background-size:100% 100%;
}
.dbContainer{
width:210px;
}
.dbfont{
font-size: 50px;
}
}
.honorContainer{
 max-width:1200px;margin:0 auto;margin-top:15px;
}
@media screen and (max-width: 992px) {
  .honorContainer{
    padding:0 2%;
    }
}
</style>
