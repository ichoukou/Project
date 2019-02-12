<template>
  <div class="indexBody">
    <div><img v-lazy="murl+'img_banner_HSE@3x.png'"></div>
    <!-- 产品特点 -->
    <div class="aside1">
      <p class="f12 bold">经典培训课程</p>
      <div class="cptd"><img v-lazy="murl+'img_peixun_biaoge@3x.png'"></div>
    </div>
     <div class="ptop1"></div>  
       <!-- <div class="swiper-container" style="width:100%;padding:10px 0 0 0;border-bottom:1px solid #ccc"> -->
       <div class="swiper-container" style="border-bottom:1px solid #ccc">
       <div class="swiper-wrapper kclb">
        <div class="swiper-slide"  @click="getData(1)"><span  :class="{active:num == 1}">理念与文化</span></div>
        <div class="swiper-slide"  @click="getData(2)"><span  :class="{active:num == 2}">安全风险管理</span></div>
         <div class="swiper-slide"  @click="getData(3)"><span  :class="{active:num == 3}">工艺安全管理</span></div>
          <div class="swiper-slide"   @click="getData(4)"><span  :class="{active:num == 4}">作业安全管理</span></div>
        <div class="swiper-slide"  @click="getData(5)"><span  :class="{active:num == 5}">行为安全管理</span></div>
        <div class="swiper-slide"  @click="getData(6)"><span  :class="{active:num == 6}">审核与评估</span></div>
               <div class="swiper-slide"  @click="getData(7)"><span  :class="{active:num == 7}">安全信息化</span></div>
      </div>
       </div>
   <!-- 理念与文化 -->
   <div v-if="num==1">
 <Row class="kc1_m"  >
   <Col :xs="{ span: 20, offset: 2 }">
     <!-- <span class="pxkc_boder"></span> -->
     <span class="kc_m">课程一：企业安全文化建设</span>
     <ul>
       <li><div class="time_m"></div></li>
       <li><span class="kcsj_m">课程时间:</span>2天</li>
       <li><div class="jingsi_m" style="margin-left:10px;"></div></li>
       <li><span class="kcsj_m">培训讲师:</span>2名<br></li>
     </ul>
     </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxry_m"></div></li>
         <li><span class="kcsj_m">培训人员：</span></li>
         <li>中高层领导、安全处室、HSE管理/监督人员、培训师等</li>
     </ul>
   </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxnr_m"></div></li>
         <li><span class="kcsj_m">主要内容：</span></li>
     </ul>
     <ol class="pxnr_content_m">
       <li>安全知识教育、增强安全意识；</li>
       <li>开展安全活动培训；</li>
       <li>配备必要的安全设备；</li>
       <li>落实直线责任、有感领导和属地管理；</li> 
       <li>设立安全工作领导小组；</li> 
       <li>定期进行安全检查；</li>
       <li>设计安全事故解决预案；</li>
       <li>不定期进行各项安全演习；</li>
       <li>安全经验分享。</li>      
     </ol>
   </Col>
</Row> 
  
  <Row class="kc2_m">
   <Col :xs="{ span: 20, offset: 2 }">
     <!-- <span class="pxkc_boder"></span> -->
     <span class="kc_m">课程二：现代企业安全管理（SBP，Safety Best Practices）</span>
     <ul>
       <li><div class="time_m"></div></li>
       <li><span class="kcsj_m">课程时间:</span>3天</li>
       <li><div class="jingsi_m" style="margin-left:10px;"></div></li>
      <li><span class="kcsj_m">培训讲师:</span>2名<br></li>
     </ul>
     </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxry_m"></div></li>
         <li><span class="kcsj_m">培训人员：</span></li>
         <li>中高层领导、安全处室、HSE管理/监督人员、培训师等</li>
     </ul>
   </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxnr_m"></div></li>
         <li><span class="kcsj_m">主要内容：</span></li>
     </ul>
     <ol class="pxnr_content_m">
       <li>安全领导力；</li>
       <li>如何管理风险；</li>
       <li>安全文化与安全行为；</li>
       <li>风险识别与评价；</li> 
       <li>风险控制；</li> 
       <li>维修、检查与监督；</li>
       <li>变更分类与管理；</li>
       <li>交流与沟通；</li>
       <li>承包商管理；</li>   
       <li>应急响应准备；</li>  
       <li>风险监控；</li>   
       <li>事故事件调查、统计与经验分享；</li>   
       <li>风险监控与测量；</li>    
       <li>后果与评价。</li>   
     </ol>
   </Col>
</Row>   
<!-- 课程3 -->
<Row class="kc1_m">
   <Col :xs="{ span: 20, offset: 2 }">
     <!-- <span class="pxkc_boder"></span> -->
     <span class="kc_m">课程三：培训与能力建设评估与策划</span>
     <ul>
       <li><div class="time_m"></div></li>
       <li><span class="kcsj_m">课程时间:</span>2天</li>
       <li><div class="jingsi_m" style="margin-left:10px;"></div></li>
       <li><span class="kcsj_m">培训讲师:</span>1名<br></li>
     </ul>
     </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxry_m"></div></li>
         <li><span class="kcsj_m">培训人员：</span></li>
         <li>中高层管理者、人力资源相关人员、安全监督等</li>
     </ul>
   </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxnr_m"></div></li>
         <li><span class="kcsj_m">主要内容：</span></li>
     </ul>
     <ol class="pxnr_content_m">
        <li>培训管理体系的建立与完善；</li>
       <li>培训需求分析；</li>
       <li>培训讲师资质；</li>
       <li>培训计划与实施；</li> 
       <li>领导入职培训；</li> 
       <li>通用入职培训；</li>
       <li>上岗前业务、技术、风险、管理等培训；</li>
       <li>培训（培训体系、培训讲师、培训教材、培训组织、培训硬件等）评价。</li>   
     </ol>
   </Col>
