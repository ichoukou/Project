<template>
  <div id="app">
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  name: 'app'
}
</script>

<style lang="less">
@import '~vux/src/styles/reset.less';

body {
  background-color: #fbf9fe;
}
</style>


<style
*{
    box-sizing: border-box;
   margin:0;
    padding:0;
}
body{
    background: none;
    background: #fafafa;
    font-size: 14px;
    line-height: 1.42857143;
    margin:0;
    font-family: "Microsoft Yahei";
    position: relative;
}
#top{
    display: block;
    width:45px;
    height:45px;
    background: #cccccc;
    border-radius:5px;
    position:fixed;
    right:20px;
    bottom:10%;
    cursor: pointer;
    text-align:center;
    line-height: 45px;
    z-index:1000;
    opacity: 0.6;
}

h1, h2, h3, h4, h5, h6, .h1, .h2, .h3, .h4, .h5, .h6 {
    font-family: inherit;
    font-weight: 500;
    line-height: 1.1;
    color: inherit;
}
/*响应式导航条*/
.navbar-fixed-top{color:#f5f5f5;background: #2C3E50}
.navbar-default .navbar-link:hover {
    color: #C27112;
/*color: #ffffff;*/

}
#navbar-right{display: block}
#menu{color:red;}
#menu>a{display:block;}
#blog{left:25px;display: block;position: absolute}
/*top大图*/
.carousel-inner .item{animation:fadescale 5s forwards}
@keyframes fadescale {
    0%{opacity: 1;transform:scale(1)}
    50%{transform:scale(1.1)}
    100%{transform: scale(1)}
}
.carousel-caption>span{
    display:inline-block;
    width:145px;height:45px;
    background: #2c3e50;

    cursor: pointer;
    border-radius: 5px;
    text-align: center;
    line-height:45px;
    font-size:1.6rem;
    margin-left:20px;
}
.carousel-caption>span>a{ color: #fff;}
.carousel-caption>span:last-child{
    background:#5CB85C;
    text-align: center;
    line-height: 45px;

}
.carousel { margin-top:40px;}

/*关于我*/
#Aboutme{
    text-align: center;
    height:200px;
    line-height: 200px;
    font-weight: 500;
    font-size:2.7rem;
}
#Aboutme>p{border-bottom:3px solid #E87E04;width:90px;height: 130px;margin: 0 auto;}
#me{border:1px solid #000;text-align: center;height:180px;line-height:180px;font-weight: 500;font-size:2.7rem}
#intro{line-height: 2rem}
/*求职意向*/
#forward{margin-top:40px;background-image: url(../images/services-bg.jpg)}
#forward #job{height:240px;
    font-size: 3rem;
    line-height: 240px;
    text-align: center;
}
#forward #job>p{
    border-bottom:3px solid #E87E04;
    width:120px;height: 150px;
    margin: 0 auto;
}
#forward .col-md-3{text-align: center}
#forward .col-md-3>p{margin-top:20px;color:#E87E04;font-size: 1.7rem;}
#forward .col-md-3>p:last-child{margin-top:20px;color: #000000;font-size: 1.5rem;margin-bottom: 200px;}
/*作品集*/
#product{
    height:50px;
    margin-top:150px;

    font-size: 3rem;
   text-align: center;
}
   #product>p{
       border-bottom:3px solid #E87E04;
       width:100px;
       height: 50px;
       margin: 0 auto;
}
#product-intro{margin-top:30px;}
#product-list{margin-top:60px;}
#product-list .col-md-3{position: relative}
#product-list .imgbox{width:100%;cursor: pointer;}
#product-list img{width:100%;transition: all 0.3s ease;}
#product-list .imgbox:hover{animation:overscale 1s forwards;filter: brightness(0.3);}
@keyframes overscale{
       0%{transform: scale(1)}
    100%{transform: scale(1.1);}
}
#zp,#zp1,#zp2,#zp3{
    position: absolute;
    top:50%;
    left:30%;
    color:#FFFFFF;
    font-size: 1.8rem;
    z-index:10;
    display:none;
}
/*技术掌握*/
#skills{
    height:240px;
    font-size: 3rem;
    line-height: 240px;
    text-align: center;
}
#skills p{
    border-bottom:3px solid #E87E04;
    width:120px;
    height: 150px;
    margin: 0 auto;
}
#skill-bg{
    background-image: url(../images/skills-bg.jpg);
    margin-top:50px;
    padding-bottom: 300px;
}
#c1,#c2,#c3,#c4{background: transparent;}
#canv>div{text-align: center;position: relative;}
#canv>div>div{color:#E87E04;}
/*#knowleg>div{text-align: center;margin-top:20px;color:#E87E04;}*/
#canv p{position: absolute;text-align: center;top:45%;left:45%;font-size: 14px;font-weight: 700}
/*我的经历*/
#exprience{
    height:240px;
font-size: 3rem;
line-height: 240px;
text-align: center;

}
#exprience p{
    border-bottom:3px solid #E87E04;
    width:120px;
    height: 150px;
    margin: 0 auto;
}
#exp1-time{
    width:150px;
    height:150px;
    border:1px solid #DDDDDD;
border-radius: 50%;
    text-align: center;
   padding-top:30px;
    margin-left:25px;
    line-height: 25px;
    font-weight: 700;
    background: #ffffff;
}
#exp1{margin-top:25px;}
#exp1>p:first-child{text-align: right;font-size:1.7rem;font-weight: 600;}
#exp1>p:nth-child(2){text-align: right;font-size:1.7rem;color:#E87E04}
#exp2-time{
    width:150px;
    height:150px;
    border:1px solid #DDDDDD;
    border-radius: 50%;
    text-align: center;
    padding-top:30px;
   left:25px;
    line-height: 25px;
    font-weight: 700;
    background: #ffffff;
}
/*#exp-row2{margin-top:80px;}*/
#exp2{margin-top:35px;margin-left:35px;}
#exp2>p:first-child{font-size:1.7rem;font-weight: 600;}
#exp2>p:nth-child(2){font-size:1.7rem;color:#E87E04}
#line{border-left:1px solid #DDDDDD;height:80px;}
/*联系我*/
#con-bg{background-image: url(../images/achivements-bg.jpg);}

@media screen and (max-width: 992px) {
    #app,#weixin{margin-top:30px;}
}