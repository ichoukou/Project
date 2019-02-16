<template>
<div>
  <group>
    <div @click="view(1)" >
      <cell :title="$t('7岁心灵的力量')" is-link>
        <img slot="icon" width="35" style="display:block;margin-right:5px;" src="@/assets/view1.png">
      </cell>
    </div>
       <cell :title="$t('最美的诗遇见最美')" is-link>
        <img slot="icon" width="35" style="display:block;margin-right:5px;" src="@/assets/view2.png">
      </cell>
         <cell :title="$t('三件礼物')" is-link>
        <img slot="icon" width="35" style="display:block;margin-right:5px;" src="@/assets/view3.jpg">
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
    };
  },
  methods: {
    view(id){
      this.$router.push({name:'detail',params:{}})
    }
  },
  mounted: function() {
  }
};
</script>
<style>
</style>
<style scoped>
</style>
