<template>
  <div class="xxgk">
    <!-- <panel :header="$t('学校概况')" :footer="footer" :list="list" :type="type"  @on-click-item="intro(list)">
    </panel> -->

       <group :title="$t('学校概况')">
   
      <cell :title="item.title"  v-for="(item,index) in list" @click.native="intro(item.title)" is-link >
        <img slot="icon" width="20" style="display:block;margin-right:5px;" :src="item.src">
      </cell>
    </group>
    
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
      type:'3',
            list: [{
        src: require('@/assets/honor.png'),
        title: '学校荣誉',
        desc: '2016.07',
       
      }, {
        src: require('@/assets/orgin.png'),
        title: '组织机构',
        desc: '2016.07',
        },{
        src: require('@/assets/culture.png'),
        title: '校风校训',
        desc: '2016.07',
      },{
        src: require('@/assets/intro.png'),
        title: '学校简介',
        desc: '2016.07',
      },
      ],
    };
  },
  methods: {
    intro(title){
      if(title=="学校荣誉"){
         this.$router.push({name:'honory',params:{header:title}});
      }else{
 this.$router.push({name:'newsDetail',params:{header:title}});
 }
    },
  },
  mounted: function() {
  }
};
</script>
<style>
.xxgk .weui-cell{
padding:15px!important;
}
.xxgk .weui-cell__hd>img{
width:30px!important;
}
</style>
<style scoped>
</style>
