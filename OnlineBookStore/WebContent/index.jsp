<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
<!--首页-->
<!-- Basic page needs -->
<meta charset="utf-8">
<!--[if IE]>
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  "WebContent/index.jsp"<![endif]-->
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>Online Bookstore</title>
<meta name="description" content="">
	
<!-- Mobile specific metas  -->
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Favicon  -->
<link rel="shortcut icon" type="image/x-icon" href="favicon.ico">

<!-- 字体 -->
<link href='https://fonts.googleapis.com/css?family=PT+Sans:400,700italic,700,400italic' rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Arimo:400,400italic,700,700italic' rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Dosis:400,300,200,500,600,700,800' rel='stylesheet' type='text/css'>

<!-- CSS Style -->

<!-- Bootstrap CSS -->
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">

<!-- font-awesome & simple line icons CSS -->
<link rel="stylesheet" type="text/css" href="css/font-awesome.css" media="all">
<link rel="stylesheet" type="text/css" href="css/simple-line-icons.css" media="all">

<!-- owl.carousel CSS -->
<link rel="stylesheet" type="text/css" href="css/owl.carousel.css">
<link rel="stylesheet" type="text/css" href="css/owl.theme.css">
<link rel="stylesheet" type="text/css" href="css/owl.transitions.css">

<!-- animate CSS  -->
<link rel="stylesheet" type="text/css" href="css/animate.css" media="all">

<!-- flexslider CSS -->
<link rel="stylesheet" type="text/css" href="css/flexslider.css" >

<!-- jquery-ui.min CSS  -->
<link rel="stylesheet" type="text/css" href="css/jquery-ui.css">

<!-- Revolution Slider CSS -->
<link href="css/revolution-slider.css" rel="stylesheet">

<!-- style CSS -->
<link rel="stylesheet" type="text/css" href="css/style.css" media="all">
</head>

<body class="cms-index-index cms-home-page">

<!--[if lt IE 8]>
      <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
  <![endif]-->

<!-- 手机版菜单 -->

<div id="mobile-menu">
  <ul>
    <li><a href=<%=request.getContextPath() +"/FindBookServlet" %> class="home1">首页</a></li>
    <li><a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=文学类">文学类</a>
      <ul>
        <li><a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=散文随笔" class="">散文随笔</a></li>
        <li><a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=诗词歌曲">诗歌词曲</a></li>
        <li><a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=青春励志">青春励志</a></li>
      </ul>
    </li>
    <li><a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=小说类">小说类</a>
      <ul>
        <li><a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=古典小说" class="">古典小说</a></li>
        <li><a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=外国小说">外国小说</a></li>
        <li><a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=悬疑小说">悬疑小说</a></li>
        <li><a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=社会图书">社会图书</a></li>
      </ul>
    </li>
    <li><a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=童书类">童书类</a>
      <ul>
        <li><a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=动漫童话" class="">动漫童话</a></li>
        <li><a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=科学百科">科学百科</a></li>
        <li><a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=文学读物">文学读物</a></li>
      </ul>
    </li>
    <li><a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=传记类">传记类</a>
      <ul>
        <li><a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=女性人物" class="">女性人物</a></li>
        <li><a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=名人自传">名人自传</a></li>
        <li><a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=人物评传">人物评传</a></li>
      </ul>
    </li>
    <li><a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=哲学宗教类">哲学宗教类</a>
      <ul>
        <li><a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=哲学" class="">哲学</a></li>
        <li><a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=宗教">宗教</a></li>
      </ul>
    </li>
    <li><a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=管理类">管理类</a>
      <ul>
        <li><a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=金融学" class="">金融学</a></li>
        <li><a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=金融理论">金融理论</a></li>
      </ul>
    </li>
    <li><a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=进口文学类">进口文学类</a>
      <ul>
        <li><a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=小说" class="">小说</a></li>
        <li><a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=童书">童书</a></li>
      </ul>
    </li>
  </ul>
</div>

