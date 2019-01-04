<%@include file="common/taglib.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	//获取绝对路径路径 
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!doctype html>
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
				<s:action name="VedioAction_vedioInfo" namespace="/system"></s:action>
				<!--breadcrumbs-->
				<section id="breadcrumb">
					<div class="row">
						<div class="large-12 columns">
							<nav aria-label="You are here:" role="navigation">
								<ul class="breadcrumbs">
									<li><i class="fa fa-home"></i><a href="index.html">主页</a></li>
									<li><a href="#">个人中心</a></li>
									<li><span class="show-for-sr">现在: </span> 我的视频</li>
								</ul>
							</nav>
						</div>
					</div>
				</section>
				<!--end breadcrumbs-->

				<!-- profile top section -->
				<section class="topProfile">
					<div class="profile-stats">
						<div class="row secBg">
							<div class="large-12 columns">
								<div class="profile-author-img">
								<%-- TODO --%>
									<img src="${userInfo.playUserHead }" alt="profile author img">
								</div>
								<div class="clearfix">
									<div class="profile-author-name float-left">
										<h4>${userInfo.playUserName }</h4>
									</div>
									<div class="profile-author-stats float-right">
										<ul class="menu">
											<li>
												<div class="icon float-left">
													<i class="fa fa-video-camera"></i>
												</div>
												<div class="li-text float-left">
													<p class="number-text">36</p>
													<span>视频</span>
												</div>
											</li>
											<li>
												<div class="icon float-left">
													<i class="fa fa-comments-o"></i>
												</div>
												<div class="li-text float-left">
													<p class="number-text">26</p>
													<span>评论</span>
												</div>
											</li>
										</ul>
									</div>
								</div>
							</div>
						</div>
					</div>
				</section>
				<!-- End profile top section -->
				<div class="row">
					<!-- right side content area -->
					<div class="large-8 columns profile-inner">
						<!-- single post description -->
						<section class="profile-videos">
							<div class="row secBg">
								<div class="large-12 columns">
									<div class="heading">
										<i class="fa fa-video-camera"></i>
										<h4>我的视频</h4>
									</div>
									<c:forEach var="vedio" items="${vedioList }">
										<div class="profile-video">
											<div class="media-object stack-for-small">
												<div class="media-object-section media-img-content">
													<a href="system/VedioAction_vedioFind?vedioId=${vedio.vedioId }">
									<video class="shipin" src="${vedio.vedioUrl}"></video></a>
												</div>
												<div class="media-object-section media-video-content">
													<div class="video-content">
														<h5>
															<a href="system/VedioAction_vedioFind?vedioId=${vedio.vedioId }">${vedio.vedioName}</a>
														</h5>
													</div>
													<div class="video-detail clearfix">
														<div class="video-stats">
															<span><i class="fa fa-clock-o"></i>${vedio.vedioTime}</span>
														</div>
														<div class="video-btns">
															<a class="video-btn"
																href="system/VedioAction_vedioDelete?vedioId=${vedio.vedioId}"> <i
																class="fa fa-trash"></i>删除
															</a>
														</div>
													</div>
												</div>
											</div>
										</div>
									</c:forEach>
								</div>
							</div>
						</section>
						<!-- End single post description -->
					</div>
					<!-- end left side content area -->
				</div>
				<%@include file="foot.jsp"%>
			</div>
			<!--end off canvas content-->
		</div>
		<!--end off canvas wrapper inner-->
	</div>
	<!--end off canvas wrapper-->
	<!-- script files -->
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
</body>
</html>