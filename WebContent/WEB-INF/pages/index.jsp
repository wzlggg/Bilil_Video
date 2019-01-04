<%@include file="common/taglib.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
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
<link rel="stylesheet" href="css/responsive.css">
</head>
<body>
	<div class="off-canvas-wrapper">
		<div class="off-canvas-wrapper-inner" data-off-canvas-wrapper>
			<!--header-->
			<div class="off-canvas-content" data-off-canvas-content>
				<%@include file="top.jsp"%>
				<!-- layerslider -->
				<section id="slider">
					<div id="full-slider-wrapper">
						<div id="layerslider" style="width: 100%; height: 500px;">
							<div class="ls-slide" data-ls="transition2d:1;timeshift:-1000;">
								<img src="images/sliderimages/bg.png" class="ls-bg"
									alt="Slide background" />
								<h3 class="ls-l"
									style="left: 50px; top: 135px; padding: 15px; color: #444444; font-size: 24px; font-family: 'Open Sans'; font-weight: bold; text-transform: uppercase;"
									data-ls="offsetxin:0;durationin:2500;delayin:500;durationout:750;easingin:easeOutElastic;rotatexin:90;transformoriginin:50% bottom 0;offsetxout:0;rotateout:-90;transformoriginout:left bottom 0;">World’s
									Biggest</h3>
								<h1 class="ls-l"
									style="left: 63px; top: 185px; background: #e96969; padding: 0 10px; opacity: 1; color: #ffffff; font-size: 36px; font-family: 'Open Sans'; text-transform: uppercase; font-weight: bold;"
									data-ls="offsetxin:left;durationin:3000; delayin:800;durationout:850;rotatexin:90;rotatexout:-90;">Powerfull
									Video Theme</h1>
								<p class="ls-l"
									style="font-weight: 600; left: 62px; top: 250px; opacity: 1; width: 450px; color: #444; font-size: 14px; font-family: 'Open Sans';"
									data-ls="offsetyin:top;durationin:4000;rotateyin:90;rotateyout:-90;durationout:1050;">Lorem
									Ipsum is simply dummy text of the printing and typesetting
									industry. Lorem Ipsum has been .</p>
								<a href="#" class="ls-l button"
									style="border-radius: 4px; text-align: center; left: 63px; top: 315px; background: #444; color: #ffffff; font-family: 'Open Sans'; font-size: 14px; display: inline-block; text-transform: uppercase; font-weight: bold;"
									data-ls="durationout:850;offsetxin:90;offsetxout:-90;duration:4200;fadein:true;fadeout:true;">立即观看</a>
								<img class="ls-l" src="images/sliderimages/layer1.png"
									alt="layer 1" style="top: 55px; left: 700px;"
									data-ls="offsetxin:right;durationin:3000; delayin:600;durationout:850;rotatexin:-90;rotatexout:90;">
								<img class="ls-l ls-linkto-2"
									style="top: 400px; left: 50%; white-space: nowrap;"
									data-ls="offsetxin:-50;delayin:1000;rotatein:-40;offsetxout:-50;rotateout:-40;"
									src="images/sliderimages/left.png" alt=""> <img
									class="ls-l ls-linkto-2"
									style="top: 400px; left: 52%; white-space: nowrap;"
									data-ls="offsetxin:50;delayin:1000;offsetxout:50;"
									src="images/sliderimages/right.png" alt="">
							</div>
							<div class="ls-slide" data-ls="transition2d:1;timeshift:-1000;">
								<img src="images/sliderimages/bg2.png" class="ls-bg"
									alt="Slide background" />
								<h3 class="ls-l"
									style="left: 50%; top: 150px; padding: 15px; color: #444444; font-size: 24px; font-family: 'Open Sans'; font-weight: bold; text-transform: uppercase;"
									data-ls="offsetxin:0;durationin:2500;delayin:500;durationout:750;easingin:easeOutElastic;rotatexin:90;transformoriginin:50% bottom 0;offsetxout:0;rotateout:-90;transformoriginout:left bottom 0;">Bli
									is a World’s Biggest</h3>
								<h1 class="ls-l"
									style="left: 50%; top: 200px; background: #e96969; padding: 0 10px; opacity: 1; color: #ffffff; font-size: 36px; font-family: 'Open Sans'; text-transform: uppercase; font-weight: bold;"
									data-ls="offsetxin:left;durationin:3000; delayin:800;durationout:850;rotatexin:90;rotatexout:-90;">Boost
									your video Website</h1>
								<p class="ls-l"
									style="text-align: center; font-weight: 600; left: 50%; top: 265px; opacity: 1; width: 450px; color: #444; font-size: 14px; font-family: 'Open Sans';"
									data-ls="offsetyin:top;durationin:4000;rotateyin:90;rotateyout:-90;durationout:1050;">Lorem
									Ipsum is simply dummy text of the printing and typesetting
									industry. Lorem Ipsum has been .</p>
								<a href="#" class="ls-l button"
									style="border-radius: 4px; text-align: center; left: 50%; top: 315px; background: #444; color: #ffffff; font-family: 'Open Sans'; font-size: 14px; display: inline-block; text-transform: uppercase; font-weight: bold;"
									data-ls="durationout:850;offsetxin:90;offsetxout:-90;duration:4200;fadein:true;fadeout:true;">立即观看</a>
								<img class="ls-l ls-linkto-1"
									style="top: 400px; left: 50%; white-space: nowrap;"
									data-ls="offsetxin:-50;delayin:1000;rotatein:-40;offsetxout:-50;rotateout:-40;"
									src="images/sliderimages/left.png" alt=""> <img
									class="ls-l ls-linkto-1"
									style="top: 400px; left: 52%; white-space: nowrap;"
									data-ls="offsetxin:50;delayin:1000;offsetxout:50;"
									src="images/sliderimages/right.png" alt="">
							</div>
						</div>
					</div>
				</section>
				<!--end slider-->
				<!-- Premium Videos -->
				<form action="system/VedioAction_vedioOnLine" method="post">
					<section id="premium">
						<div class="row">
							<div class="heading clearfix">
								<div class="large-11 columns">
									<h4>
										<i class="fa fa-play-circle-o"></i>精彩视频
									</h4>
								</div>
								<div class="large-1 columns">
									<div class="navText show-for-large">
										<a class="prev secondary-button"><i
											class="fa fa-angle-left"></i></a> <a
											class="next secondary-button"><i
											class="fa fa-angle-right"></i></a>
									</div>
								</div>
							</div>
						</div>

						<div id="owl-demo" class="owl-carousel carousel"
							data-car-length="4" data-items="4" data-loop="true"
							data-nav="false" data-autoplay="true"
							data-autoplay-timeout="3000" data-dots="false"
							data-auto-width="false" data-responsive-small="1"
							data-responsive-medium="2" data-responsive-xlarge="5">	
							<div class="item">
								<figure class="premium-img">
									<img src="http://placehold.it/400x300" alt="carousel">
									<figcaption>
										<h5>狗狗游泳</h5>
										<p>小视频</p>
									</figcaption>
								</figure>
								<a href="single-video-v1.html" class="hover-posts"> <span><i
										class="fa fa-play"></i>观看视频</span>
								</a>
							</div>
							<div class="item">
								<figure class="premium-img">
									<img src="http://placehold.it/400x300" alt="carousel">
									<figcaption>
										<h5>狗狗游泳</h5>
										<p>小视频</p>
									</figcaption>
								</figure>
								<a href="single-video-v1.html" class="hover-posts"> <span><i
										class="fa fa-play"></i>观看视频</span>
								</a>
							</div>
							<div class="item">
								<figure class="premium-img">
									<img src="http://placehold.it/400x300" alt="carousel">
									<figcaption>
										<h5>狗狗游泳</h5>
										<p>小视频</p>
									</figcaption>
								</figure>
								<a href="single-video-v1.html" class="hover-posts"> <span><i
										class="fa fa-play"></i>观看视频</span>
								</a>
							</div>
							<div class="item">
								<figure class="premium-img">
									<img src="http://placehold.it/400x300" alt="carousel">
									<figcaption>
										<h5>打卡网红火锅店</h5>
										<p>小视频</p>
									</figcaption>
								</figure>
								<a href="single-video-v2.html" class="hover-posts"> <span><i
										class="fa fa-play"></i>观看视频</span>
								</a>
							</div>
						</div>
					</section>
				</form>
				<!-- End Premium Videos -->
				<!-- Start ForEach -->
				
