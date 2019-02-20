<%@page import="com.xnx3.j2ee.Global"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://www.xnx3.com/java_xnx3/xnx3_tld" prefix="x" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <jsp:include page="../../iw/common/head.jsp">
        <jsp:param name="title" value="首页"/>
    </jsp:include>
</head>
<body>



<table class="layui-table iw_table">
  <tbody>
	   	<tr>
	   		<td>SLS日志服务</td>
	   		<td id="sls"></td>
	    </tr>
		<tr>
	   		<td>OSS对象存储</td>
	   		<td id="oss"></td>
	    </tr>
  </tbody>
</table>
<!-- <div onclick="deleteThis" style="border:1px; width:100%; height:80px; font-size:50px;">创建完毕？彻底删除此插件</div> -->

<script>
//SLS检测
var slsObj = document.getElementById('sls');
if('<%=Global.get("ALIYUN_SLS_USE")  %>' == '1'){
	slsObj.innerHTML = "已使用";
}else{
	//未使用
	slsObj.innerHTML = '未使用&nbsp;&nbsp; <button onclick="createSLS();">创建此组建云服务并启用</button>';
}

//OSS检测
var ossObj = document.getElementById('oss');
if('<%=Global.get("ATTACHMENT_FILE_MODE")  %>' == 'aliyunOSS'){
	ossObj.innerHTML = "已使用";
}else{
	//未使用
	ossObj.innerHTML = '未使用&nbsp;&nbsp; <button onclick="createOSS();">创建此组建云服务并启用</button>';
}

//创建OSS服务及自动配置
function createOSS(){
	parent.iw.loading("创建中");    //显示“更改中”的等待提示
	$.post(
	    "<%=basePath %>/plugin/aliyunServiceCreate/oss/create.do",  function(data){
	        parent.iw.loadClose();    //关闭“更改中”的等待提示
	        if(data.result != '1'){
	            parent.iw.msgFailure(data.info);
	        }else{
	            parent.iw.msgSuccess("操作成功!记得更改cdn附件路径。");
	            window.onload();	//刷新页面
	        }
	    }, 
	"json");
}


//创建SLS服务及自动配置
function createSLS(){
	parent.iw.loading("创建中");    //显示“更改中”的等待提示
	$.post(
	    "<%=basePath %>/plugin/aliyunServiceCreate/sls/create.do",  function(data){
	        parent.iw.loadClose();    //关闭“更改中”的等待提示
	        if(data.result != '1'){
	            parent.iw.msgFailure(data.info);
	        }else{
	            parent.iw.msgSuccess("已创建SLS日志服务！1分钟后生效");
	            window.onload();	//刷新页面
	        }
	    }, 
	"json");
}

</script>


<jsp:include page="../../iw/common/foot.jsp"></jsp:include>  