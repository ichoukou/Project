<template>
    <div class="all"><img style="width:100%;height:auto;" v-lazy="pcurl+'fsy.png'">
        <!-- 移动放射源 -->
        <div class="cptd cp">
            <p class="ryzz">产品特点</p>
            <Row class="cp_picture w">
                <Col>
                <div><img v-lazy="pcurl+'img_chanpintedian.png'" class="gsjj_picture"></div>
                </Col>
            </Row>
        </div>
        <!-- 产品配备 -->
        <div class="jfbz cp">
            <p class="ryzz ryzz1">产品配备</p>
            <Row class="cp_picture w">
                <Col  style="text-align: center;">
                <!-- <div><img v-lazy="cppb" class="gsjj_picture" style="margin-bottom:30px;"></div> -->
                <div><img v-lazy="pcurl+'img_chanpinpeibei@1x.png'" class="gsjj_picture" style="margin-bottom:30px;"></div>
                </Col>
            </Row>
        </div>
        <!-- 产品简介 -->
        <div class="cpjj cp">
            <p class="ryzz">产品简介</p>
            <Row class="cp_picture w" type="flex" align="middle">
                <Col span="11">
                <!-- <div><img v-lazy="cpjj" class="gsjj_picture"></div> -->
                <div><img v-lazy="pcurl+'img_chanpinjianjie1.png'" class="gsjj_picture"></div>
                </Col>
                <Col span="11" offset="2" class="czzd">
                <div>
                    <p class="cptitle">车载总控终端</p>
                    <p class="yyfs">用于放射源运输及现场作业时的数据采集、远程传输、设备区间通信和为违规行为的监管</p><br>
                    <p class="czzk">主要技术指标</p>
                    <Table :columns="columns1" :data="data1" class="tab"></Table>
                </div>
                </Col>
            </Row>

            <Row class="cp_picture w" type="flex" align="middle">
                <Col span="11"  class="czzd">
                <div>
                    <p class="cptitle">R-Tag系列检测器</p>
                    <p class="yyfs">一款超小型化及超长电池续航能力的放射源迷你监测设备，特别适合探伤源的在线监控</p><br>
                    <p class="czzk">主要技术指标</p>
                    <Table :columns="columns1" :data="data2" class="tab"></Table>
                </div>
                </Col>
                <Col span="11" offset="2" style="text-align:right">
                <div><img src="http://oss.chain-smart.com/assets/img_chanpinjianjie2.png" class="gsjj_picture" style="margin-top:80px;"></div>
                </Col>
            </Row>

            <Row class="cp_picture w" type="flex" align="middle">
                <Col span="11" >
                <!-- <div><img v-lazy="ykjg" class="gsjj_picture"></div> -->
                <div><img v-lazy="pcurl+'img_chanpinjianjie3.png'" class="gsjj_picture"></div>
                </Col>
                <Col span="11" offset="2" class="czzd">
                <div style="margin-top:4vh;">
                    <p class="cptitle">源库监管终端</p>
                    <p class="yyfs">用于确认放射源出入库时的身份及方向信息，并配合智能伽马枪实现对人员行为的监管</p><br>
                    <p class="czzk">主要技术指标</p>
                    <Table :columns="columns1" :data="data3" class="tab"></Table>
                </div>
                </Col>
            </Row>
            <Row class="cp_picture w" type="flex" align="middle">
                <Col span="11" class="czzd">
                <div>
                    <p class="cptitle">车载总控终端</p>
                    <p class="yyfs">用于放射源运输及现场作业时的数据采集、远程传输、设备区间通信和为违规行为的监管</p><br>
                    <p class="czzk">主要技术指标</p>
                    <Table :columns="columns1" :data="data1" class="tab"></Table>
                </div>
                </Col>
                <Col span="11" offset="2" style="text-align:right">
                <div><img src="http://oss.chain-smart.com/assets/img_chanpinjianjie4.png" class="gsjj_picture" style="margin-top:15px;"></div>
                </Col>
            </Row>
            <Row class="cp_picture w" type="flex" align="middle">
                <Col span="11" >
                <!-- <div><img v-lazy="znmq" class="gsjj_picture" style="margin-top:50px;"></div> -->
                <div><img v-lazy="pcurl+'img_chanpinjianjie5.png'" class="gsjj_picture" style="margin-top:50px;"></div>
                </Col>
                <Col span="11" offset="2" class="czzd">
                <div>
                    <p class="cptitle">智能伽马枪</p>
                    <p class="yyfs">国内先进智能联网伽马射线定量监测手持设备，集辐射监测、多路通信及行为监管于一体</p><br>
                    <p class="czzk">主要技术指标</p>
                    <Table :columns="columns1" :data="data4" class="tab"></Table>
                </div>
                </Col>
            </Row>
            <Row class="cp_picture w" type="flex" align="middle">
                <Col span="11"  class="czzd">
                <div>
                    <p class="cptitle">PC端调度系统及移动端监管APP</p>
                    <p class="yyfs">用于统一、接入、展示底层智能设备业务数据，同时下达控制指令的智能调度系统</p><br>

                    <Table :columns="columns2" :data="data5" class="tab"></Table>
                </div>
                </Col>
                <Col span="11" offset="2" style="text-align:right">
                <!-- <div><img v-lazy="pcdd" class="gsjj_picture"></div> -->
                <div><img src="http://oss.chain-smart.com/assets/img_chanpinjianjie6.png" class="gsjj_picture"></div>
                </Col>

            </Row>
        </div>
    </div>
