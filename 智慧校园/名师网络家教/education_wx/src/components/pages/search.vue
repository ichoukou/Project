<template>
  <div class="list">
    <search
      @result-click="resultClick"
      @on-change="getResult"
      :results="results"
      v-model="value"
      position="absolute"
      auto-scroll-to-top
      autoFixed:true
      @on-focus="onFocus"
      @on-cancel="onCancel"
      @on-submit="onSubmit"
      ref="search"></search>
<div style="margin-top:50px;padding:2%;font-size:0.8rem" >
      <p >搜索历史</p>
      <div class="flex" style="margin-top:10px">
        <div style="text-align:center;background:#F3F5F7;border:1px solid #ddd;border-radius:3px;color:#71777D;padding:2px 10px;"><span>java</span></div>
        <div style="text-align:center;background:#F3F5F7;border:1px solid #ddd;border-radius:3px;color:#71777D;margin-left:10px;padding:2px 10px;">phyon</div>
        <div style="text-align:center;background:#F3F5F7;border:1px solid #ddd;border-radius:3px;color:#71777D;margin-left:10px;padding:2px 10px;">vue</div>
      </div>
      </div>
  </div>

</template>

<script>
import Vue from 'vue'
import { Search, Group, Cell, XButton } from 'vux'
export default {
  components: {
    Search,
    Group,
    Cell,
    XButton
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
      this.$router.push({name:'index'});
    },
  
  },
  mounted: function () {
    this.setFocus();
  this.onFocus();
  },


}
</script>

<style scoped>

.header {
  height: 44px;
  background: green;
  line-height: 44px;
}

</style>