</Row> 
  <!-- 课程4 -->
  <Row class="kc2_m">
   <Col :xs="{ span: 20, offset: 2 }">
     <!-- <span class="pxkc_boder"></span> -->
     <span class="kc_m">课程四：HSE管理体系(流程/机制)评估、改进与提升</span>
     <ul>
       <li><div class="time_m"></div></li>
       <li><span class="kcsj_m">课程时间:</span>2天</li>
       <li><div class="jingsi_m" style="margin-left:10px;"></div></li>
      <li><span class="kcsj_m">培训讲师:</span>2名<br></li>
     </ul>
     </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxry_m"></div></li>
         <li><span class="kcsj_m">培训人员：</span></li>
         <li>中高层领导、管理者代表、安全处室、HSE管理/监督人员、培训师等</li>
     </ul>
   </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxnr_m"></div></li>
         <li><span class="kcsj_m">主要内容：</span></li>
     </ul>
     <ol class="pxnr_content_m">
       <li>HSE一体化管理体系的要点和益处；</li>
       <li>HSE一体化管理体系评估的方法与技巧；</li>
       <li>成功实践案例（HSE一体化管理体系）的分析；</li>
       <li>适合企业自身的HSE理念及政策；</li> 
       <li>建立合理的企业安全管理流程；</li> 
       <li>提升企业各职能部门HSE技能；</li>
       <li>落实直线责任、有感领导和属地管理；</li>
       <li>提升企业HSE委员会及分委会运作。</li>  
     </ol>
   </Col>
</Row>   
<!-- 课程5 -->
<Row class="kc1_m">
   <Col :xs="{ span: 20, offset: 2 }">
     <!-- <span class="pxkc_boder"></span> -->
     <span class="kc_m">课程五：安全领导力</span>
     <ul>
       <li><div class="time_m"></div></li>
       <li><span class="kcsj_m">课程时间:</span>2天</li>
       <li><div class="jingsi_m" style="margin-left:10px;"></div></li>
       <li><span class="kcsj_m">培训讲师:</span>2名<br></li>
     </ul>
     </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxry_m"></div></li>
         <li><span class="kcsj_m">培训人员：</span></li>
         <li>中高层领导、安全处室、HSE管理/监督人员、培训师等</li>
     </ul>
   </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxnr_m"></div></li>
         <li><span class="kcsj_m">主要内容：</span></li>
     </ul>
     <ol class="pxnr_content_m">
        <li>高层HSE领导力技能研讨；</li>
       <li>如何实施安全观察与沟通；</li>
       <li>个人安全行动计划的制定与有效实施；</li>
       <li>落实直线责任、有感领导和属地管理；</li> 
       <li>HSE制度管理改进和提升；</li> 
       <li>企业风险的有效管理；</li>
       <li>事故调查技能提升。</li>
     </ol>
   </Col>
</Row> 
</div>
<!-- 安全风险管理 -->
   <div v-if="num==2">
 <Row class="kc1_m"  >
   <Col :xs="{ span: 20, offset: 2 }">
     <!-- <span class="pxkc_boder"></span> -->
     <span class="kc_m">课程一：风险管理（RM）</span>
     <ul>
       <li><div class="time_m"></div></li>
       <li><span class="kcsj_m">课程时间:</span>3天</li>
       <li><div class="jingsi_m" style="margin-left:10px;"></div></li>
       <li><span class="kcsj_m">培训讲师:</span>1名<br></li>
     </ul>
     </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxry_m"></div></li>
         <li><span class="kcsj_m">培训人员：</span></li>
         <li>中高层领导、安全处室、HSE管理/监督人员、风险分析员、培训师等</li>
     </ul>
   </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxnr_m"></div></li>
         <li><span class="kcsj_m">主要内容：</span></li>
     </ul>
     <ol class="pxnr_content_m">
       <li>管理风险；</li>
       <li>风险的接受能力；</li>
       <li>配备必要的安全设备；</li>
       <li>风险识别；</li> 
       <li>风险矩阵;</li> 
       <li>风险评估；</li>
       <li>风险控制；</li>
       <li>风险监控；</li>
       <li>残余风险。</li>      
     </ol>
   </Col>
</Row> 

  <Row class="kc2_m">
   <Col :xs="{ span: 20, offset: 2 }">
     <!-- <span class="pxkc_boder"></span> -->
     <span class="kc_m">课程二：物理安全屏障评估（PSBA）</span>
     <ul>
       <li><div class="time_m"></div></li>
       <li><span class="kcsj_m">课程时间:</span>：2天</li>
       <li><div class="jingsi_m" style="margin-left:10px;"></div></li>
      <li><span class="kcsj_m">培训讲师:</span>1名<br></li>
     </ul>
     </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxry_m"></div></li>
         <li><span class="kcsj_m">培训人员：</span></li>
         <li>中高层领导、安全处室、HSE管理/监督人员、风险分析员、培训师等</li>
     </ul>
   </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxnr_m"></div></li>
         <li><span class="kcsj_m">主要内容：</span></li>
     </ul>
     <ol class="pxnr_content_m">
       <li>物理屏障的概念；</li>
       <li>物理屏障的范围；</li>
       <li>本质安全；</li>
       <li>危害预防措施；</li> 
       <li>危害缓解措施；</li> 
       <li>应急响应；</li>
       <li>物理屏障评价的程序；</li>
       <li>物理屏障量化评价表。</li>
     </ol>
   </Col>
