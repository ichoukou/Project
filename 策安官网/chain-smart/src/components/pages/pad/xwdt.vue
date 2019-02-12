<template>
  <div class="indexPad">
    <div><img v-lazy="padurl+'img_banner_xinwen@2x.png'"></div>
   <div class="new_pad" style="border-top:none">
        <p :class="{active:num == 1}" @click="getData(1)">企业新闻</p>
        <p :class="{active:num == 2}" @click="getData(2)">行业新闻</p>
      </div>
      <div class="aside1">
  <div class="xwContent flex" v-for="(item,index) in news" @click="xwxqDetail(item.news_id)">
        <div>
          <div class="xwDate" v-if="item.news_time!=null">
            <p>{{item.news_time.slice(8,10)}}</p>
            <p>{{item.news_time.slice(0,4)}}/{{item.news_time.slice(5,7)}}</p>
          </div>
        </div>
        <div>
          <p class="xwContent_title bold">{{item.news_title}}</p>
               <p class="colorCon" v-if="item.description.length>95">{{item.description.slice(0,95)}}...</p>
            <p class="colorCon" v-else>{{item.description}}</p>
        </div>
      </div>
      </div>
   <p class="loadmore" @click="loadmore()">{{moredata}}</p>
  </div>
</template>
<script>
import { getNews } from "@/api/api"
export default {
  data() {
    return {
         padurl:"http://oss.chain-smart.com/assetPad/",
      num: 1,
      news:[],
         moredata:'点击加载更多',
                page: {
        total: 0,
        current: 1,
        pageSize: 5
      },
      isindustry:'COMPANY',
    };
  },
  methods: {
            loadmore(){
this.page.pageSize= this.page.pageSize * 2;
this.getList();
    },
     getData(index) {
      this.num = index;
            if(index==1){
        this.isindustry='COMPANY';
      }else{
        this.isindustry='INDUSTRY';
      }
         this.page.current=1;
         this.page.pageSize=5;
      this.getList();
    },
xwxqDetail(id){
    this.$router.push({name:"padxwDetail",params:{id:id}});
},
    getList(){
           let param = {
        sort: 'news_time',
        sortType:"desc",
       pageNo:this.page.current,
        pageSize:this.page.pageSize,
query:[{"query_condition":"=", "control_type":"selector","field_code":"state","value":"1"},{"query_condition":"=", "control_type":"selector","field_code":"category_id","value":this.isindustry}]
      };
      getNews(param).then(res => {
          var code = res.status;
          if (code == 200) {
            this.news = res.data.data.rows.dataList;
                         let records=res.data.data.rows.pagination.totalRecords;
        if(records<=this.page.pageSize){
           this.moredata="暂无更多新闻";
          }else{
            this.moredata="点击加载更多";
          }
            // debugger;
            //  this.news= datalist.filter(function (x) {
            //        return x.category_id== '��˾����';
            //   });
            //   this.Industrynews=datalist.filter(function (x) {
            //        return x.category_id== '��ҵ����';
            //   });
          } else {
            this.$Message.error(res.data.error);
          }
        })
        .catch(error => {
          this.$Message.error(res.data.error);
        });
    }
  },
  mounted: function () {
this.getList();
  }
};
</script>
<style scoped>
img {
  width: 100%;
  height: auto;
}
.loadmore{
margin:20px 0;font-size:1rem;
}
</style>
