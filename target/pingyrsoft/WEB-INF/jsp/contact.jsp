<%--
  Created by IntelliJ IDEA.
  User: pingyr
  Date: 2017/7/10
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>芒果的味道--pingyr</title>
    <%@include file="common/head.jsp"%>
</head>
<body>
    <div id="page-wrapper">

        <!--Header-->
        <%@include file="common/header.jsp"%>

        <!-- Main -->
        <section id="main" class="container 75%">
            <header>
                <h2>与我联系</h2>
                <p>如果你对我的网站有新的建议与想法，请与我联系.</p>
            </header>
            <div class="box">
                <form method="post" action="${pageContext.request.contextPath}/send-message" >
                    <div class="row uniform 50%">
                        <div class="6u 12u(mobilep)">
                            <input type="text" name="name" id="name" value="" placeholder="姓名" />
                        </div>
                        <div class="6u 12u(mobilep)">
                            <input type="email" name="email" id="email" value="" placeholder="邮箱" />
                        </div>
                    </div>
                    <div class="row uniform 50%">
                        <div class="12u">
                            <input type="text" name="subject" id="subject" value="" placeholder="主题" />
                        </div>
                    </div>
                    <div class="row uniform 50%">
                        <div class="12u">
                            <textarea name="content" id="message" placeholder="输入你的消息" rows="6"></textarea>
                        </div>
                    </div>
                    <div class="row uniform">
                        <div class="12u">
                            <ul class="actions align-center">
                                <li><input type="submit" value="发送消息" /></li>
                            </ul>
                        </div>
                    </div>
                </form>
            </div>
        </section>

        <!-- Footer -->
        <%@include file="common/footer.jsp"%>

    </div>

</body>
<%@include file="common/scripts.jsp"%>
</html>