<!-- end mobile menu -->
<div id="page">
  <!-- Header -->
  <header>
    <div class="header-container">
      <div class="header-top">
        <div class="container">
          <div class="row">
            <div class="col-lg-4 col-sm-4 hidden-xs">
              <!-- Default Welcome Message -->
              <div class="welcome-msg ">欢迎来到我的商店 ! </div>
              <span class="phone hidden-sm"></span> </div>

            <!-- top links -->
            <div class="headerlinkmenu col-lg-8 col-md-7 col-sm-8 col-xs-12">
              <div class="links">
               <div class="myaccount"><a title="我的账户" href="MyAccountServlet"><i class="fa fa-user"></i><span class="hidden-xs">我的账户</span></a></div>
                <div class="myaccount"><a title="登录" href="account_page.jsp"><i class="fa fa-user"></i><span class="hidden-xs">登录</span></a></div>
                
                <div class="login"><a href="LoginOutServlet"><i class="fa fa-unlock-alt"></i><span class="hidden-xs">注销</span></a></div>
              </div>
              <div class="language-currency-wrapper">
                <div class="inner-cl">
                  <div class="block block-language form-language">
                    <div class="lg-cur"> <span> <img src="images/flag-default.jpg" alt="Chinese"> <span class="lg-fr">简体中文</span> <i class="fa fa-angle-down"></i> </span> </div>
                    <ul>
                      <!-- <li> <a class="selected" href="#"> <img src="images/flag-english.jpg" alt="flag"> <span>English</span> </a> </li>
                       --><li> <a href="#"> <img src="images/flag-default.jpg" alt="flag"> <span>简体中文</span> </a> </li>
                      <!-- <li> <a href="#"> <img src="images/flag-german.jpg" alt="flag"> <span>German</span> </a> </li>
                      <li> <a href="#"> <img src="images/flag-brazil.jpg" alt="flag"> <span>Brazil</span> </a> </li>
                      <li> <a href="#"> <img src="images/flag-chile.jpg" alt="flag"> <span>Chile</span> </a> </li>
                      <li> <a href="#"> <img src="images/flag-spain.jpg" alt="flag"> <span>Spain</span> </a> </li>
                     --></ul>
                  </div>
                  <div class="block block-currency">
                    <div class="item-cur"> <span>CNY </span> <i class="fa fa-angle-down"></i></div>
                   <!--  <ul>
                      <li> <a href="#"><span class="cur_icon">€</span> EUR</a> </li>
                      <li> <a href="#"><span class="cur_icon">¥</span> CNY</a> </li>
                      <li> <a class="selected" href="#"><span class="cur_icon">$</span> USD</a> </li>
                    </ul> -->
                  </div>
                </div>

                <!-- End Default Welcome Message -->
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="container">
        <div class="row">
          <div class="col-sm-3 col-md-3 col-xs-12">
            <!-- Header Logo -->
            <div class="logo"><a title="MyStore" href=<%=request.getContextPath() +"/FindBookServlet" %>><img alt="e-commerce" src="images/logo.png"></a> </div>
            <!-- End Header Logo -->
          </div>
          <div class="col-xs-9 col-sm-6 col-md-6">
            <!-- Search -->
            <div class="top-search">
              <div id="search">     
                  <div class="input-group">
                  <form action="SearchBooKServlet" method="get">
                    <select class="cate-dropdown hidden-xs" name="massage">
                      <option>按书名</option>
                      <option>按作者</option>
                      <option>按类别</option>                    
                    </select>
                    <input type="text" class="form-control" placeholder="搜索" name="search">
                    <button class="btn-search" type="submit"><i class="fa fa-search"></i></button>
                  </form>
                  </div>        
              </div>
            </div>
            <!-- End Search -->
          </div>
          <!-- top cart -->	
          <div class="col-lg-3 col-xs-3 top-cart">
            <div class="top-cart-contain">
              <div class="mini-cart">
                <div data-toggle="dropdown" data-hover="dropdown" class="basket dropdown-toggle"> <a href="#">
                  <div class="cart-icon"><i class="fa fa-shopping-cart"></i></div>
                  <div class="shoppingcart-inner hidden-xs"><span class="cart-title">购物车</span></div>
                  </a></div>
                <div>
                  <div class="top-cart-content">
                    <div class="block-subtitle hidden-xs">已添加商品</div>
					  <c:set var="sum" value="0"> </c:set> 
                    <ul id="cart-sidebar" class="mini-products-list">
					<c:forEach var="Cart" items="${requestScope.Cart}"> 
                      <li class="item odd"> <a href="ShoppingCartServlet" title="${Cart.bookname }" class="product-image"><img src="${Cart.img1 }" alt="Lorem ipsum dolor" width="65"></a>
                        <div class="product-details"> <a href="${pageContext.request.contextPath}/DeleteBookServlet?param1=${Cart.cartserial}" title="删除" class="remove-cart"><i class="icon-close"></i></a>
                          <p class="product-name"><a href="ShoppingCartServlet">${Cart.bookname }</a> </p>
                          <strong>${Cart.count }</strong> x <span class="price">¥${Cart.price }</span> </div> 
                      </li>
                      <c:set var="sum" value="${sum + Cart.totalprice }"></c:set>
                    </c:forEach>
                    </ul>
                    <div class="top-subtotal">总计: <span class="price">￥${ sum }</span></div>      
                    <div class="actions"> 	
                      <form action="ShoppingCartServlet">
                      <button class="btn-checkout" type="submit"><i class="fa fa-check"></i><span>购买</span></button>         
                      <button class="view-cart" type="submit" ><i class="fa fa-shopping-cart"></i> <span>查看购物车</span></button>
                    </form>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>        
        </div>
      </div>
    </div>
  </header>
  <!-- end header -->

  <!-- Navbar -->
  <nav>
    <div class="container">
      <div class="row">
        <div class="col-md-3 col-sm-4">
          <div class="mm-toggle-wrap">
            <div class="mm-toggle"> <i class="fa fa-align-justify"></i> </div>
            <span class="mm-label">菜单</span> </div>
          <div class="mega-container visible-lg visible-md visible-sm">
            <div class="navleft-container">
              <div class="mega-menu-title">
                <h3>全部分类</h3>
              </div>
              <div class="mega-menu-category">
                <ul class="nav">
                  <li><a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=文学类">文学类</a>
                    <div class="wrap-popup column1">
                      <div class="popup">
                        <ul class="nav">
                          <li> <a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=散文随笔">散文随笔</a> </li>
                          <li> <a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=诗词歌曲">诗歌词曲</a> </li>
                          <li> <a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=青春励志">青春励志</a> </li>
                        </ul>
                      </div>
                    </div>
                  </li>
                  <li><a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=小说类">小说类</a>
                    <div class="wrap-popup column1">
                      <div class="popup">
                        <ul class="nav">
                          <li> <a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=古典小说">古典小说</a> </li>
                          <li> <a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=外国小说">外国小说</a> </li>
                          <li> <a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=悬疑小说">悬疑小说</a> </li>
                          <li> <a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=社会图书">社会图书</a> </li>
                        </ul>
                      </div>
                    </div>
                  </li>
                  <li><a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=童书类">童书类</a>
                    <div class="wrap-popup column1">
                      <div class="popup">
                        <ul class="nav">
                          <li> <a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=动漫童话">动漫童话</a> </li>
                          <li> <a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=科学百科">科学百科</a> </li>
                          <li> <a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=文学读物">文学读物</a> </li>
                        </ul>
                      </div>
                    </div>
                  </li>
                  <li><a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=传记类">传记类</a>
                    <div class="wrap-popup column1">
                      <div class="popup">
                        <ul class="nav">
                          <li> <a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=女性人物">女性人物</a> </li>
                          <li> <a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=名人自传">名人自传</a> </li>
                          <li> <a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=人物评传">人物评传</a> </li>
                        </ul>
                      </div>
                    </div>
                  </li>
                  <li><a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=哲学宗教类">哲学宗教类</a>
                    <div class="wrap-popup column1">
                      <div class="popup">
                        <ul class="nav">
                          <li> <a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=哲学">哲学</a> </li>
                          <li> <a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=宗教">宗教</a> </li>
                        </ul>
                      </div>
                    </div>
                  </li>
                  <li><a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=管理类">管理类</a>
                    <div class="wrap-popup column1">
                      <div class="popup">
                        <ul class="nav">
                          <li> <a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=管理学">管理学</a> </li>
                          <li> <a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=金融理论">金融理论</a> </li>
                        </ul>
                      </div>
                    </div>
                  </li>
                  <li><a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=进口文学类">进口文学类</a>
                    <div class="wrap-popup column1">
                      <div class="popup">
                        <ul class="nav">
                          <li> <a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=小说">小说</a> </li>
                          <li> <a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=按类别&search=童书">童书</a> </li>
                        </ul>
                      </div>
                    </div>
                  </li>
                  </ul>
              </div>
            </div>
          </div>
        </div>
        <div class="col-md-9 col-sm-8">
          <div class="mtmegamenu">
            <ul>
              <li class="mt-root demo_custom_link_cms"> <!-- 首页  -->
                <div class="mt-root-item"><a href= <%=request.getContextPath() +"/FindBookServlet" %> >
                  <div class="title title_font"><span class="title-text">首页</span></div>
                  </a>
                </div>
              <li class="mt-root">  <!-- 销量排行榜  -->
                <div class="mt-root-item"><a href=" ${pageContext.request.contextPath}/SearchBooKServlet?massage=销量排行榜&search=#">
                  <div class="title title_font"><span class="title-text">销量排行榜</span> </div>
                  </a></div>
              </li>
              <li class="mt-root">  <!-- 上架时间  -->
                <div class="mt-root-item"><a href="${pageContext.request.contextPath}/SearchBooKServlet?massage=最新上架&search=#">
                  <div class="title title_font"><span class="title-text">最新上架</span> </div>
                  </a></div>
              </li>      
              <li class="mt-root">  <!-- 今日推荐  -->
                <div class="mt-root-item">
                  <div class="title title_font"><span class="title-text">今日推荐</span></div>
                </div>
                <ul class="menu-items col-xs-12">              	
               	<c:forEach var="Rbook" items="${ requestScope.Rbook }">
                  <li class="menu-item depth-1 product menucol-1-3 withimage">            
                    <div class="product-item">
                      <div class="item-inner">
                        <div class="product-thumbnail">
                          <div class="icon-sale-label sale-left">Sale</div>
                          <div class="pr-img-area"> <a title="${Rbook.bookname}" href="${pageContext.request.contextPath}/Quick_viewServlet?param1=${Rbook.bookname}"  >
                            <figure> <img class="first-img" src="${Rbook.img1}" alt=""> <img class="hover-img" src="${Rbook.img1}" alt=""></figure>
                            </a>
                              <button type="button" class="add-to-cart-mt" onclick="window.location.href='${pageContext.request.contextPath}/AddBookServlet?param1=${Rbook.number}&param2=1'"> <i class="fa fa-shopping-cart"></i><span>添加到购物车</span> </button>
                            </div>                 
                        </div>
                        <div class="item-info">
                          <div class="info-inner">
                            <div class="item-title"> 
                            	<a title="${Rbook.bookname}" href="${pageContext.request.contextPath}/Single_productServlet?param1=${Rbook.bookname}">${Rbook.bookname}</a>    
                            </div>
                            <div class="item-content">
                              <div class="item-price">
                                <div class="price-box"> 
                                <p class="special-price"> <span class="price-label">Special Price</span> <span class="price"> ¥${ Rbook.price } </span> </p>
                                <p class="old-price"> <span class="price-label">Regular Price:</span> <span class="price">¥${ Rbook.price+20 } </span> </p>
                              </div>
                            </div>
                          </div>
                        </div>
                      </div>
                    </div>
                  </li>
                 </c:forEach>
                </ul>
              </li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </nav>
  <!-- end nav -->