</Row>  
</div>
<!-- 工艺安全管理 -->
   <div v-if="num==3">
 <Row class="kc1_m"  >
   <Col :xs="{ span: 20, offset: 2 }">
     <!-- <span class="pxkc_boder"></span> -->
     <span class="kc_m">课程一：工艺安全管理（PSM）体系评估、策划、改进与提升</span>
     <ul>
       <li><div class="time_m"></div></li>
       <li><span class="kcsj_m">课程时间:</span>3天</li>
       <li><div class="jingsi_m" style="margin-left:10px;"></div></li>
       <li><span class="kcsj_m">培训讲师:</span>2名<br></li>
     </ul>
     </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxry_m"></div></li>
         <li><span class="kcsj_m">培训人员：</span></li>
         <li>中高层管理者、生产/维护/技术主管、工艺工程师、安全监督、安全工程师和承包商管理人员等</li>
     </ul>
   </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxnr_m"></div></li>
         <li><span class="kcsj_m">主要内容：</span></li>
     </ul>
     <ol class="pxnr_content_m">
       <li>工艺安全管理的概念；</li>
       <li>工艺安全管理体系的策划与建设；</li>
       <li>工艺安全管理体系的评估、改进与提高；</li>
       <li>工艺安全管理（PSM）体系要素及其相互关系；</li> 
       <li>如何实现卓越的工艺安全；</li> 
       <li>如何对风险进行辨识与管理、有效避免灾难性事故的发生。</li>     
     </ol>
   </Col>
</Row>
<Row class="kc2_m">
   <Col :xs="{ span: 20, offset: 2 }">
     <!-- <span class="pxkc_boder"></span> -->
     <span class="kc_m">课程二：工艺危害分析（PHA）</span>
     <ul>
       <li><div class="time_m"></div></li>
       <li><span class="kcsj_m">课程时间:</span>1天</li>
       <li><div class="jingsi_m" style="margin-left:10px;"></div></li>
      <li><span class="kcsj_m">培训讲师:</span>1名<br></li>
     </ul>
     </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxry_m"></div></li>
         <li><span class="kcsj_m">培训人员：</span></li>
         <li>中层管理者、@/维修人员、安全监督、安全工程师、承包商等</li>
     </ul>
   </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxnr_m"></div></li>
         <li><span class="kcsj_m">主要内容：</span></li>
     </ul>
     <ol class="pxnr_content_m">
       <li>PHA的概念；</li>
       <li>PHA的背景和应用；</li>
       <li>PHA实施步骤和内容；</li>
       <li>PHA方法和练习：<br>
       ——HAZOP<br>
       ——WHATIF<br>
       ——CHECKLIST<br>
       ——FMEA<br>
       ——ETA<br>
       ——QRA<br>
       ——LOPA<br>
       ——Bow-Tie
       </li> 
       <li>PHA的运用。</li> 
     </ol>
   </Col>
</Row>  
<Row class="kc1_m" >
   <Col :xs="{ span: 20, offset: 2 }">
     <!-- <span class="pxkc_boder"></span> -->
     <span class="kc_m">课程三：工艺安全信息（PSI）</span>
     <ul>
       <li><div class="time_m"></div></li>
       <li><span class="kcsj_m">课程时间:</span>1天</li>
       <li><div class="jingsi_m" style="margin-left:10px;"></div></li>
       <li><span class="kcsj_m">培训讲师:</span>1名<br></li>
     </ul>
     </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxry_m"></div></li>
         <li><span class="kcsj_m">培训人员：</span></li>
         <li>中层管理者、维修人员、安全监督、安全工程师、承包商等中高层管理者、生产/维护/技术主管、工艺工程师、安全监督、安全工程师和承包商管理人员等</li>
     </ul>
   </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxnr_m"></div></li>
         <li><span class="kcsj_m">主要内容：</span></li>
     </ul>
     <ol class="pxnr_content_m">
       <li>PSI的概述；</li>
       <li>PSI的目的与意义；</li>
       <li>PSI的主要内容；</li>
       <li>PSI的收集；</li> 
       <li>PSI的统一规范管理；</li> 
       <li>PSI的运用。</li>     
     </ol>
   </Col>
</Row>
<Row class="kc2_m">
   <Col :xs="{ span: 20, offset: 2 }">
     <!-- <span class="pxkc_boder"></span> -->
     <span class="kc_m">课程四：工作循环检查（JCC）</span>
     <ul>
       <li><div class="time_m"></div></li>
       <li><span class="kcsj_m">课程时间:</span>1天</li>
       <li><div class="jingsi_m" style="margin-left:10px;"></div></li>
      <li><span class="kcsj_m">培训讲师:</span>1名<br></li>
     </ul>
     </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxry_m"></div></li>
         <li><span class="kcsj_m">培训人员：</span></li>
         <li>中层管理者、维修人员、安全监督、安全工程师、承包商等</li>
     </ul>
   </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxnr_m"></div></li>
         <li><span class="kcsj_m">主要内容：</span></li>
     </ul>
     <ol class="pxnr_content_m">
       <li>JCC的概述；</li>
       <li>实施JCC的目的与意义；</li>
       <li>JCC的术语解读；</li>
       <li>JCC的管理流程；</li> 
       <li>JCC的工作流程；</li>
      <li>JCC的典型做法。</li>	 
     </ol>
   </Col>
</Row>

<Row class="kc1_m" >
   <Col :xs="{ span: 20, offset: 2 }">
     <!-- <span class="pxkc_boder"></span> -->
     <span class="kc_m">课程五：定量安全评估（QRA）</span>
     <ul>
       <li><div class="time_m"></div></li>
       <li><span class="kcsj_m">课程时间:</span>3天</li>
       <li><div class="jingsi_m" style="margin-left:10px;"></div></li>
       <li><span class="kcsj_m">培训讲师:</span>1名<br></li>
     </ul>
     </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxry_m"></div></li>
         <li><span class="kcsj_m">培训人员：</span></li>
         <li>生产/维护/技术主管、工艺工程师、风险分析员、安全工程师等</li>
     </ul>
   </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxnr_m"></div></li>
         <li><span class="kcsj_m">主要内容：</span></li>
     </ul>
     <ol class="pxnr_content_m">
       <li>QRA的概念；</li>
       <li>QRA的工作流程；</li>
       <li>QRA的目的；</li>
       <li>QRA软件；</li> 
       <li>QRA输入条件；</li> 
       <li>QRA输出结果；</li>    
     <li>QRA的典型应用领域。</li>    
     </ol>
   </Col>