<s:action name="VedioTypeAction_allType" namespace="/system"></s:action>
<s:action name="VedioAction_indexVedioSearch" namespace="/system"></s:action>
<c:forEach items="${typeList}" var="vedioType">
<section id="movies">
<div class="row secBg">
		<div class="large-12 columns">
			<div class="column row">
				<div class="heading category-heading clearfix">
					<div class="cat-head pull-left">
						<i class="fa fa-video-camera"></i>
						<h4>${vedioType.vedioTypeName }</h4>
					</div>
					<div>
						<div class="navText pull-right show-for-large">
							<a class="prev secondary-button"><i
								class="fa fa-angle-left"></i></a> <a
								class="next secondary-button"><i
								class="fa fa-angle-right"></i></a>
						</div>
					</div>
				</div>
				
				<!-- movie carousel -->
			<div id="owl-demo-movie" class="owl-carousel carousel"
				data-autoplay="true" data-autoplay-timeout="3000"
				data-autoplay-hover="true" data-car-length="5" data-items="6"
				data-dots="false" data-loop="true" data-auto-width="true"
				data-margin="10">
				<c:forEach items="${vedioList }" var="vedio">
				 <c:if test="${vedio.vedioType.vedioTypeId == vedioType.vedioTypeId }"> 
				<div class="item-movie item thumb-border">
					<figure class="premium-img">
						<img src="http://placehold.it/185x275" alt="carousel">
						<a href="system/VedioAction_vedioFind?vedioId=${vedio.vedioId }" class="hover-posts"> <span><i
								class="fa fa-search"></i></span>
						</a>
					</figure>
				</div>
				</c:if>  
				</c:forEach>
			</div>

			<!-- end carousel -->	
			</div>
</section>
</c:forEach>
				<div class="googleAdv text-center">
					<a href="#"><img src="images/goodleadv.png" alt="googel ads"></a>
				</div>
				<!-- End ad Section -->
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