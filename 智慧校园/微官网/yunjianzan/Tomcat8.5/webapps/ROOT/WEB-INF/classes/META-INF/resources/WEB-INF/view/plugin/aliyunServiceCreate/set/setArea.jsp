<%@page import="com.xnx3.j2ee.Global"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.xnx3.com/java_xnx3/xnx3_tld" prefix="x" %>
<%
//iw/admin/system/variableList.jsp
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<jsp:include page="../../../iw/common/head.jsp">
	<jsp:param name="title" value="系统参数"/>
</jsp:include>

<table class="layui-table iw_table">
  <tbody>
	   	<tr>
	   		<td style="width:200px;"> 服务所在区域 ( End Point )  ：</td>
	   		<td style="width:160px;"><%=Global.get("ALIYUN_COMMON_ENDPOINT") %></td>
	        <td>
	        	设置：
	        	<select id="selectId" onchange="selectChange();">
	        		<option value="" >请选择服务区域</option>
	        		<option value="hangzhou" >杭州（华东 1）</option>
	        		<option value="shanghai" >上海（华东 2）</option>
	        		<option value="qingdao" >青岛（华北 1）</option>
	        		<option value="beijing" >北京（华北 2）</option>
	        		<option value="zhangjiakou" >张家口（华北 3）</option>
	        		<option value="shenzhen" >深圳（华南 1）</option>
	        		<option value="chengdu" >成都（西南 1）</option>
	        		<option value="hongkong" >香港</option>
	        	</select>
	        </td>
	    </tr>
  </tbody>
</table>


<script type="text/javascript">
//当选择区域之后，触发
function selectChange(){
	var objS = document.getElementById("selectId");
	if(objS.value.length < 2){
		return;
	}
    
    parent.iw.loading("更改中");    //显示“更改中”的等待提示
	$.post(
	    "<%=basePath %>/plugin/aliyunServiceCreate/set/setAreaSave.do", 
	    { "area": objS.value}, 
	        function(data){
	        parent.iw.loadClose();    //关闭“更改中”的等待提示
	        if(data.result != '1'){
	            parent.iw.msgFailure(data.info);
	        }else{
	            parent.iw.msgSuccess("操作成功");
	            window.location.href="../index.do";
	        }
	    }, 
	"json");
}
</script>

<jsp:include page="../../../iw/common/foot.jsp"></jsp:include> 