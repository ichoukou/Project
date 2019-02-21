<%@page import="com.xnx3.wangmarket.admin.G"%>
<%@page import="com.xnx3.j2ee.Global"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://www.xnx3.com/java_xnx3/xnx3_tld" prefix="x" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<jsp:include page="../../../iw/common/head.jsp">
	<jsp:param name="title" value="模版列表"/>
</jsp:include>
<script src="<%=basePath+Global.CACHE_FILE %>Template_iscommon.js"></script>

<jsp:include page="../../../iw/common/list/formSearch_formStart.jsp" ></jsp:include>
	<jsp:include page="../../../iw/common/list/formSearch_input.jsp">
		<jsp:param name="iw_label" value="模版编码"/>
		<jsp:param name="iw_name" value="name"/>
	</jsp:include>
	<jsp:include page="../../../iw/common/list/formSearch_input.jsp">
		<jsp:param name="iw_label" value="公司名"/>
		<jsp:param name="iw_name" value="companyname"/>
	</jsp:include>
	<jsp:include page="../../../iw/common/list/formSearch_input.jsp">
		<jsp:param name="iw_label" value="用户名"/>
		<jsp:param name="iw_name" value="username"/>
	</jsp:include>
	
	<input class="layui-btn iw_list_search_submit" type="submit" value="搜索" />
</form>	
        
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
	<thead>
		<tr>
			<th>模版编码</th>
			<th>公司名</th>
			<th>开发者名</th>
			<th>模版性质</th>
			<th>创建时间</th>
			<th>操作</th>
		</tr> 
	</thead>
	<tbody>
		<c:forEach items="${list}" var="item">
			<tr>
				<td style="width:55px;"><a href="view.do?id=${item['id'] }">${item['name'] }</a></td>
				<td>${item['companyname'] }</td>
				<td>${item['username'] }</td>
				<td><script type="text/javascript">writeIscommon(${item['iscommon'] });</script></td>
				<td style="width:100px;"><x:time linuxTime="${site['addtime'] }" format="yy-MM-dd"></x:time></td>
				<td>
					<button onclick="templateView();">详情</button>
				</td>
			</tr>
		</c:forEach>
  </tbody>
</table>
<!-- 通用分页跳转 -->
<jsp:include page="../../../iw/common/page.jsp" ></jsp:include>

<script>
//查看详情信息
function templateView(id){
	layer.open({
		type: 2, 
		title:'查看模版信息', 
		area: ['460px', '470px'],
		shadeClose: true, //开启遮罩关闭
		content: '<%=basePath %>plugin/templateCenter/admin/view.do?id='+id
	});
}

</script>
<jsp:include page="../../../iw/common/foot.jsp"></jsp:include>                  