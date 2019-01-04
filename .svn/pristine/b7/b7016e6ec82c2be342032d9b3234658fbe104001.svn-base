<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%
	//获取绝对路径路径 
	String path = request.getContextPath();

			String basePath = request.getScheme() + "://"
					+ request.getServerName() + ":" + request.getServerPort()
					+ path + "/";
	%>   
<%@ taglib prefix="d" uri="http://displaytag.sf.net" %>	   
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title></title>
<link href="resource/css/bootstrap.min.css" rel="stylesheet" />
<script type="text/javascript" src="resource/js/jquery.min.js"></script>
<script type="text/javascript"
	src="resource/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="resource/My97DatePicker/WdatePicker.js"></script>	
<script type="text/javascript">
$(function(){
	
})

</script>	
</head>
<body>
<div>
		<ul class="breadcrumb" style="margin: 0px;">
			<li>视频管理</li>
			<li>视频查询</li>
		</ul>
	</div>
	<div class="alert alert-warning alert-dismissible fade in" role="alert" style="display:${tip==null?'none':'block' };margin-bottom: 0px;">
     	<h4 align="center" style="color: red">${tip }</h4>
    </div>
	<form action="system/BkVedioAction_findVedios" id="f1" method="post" class="form-inline">
		<div class="row alert alert-info" style="margin: 0px; padding: 5px;">
			<div class="form-group">
			<%--<label>视频up主:</label> <input type="text" class="form-control" name="userName" value="${vedioSearch.playUser.playUserName}" placeholder="请输入视频up主" />--%>
			<label>视频编号:</label> <input type="text" class="form-control" name="vedioId" value="${vedioSearch.vedioId}" placeholder="请输入视频名称" />
			<label>视频名称:</label> <input type="text" class="form-control" name="vedioName" value="${vedioSearch.vedioName}" placeholder="请输入视频名称" />
			<label>开始时间:</label> <input type="text" class="form-control " name="startTime" type="text" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})"  value='<fmt:formatDate value="${vedioSearch.startTime }" pattern="yyyy-MM-dd" type="both"/>' placeholder="请输入开始时间" />
			<label>结束时间:</label> <input type="text" class="form-control" name="endTime" type="text" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})"   value='<fmt:formatDate value="${vedioSearch.endTime }" pattern="yyyy-MM-dd" type="both"/>' placeholder="请输入结束时间" />	
			<%-- <label>视频状态:</label>
			<select class="form-control" name="expernseState">
				<option value="">请选择</option>
				<option value="1" ${expense.expernseState=='1'?'selected':'' } >经理未审核</option>
				<option value="2" ${expense.expernseState=='2'?'selected':'' }>经理审核通过</option>
				<option value="3" ${expense.expernseState=='3'?'selected':'' }>财务审核通过</option>
				<option value="-2" ${expense.expernseState=='-2'?'selected':'' }>经理审核未通过</option>
				<option value="-3" ${expense.expernseState=='-3'?'selected':''}>财务审核未通过</option>
			</select> --%>
			</div>
			<input type="submit" class="btn btn-danger" value="查询"> 
		
		</div>
		
		<div class="row" style="padding: 15px;">
			<d:table class="table table-hover table-condensed" name="vedioList" pagesize="10" requestURI="system/BkVedioAction_findVedios">
				<d:column property="vedioId" title="视频编号"></d:column>
				<d:column property="vedioName" title="视频名称"></d:column>
				<d:column property="vedioTime" title="视频时间"></d:column>
				<d:column property="vedioState" title="视频状态"></d:column>
				<d:column value="删除" title="操作" href="system/BkVedioAction_deleteVedios"  paramId="vedioId" paramProperty="vedioId"></d:column>
				
			</d:table>
		</div>
	</form>
</body>
</html>