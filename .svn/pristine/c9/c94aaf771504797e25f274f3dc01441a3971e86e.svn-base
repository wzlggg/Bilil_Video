<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%
	//获取绝对路径路径 
	String path = request.getContextPath();

			String basePath = request.getScheme() + "://"
					+ request.getServerName() + ":" + request.getServerPort()
					+ path + "/";
	%>   
	<!DOCTYPE html>   
<html>
<head>
<base href="<%=basePath %>" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>用户管理-用户添加</title>
<link href="resource/css/bootstrap.min.css" rel="stylesheet" />
<!-- <link href="resource/css/main.css" rel="stylesheet" /> -->
<script type="text/javascript" src="resource/js/jquery.min.js"></script>
<script type="text/javascript"
	src="resource/js/bootstrap.min.js"></script>
<script type="text/javascript" src="resource/validation/jquery.validate.js"></script>
<script type="text/javascript">
$(function(){
	//给文本框绑定事件 只能定义在这个地方
	$("input[id=playUserName]").blur(function(){
		var name = "";
		$("input[id=playUserName]").each(function(){
			name=($(this).val());
		});
		$("#userAccount").val(name);
		
	});
	 $("#f1").validate();
	 //监听焦点移开事件
	$("#userAccount").blur(function(){
	/* alert($("#userAccount").val()); */
		$.ajax({
			url:"system/BackgroundAction_checkUser",
			type:"post",
			dataType:"json",
			data:{
				userAccount:$("#userAccount").val()
			},
			success:function(resp){
				/*  if(resp.state==true){
					$("#accountinfo").html(resp.tip);
					$("#saveBtn").attr("disabled",true);
				}else{
					$("#accountinfo").html("");
					$("#saveBtn").attr("disabled",false);
				}  */
				/* alert(resp.state==true); */
				if(resp.state==false){
					$("#accountinfo").html(resp.tip);
					$("#saveBtn").attr("disabled",true);
				}else{
					$("#accountinfo").html(resp.tip);
					$("#saveBtn").attr("disabled",false);
				}
			}
		});
	});
	 
})
</script>	
<style type="text/css">.error{color: red;}</style>

</head>
<body>
<div>
		<ul class="breadcrumb" style="margin: 0px;">
			<li>系统管理</li>
			<li>用户管理</li>
			<li>用户添加</li>
		</ul>
	</div>
	<div class="alert alert-warning alert-dismissible fade in" role="alert" style="display:${info==null?'none':'block' };margin-bottom: 0px;">
     	<h4 align="center" style="color: red">${info }</h4>
    </div>
<form action="system/BackgroundAction_addUser" id="f1" method="post" class="form-horizontal">
		<h5 class="page-header alert-info"
			style="margin: 0px; padding: 10px; margin-bottom: 10px;">基本信息</h5>
			<input type="hidden" name="playUserId" value="${user.playUserId }" />
		<!-- 开始1 -->
		<div class="row">
			<div class="col-xs-5">
				<div class="form-group ">
					<label class="col-xs-3 control-label">用户姓名</label>
					<div class="col-xs-9 ">
						<input type="text" class="form-control" name="playUserName" id="playUserName" value="${user.playUserName }"  />
					</div>
				</div>
			</div>
			<div class="col-xs-5">
				<div class="form-group ">
					<label class="col-xs-3 control-label">用户生日</label>
					<div class="col-xs-9 ">
						<input type="date" class="form-control" name="playUserBirthday" value="${user.playUserBirthday }" placeholder="请输入用户生日" />
					</div>
				</div>
			</div>
		</div>
		<!--结束1 -->
		<!-- 开始2 -->
		<div class="row">
			<div class="col-xs-5">
				<div class="form-group ">
					<label class="col-xs-3 control-label">用户性别</label>
					<div class="col-xs-3 ">
						<select name="playUserSex" class="form-control">
							<option ${user.playUserSex=='保密'?'selected':'' } >保密</option>
							<option ${user.playUserSex=='男'?'selected':'' }>男</option>
							<option ${user.playUserSex=='女'?'selected':'' }>女</option>
						</select>
					</div>
				</div>
			</div>
			<div class="col-xs-5">
				<div class="form-group ">
					<label class="col-xs-3 control-label">电话号码</label>
					<div class="col-xs-9 ">
						<input type="text" class="form-control" name="playUserPhone" value="${user.playUserPhone }" placeholder="请输入电话号码" />
					</div>
				</div>
			</div>
		</div>
		<!--结束2 -->
		<!-- 开始3 -->
		<div class="row">
<%-- 			<div class="col-xs-5">
				<div class="form-group ">
					<label class="col-xs-3 control-label">用户角色</label>
					<div class="col-xs-4 ">
						<select name="roleId" class="form-control" >
							<option ${user.roleName=='普通员工'?'selected':'' } value="1">普通员工</option>
							<option ${user.roleName=='财务人员'?'selected':'' } value="2">财务人员</option>
							<option ${user.roleName=='部门经理'?'selected':'' } value="3">部门经理</option>
							<option ${user.roleName=='超级管理员'?'selected':'' } value="4">超级管理员</option>
						</select>
					</div>
				</div>
			</div> --%>
			<div class="col-xs-5">
				<div class="form-group ">
					<label class="col-xs-3 control-label">用户邮箱</label>
					<div class="col-xs-9 ">
						<input type="text" class="form-control" name="playUserEmail"  value="${user.playUserEmail }" placeholder="请输入邮箱" />
					</div>
				</div>
			</div>
		</div>
		<!--结束3 -->

		<h5 class="page-header alert-info"
			style="margin: 0px; padding: 10px; margin-bottom: 10px;">账号信息</h5>
		<!-- 开始5 -->
		<div class="row">
			<div class="col-xs-5">
				<div class="form-group ">
					<label class="col-xs-3 control-label">用户账号</label>
					<div class="col-xs-9">
						<input type="text" id="userAccount" class="form-control" required name="userAccount"  value="${user.playUserName }"  readonly="readonly" id="playUserName" placeholder="请输入用户账号" />
						<span style="display: inline;color: red" id="accountinfo"></span>
					</div>
				</div>
			</div>
			<div class="col-xs-5">
				<div class="form-group ">
					<label class="col-xs-3 control-label">用户密码</label>
					<div class="col-xs-9 ">
						<input type="text" class="form-control"  value="${user.playUserPassword }"  required name="playUserPassword" placeholder="请输入用户密码" />
					</div>
				</div>
			</div>
		</div>
		<!--结束5 -->

		<div class="row">
			<div class="col-xs-3 col-xs-offset-4">
				<input type="submit" class="btn btn-success" value="保存用户" /> <input
					type="reset" class="btn btn-danger" value="重置信息" />
			</div>

		</div>

	</form>
</body>
</html>