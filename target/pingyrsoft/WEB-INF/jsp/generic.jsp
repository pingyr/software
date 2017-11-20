<%--
  Created by IntelliJ IDEA.
  User: pingyr
  Date: 2017/7/10
  Time: 15:54
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
    <section id="main" class="container">
        <header>
            <h2>Pingyr`s 个人简介</h2>
            <p>A generic page for every non-generic situation.</p>
        </header>
        <div class="box">
            <span class="image featured"><img src="${pageContext.request.contextPath}/resources/images/pic01.jpg" alt="" /></span>
            <h3>This is a subheading</h3>
            <p>Cep risus aliquam gravida cep ut lacus amet. Adipiscing faucibus nunc placerat. Tempus adipiscing turpis non blandit accumsan eget lacinia nunc integer interdum amet aliquam ut orci non col ut ut praesent. Semper amet interdum mi. Phasellus enim laoreet ac ac commodo faucibus faucibus. Curae ante vestibulum ante. Blandit. Ante accumsan nisi eu placerat gravida placerat adipiscing in risus fusce vitae ac mi accumsan nunc in accumsan tempor blandit aliquet aliquet lobortis. Ultricies blandit lobortis praesent turpis. Adipiscing accumsan adipiscing adipiscing ac lacinia cep. Orci blandit a iaculis adipiscing ac. Vivamus ornare laoreet odio vis praesent nunc lorem mi. Erat. Tempus sem faucibus ac id. Vis in blandit. Nascetur ultricies blandit ac. Arcu aliquam. Accumsan mi eget adipiscing nulla. Non vestibulum ac interdum condimentum semper commodo massa arcu.</p>
            <div class="row">
                <div class="6u 12u(mobilep)">
                    <h3>And now a subheading</h3>
                    <p>Adipiscing faucibus nunc placerat. Tempus adipiscing turpis non blandit accumsan eget lacinia nunc integer interdum amet aliquam ut orci non col ut ut praesent. Semper amet interdum mi. Phasellus enim laoreet ac ac commodo faucibus faucibus. Curae lorem ipsum adipiscing ac. Vivamus ornare laoreet odio vis praesent.</p>
                </div>
                <div class="6u 12u(mobilep)">
                    <h3>And another subheading</h3>
                    <p>Adipiscing faucibus nunc placerat. Tempus adipiscing turpis non blandit accumsan eget lacinia nunc integer interdum amet aliquam ut orci non col ut ut praesent. Semper amet interdum mi. Phasellus enim laoreet ac ac commodo faucibus faucibus. Curae lorem ipsum adipiscing ac. Vivamus ornare laoreet odio vis praesent.</p>
                </div>
            </div>
        </div>
    </section>

    <!-- Footer -->
    <%@include file="common/footer.jsp"%>

</div>
<%@include file="common/scripts.jsp"%>
</body>
</html>
