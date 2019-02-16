<template>
<div>
    <grid >
      <grid-item :label="item.name" v-for="(item,index) in list1" :key="index" :link="item.link">
        <img slot="icon" :src="item.img">
      </grid-item>
    </grid>
</div>
</template>
<script>
import Vue from 'vue'
import { Grid, GridItem, GroupTitle,Tabbar, TabbarItem, Group, Cell,Panel,  Radio} from 'vux'
export default {
    components: {
 Grid, GridItem, GroupTitle,Tabbar, TabbarItem, Group, Cell,Panel,  Radio
  },
  data() {
    return {
            list1: [
        { id: 1, name: '国家教育部', img: 'http://www.jnbwx.com.cn/Public/Home/bowen/images/wx/001.png', link: "/m_introduce" },
        { id: 2, name: '山东省教育厅', img: 'http://www.jnbwx.com.cn/Public/Home/bowen/images/wx/icon-xyxw.png', link: "/newsList/2" },
        { id: 3, name: '烟台教育局', img: 'http://www.jnbwx.com.cn/Public/Home/bowen/images/wx/010.png', link: '/newsList/3' },
        { id: 4, name: '招生政策', img: 'http://www.jnbwx.com.cn/Public/Home/bowen/images/wx/002.png', link: "/newsList/4" },
        { id: 5, name: '成绩查询', img: 'http://www.jnbwx.com.cn/Public/Home/bowen/images/wx/003.png', link: "/newsList/5" },
        { id: 6, name: '智慧校园', img: 'http://www.jnbwx.com.cn/Public/Home/bowen/images/wx/005.png', link: "/newsList/6" },
        { id: 7, name: '心里咨询', img: 'http://www.jnbwx.com.cn/Public/Home/bowen/images/wx/006.png', link: "/newsList/7" },
        { id: 8, name: '录取查询', img: 'http://www.jnbwx.com.cn/Public/Home/bowen/images/wx/007.png', link: "/newsList/8" },
        { id: 9, name: '学籍查询', img: 'http://www.jnbwx.com.cn/Public/Home/bowen/images/wx/008.png', link: "/newsList/9" },
      ],
    };
  },
  methods: {
  },
  mounted: function() {
  }
};
</script>
<style>
</style>
<style scoped>
</style>