</template>
<script>
export default {
    data() {
        return {
            num: 1,
            // cppb:require('http://oss.chain-smart.com/assets/img_chanpinpeibei.png'),
        //    cpjj:require('http://oss.chain-smart.com/assets/img_chanpinjianjie1.png'),
        //     tag:require('http://oss.chain-smart.com/assets/img_chanpinjianjie2.png'),
        //    ykjg:require('http://oss.chain-smart.com/assets/img_chanpinjianjie3.png'),
        //     czzk:require('http://oss.chain-smart.com/assets/img_chanpinjianjie4.png'),
        //    znmq:require('http://oss.chain-smart.com/assets/img_chanpinjianjie5.png'),
        //     pcdd:require('http://oss.chain-smart.com/assets/img_chanpinjianjie6.png'),
            pcurl:'http://oss.chain-smart.com/assets/',
            columns1: [
                {
                    title: '技术参数',
                    key: 'name'
                },
                {
                    title: '规格指标',
                    key: 'age'
                },

            ],
            data1: [
                {
                    name: '视频功能',
                    age: '5路高清广角夜视，256G SD卡',
                },
                {
                    name: '通信方式',
                    age: '4个(全网通)/北斗卫星报文',
                },
                {
                    name: '定位方式',
                    age: '北斗/GPS双模',
                },
                {
                    name: '工作温度',
                    age: '-20℃~+80℃',
                },
                {
                    name: '视频功能',
                    age: '24V车载电源/内置大容量备用电池',
                },

            ],
            data2: [
                {
                    name: '能量响应范围',
                    age: '48Kev-1.5Mev',
                },
                {
                    name: '剂量率测量范围',
                    age: '1uSv/h-100mSv/h',
                },
                {
                    name: '通讯方式',
                    age: '2.4GHz/辅助卫星/辅助蜂窝',
                },
                {
                    name: '工作温度',
                    age: '-40℃~+80℃',
                },
                {
                    name: '防护等级',
                    age: 'IP67',
                },
                {
                    name: '防爆型式',
                    age: '本质安全型',
                },
                {
                    name: '供电',
                    age: '可更换电池(>45天)',
                },

            ],
            data3: [
                {
                    name: '通信方式',
                    age: '蜂窝/2.4GHz/RJ45',
                },
                {
                    name: '工作温度',
                    age: '-40℃~+80℃',
                },
                {
                    name: '供电',
                    age: '220v市电',
                },

            ],
            data4: [
                {
                    name: '闪烁体类型',
                    age: 'Nal(TL)',
                },
                {
                    name: '闪烁体规格',
                    age: '25mm*25mm',
                },
                {
                    name: '剂量率测量范围',
                    age: '0-300Usv/h',
                },
                {
                    name: '定位方式',
                    age: '北斗/GPS双模',
                },
                {
                    name: '通信方式',
                    age: '蜂窝/窄带/2.4GHz',
                },
                {
                    name: '工作温度',
                    age: '-20℃~+60℃',
                },
                {
                    name: '供电',
                    age: '可更换电池',
                },

            ],
            data5: [
                {
                    name: 'PC端调度系统运行环境',
                    age: 'IE8(含)以上或chrome浏览器',
                },
                {
                    name: '移动运用APP运行环境',
                    age: '安卓4.4(含)或IOS9.0(含)以上版本',
                }

            ],
            columns2: [
                {
                    title: '系统',
                    key: 'name'
                },
                {
                    title: '应用环境',
                    key: 'age'
                },

            ]

        }
    },
    methods: {
        getData(index) {
            this.num = index;
        },
    },
    mounted: function () {
    }
}

</script>
<style>
.ivu-table:after{
    background-color: #fff !important;   
}
.ivu-table th {
    background-color: rgba(93,192,193,0.1) !important;
}
.ivu-table-row-hover td {
    background-color: #fff !important;
} 
</style>
<style scoped>
.ryzz {
  margin: 0 auto;
  text-align: center;
  font-size: 32px;
  font-weight: 600;
  padding: 25px 0;
}
.gsjj_picture {
  /* width: auto;
  height: auto;
  max-width: 100%;
  max-height: 100%; */
  width:100%;
}
.cp_picture {
  margin-top: 5vh;
}
.cptitle {
  font-size: 17px;
  font-weight: bold;
}
.czzk {
  font-size: 14px;
  font-weight: bold;
}
.yyfs {
  margin-top: 2vh;
  color: #808080;
  font-size: 14px;
  line-height: 28px;
}
.tab {
  margin-top: 10px; 
  border: none;
}
.jfbz {
  background: #f0f0f0;
  padding: 10vh 0;
}
.cp {
  margin: 10vh 0;
}
</style>