</Row>
<Row class="kc2_m">
   <Col :xs="{ span: 20, offset: 2 }">
     <!-- <span class="pxkc_boder"></span> -->
     <span class="kc_m">课程六：危险与可操作性分析（HAZOP）</span>
     <ul>
       <li><div class="time_m"></div></li>
       <li><span class="kcsj_m">课程时间:</span>3天</li>
       <li><div class="jingsi_m" style="margin-left:10px;"></div></li>
      <li><span class="kcsj_m">培训讲师:</span>1名<br></li>
     </ul>
     </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxry_m"></div></li>
         <li><span class="kcsj_m">培训人员：</span></li>
         <li>中层管理者、生产/维护/技术主管、工艺工程师、风险分析员、安全工程师等</li>
     </ul>
   </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxnr_m"></div></li>
         <li><span class="kcsj_m">主要内容：</span></li>
     </ul>
     <ol class="pxnr_content_m">
       <li>HAZOP的法律法规；</li>
       <li>HAZOP的目的；</li>
       <li>HAZOP分析的人员要求；</li>
       <li>HAZOP的常见术语及关键词；</li> 
       <li>常用的HAZOP分析工艺参数、偏差及可能原因；</li>
      <li>HAZOP分析所需的资料文件；</li>	 
       <li>HAZOP分析步骤及技术关键；</li> 
       <li>HAZOP分析优缺点；</li>
      <li>HAZOP分析案例。</li>	
     </ol>
   </Col>
</Row>  
<Row class="kc1_m" >
   <Col :xs="{ span: 20, offset: 2 }">
     <!-- <span class="pxkc_boder"></span> -->
     <span class="kc_m">课程七：危险源识别分析（HAZID）</span>
     <ul>
       <li><div class="time_m"></div></li>
       <li><span class="kcsj_m">课程时间:</span>1天</li>
       <li><div class="jingsi_m" style="margin-left:10px;"></div></li>
       <li><span class="kcsj_m">培训讲师:</span>1名<br></li>
     </ul>
     </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxry_m"></div></li>
         <li><span class="kcsj_m">培训人员：</span></li>
         <li>中层管理者、生产/维护/技术主管、工艺工程师、风险分析员、安全工程师等</li>
     </ul>
   </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxnr_m"></div></li>
         <li><span class="kcsj_m">主要内容：</span></li>
     </ul>
     <ol class="pxnr_content_m">
       <li>法律法规——重大危险源；</li>
       <li>危险源识别分析（HAZID）的资料准备；</li>
       <li>HAZID分析流程；</li>
       <li>危险源的识别；</li> 
       <li>危险源的评估；</li> 
       <li>危险源的分类与管理；</li>    
      <li>重大危险源的控制与监控。</li>    
     </ol>
   </Col>
</Row>
<Row class="kc2_m">
   <Col :xs="{ span: 20, offset: 2 }">
     <!-- <span class="pxkc_boder"></span> -->
     <span class="kc_m">课程八：变更管理（MOC）</span>
     <ul>
       <li><div class="time_m"></div></li>
       <li><span class="kcsj_m">课程时间:</span>1天</li>
       <li><div class="jingsi_m" style="margin-left:10px;"></div></li>
      <li><span class="kcsj_m">培训讲师:</span>1名<br></li>
     </ul>
     </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxry_m"></div></li>
         <li><span class="kcsj_m">培训人员：</span></li>
         <li>中层管理者、设计/维修人员、安全监督、安全工程师、承包商等</li>
     </ul>
   </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxnr_m"></div></li>
         <li><span class="kcsj_m">主要内容：</span></li>
     </ul>
     <ol class="pxnr_content_m">
       <li>MOC的概念；</li>
       <li>MOC的范围；</li>
       <li>MOC的分类；</li>
       <li>MOC的工作流程；</li> 
       <li>MOC的审查；</li>
      <li>MOC的执行及效果验证；</li>	 
       <li>推展MOC的注意事项。</li> 
     </ol>
   </Col>
</Row> 

<Row class="kc1_m" >
   <Col :xs="{ span: 20, offset: 2 }">
     <!-- <span class="pxkc_boder"></span> -->
     <span class="kc_m">课程九：设备的质量保证与机械完整性（MIQA）</span>
     <ul>
       <li><div class="time_m"></div></li>
       <li><span class="kcsj_m">课程时间:</span>2天</li>
       <li><div class="jingsi_m" style="margin-left:10px;"></div></li>
       <li><span class="kcsj_m">培训讲师:</span>1名<br></li>
     </ul>
     </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxry_m"></div></li>
         <li><span class="kcsj_m">培训人员：</span></li>
         <li>中层管理者、设计/维修人员、安全监督、安全工程师、承包商等</li>
     </ul>
   </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxnr_m"></div></li>
         <li><span class="kcsj_m">主要内容：</span></li>
     </ul>
     <ol class="pxnr_content_m">
       <li>MIQA 的由来及定义；</li>
       <li>设备质量保证（QA）管理内容；</li>
       <li>设备的安装调试；</li>
       <li>设备的验收与文档记录</li> 
       <li>机械完整性（MI）管理内容；</li> 
       <li>推展MIQA的注意事项。</li>     
     </ol>
   </Col>
