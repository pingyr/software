<%--
  Created by IntelliJ IDEA.
  User: pingyr
  Date: 2017/9/30
  Time: 8:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SignUp|芒果的味道</title>
    <%@include file="common/head.jsp" %>
</head>
<body>
<div id="page-wrapper">

    <!--Header-->
    <%@include file="common/header.jsp" %>

    <!--Main-->
    <section id="main" class="container">
        <header>
            <h2>登陆本网站</h2>
            <p>会员可以浏览更多内容</p>
        </header>
        <div class="box">
            <form method="post" action="#">
                <div class="row uniform 50%">
                    <div class="12u">
                        <input type="text" name="username" id="username" value="" placeholder="会员登陆名"/>
                    </div>
                </div>
                <div class="row uniform 50%">
                    <div class="12u">
                        <input type="password" name="password" id="password" value="" placeholder="密码"/>
                    </div>
                </div>
                <div class="row uniform">
                    <div class="12u">
                        <ul class="actions align-center">
                            <li><input type="submit" value="登陆" class="alt"/></li>
                        </ul>
                    </div>
                </div>
            </form>
        </div>
    </section>

    <!--Footer-->
    <%@include file="common/footer.jsp" %>
</div>
</body>

<%@include file="common/scripts.jsp" %>
</html>
