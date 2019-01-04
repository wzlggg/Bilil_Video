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
				<!--breadcrumbs-->
				<!-- End Header -->
				<!--breadcrumbs-->
				<section id="breadcrumb">
					<div class="row">
						<div class="large-12 columns">
							<nav aria-label="You are here:" role="navigation">
								<ul class="breadcrumbs">
									<li><i class="fa fa-home"></i><a href="#">主页</a></li>
									<li><a href="#">视频</a></li>
									<li><span class="show-for-sr">现在: </span> 上传视频</li>
								</ul>
							</nav>
						</div>
					</div>
				</section>
				<!--end breadcrumbs-->
				<!-- profile top section -->
				<section class="topProfile topProfile-inner"
					style="background: url('images/profile-bg1.png') no-repeat;">
					<div class="profile-stats">
						<div class="row secBg">
							<div class="large-12 columns">
								<div class="profile-author-img">
									<label id="mylabel" for="fid"
										style="height: 100%; width: 100%;"> <img
										src="${userInfo.playUserHead }" alt="profile author img">
									</label>
								</div>
								<div class="clearfix">
									<div class="profile-author-name float-left">
										<p class="form-control-static">${userInfo.playUserName }</p>
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
						<!-- profile settings -->
						<section class="submit-post">
							<div class="row secBg">
								<div class="large-12 columns">
									<div class="heading">
										<i class="fa fa-pencil-square-o"></i>
										<h4>上传新视频</h4>
									</div>
									<div class="row">
										<div class="large-12 columns">

											<form action="system/VedioAction_add"
												enctype="multipart/form-data" method="post">
												<div data-abide-error class="alert callout"
													style="display: none;">
													<p>
														<i class="fa fa-exclamation-triangle"></i> 好像哪里出错了.
													</p>
												</div>
												<div class="row">
													<div class="large-12 columns">
														<label>标题 <input type="text" name="vedioName"
															placeholder="输入视频名字..." required> <span
															class="form-error"> 起个好名字. </span>
														</label>
													</div>
													<div class="large-12 columns">
														<div class="upload-video">
															<label for="videoupload" class="button">上传视频</label> <input
																type="file" id="videoupload" name="vedioContent"
																class="show-for-sr"> <span>无文件</span>
														</div>
													</div>
													<div class="large-12 columns">
														<div class="post-category">
														<s:action name="VedioTypeAction_allType" namespace="/system"></s:action>
															<label>视频类型: <select name="typeId">
														        <c:forEach items="${typeList}" var="vedioType" >
																	<option value="${vedioType.vedioTypeId }">${vedioType.vedioTypeName }</option>
																</c:forEach> 
															</select>
															</label>
														</div>
													</div>
													<div class="large-12 columns">
														<button class="button expanded" type="submit"
															name="submit">现在发表</button>
													</div>
												</div>
											</form>
										</div>
									</div>
								</div>
							</div>
						</section>
						<!-- End profile settings -->
					</div>
					<!-- end left side content area -->
				</div>
				
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