<!--   
  <div class="slider">
    <div class="tp-banner-container clearfix">
      <div class="tp-banner" >
        <ul>
          轮播图  图1 
          <li data-transition="slidehorizontal" data-slotamount="5" data-masterspeed="700" >
            MAIN IMAGE
            <img src="images/slider/轮播图1.jpg" alt="slidebg1" data-bgfit="cover" data-bgposition="center center" data-bgrepeat="no-repeat">
          </li>
          轮播图  图2 
          <li data-transition="slidehorizontal" data-slotamount="5" data-masterspeed="700" >
            MAIN IMAGE
            <img src="images/slider/轮播图2.jpg" alt="slidebg1" data-bgfit="cover" data-bgposition="center center" data-bgrepeat="no-repeat">
          </li>
          轮播图  图3 
          <li data-transition="slidehorizontal" data-slotamount="5" data-masterspeed="700" >
            MAIN IMAGE
            <img src="images/slider/轮播图3.jpg" alt="slidebg3" data-bgfit="cover" data-bgposition="center center" data-bgrepeat="no-repeat">
          </li>
        </ul>
      </div>
    </div>
  </div>
 -->
  <!-- main container -->
  <div class="main-container col1-layout">
    <div class="container">
      <div class="row">
        <!-- Home Tabs  -->
        <div class="col-sm-8 col-md-9 col-xs-12">
          <div class="home-tab">
            <ul class="nav home-nav-tabs home-product-tabs">
              <li class="active"><a href="#featured" data-toggle="tab" aria-expanded="false">特色书籍</a></li>
              <li class="divider"></li>
              <li> <a href="#top-sellers" data-toggle="tab" aria-expanded="false">畅销书籍</a> </li>
            </ul>
            <div id="productTabContent" class="tab-content">
              <div class="tab-pane active in" id="featured">
                <div class="featured-pro">
                  <div class="slider-items-products">
                    <div id="featured-slider" class="product-flexslider hidden-buttons">
                      <div class="slider-items slider-width-col4">                   
                        <!-- 6个特色书籍  -->
                        <c:forEach var="Cbook" items="${ requestScope.Cbook }">
                        <div class="product-item">
                          <div class="item-inner">
                            <div class="product-thumbnail">
                              <div class="icon-sale-label sale-left">Sale</div>
                               <div class="icon-new-label new-right">New</div>
                              <div class="pr-img-area"> <a title="${Cbook.bookname}" href="${pageContext.request.contextPath}/Quick_viewServlet?param1=${Cbook.bookname}">
                                <figure> <img class="first-img" src="${Cbook.img1}" alt=""> <img class="hover-img" src="${Cbook.img1}" alt=""></figure>
                                </a> 
                                  <button type="button" class="add-to-cart-mt" onclick="window.location.href='${pageContext.request.contextPath}/AddBookServlet?param1=${Cbook.number}&param2=1'"> <i class="fa fa-shopping-cart"></i><span>添加到购物车</span> </button>                         
                              </div>                             
                            </div>
                            <div class="item-info">
                              <div class="info-inner">
                                <div class="item-title"> <a title="${Cbook.bookname}" href="${pageContext.request.contextPath}/Single_productServlet?param1=${Cbook.bookname}">${Cbook.bookname}</a> </div>
                                <div class="item-content">
                                  <div class="item-price">
                                    <div class="price-box"> <span class="regular-price"> <span class="price">¥${Cbook.price}</span> </span> </div>
                                  </div>
                                </div>
                              </div>
                            </div>
                          </div>
                        </div>
                        </c:forEach>                       
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              <div class="tab-pane fade" id="top-sellers">
                <div class="top-sellers-pro">
                  <div class="slider-items-products">
                    <div id="top-sellers-slider" class="product-flexslider hidden-buttons">
                      <div class="slider-items slider-width-col4 ">                       
                        <!-- 畅销书籍  -->
                        <c:forEach var="Sbook" items="${ requestScope.Sbook }">
                        <div class="product-item">
                          <div class="item-inner">
                            <div class="product-thumbnail">
                              <div class="icon-sale-label sale-left">HOT</div>                            
                              <div class="pr-img-area"> <a title="${Sbook.bookname}" href="${pageContext.request.contextPath}/Quick_viewServlet?param1=${Sbook.bookname}">
                                <figure> <img class="first-img" src="${Sbook.img1}" alt=""> <img class="hover-img" src="${Sbook.img1}" alt=""></figure>
                                </a>
                                  <button type="button" class="add-to-cart-mt" onclick="window.location.href='${pageContext.request.contextPath}/AddBookServlet?param1=${Sbook.number}&param2=1'"> <i class="fa fa-shopping-cart"></i><span>添加到购物车</span> </button>                      
                                   </div>                
                            </div>
                            <div class="item-info">
                              <div class="info-inner">
                                <div class="item-title"> <a title="${Sbook.bookname}" href="${pageContext.request.contextPath}/Single_productServlet?param1=${Sbook.bookname}">${Sbook.bookname}</a> </div>
                                <div class="item-content">
                                  <div class="item-price">
                                    <div class="price-box"> <span class="regular-price"> <span class="price">¥${Sbook.price}</span> </span> </div>
                                  </div>
                                </div>
                              </div>
                            </div>
                          </div>
                        </div>
                        </c:forEach>          
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
        <!--Hot deal -->
        <div class="col-md-3 col-sm-4 col-xs-12 hot-products">
          <div class="hot-deal"> <span class="title-text">今日热销</span>
            <ul class="products-grid">
              <li class="item">  
                <c:forEach var="Mbook" items="${ requestScope.Mbook }">
                <div class="product-item">
                  <div class="item-inner">
                    <div class="product-thumbnail">
                      <div class="icon-hot-label hot-right">Hot</div>
                      <div class="pr-img-area"> <a title="${Mbook.bookname}" href="${pageContext.request.contextPath}/Quick_viewServlet?param1=${Mbook.bookname}">
                        <figure> <img class="first-img" src="${Mbook.img1}" alt=""> <img class="hover-img" src="${Mbook.img1}" alt=""></figure>
                        </a>                     
                        <button type="button" class="add-to-cart-mt" onclick="window.location.href='${pageContext.request.contextPath}/AddBookServlet?param1=${Mbook.number}&param2=1'"> <i class="fa fa-shopping-cart"></i><span>添加到购物车</span> </button>
                       </div>                       
                    </div>
                    <div class="item-info">
                      <div class="info-inner">
                        <div class="item-title"> <a title="${Mbook.bookname}" href="${pageContext.request.contextPath}/Single_productServlet?param1=${Mbook.bookname}">${Mbook.bookname}</a> </div>
                        <div class="item-content">
                          <div class="item-price">
                            <div class="price-box"> <span class="regular-price"> <span class="price">¥${Mbook.price}</span> </span> </div>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
                </c:forEach>             
              </li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </div>
  <!-- end main container -->


  <!-- category area start -->
  <div class="jtv-category-area">
    <div class="container">
      <div class="row">
        <div class="col-md-4 col-sm-6">
          <div class="jtv-single-cat">
            <h2 class="cat-title">最受好评</h2>          
             <c:forEach var="Pbook" items="${ requestScope.Pbook }">
            <div class="jtv-product">
              <div class="product-img"> <a href="${pageContext.request.contextPath}/Single_productServlet?param1=${Pbook.bookname}"> <img src="${ Pbook.img1 }" alt=""> <img class="secondary-img" src="${ Pbook.img1 }" alt=""> </a> </div>
              <div class="jtv-product-content">
                <h3><a href="${pageContext.request.contextPath}/Single_productServlet?param1=${Pbook.bookname}">${ Pbook.bookname }</a></h3>
                <div class="price-box"> <span class="regular-price"> <span class="price">¥${ Pbook.price }</span> </span> </div>
                <div class="jtv-product-action">
                  <div class="jtv-extra-link">
                     <a href="${pageContext.request.contextPath}/AddBookServlet?param1=${Pbook.number}&param2=1"><i class="fa fa-shopping-cart"></i></a> 
                    <a href="${pageContext.request.contextPath}/Quick_viewServlet?param1=${Pbook.bookname}" ><i class="fa fa-search"></i></a> 
                	</div>
                </div>
              </div>
            </div>
            </c:forEach>          
          </div>
        </div>
        <div class="col-md-4 col-sm-6">
          <div class="jtv-single-cat">
            <h2 class="cat-title">即将售罄</h2>          
            <c:forEach var="Obook" items="${ requestScope.Obook }">
            <div class="jtv-product">
              <div class="product-img"> <a href="${pageContext.request.contextPath}/Single_productServlet?param1=${Obook.bookname}"> <img src="${ Obook.img1 }" alt=""> <img class="secondary-img" src="${ Obook.img1 }" alt=""> </a> </div>
              <div class="jtv-product-content">
                <h3><a href="${pageContext.request.contextPath}/Single_productServlet?param1=${Obook.bookname}">${ Obook.bookname }</a></h3>
                <div class="price-box">
                  <p class="special-price"> <span class="price-label">Special Price</span> <span class="price"> ¥${ Obook.price } </span> </p>
                </div>
                <div class="jtv-product-action">
                  <div class="jtv-extra-link"> 
                    <a href="${pageContext.request.contextPath}/AddBookServlet?param1=${Obook.number}&param2=1"><i class="fa fa-shopping-cart"></i></a> 
                    <a href="${pageContext.request.contextPath}/Quick_viewServlet?param1=${Obook.bookname}" ><i class="fa fa-search"></i></a> 
                    </div>
                </div>
              </div>
            </div>
    		</c:forEach>        
          </div>
        </div>

        <!-- service area start -->
        <div class="col-md-4 col-sm-12 col-xs-12">
          <div class="jtv-service-area">
            <!-- jtv-single-service start -->
            <div class="jtv-single-service">
              <div class="service-icon"> <img alt="" src="images/customer-service-icon.png"> </div>
              <div class="service-text">
                <h2>24小时客服在线</h2>
                <p><span>Call us 24/7 at 12580</span></p>
              </div>
            </div>
            <div class="jtv-single-service">
              <div class="service-icon"> <img alt="" src="images/shipping-icon.png"> </div>
              <div class="service-text">
                <h2>全国范围内免费配送</h2>
                <p><span>订单超过99元</span></p>
              </div>
            </div>
            <div class="jtv-single-service">
              <div class="service-icon"> <img alt="" src="images/guaratee-icon.png"> </div>
              <div class="service-text">
                <h2>退款保证</h2>
                <p><span>7天内发货</span></p>
              </div>
            </div>
            <!-- jtv-single-service end -->
          </div>
        </div>
      </div>
    </div>
  </div>
  <!-- category-area end -->

  <!-- Footer -->

  <footer>
    <div class="container" >
      <div class="row">
        <div class="col-sm-6 col-md-4 col-xs-12 col-lg-3">
          <div class="footer-logo"><a href="index.html"><img src="images/footer-logo.png" alt="fotter logo"></a> </div>
          <p>Lorem Ipsum is simply dummy text of the print and typesetting industry.</p>
          <div class="footer-content">
            <div class="email"> <i class="fa fa-envelope"></i>
              <p>Support@themes.com</p>
            </div>
            <div class="phone"> <i class="fa fa-phone"></i>
              <p>12580</p>
            </div>
            <div class="address"> <i class="fa fa-map-marker"></i>
              <p> 地址：湖南长沙</p>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="footer-coppyright">
      <div class="container">
        <div class="row">
          <div class="col-sm-6 col-xs-12 coppyright"> Copyright ? 2016 <a href="#"> MyStore </a>. All Rights Reserved. </div>
        </div>
      </div>
    </div>
  </footer>
  <a href="#" class="totop"> </a> </div>

