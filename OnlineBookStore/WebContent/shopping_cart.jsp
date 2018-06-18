<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
<!-- Basic page needs -->
<meta charset="utf-8">
<!--[if IE]>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <![endif]-->
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>MyStore premium HTML5 &amp; CSS3 template</title>
<meta name="description" content="">

<!-- Mobile specific metas  -->
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Favicon  -->
<link rel="shortcut icon" type="image/x-icon" href="favicon.ico">

<!-- Google Fonts -->
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

<!-- animate CSS  -->
<link rel="stylesheet" type="text/css" href="css/animate.css" media="all">

<!-- flexslider CSS -->
<link rel="stylesheet" type="text/css" href="css/flexslider.css" >

<!-- jquery-ui.min CSS  -->
<link rel="stylesheet" type="text/css" href="css/jquery-ui.css">

<!-- Revolution Slider CSS -->
<link rel="stylesheet" type="text/css" href="css/revolution-slider.css">

<!-- style CSS -->
<link rel="stylesheet" type="text/css" href="css/style.css" media="all">

<style type="text/css">
.box{
	margin-top:30px,40px,10px,40px;
	margin-left: 60px;

}

th,td{
	text-align:center;
}
</style>
</head>

<body class="shopping_cart_page">

     

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
               <div class="myaccount"><a title="我的账户" href="MyAccountServlet"><i class="fa fa-user"></i><span class="hidden-xs">我的账户</span></a></div> <div class="login"><a href="LoginOutServlet"><i class="fa fa-unlock-alt"></i><span class="hidden-xs">注销</span></a></div>
              </div>
              <div class="language-currency-wrapper">
                <div class="inner-cl">
                  <div class="block block-language form-language">
                    <div class="lg-cur"> <span> <img src="images/flag-default.jpg" alt="Chinese"> <span class="lg-fr">简体中文</span> <i class="fa fa-angle-down"></i> </span> </div>
                    <ul>
                     <!--  <li> <a class="selected" href="#"> <img src="images/flag-english.jpg" alt="flag"> <span>English</span> </a> </li>
                      --> <li> <a href="#"> <img src="images/flag-default.jpg" alt="flag"> <span>简体中文</span> </a> </li>
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
                          <strong>${Cart.count }</strong>  <span class="price">¥${Cart.price }</span> </div> 
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
              <li class="mt-root">  <!-- 最新上架  -->
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
  
  <!-- Main Container -->
  <section class="main-container col1-layout">
    <div class="main container">
    	
      <div class="col-main">
        <div class="cart">
          
          <div class="page-content page-order"><div class="page-title">
            <h2>购物车</h2>
          </div>     
            
            <div class="order-detail-content">
              <div class="table-responsive">
                <c:set var="sum" value="0"> </c:set>

                <form action="OrderInsertServlet" name="form" id="form" method="post" onsubmit="return check()">
                <table class="table table-bordered cart_summary">
                  <thead>
                    <tr>
                      <th class="cart_product">商品</th>
                      <th>书名</th>
                      <th>单价</th>
                      <th>数量</th>
                      <th>总价</th>
                      <th  class="action"><i class="fa fa-trash-o"></i></th>
                    </tr>
                  </thead>
                  <tbody>
                  	
                  	<c:forEach var="Cart" items="${requestScope.Cart}"> 
                    <tr>
                      <td class="cart_product"><a href="${pageContext.request.contextPath}/Single_productServlet?param1=${Cart.bookname}"><img src="${Cart.img1}" alt="Product"></a></td>
                      <td class="cart_description"><p class="product-name"><a href="${pageContext.request.contextPath}/Single_productServlet?param1=${Cart.bookname}"><span id="bookname">${Cart.bookname}</span></a></p>
                      <td class="price"><span>￥</span><span id="price">${Cart.price}</span></td>
                      <td class="qty"><span><input name="qty" value="${Cart.count}" id="qty"/></span></td>
                      <td class="price"><span id="tprice">￥${Cart.totalprice}</span></td>
                      <td class="action"><a href="${pageContext.request.contextPath}/DeleteBookServlet?param1=${Cart.cartserial}"><i class="icon-close"></i></a></td>
                      <!-- 点击X  执行购物车表的删除操作、调回删除后的购物车详情界面 -->
                    </tr>
                    	<c:set var="sum" value="${sum + Cart.totalprice }"></c:set>
                    	
                    </c:forEach>
                  </tbody>
                  <tfoot>
                    <tr>
                      <td ><label for="receiver" ><p style="font-size: 16px; margin-top: 8px;">收件人</p></label></td>
                      <td  ><input type="text" name="receiver" placeholder="输入收件人"  id="telephone" size="15"></td>
                      <td><label for="rphone" ><p style="font-size: 16px; margin-top: 8px;">电话</p></label></td>
                      <td><input type="text" name="rphone" id="rphone" placeholder="输入手机号"  size="15"></td>
                      <td><label for="address" ><p style="font-size: 16px; margin-top: 8px;">地址</p></label></td>
                      <td><input type="text" name="address" placeholder="输入地址"  id="address" size="15"></td>
                    </tr>
                    <tr>
                      <td colspan="4"><strong>总付款</strong></td>
                      <td colspan="1"><strong>￥${ sum } </strong></td>   
                      <td colspan="1"><button type="submit" class="checkout-btn" oncliek="return check()"><i class="fa fa-check"></i>结算</button></td>   
                    </tr>
                    
                  </tfoot>               
                </table>
                </form>
                 
              </div>
             <!--  <div class="cart_navigation"> 
              	<a class="continue-btn" href="FindBookServlet"><i class="fa fa-arrow-left"> </i>&nbsp; 继续购物</a> 
              	<a class="checkout-btn" href="OrderInsertServlet" oncliek="return check()" type="submit"><i class="fa fa-check"></i> 结算</a> 
             			
              </div> -->
            </div>
          </div>
        </div>
      </div>
      
    </div>
  </section>
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
          <div class="col-sm-6 col-xs-12 coppyright"> Copyright © 2016 <a href="#"> MyStore </a>. All Rights Reserved. </div>
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

<!--jquery-slider js --> 
<script type="text/javascript" src="js/slider.js"></script> 

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

 <script language="javascript">
document.getElementById('qty').onblur=function(){
	 var result = document.getElementById('qty');var qty = result.value;  
	// var count = form.qty.value;
	/* var inventory = document.getElementById("inventory").value; 
	alert(inventory); */
	 if( isNaN( qty )||qty<=0){
		alert("请输入正确的数字符号");
	} 
	 else{
	 var price = document.getElementById("price").innerText; 
	 var bookname = document.getElementById("bookname").innerText; 
	 document.getElementById("tprice").innerHTML = "￥"+ qty*price;
	 window.location.href="UpdateCartServlet?param1="+bookname+"&param2="+qty+"";
	} 
 }
document.getElementById('form').onsubmit=function(){
	var regm = /^[1]+[0-9]+[0-9]+[0-9]+[0-9]+[0-9]+[0-9]+[0-9]+[0-9]+[0-9]+[0-9]+$/
		
	if(form.receiver.value=="")
	{
		alert("收件人不能为空！");
		blur();
		return false;
	}
	if(!form.id.value.match(regm)||form.rphone.value=="")
	{
		alert("手机号为空或格式不正确！");
		return false;
	}
	if(form.address.value=="")
	{
		alert("地址不能为空！");
		return false;
	}
} 
</script>
 
</body>
</html>