</Row>
<Row class="kc2_m">
   <Col :xs="{ span: 20, offset: 2 }">
     <!-- <span class="pxkc_boder"></span> -->
     <span class="kc_m">课程十：蝴蝶结（Bow-Tie）和保护层（LOPA）</span>
     <ul>
       <li><div class="time_m"></div></li>
       <li><span class="kcsj_m">课程时间:</span>2天</li>
       <li><div class="jingsi_m" style="margin-left:10px;"></div></li>
      <li><span class="kcsj_m">培训讲师:</span>1名<br></li>
     </ul>
     </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxry_m"></div></li>
         <li><span class="kcsj_m">培训人员：</span></li>
         <li>中层管理者、生产/维护/技术主管、工艺工程师、风险分析员、安全工程师等</li>
     </ul>
   </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxnr_m"></div></li>
         <li><span class="kcsj_m">主要内容：</span></li>
     </ul>
     <ol class="pxnr_content_m">
       <li>蝴蝶结（Bow-Tie）和保护层（LOPA）的概念；</li>
       <li>蝴蝶结（Bow-Tie）和保护层（LOPA）的工作流程；</li>
       <li>蝴蝶结（Bow-Tie）与HSE管理体系的关系；</li>
       <li>蝴蝶结（Bow-Tie）与根本风险因素的关系；</li> 
       <li>蝴蝶结（Bow-Tie）与事故事件调查的关系；</li>
      <li>蝴蝶结（Bow-Tie）和保护层（LOPA）的关系；</li>	 
       <li>蝴蝶结（Bow-Tie）和保护层（LOPA）的典型应用。</li> 
     </ol>
   </Col>
</Row>
</div>
<!-- 作业安全管理 -->
  <div v-if="num==4">
 <Row class="kc1_m"  >
   <Col :xs="{ span: 20, offset: 2 }">
     <!-- <span class="pxkc_boder"></span> -->
     <span class="kc_m">课程一：生产作业现场安全管理</span>
     <ul>
       <li><div class="time_m"></div></li>
       <li><span class="kcsj_m">课程时间:</span>3天</li>
       <li><div class="jingsi_m" style="margin-left:10px;"></div></li>
       <li><span class="kcsj_m">培训讲师:</span>2名<br></li>
     </ul>
     </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxry_m"></div></li>
         <li><span class="kcsj_m">培训人员：</span></li>
         <li>安全处室、HSE管理/监督人员、班组长、基层员工等中高层管理者、生产/维护/技术主管、工艺工程师、安全监督、安全工程师和承包商管理人员等</li>
     </ul>
   </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxnr_m"></div></li>
         <li><span class="kcsj_m">主要内容：</span></li>
     </ul>
     <ol class="pxnr_content_m">
       <li>落实直线责任、有感领导和属地管理；</li>
       <li>生产作业现场安全管理制度；</li>
       <li>交接班制度、5S管理；</li>
       <li>应急响应准备及演习；</li> 
       <li>基层安全管理组织及职责；</li> 
       <li>生产现场习惯性违章及其管理；</li>     
       <li>生产安全事故分析与改进方法；</li>
       <li>HSE小组学习与交流；</li>
       <li>目视化管理；</li>
       <li>作业许可管理；</li> 
       <li>承包商安全管理；</li> 
       <li>工程项目HSE管理；</li>   
     <li>成功实践介绍。</li> 
     </ol>
   </Col>
</Row>
<!-- 课程4-2 -->
<Row class="kc2_m">
<Col :xs="{ span: 20, offset: 2 }">
<!-- <span class="pxkc_boder"></span> -->
<span class="kc_m">课程二：目视化安全管理</span>
<ul>
<li><div class="time_m"></div></li>
<li><span class="kcsj_m">课程时间:</span>1天</li>
<li><div class="jingsi_m" style="margin-left:10px;"></div></li>
<li><span class="kcsj_m">培训讲师:</span>1名<br></li>
</ul>
</Col>
<Col :xs="{ span: 20, offset: 2 }">
<ul>
<li><div class="pxry_m"></div></li>
<li><span class="kcsj_m">培训人员：</span></li>
<li>安全处室、HSE管理/监督人员、班组长、基层员工等</li>
</ul>
</Col>
<Col :xs="{ span: 20, offset: 2 }">
<ul>
<li><div class="pxnr_m"></div></li>
<li><span class="kcsj_m">主要内容：</span></li>
</ul>
<ol class="pxnr_content_m">
<li>目视化安全管理的概念；</li>
<li>安全色、标牌、标签；</li>
<li>目视化安全管理的优点；</li>
<li>人员管理目视化；</li> 
<li>工具、器具管理目视化；</li> 
<li>设备、设施管理目视化；</li>
<li>作业区域管理目视化；</li>
<li>道路管理目视化；</li>
<li>风险管理目视化。</li>
</ol>
</Col>
</Row> 
<!-- 课程4-3-->
  <Row class="kc1_m">
   <Col :xs="{ span: 20, offset: 2 }">
     <!-- <span class="pxkc_boder"></span> -->
     <span class="kc_m">课程三：开工前安全检查（PSSR）</span>
     <ul>
       <li><div class="time_m"></div></li>
       <li><span class="kcsj_m">课程时间:</span>2天</li>
       <li><div class="jingsi_m" style="margin-left:10px;"></div></li>
      <li><span class="kcsj_m">培训讲师:</span>1名<br></li>
     </ul>
     </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxry_m"></div></li>
         <li><span class="kcsj_m">培训人员：</span></li>
         <li>中高层管理者、公共工程主管、工艺工程师、安全监督、安全工程师等</li>
     </ul>
   </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxnr_m"></div></li>
         <li><span class="kcsj_m">主要内容：</span></li>
     </ul>
     <ol class="pxnr_content_m">
<li> PSSR的概念；</li>
<li> PSSR的几种定义；</li>
<li> PSSR的触发事件；</li>
<li> PSSR的目的与益处；</li>
<li> PSSR的工作流程；</li>
<li> PSSR团队的建设；</li>
<li> PSSR的执行步骤；</li>
<li> PSSR的简表和详表；</li>
<li> PSSR的绝优做法。</li>
     </ol>
   </Col>
