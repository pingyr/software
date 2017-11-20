<%--
  Created by IntelliJ IDEA.
  User: pingyr
  Date: 2017/7/10
  Time: 11:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>

    <title>芒果的味道--pingyr</title>
    <meta name="msvalidate.01" content="FF714500FB4E01BFF349C791BBDFBD6C" />

    <%@include file="/WEB-INF/jsp/common/head.jsp"%>


</head>
<body class="landing">
<div id="page-wrapper">

    <!-- Header -->
    <%@include file="/WEB-INF/jsp/common/header.jsp"%>

    <!-- Banner -->
    <section id="banner">
        <h2>芒果的味道</h2>
        <p>Do you understand the feeling of missing someone?</p>
        <ul class="actions">
            <li><a href="${pageContext.request.contextPath}/signUp" class="button special">注册</a></li>
            <li><a href="#" class="button">了解更多</a></li>
        </ul>
    </section>

    <!-- Main -->
    <section id="main" class="container">

        <section class="box special">
            <header class="major">
                <h2>Web前端设计师 Java工程师
                    <br />
                    for doing stuff with my hobby</h2>
                <p><br />
                    我对自己所要追求的目标充满信心</p>
            </header>
            <span class="image featured"><img src="${pageContext.request.contextPath}/resources/images/pic01.jpg" alt="pic01" /></span>
        </section>

        <section class="box special features">
            <div class="features-row">
                <section>
                    <span class="icon major fa-eercast accent2"></span>
                    <h3>Magna etiam</h3>
                    <p>Integer volutpat ante et accumsan commophasellus sed aliquam feugiat lorem aliquet ut enim rutrum phasellus iaculis accumsan dolore magna aliquam veroeros.</p>
                </section>
                <section>
                    <span class="icon major fa-ravelry accent3"></span>
                    <h3>Ipsum dolor</h3>
                    <p>Integer volutpat ante et accumsan commophasellus sed aliquam feugiat lorem aliquet ut enim rutrum phasellus iaculis accumsan dolore magna aliquam veroeros.</p>
                </section>
            </div>
            <div class="features-row">
                <section>
                    <span class="icon major fa-superpowers accent4"></span>
                    <h3>Sed feugiat</h3>
                    <p>Integer volutpat ante et accumsan commophasellus sed aliquam feugiat lorem aliquet ut enim rutrum phasellus iaculis accumsan dolore magna aliquam veroeros.</p>
                </section>
                <section>
                    <span class="icon major fa-linode accent5"></span>
                    <h3>Enim phasellus</h3>
                    <p>Integer volutpat ante et accumsan commophasellus sed aliquam feugiat lorem aliquet ut enim rutrum phasellus iaculis accumsan dolore magna aliquam veroeros.</p>
                </section>
            </div>
        </section>

        <div class="row">
            <div class="6u 12u(narrower)">

                <section class="box special">
                    <span class="image featured"><img src="${pageContext.request.contextPath}/resources/images/pic02.jpg" alt="pic02" /></span>
                    <h3>Sed lorem adipiscing</h3>
                    <p>Integer volutpat ante et accumsan commophasellus sed aliquam feugiat lorem aliquet ut enim rutrum phasellus iaculis accumsan dolore magna aliquam veroeros.</p>
                    <ul class="actions">
                        <li><a href="#" class="button alt">Learn More</a></li>
                    </ul>
                </section>

            </div>
            <div class="6u 12u(narrower)">

                <section class="box special">
                    <span class="image featured"><img src="${pageContext.request.contextPath}/resources/images/pic03.jpg" alt="pic03" /></span>
                    <h3>Accumsan integer</h3>
                    <p>Integer volutpat ante et accumsan commophasellus sed aliquam feugiat lorem aliquet ut enim rutrum phasellus iaculis accumsan dolore magna aliquam veroeros.</p>
                    <ul class="actions">
                        <li><a href="#" class="button alt">Learn More</a></li>
                    </ul>
                </section>

            </div>
        </div>

    </section>

    <!-- CTA -->
    <section id="cta">

        <h2>Sign up for beta access</h2>
        <p>Blandit varius ut praesent nascetur eu penatibus nisi risus faucibus nunc.</p>

        <form>
            <div class="row uniform 50%">
                <div class="8u 12u(mobilep)">
                    <input type="email" name="email" id="email" placeholder="Email Address" />
                </div>
                <div class="4u 12u(mobilep)">
                    <input type="submit" value="Sign Up" class="fit" />
                </div>
            </div>
        </form>

    </section>

    <!-- Footer -->
    <%@include file="/WEB-INF/jsp/common/footer.jsp"%>

</div>

</body>
<%@include file="/WEB-INF/jsp/common/scripts.jsp"%>
</html>
