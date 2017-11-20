<%--
  Created by IntelliJ IDEA.
  User: pingyr
  Date: 2017/7/10
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<header id="header">
    <h1><a href="${pageContext.request.contextPath}/home">Mango</a> by Pingyr</h1>
    <nav id="nav">
        <ul>
            <li><a href="${pageContext.request.contextPath}/home">Home</a></li>
            <li>
                <a href="#" class="icon fa-angle-down">其他</a>
                <ul>
                    <li><a href="${pageContext.request.contextPath}/generic">个人简介</a></li>
                    <li><a href="${pageContext.request.contextPath}/contact">与我联系</a></li>
                    <li><a href="${pageContext.request.contextPath}/elements">Elements</a></li>
                    <li>
                        <a href="#">Submenu</a>
                        <ul>
                            <li><a href="#">Option One</a></li>
                            <li><a href="#">Option Two</a></li>
                            <li><a href="#">Option Three</a></li>
                            <li><a href="#">Option Four</a></li>
                        </ul>
                    </li>
                </ul>
            </li>
            <li><a href="${pageContext.request.contextPath}/signIn" class="button">登陆</a></li>
        </ul>
    </nav>
</header>
