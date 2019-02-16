<template>

    <div >
    <div id="maps" style="width:100%; height:100%;position:absolute;"></div>
  </div>
 
</template>
<script>
import Vue from 'vue'
  import AMap from 'AMap'
export default {
    components: {

  },
  data() {
    return {
    };
  },
  methods: {
          init () {
       let mapObj  = new AMap.Map('maps', {
          center: [121.271193,37.564548],
          resizeEnable: true,
          zoom: 18
        })

mapObj.plugin(['AMap.ToolBar', 'AMap.MapType'], function () {
  mapObj.addControl(new AMap.ToolBar())
  mapObj.addControl(new AMap.MapType({showTraffic: false, showRoad: false}))
        })


mapObj.plugin(['AMap.Geolocation'], function () {
          let geolocation = new AMap.Geolocation({
            enableHighAccuracy: true, //  是否使用高精度定位，默认:true
            timeout: 10000, //  超过10秒后停止定位，默认：无穷大
            maximumAge: 0, // 定位结果缓存0毫秒，默认：0
            convert: true, // 自动偏移坐标，偏移后的坐标为高德坐标，默认：true
            showButton: true, //  显示定位按钮，默认：true
            buttonPosition: 'LB',  // 定位按钮停靠位置，默认：'LB'，左下角
            buttonOffset: new AMap.Pixel(10, 20), //  定位按钮与设置的停靠位置的偏移量，默认：Pixel(10, 20)
            showMarker: true, //  定位成功后在定位到的位置显示点标记，默认：true
            showCircle: true, //  定位成功后用圆圈表示定位精度范围，默认：true
            panToLocation: true,  //  定位成功后将定位到的位置作为地图中心点，默认：true
            zoomToAccuracy: true  //  定位成功后调整地图视野范围使定位位置及精度范围视野内可见，默认：false
          })
          mapObj.addControl(geolocation)
          geolocation.getCurrentPosition()
          AMap.event.addListener(geolocation, 'complete', (result) => {
            mapObj.setCenter(result.position)
          })  //  返回定位信息
          AMap.event.addListener(geolocation, 'error', (result) => {
            console.log(result)
          })  //  返回定位出错信息
        })
	  // 后台取到的点，新建LngLat对象
   　　　　　　geolocation.getCurrentPosition()
   AMap.event.addListener(geolocation, 'complete', (e) => {
　　　　　　　　console.log(e) // 定位成功之后做的事
　　　　　　　　let marker = new AMap.Marker({
　　　　　　　　　　position: e.position, 
　　　　　　　　　　icon: '', 
　　　　　　　　　　map:this.map
　　　　　　　　})
　　　　　　})
　AMap.event.addListener(geolocation, 'error', (e) => {
　　　　　　　　console.log(e) 
　　　　　　})

            // AMap.event.addListener(marker, 'click', (e) => {
            //   AMapUI.loadUI(['overlay/SimpleInfoWindow'], function (SimpleInfoWindow) {
            //     var infoWindow = new SimpleInfoWindow({
            //       infoTitle: '<strong>这是标题</strong>',
            //       infoBody: '<p>这是信息</p>',
            //       offset: new AMap.Pixel(0, -20),
            //       autoMove: true
            //     })
            //     infoWindow.open(mapObj, e.target.getPosition())
            //     // 最坑的就是这一步了，他的infowindow没有点击事件，所以infoWindow.get$Container()会返回这个infowindow（jquery）对象
            //     let infoEle = infoWindow.get$Container()
            //     //给infowindow添加点击事件，并在回调函数中处理业务或者跳转等
            //     infoEle.on('click', (e) => {
            //       router.push({name: 'proinfo', params: pro})
            //     })
            //   })
            // })
          // })

//   AMap.plugin(['AMap.ToolBar', 'AMap.Scale','AMap.Geolocation'], function () {
//           map.addControl(new AMap.ToolBar())
//           map.addControl(new AMap.Scale())
//           let geolocation = new AMap.Geolocation({
//             enableHighAccuracy: true,
//             timeout: 10000,
//             　　buttonOffset: new AMap.Pixel(10, 20),
//             　 zoomToAccuracy: true,
//             　　　buttonPosition: 'RB'
//             })
//    　　　　　　geolocation.getCurrentPosition()
//    AMap.event.addListener(geolocation, 'complete', (e) => {
// 　　　　　　　　console.log(e) // 定位成功之后做的事
// 　　　　　　　　let marker = new AMap.Marker({
// 　　　　　　　　　　position: e.position, 
// 　　　　　　　　　　icon: '', 
// 　　　　　　　　　　map:this.map
// 　　　　　　　　})
// 　　　　　　})
// 　AMap.event.addListener(geolocation, 'error', (e) => {
// 　　　　　　　　console.log(e) 
// 　　　　　　})
// })
          }
  },
  mounted: function() {
     this.init();
  }
};
</script>
<style>
</style>
<style scoped>
</style>
