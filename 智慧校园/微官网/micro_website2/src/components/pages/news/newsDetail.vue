<template>
  <div>
    <section  style="background-image: url(http://www.qhfx.edu.cn/app/static/images/xy_img/dingbu21.jpg);padding:10px 0;" class="dingbu">
    <div  class="dbContainer">
      <div class="dbfont">{{header}}</div>
    </div>
</section>
    <div class="honorContainer">
    <p class="title">7岁心灵的力量</p>
        <div style="margin-top:10px;font-size：16px"><span style="color: #576b95;"> 清华大学附属小学</span>&nbsp;&nbsp;&nbsp;&nbsp;<span style="color: rgba(0,0,0,0.3);">2017.02.14</span></div>
       <p style="margin-top:10px;font-size：14px">当一团熊熊燃烧着的大火，突然遭遇到了倾盆大雨的时侯，那种瞬间被浇灭的失望、悲伤着的心情，仿佛跌到了人生的冰点。

当这种感受扑面而来的时侯，太需要一本毕淑敏《心灵的力量》来灌注重新烧燃的希望了，翻开书本，浏览文字，让思绪静下来。重温自己，让心灵的温度慢慢的暖和起来，暖和一些，再暖和一些......

每一个成人的内心深处，都潜伏着一个爱做游戏、充满好奇的天真孩童，只不过随着时光的流逝，蒙上了世故的尘土。

现代社会是一只飞速旋转的风火轮，把无数信息灌输给我们，我们会遇到自己的心灵在纷繁的灯红酒绿中逐渐麻痹，那些成长中“珍惜、感动、希望、共勉”的磁性也逐渐变弱的时侯。在这个时侯，我们需要一眼永不干涸、汩汩热情的温泉，来滋润着我们的心灵，让我们的心灵蒸腾而起、奔向蓝天、白云。而这汩温泉就宛若如下文字般，热气腾腾，温暖舒适。</p>
  </div>
    </div>
  </div>
</template>
<script>
import Vue from 'vue'
import { Grid, GridItem, GroupTitle,Tabbar, TabbarItem, Group, Cell,Panel,  Radio,Divider, Card} from 'vux'
export default {
     props:['header'],
    components: {
 Grid, GridItem, GroupTitle,Tabbar, TabbarItem, Group, Cell,Panel,  Radio,Divider, Card
  },
  data() {
    return {
    };
  },
  methods: {
  },
  mounted: function() {
  this.header=this.$route.params.header;
  }
};
</script>
<style scoped>
.title{
font-size:20px;
font-weight:bold;
margin:0 auto;
text-align:center;
}
</style>
