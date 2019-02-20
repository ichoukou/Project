<%@page import="com.xnx3.wangmarket.admin.G"%>
<%@page import="com.xnx3.j2ee.entity.User"%>
<%@page import="com.xnx3.j2ee.Global"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://www.xnx3.com/java_xnx3/xnx3_tld" prefix="x" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<jsp:include page="../../../iw/common/head.jsp">
	<jsp:param name="title" value="模版信息"/>
</jsp:include>
<script src="<%=basePath+Global.CACHE_FILE %>Template_iscommon.js"></script>
<script>
//页面上输出模版性质是共享还是私有
function writeIscommon(iscommon){
	if(iscommon == '1'){
		document.write('共享');
	}else{
		document.write('私有');
	}
}
</script>

<table class="layui-table iw_table">
	<tbody>
		<tr>
			<td class="iw_table_td_view_name">模版编码</td>
			<td>${template.name }</td>
		</tr>
		<tr>
			<td class="iw_table_td_view_name">模版开发时间</td>
			<td><x:time linuxTime="${template['addtime'] }"></x:time></td>
		</tr>
		<tr>
			<td>网站类型</td>
			<td><script type="text/javascript">writeIscommon(${template.iscommon });</script></td>
		</tr>
		
		
    </tbody>
</table>


<script type="text/javascript">
//自适应弹出层大小
var index = parent.layer.getFrameIndex(window.name); //获取窗口索引
parent.layer.iframeAuto(index);

function deleteNews(id){
	if(confirm("确定要删除吗？删除后不可恢复！")){
		window.location.href="delete.do?id="+id;
	}
}
function cancelLegitimate(id){
	window.location.href="cancelLegitimate.do?id="+id;
}
</script>

<jsp:include page="../../../iw/common/foot.jsp"></jsp:include>  