</Row> 
 <!-- 课程4-4-->
  <Row class="kc2_m">
   <Col :xs="{ span: 20, offset: 2 }">
     <!-- <span class="pxkc_boder"></span> -->
     <span class="kc_m">课程四：工作前安全分析（JSA）</span>
     <ul>
       <li><div class="time_m"></div></li>
       <li><span class="kcsj_m">课程时间:</span>1天</li>
       <li><div class="jingsi_m" style="margin-left:10px;"></div></li>
      <li><span class="kcsj_m">培训讲师:</span>1名<br></li>
     </ul>
     </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxry_m"></div></li>
         <li><span class="kcsj_m">培训人员：</span></li>
         <li>中层管理者、维修人员、安全监督、安全工程师、承包商等</li>
     </ul>
   </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxnr_m"></div></li>
         <li><span class="kcsj_m">主要内容：</span></li>
     </ul>
     <ol class="pxnr_content_m">
<li> JSA的概述；</li>
<li> JSA的意义和应用领域；</li>
<li> JSA的管理流程；</li>
<li> JSA的工作流程；</li>
<li> JSA的典型做法；</li>
<li> 作业现场常见的危害。</li>
     </ol>
   </Col>
</Row> 
 <!-- 课程4-5 -->
  <Row class="kc1_m">
   <Col :xs="{ span: 20, offset: 2 }">
     <!-- <span class="pxkc_boder"></span> -->
     <span class="kc_m">课程五：作业许可管理</span>
     <ul>
       <li><div class="time_m"></div></li>
       <li><span class="kcsj_m">课程时间:</span>1天</li>
       <li><div class="jingsi_m" style="margin-left:10px;"></div></li>
      <li><span class="kcsj_m">培训讲师:</span>1名<br></li>
     </ul>
     </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxry_m"></div></li>
         <li><span class="kcsj_m">培训人员：</span></li>
         <li>中高层管理者、维修人员、安全监督、安全工程师、承包商等</li>
     </ul>
   </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxnr_m"></div></li>
         <li><span class="kcsj_m">主要内容：</span></li>
     </ul>
     <ol class="pxnr_content_m">
<li> 为什么要实施作业许可？</br>
——作业许可管理规范与专项作业许可管理规范的关系</li>
<li> 作业许可管理职责；</li>
<li> 作业许可管理范围：</br>
——非计划性维修工作</br>
——承包商作业</br>
——偏离安全标准、规则、程序要求的工作</br>
——交叉作业</br>
——在承包商区域进行的工作</br>
——缺乏安全程序的工作</li>
<li> 作业许可管理流程：</br>
——作业申请</br>
——作业批准</br>
——作业实施</br>
——作业关闭</li>
<li> 作业许可票证管理；</li>
<li> 作业许可管理要点。</li>
     </ol>
   </Col>
</Row> 
 <!-- 课程4-6 -->
  <Row class="kc2_m">
   <Col :xs="{ span: 20, offset: 2 }">
     <!-- <span class="pxkc_boder"></span> -->
     <span class="kc_m">课程六：应急响应准备（ERP）</span>
     <ul>
       <li><div class="time_m"></div></li>
       <li><span class="kcsj_m">课程时间:</span>2天</li>
       <li><div class="jingsi_m" style="margin-left:10px;"></div></li>
      <li><span class="kcsj_m">培训讲师:</span>1名<br></li>
     </ul>
     </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxry_m"></div></li>
         <li><span class="kcsj_m">培训人员：</span></li>
         <li>中高层管理者、各应急小组成员、安全监督、安全工程师等</li>
     </ul>
   </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxnr_m"></div></li>
         <li><span class="kcsj_m">主要内容：</span></li>
     </ul>
     <ol class="pxnr_content_m">
<li> 应急需求识别与评估；</li>
<li> 各种应急计划制订；</li>
<li> 应急计划审核；</li>
<li> 应急沟通；</li>
<li> 应急保护系统；</li>
<li> 能量控制；</li>
<li> 应急小组；</li>
<li> 应急演习；</li>
<li> 急救人员与设备；</li>
<li> 外部支援。</li>
     </ol>
   </Col>
</Row>
</div>

<!-- 行为安全管理 -->
<div v-if="num==5">
  <!-- 课程5-1 -->
