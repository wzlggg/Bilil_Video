# Bilil_video
数据库建表基本信息
1 用戶基本信息
	建立用户数据库（playUser）
		属性：  playUserId（Integer）   用户编号                          主键，非空
				playUserName（varchar）     用户昵称                         非空
				playUserPassword（varchar） 密码                             非空
				playUserSex（varchar）    	性别
				playUserBirthday（date）    生日
				playUserHead（varchar）     头像
				playUserState（Integer）    状态( 0異常用户 1正常用户 2管理員)
				playUserPhone（varchar）    手机号码
				playUserEmail（varchar）    邮箱
	
	建立视频数据库（vedio）       外键FK(userId  typeId)
		属性：  vedioId（Integer）        视频编号                           非空
				vedioName（varchar）		视频名称						 非空
				*vedioContent	Blob        视频描述
				typeId（Integer）			类型编号（外）
				vedioTime（date）		    上传时间
				vedioState（Integer）       状态(0 異常 1正常)		
				vedioUrl（varchar）		    视频地址
				userId（Integer）			上传的用户（外）
			
	建立视频分区数据库（vedioType）     
		属性：  typeId（Integer）          类型编号                         主键，非空
		        typeName（varchar）        类型名称						    非空
			    typeContext（varchar）     类型描述
	
	建立评论数据库（remark）      外键FK(userId  vedioId) 
		属性：  remarkId（Integer）             评论编号					主键，非空
			    remarkContent（varchar）		评论内容
				remarkTime（date）				评论时间
				remarkState（Integer）			该条评论状态
				userId（Integer）				用户编号（外）
				vedioId（Integer）				视频编号（外）
	
   *建立历史记录数据库(history   中間表)   外键FK(userId  vedioId) 
		属性：  historyId（Integer）            记录编号					主键，非空
				historyTime（date）				记录时间						
				userId（Integer）				用户编号（外）
				vedioId（Integer）				视频编号（外）
	
   *建立收藏数据库（favorite）             外键FK(userId  vedioId)
		属性：	favoriteId（Integer）			收藏的编号						非空
				favoriteTime（date）			收藏时间
				userId（Integer）				用户编号（外）
				vedioId	（Integer）				视频编号（外）
	建立菜单栏的分级数据库（menu）       
		属性：	menuId（Integer） 				菜单编号
				menuName（varchar）				菜单名称
				menuPId（Integer）              菜单分层编号（控制菜單分級）
				menuUrl（varchar）				地址

2 功能：
	对用户来说：          注册个人信息
					增加个人信息
					删除个人信息
					上传视频
					查看视频
					删除视频
					注销账号
					评论视频 
					评论删除
					*收藏视频
					*收藏删除
	对管理员来说：  增删改查账号
					查删视频
					修改分区
3 需要实现
    视频的排版首页面（统一张图）
	视频在线观看【仿照bilibili】
	对评论的增删改
	收藏视频
	历史记录
	
	
	
4 菜单
	主页
	视频
		宠物
		美食
		舞蹈
		科技
		上传视频		（视频名称 视频分区 视频上传）
	个人中心			（普通用户1）
		我的信息  （ 增 删 改 基本信息
				      头像的上传）
		我的视频  （ 增 删 查）
	注册/登录
		登录			（用户名  密码）
		注册			（用户名  密码  确认密码  邮箱）
		
		
	系统管理    		（管理员2）
		用户管理
		  	增 删 改 查基本信息
		视频管理
		  	删 查 视频信息
		评论管理  删 查
	


5 页面
        主页index.jsp	
	登录页面login.jsp
	注册页面login-register.jsp
	视频界面查看（分区）single-video-v1.jsp    萌宠
						single-video-v2.jsp   美食
						single-video-v3.jsp   舞蹈
						single-video-v4.jsp   科技
	用户上传视频界面submit-post.jsp
	我的信息页面profile-message.jsp
	我的视频页面profile-vedio.jsp
