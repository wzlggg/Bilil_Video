<%@include file="common/taglib.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	//获取绝对路径路径 
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html class="no-js" lang="en">
<head>
<base href="<%=basePath%>" />
<meta charset="utf-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Bli video</title>
<link rel="stylesheet" href="css/app.css">
<link rel="stylesheet" href="css/theme.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
<link
	href='https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet" type="text/css"
	href="layerslider/css/layerslider.css">
<link rel="stylesheet" href="css/owl.carousel.min.css">
<link rel="stylesheet" href="css/owl.theme.default.min.css">
<link rel="stylesheet" href="css/jquery.kyco.easyshare.css">
<link rel="stylesheet" href="css/responsive.css">
</head>
<body>
	<div class="off-canvas-wrapper">
		<div class="off-canvas-wrapper-inner" data-off-canvas-wrapper>
			<!--header-->
			<div class="off-canvas-content" data-off-canvas-content>
				<%@include file="top.jsp" %>
				<!--breadcrumbs-->
				<section id="breadcrumb">
					<div class="row">
						<div class="large-12 columns">
							<nav aria-label="You are here:" role="navigation">
								<ul class="breadcrumbs">
									<li><i class="fa fa-home"></i><a href="system/PlayUserAction_indexUI">主页</a></li>
									<li><span class="show-for-sr">现在: </span> 用户登录</li>
								</ul>
							</nav>
						</div>
					</div>
				</section>
				<!--end breadcrumbs-->

				<!-- registration -->
				<section class="registration">
					<div class="row secBg">
						<div class="large-12 columns">
							<div class="login-register-content">
								<div class="row collapse borderBottom">
									<div class="medium-6 large-centered medium-centered">
										<div class="page-heading text-center">
											<h3>用户登录</h3>
										</div>
									</div>
								</div>
								<div class="row" data-equalizer data-equalize-on="medium"
									id="test-eq">
									<div class="large-4 medium-6 columns end">
										<div class="register-form">
											<h5 class="text-center">登录账号</h5>
											<%--登陆逻辑 Action --%>
											<form method="post"
												action="system/PlayUserAction_login">
												<div data-abide-error class="alert callout"
													style="display: none;">
													<p>
														<i class="fa fa-exclamation-triangle"></i> 用户名或密码输入不正确。
													</p>
												</div>
												<div class="input-group">
													<span class="input-group-label"><i
														class="fa fa-user"></i></span>
													<!--FORM-INPUT 输入账号 -->
													<input class="input-group-field" type="text"
														placeholder="请输入用户名" name="playUserName"> <span
														class="form-error">用户名不可用</span>
												</div>

												<div class="input-group">
													<span class="input-group-label"><i
														class="fa fa-lock"></i></span>
													<!--FORM-INPUT 输入密码 -->
													<input type="password" id="password" placeholder="请输入密码"
														name="playUserPassword"> <span class="form-error">请输入正确密码</span>
												</div>
												<div class="checkbox">
													<input id="remember" type="checkbox" name="check"
														value="remember"> <label class="customLabel"
														for="remember">记住我</label>
												</div>
												<button class="button expanded" type="submit" name="submit">立即登录</button>
												<p class="loginclick">
													<a href="system/PlayUserAction_registerUI.action">创建新账号</a>
												</p>
											</form>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</section>
				<%@include file="foot.jsp" %>
			</div>
			<!--end off canvas content-->
		</div>
		<!--end off canvas wrapper inner-->
	</div>
	<!--end off canvas wrapper-->
	<!-- script files -->
	<script src="bower_components/jquery/dist/jquery.js"></script>
	<script src="bower_components/what-input/what-input.js"></script>
	<script
		src="bower_components/foundation-sites/dist/foundation.js"></script>
	<script src="js/jquery.showmore.src.js" type="text/javascript"></script>
	<script src="js/app.js"></script>
	<script src="layerslider/js/greensock.js"
		type="text/javascript"></script>
	<!-- LayerSlider script files -->
	<script src="layerslider/js/layerslider.transitions.js"
		type="text/javascript"></script>
	<script
		src="layerslider/js/layerslider.kreaturamedia.jquery.js"
		type="text/javascript"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/inewsticker.js" type="text/javascript"></script>
	<script src="js/jquery.kyco.easyshare.js"
		type="text/javascript"></script>
</body>
</html>