<!-- End Footer -->


<!-- JS -->

<!-- jquery js -->
<script type="text/javascript" src="js/jquery.min.js"></script>

<!-- bootstrap js -->
<script type="text/javascript" src="js/bootstrap.min.js"></script>

<!-- owl.carousel.min js -->
<script type="text/javascript" src="js/owl.carousel.min.js"></script>

<!-- bxslider js -->
<script type="text/javascript" src="js/jquery.bxslider.js"></script>

<!-- Slider Js -->
<script type="text/javascript" src="js/revolution-slider.js"></script>

<!-- megamenu js -->
<script type="text/javascript" src="js/megamenu.js"></script>
<script type="text/javascript">
  /* <![CDATA[ */
  var mega_menu = '0';

  /* ]]> */
  </script>

<!-- jquery.mobile-menu js -->
<script type="text/javascript" src="js/mobile-menu.js"></script>

<!--jquery-ui.min js -->
<script type="text/javascript" src="js/jquery-ui.js"></script>

<!-- main js -->
<script type="text/javascript" src="js/main.js"></script>

<!-- countdown js -->
<script type="text/javascript" src="js/countdown.js"></script>

<!-- Revolution Slider -->
<script type="text/javascript">
          jQuery(document).ready(function() {
                 jQuery('.tp-banner').revolution(
                  {
                      delay:9000,
                      startwidth:1170,
                      startheight:530,
                      hideThumbs:10,

                      navigationType:"bullet",
                      navigationStyle:"preview1",

                      hideArrowsOnMobile:"on",

                      touchenabled:"on",
                      onHoverStop:"on",
                      spinner:"spinner4"
                  });
          });
</script>

</body>
</html>
