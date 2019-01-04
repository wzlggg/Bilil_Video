<%@include file="common/taglib.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<s:action name="MenuAction" namespace="/system"></s:action>

	<header>
					<!--Navber-->
					<section id="navBar">
						<nav class="sticky-container" data-sticky-container>
							<div class="sticky topnav" data-sticky data-top-anchor="navBar"
								data-btm-anchor="footer-bottom:bottom" data-margin-top="0"
								data-margin-bottom="0" style="width: 100%; background: #fff;"
								data-sticky-on="large">
								<div class="row">
									<div class="large-12 columns">
										<div class="title-bar" data-responsive-toggle="beNav"
											data-hide-for="large">
											<button class="menu-icon" type="button"
												data-toggle="offCanvas-responsive"></button>
											<div class="title-bar-title">
												<img src="images/logo.png" alt="logo">
											</div>
										</div>

										<div class="top-bar show-for-large" id="beNav"
											style="width: 100%;">
											<div class="top-bar-left">
												<ul class="menu">
													<li class="menu-text"><a
														href="system/PlayUserAction_indexUI"><img
															src="images/logo.png" alt="logo"></a></li>
												</ul>
											</div>
											<div class="top-bar-right search-btn">
												<ul class="menu">
													<li class="search"><i class="fa fa-search"></i></li>
												</ul>
											</div>
											<div class="top-bar-right">
											<!-- ################################ -->
												<ul class="menu vertical medium-horizontal" id="navigator"
													data-responsive-menu="drilldown medium-dropdown">
													<li class="has-submenu active"><a
														href="system/PlayUserAction_indexUI"><i
															class="fa fa-home"></i>主页</a></li>
													<c:forEach var="menu" items="${menuList}">
														<c:if test="${menu.pMenuId==0 }">
															<li class="has-submenu" data-dropdown-menu="example1">
																<a href="javascript:void(0)"> <i class="fa fa-film"></i>${menu.menuName }</a>

																<ul class="submenu menu vertical" data-submenu
																	data-animate="slide-in-down slide-out-up">
																	<c:forEach var="child" items="${menuList }">
																		<c:if test="${child.pMenuId==menu.menuId }">
																			<li><a href="${child.menuUrl}"> <i
																					class="fa fa-film"></i>${child.menuName}</a></li>
																		</c:if>
																	</c:forEach>
																</ul>
															</li>
													</c:if>
													</c:forEach>
												</ul>
											</div>
										</div>
									</div>
								</div>
								<div id="search-bar" class="clearfix search-bar-light">
									<form method="post" action="system/VedioAction_vedioSearch">
										<div class="search-input float-left">
											<input type="search" name="vedioName" placeholder="请输入视频名称">
										</div>
										<div class="search-btn float-right text-right">
											<button class="button" name="search" type="submit">立即搜索</button>
										</div>
									</form>
								</div>
							</div>
						</nav>
					</section>
				</header>
<!-- End Header -->