<Row class="kc1_m">
<Col :xs="{ span: 20, offset: 2 }">
<!-- <span class="pxkc_boder"></span> -->
<span class="kc_m">课程一：行为安全Behaviour Based Safety(BBS)</span>
<ul>
<li><div class="time_m"></div></li>
<li><span class="kcsj_m">课程时间:</span>2天</li>
<li><div class="jingsi_m" style="margin-left:10px;"></div></li>
<li><span class="kcsj_m">培训讲师:</span>1名<br></li>
</ul>
</Col>
<Col :xs="{ span: 20, offset: 2 }">
<ul>
<li><div class="pxry_m"></div></li>
<li><span class="kcsj_m">培训人员：</span></li>
<li>各级管理层、安全处室、HSE管理/监督人员、班组长、基层员工等</li>
</ul>
</Col>
<Col :xs="{ span: 20, offset: 2 }">
<ul>
<li><div class="pxnr_m"></div></li>
<li><span class="kcsj_m">主要内容：</span></li>
</ul>
<ol class="pxnr_content_m">
<li>行为安全管理基础：<br/>-行为安全与事故预防<br/>-行为安全管理的三阶段：冒险行为、安全标准、安全文化<br/>-不安全行为分类<br/>-行为影响因素与模型<br/>-行为安全观察的二个阶段：行为安全审核、行为安全观察</li>
<li>行为安全观察方法：流程、原则、观察与沟通过程、观察内容、统计数据分析</li>
<li>行为安全管理技巧：<br/>-沟通技巧<br/>-显示管理承诺<br/>-现场安全指导<br/>-不安全行为与事故<br/>-行为安全与管理安全</li>
<li>行为安全观察记录卡：<br/>-行为安全观察卡格式<br/>-行为安全观察步骤<br/>-行为安全观察卡填写</li> 
<li>实施步骤与流程：<br/>-标准化流程<br/>-指导小组<br/>-成员职责<br/>-行为安全观察卡的收集、分析与反馈</li> 
<li>案例分析。</li>
</ol>
</Col>
</Row> 
<!-- 课程5-2 -->
<Row class="kc2_m">
<Col :xs="{ span: 20, offset: 2 }">
<!-- <span class="pxkc_boder"></span> -->
<span class="kc_m">课程二：高级行为安全观察Advanced Behaviour Based Safety(ＡＢＢＳ)</span>
<ul>
<li><div class="time_m"></div></li>
<li><span class="kcsj_m">课程时间:</span>1天</li>
<li><div class="jingsi_m" style="margin-left:10px;"></div></li>
<li><span class="kcsj_m">培训讲师:</span>1名<br></li>
</ul>
</Col>
<Col :xs="{ span: 20, offset: 2 }">
<ul>
<li><div class="pxry_m"></div></li>
<li><span class="kcsj_m">培训人员：</span></li>
<li>各级管理层、安全处室、HSE管理/监督人员、班组长、基层员工等</li>
</ul>
</Col>
<Col :xs="{ span: 20, offset: 2 }">
<ul>
<li><div class="pxnr_m"></div></li>
<li><span class="kcsj_m">主要内容：</span></li>
</ul>
<ol class="pxnr_content_m">
<li>行为纠正理论；</li>
<li>行为安全观察与反馈；</li>
<li>行为安全管理的意义；</li>
<li>关键行为管理；</li> 
<li>关键人物行为管理；</li> 
<li>行为安全与安全管理体系的整合；</li>
<li>案例分析。</li>
</ol>
</Col>
</Row> 
</div>
<!-- 审核与评估 -->
<div v-if="num==6">
  <!-- 课程6-1 -->
  <Row class="kc1_m">
   <Col :xs="{ span: 20, offset: 2 }">
     <!-- <span class="pxkc_boder"></span> -->
     <span class="kc_m">课程一：合规性审计</span>
     <ul>
       <li><div class="time_m"></div></li>
       <li><span class="kcsj_m">课程时间:</span>1天</li>
       <li><div class="jingsi_m" style="margin-left:10px;"></div></li>
      <li><span class="kcsj_m">培训讲师:</span>1名<br></li>
     </ul>
     </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxry_m"></div></li>
         <li><span class="kcsj_m">培训人员：</span></li>
         <li>中高层管理者、设计/维修人员、安全监督、安全工程师、承包商等</li>
     </ul>
   </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxnr_m"></div></li>
         <li><span class="kcsj_m">主要内容：</span></li>
     </ul>
     <ol class="pxnr_content_m">
<li> 法律法规；</li>
<li> 运营许可；</li>
<li> 行业规范和标准；</li>
<li> 信息安全；</li>
<li> 产品监护；</li>
<li> 现场巡视、人员访谈；</li>
<li> 合规性审计报告。</li>
     </ol>
   </Col>
</Row> 
  <!-- 课程6-2 -->
  <Row class="kc2_m">
   <Col :xs="{ span: 20, offset: 2 }">
     <!-- <span class="pxkc_boder"></span> -->
     <span class="kc_m">课程二：承包商（供应商）审核、管理及量化评估</span>
     <ul>
       <li><div class="time_m"></div></li>
       <li><span class="kcsj_m">课程时间:</span>1天</li>
       <li><div class="jingsi_m" style="margin-left:10px;"></div></li>
      <li><span class="kcsj_m">培训讲师:</span>1名<br></li>
     </ul>
     </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxry_m"></div></li>
         <li><span class="kcsj_m">培训人员：</span></li>
         <li>中层管理者、设计/维修人员、安全监督、安全工程师、承包商等</li>
     </ul>
   </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxnr_m"></div></li>
         <li><span class="kcsj_m">主要内容：</span></li>
     </ul>
     <ol class="pxnr_content_m">
     <li> 	承包商安全管理问题的探讨；</li>
 <li>	承包商安全管理改进提议的探讨；</li>
 <li>	跨国公司承包商安全管理的流程和实践；</li>
 <li>	分析国内大公司承包商安全管理存在的问题；</li>
 <li>	探讨相应的改进建议；</li>
 <li>	承包商的日常管理；</li>
 <li>	承包商的审核；</li>
 <li>	承包商的量化评估。</li>
     </ol>
   </Col>
</Row> 
  <!-- 课程6-3 -->
  <Row class="kc1_m">
   <Col :xs="{ span: 20, offset: 2 }">
     <!-- <span class="pxkc_boder"></span> -->
     <span class="kc_m">课程三：应急响应准备量化评估</span>
     <ul>
       <li><div class="time_m"></div></li>
       <li><span class="kcsj_m">课程时间:</span>2天</li>
       <li><div class="jingsi_m" style="margin-left:10px;"></div></li>
      <li><span class="kcsj_m">培训讲师:</span>1名<br></li>
     </ul>
     </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxry_m"></div></li>
         <li><span class="kcsj_m">培训人员：</span></li>
         <li>中高层管理者、各应急小组成员、安全监督、安全工程师等</li>
     </ul>
   </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxnr_m"></div></li>
         <li><span class="kcsj_m">主要内容：</span></li>
     </ul>
     <ol class="pxnr_content_m">
       <li>应急响应准备量化评估的程序；</li>
       <li>应急响应准备量化评估的得分简介；</li>
       <li>应急需求识别与评估；</li>
       <li>现场应急计划；</li>
