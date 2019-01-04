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
<style>
#fid {
	display: none;
}
</style>
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
									<li><i class="fa fa-home"></i><a
										href="system/PlayUserAction_indexUI">主页</a></li>
									<li><a href="#">个人中心</a></li>
									<li><span class="show-for-sr">现在: </span> 我的信息</li>
								</ul>
							</nav>
						</div>
					</div>
				</section>
				<!--end breadcrumbs-->

				<!-- profile top section -->
				<section class="topProfile">
					<form action="system/PlayUserAction_addHead"
						enctype="multipart/form-data" method="post">
						<div class="profile-stats">
							<div class="row secBg">
								<div class="large-12 columns">
									<div class="profile-author-img">
										<label id="mylabel" for="fid"
											style="height: 100%; width: 100%;"> <img
											src="${userInfo.playUserHead }" alt="profile author img">
										</label> <input id="fid" type="file" name="playUserHeadContent" />
									</div>
									<div class="clearfix">
										<div class="profile-author-name float-left">
                                          <input class="button" type="submit" value="修改头像"></input>
										</div>
									</div>
								</div>

							</div>
						</div>
					</form>
				</section>
				
            <!-- profile top section -->
          
          
            <div class="row">
                <!-- right side content area -->
                <div class="large-8 columns profile-inner">
                    <!-- left sidebar -->
                <div class="large-4 columns">
                    <aside class="secBg sidebar">
                        <div class="row">
                            <!-- profile overview -->
                            <div class="large-12 columns">
                                <div class="widgetBox">
                                    <div class="widgetTitle">
                                        <h5>我的信息</h5>
                                    </div>
                                    <div class="widgetContent">
                                    	<form action="system/PlayUserAction_userEdite" name="playUser" enctype="multipart/form-data" method="post">
                                    		<ul class="profile-overview">
                                            	<li class="clearfix">用户名：
                                            	<p class="form-control-static">${userInfo.playUserName }</p>
                                            	<input type="hidden" name="playUserName" value="${userInfo.playUserName }"></li>
                                            	<input type="hidden" name="playUserPassword" value="${userInfo.playUserPassword }">
                                            	<li class="clearfix">性别：
                                            		<select name="playUserSex">
													<option ${usersInfo.userSex=='保密'?'selected':'' } >保密</option>
													<option ${usersInfo.userSex=='男'?'selected':'' }>男</option>
													<option ${usersInfo.userSex=='女'?'selected':'' }>女</option>
                                            		</select>
                                            	</li>
                                            	<li class="clearfix">生日：<input type="date" name="playUserBirthday" value="${userInfo.playUserBirthday }"></li>
                                            	<li class="clearfix">手机号：<input type="text" name="playUserPhone" value="${userInfo.playUserPhone }"></li>
                                            	<li class="clearfix">邮箱：<input type="email" name="playUserEmail" value="${userInfo.playUserEmail }"></li>
                                    			<input class="button" type="submit" value="修改信息"></input>
                                    		</ul>
                                    	</form>
                                    </div>
                                </div>
                            </div><!-- End profile overview -->
                        </div>
                    </aside>
                </div><!-- end sidebar -->
                </div><!-- end left side content area -->
            </div>
            <%@include file="foot.jsp" %>
        </div><!--end off canvas content-->
    </div><!--end off canvas wrapper inner-->
</div><!--end off canvas wrapper-->
<!-- script files -->
<script src="bower_components/jquery/dist/jquery.js"></script>
<script src="bower_components/what-input/what-input.js"></script>
<script src="bower_components/foundation-sites/dist/foundation.js"></script>
<script src="js/jquery.showmore.src.js" type="text/javascript"></script>
<script src="js/app.js"></script>
<script src="layerslider/js/greensock.js" type="text/javascript"></script>
<!-- LayerSlider script files -->
<script src="layerslider/js/layerslider.transitions.js" type="text/javascript"></script>
<script src="layerslider/js/layerslider.kreaturamedia.jquery.js" type="text/javascript"></script>
<script src="js/owl.carousel.min.js"></script>
<script src="js/inewsticker.js" type="text/javascript"></script>
<script src="js/jquery.kyco.easyshare.js" type="text/javascript"></script>

</body>
</html>