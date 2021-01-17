<%--
  Created by IntelliJ IDEA.
  User: didef
  Date: 1/17/2021
  Time: 1:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/ChessGame_css.css" />
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <title>Title</title>
</head>
<body>
<body ng-app="myApp" ng-keydown="rm($event)" key-event>
<div class="floating-chat">
    <i class="fa fa-comments" aria-hidden="true">Chat</i>
    <div class="chat">
        <div class="header">
            <span class="title">
                what's on your mind?
            </span>
            <button>
                <i class="fa fa-times" aria-hidden="true">Close</i>
            </button>

        </div>
        <ul class="messages">
            <li class="other">Name1: Hello</li>
            <li class="self">Name2: Hello</li>
        </ul>
        <div class="footer">
            <div class="text-box" contenteditable="true" disabled="true"></div>
            <button id="sendMessage">send</button>
        </div>
    </div>
</div>
<script src="${pageContext.request.contextPath}/js/ChessGame_js.js"></script>
</body>
</body>
</html>