<li>场外应急计划；</li>
<li>危机计划；</li>
<li>业务持续计划；</li>
<li>应急计划审核；</li>
<li>应急沟通；</li>
<li>应急保护系统；</li>
<li>能量控制；</li>
<li>应急小组；</li>
<li>应急演习；</li>
<li>急救人员与设备；</li>
<li>医疗支持；</li>
<li>外部支援。</li>
     </ol>
   </Col>
</Row> 
  <!-- 课程6-4 -->
  <Row class="kc2_m">
   <Col :xs="{ span: 20, offset: 2 }">
     <!-- <span class="pxkc_boder"></span> -->
     <span class="kc_m">课程四：事故事件调查</span>
     <ul>
       <li><div class="time_m"></div></li>
       <li><span class="kcsj_m">课程时间:</span>1天</li>
       <li><div class="jingsi_m" style="margin-left:10px;"></div></li>
      <li><span class="kcsj_m">培训讲师:</span>1名<br></li>
     </ul>
     </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxry_m"></div></li>
         <li><span class="kcsj_m">培训人员：</span></li>
         <li>中高层管理者、设计/维修人员、安全监督、安全工程师、承包商等</li>
     </ul>
   </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxnr_m"></div></li>
         <li><span class="kcsj_m">主要内容：</span></li>
     </ul>
     <ol class="pxnr_content_m">
       <li>目前事故事件调查的机制和倾向；</li>
       <li>事故事件调查处理的成功实践；</li>
       <li>事故事件调查的工具方法。</li>
     </ol>
   </Col>
</Row>
</div>
<div v-if="num==7">
  <!-- 课程7 -->
<Row class="kc1_m">
   <Col :xs="{ span: 20, offset: 2 }">
     <!-- <span class="pxkc_boder"></span> -->
     <span class="kc_m">企业HSE信息化应用转型</span>
     <ul>
       <li><div class="time_m"></div></li>
       <li><span class="kcsj_m">课程时间:</span>1天</li>
       <li><div class="jingsi_m" style="margin-left:10px;"></div></li>
       <li><span class="kcsj_m">培训讲师:</span>1名<br></li>
     </ul>
     </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxry_m"></div></li>
         <li><span class="kcsj_m">培训人员：</span></li>
         <li>企业中高层领导、信息化管理人员，HSE管理人员等</li>
     </ul>
   </Col>
   <Col :xs="{ span: 20, offset: 2 }">
      <ul>
         <li><div class="pxnr_m"></div></li>
         <li><span class="kcsj_m">主要内容：</span></li>
     </ul>
     <ol class="pxnr_content_m">
       <li>HSE信息化的目的和益处；</li>
       <li>HSE信息化成功实践；</li>
       <li>HSE信息化工作流程；</li>
       <li>HSE信息化典型功能应用场景分析：</br>
           -	功能需求来源</br> 
           -	主要功能介绍</br>
           -  功能应用场景对比（原状/现状）</li>
     </ol>
   </Col>
</Row>
</div>

 </div>
</template>
<script>
import Swiper from 'swiper';
export default {
  data() {
    return {
       murl:"http://oss.chain-smart.com/assetM/",
      num:1,
    }
  },
  methods: {
        getData(index) {
      this.num = index;
    },
  },
  mounted: function () {
    new Swiper('.swiper-container',{
         slidesPerView: 3,
            spaceBetween: 10,
            pagination: {
                el: '.swiper-pagination',
                clickable: true,
            },
   })
  
  }
}

</script>
<style scoped>
img {
  width: 100%;
  height: auto;
}
.cptd{
margin-top:12px;
}
.kc1_m{
  margin-top:5vh;
  margin-bottom: 5vh;
}
.kc2_m{
  padding-bottom:5vh;
  padding-top:5vh;
  background: #F0F0F0;
}
/* .pxkc_boder{
      border-left:4px solid #5DC0C1;
      height:22px;
      display:inline-block;
      margin-right:20px;
   
   } */
.kc_m{
  font-size:1.1rem;
  font-weight: bold;
  /* height:22px;
  color: #111111; */
  height: 26px;
  line-height: 26px;
  padding-left: 4%;
  border-left: 4px solid #5DC0C1;
}

.time_m{
  background: url("http://oss.chain-smart.com/assetM/icon_peixun_time.png");
  width:22px;
  height:22px;
}
.jingsi_m{
  background: url("http://oss.chain-smart.com/assets/icon_peixun_jiangshi.png");
  width:22px;
  height:22px;
}
.kcsj_m{
  font-weight:600;
  font-size:0.9rem;
  /* color: #111111; */
}
.pxry_m{
    background: url("http://oss.chain-smart.com/assets/icon_peixun_renyuan.png");
  width:22px;
  height:22px;
 }
 .pxnr_m{
   background: url("http://oss.chain-smart.com/assets/icon_peixun_neirong.png");
  width:22px;
  height:22px;
}
.pxnr_content_m{
  margin-top:50px;
  margin-left:16px;
}
ol li{
  font-size:0.9rem;
}
ul{
  list-style: none;
  margin-left:-15px;
  margin-top:20px;
}
ul li{
  float:left;
  margin-left:10px;
  line-height:22px;
  font-size:0.9rem;
}
.kclb .swiper-slide{
  width:20%;
  font-size:1rem;
  /* height:30px!important; */
  font-weight: bold;
  text-align: center;
  /* line-height: 30px; */
  color: #ccc;
}
.kclb .swiper-slide:first-child{
  /* margin-left:10px!important; */
}
.kclb span {
  /* width:100%;  */
  display: inline-block;
  height:40px!important;
  line-height: 40px;
}
.kclb .active {
  color: #5dc0c1;
  border-bottom: 3px solid #5dc0c1;
  /* padding-bottom: 6px; */
}
</style>
