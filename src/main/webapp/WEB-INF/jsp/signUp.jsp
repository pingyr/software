<%--
  Created by IntelliJ IDEA.
  User: pingyr
  Date: 2017/9/29
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SignUp|芒果的味道</title>
    <%@include file="common/head.jsp"%>
    <style type="text/css">
        /*.has-success{*/
            /*border-color: #7fcdb8 !important;*/
            /*-webkit-box-shadow: 0 0 0 2px #7fcdb8;*/
            /*-moz-box-shadow: 0 0 0 2px #7fcdb8;*/
            /*box-shadow: 0 0 0 2px #7fcdb8;*/
        /*}*/

    </style>
</head>
<body>
    <div id="page-wrapper">

        <!--Header-->
        <%@include file="common/header.jsp" %>

        <!--Main-->
        <section id="main" class="container">
            <header>
                <h2>注册本网站的会员</h2>
                <p>仅接受邀请码方式注册</p>
            </header>
            <div class="box">
                <form method="post" action="${pageContext.request.contextPath}/account/create">
                    <div class="row uniform 50%">
                        <div class="12u">
                            <input type="text" name="username" id="username" class="" value="" placeholder="用户名"/>
                        </div>
                    </div>
                    <div class="row uniform 50%">
                        <div class="12u">
                            <input type="password" name="password" id="password" value="" placeholder="密码"/>
                        </div>
                    </div>
                    <div class="row uniform 50%">
                        <div class="12u">
                            <input type="password" name="checkpassword" id="checkpassword" value="" placeholder="确认密码"/>
                        </div>
                    </div>
                    <div class="row uniform 50%">
                        <div class="12u">
                            <input type="email" name="email" id="email" value="" placeholder="邮箱"/>
                        </div>
                    </div>
                    <div class="row uniform 50%">
                        <div class="12u">
                            <input type="text" name="invite-code" id="invite-code" value="" placeholder="邀请码"/>
                        </div>
                    </div>
                    <div class="row uniform">
                        <div class="12u">
                            <ul class="actions align-center">
                                <li><input type="submit" value="注册" class="alt"/></li>
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
<%@include file="common/scripts.jsp"%>
</html>
