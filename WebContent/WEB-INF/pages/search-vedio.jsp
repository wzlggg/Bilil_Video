<%@include file="common/taglib.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
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
				<%@include file="top.jsp"%>
				<!--breadcrumbs-->
				<section id="breadcrumb">
					<div class="row">
						<div class="large-12 columns">
							<nav aria-label="You are here:" role="navigation">
								<ul class="breadcrumbs">
									<li><i class="fa fa-home"></i> <a
										href="system/PlayUserAction_indexUI">主页</a></li>
									<li><span class="show-for-sr">现在: </span> 视频</li>
								</ul>
							</nav>
						</div>
					</div>
				</section>
				<!--end breadcrumbs-->
				<!--search -->
				<section id="search">
					<div class="search-bar">
						<div class="search-center">
							<img src="images/search.png" alt="search" />
							<form method="post" action="system/VedioAction_vedioSearch">
								<div class="search-input float-left">
									<input type="search" name="vedioName" placeholder="请输入视频名称">
								</div>
								<div class="search-btn float-right text-right">
									<button class="button" name="search" type="submit">搜索</button>
								</div>
							</form>
						</div>
					</div>
				</section>
				<!--end search-->
				<!--search navigation-->
				<section id="vedio-navigation">
					<ul class="vedio-classification">
						<li><a href="#">萌宠</a></li>
						<li><a href="#">美食</a></li>
						<li><a href="#">舞蹈</a></li>
						<li><a href="#">科技</a></li>
					</ul>
				</section>
				<!--end search navigation-->
				<!--show all vedio-->
				<section id="show" class="row secBg">
					<div class="large-12 columns">
						<ul class="vedio-list" id="vedio">
						<c:forEach var="vedio" items="${vedioList }">
							<li>
								<div class="vedio-div">
									<a href="system/VedioAction_vedioFind?vedioId=${vedio.vedioId }">
									<video class="shipin" src="${vedio.vedioUrl}"></video></a>
									<div class="vedio-name">
										<span><a href="system/VedioAction_vedioFind?vedioId=${vedio.vedioId }"><b>${vedio.vedioName}</b></a></span>
									</div>
									<div class="update-time">
										<span><i class="fa fa-clock-o"></i>${vedio.vedioTime}</span>
									</div>
								</div>
							</li>
						</c:forEach>
						</ul>
					</div>
				</section>
				<!--end show all vedio-->
				<%@include file="foot.jsp"%>
			</div>
		</div>
	</div>
</body>
<script src="bower_components/jquery/dist/jquery.js"></script>
<script src="bower_components/what-input/what-input.js"></script>
<script src="bower_components/foundation-sites/dist/foundation.js"></script>
<script src="js/jquery.showmore.src.js" type="text/javascript"></script>
<script src="js/app.js"></script>
<script src="layerslider/js/greensock.js" type="text/javascript"></script>
<!-- LayerSlider script files -->
<script src="layerslider/js/layerslider.transitions.js"
	type="text/javascript"></script>
<script src="layerslider/js/layerslider.kreaturamedia.jquery.js"
	type="text/javascript"></script>
<script src="js/owl.carousel.min.js"></script>
<script src="js/inewsticker.js" type="text/javascript"></script>
<script src="js/jquery.kyco.easyshare.js" type="text/javascript"></script>
</html>