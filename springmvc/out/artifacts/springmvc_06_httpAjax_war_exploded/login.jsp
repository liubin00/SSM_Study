<%--
  Created by IntelliJ IDEA.
  User: XDD
  Date: 2021/5/13
  Time: 12:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.6.0.min.js"></script>

    <script>
            function a1() {
                $.post({
                    url: "${pageContext.request.contextPath}/a3",
                    data: {
                        "name": $("#name").val()
                    },
                    success: function (data) {
                        $("#userInfo").html(data);
                    }
                })
            }

            function a2() {
                $.post({
                    url: "${pageContext.request.contextPath}/a3",
                    data: {
                        "pwd": $("#pwd").val()
                    },
                    success: function (data) {
                        $("#pwdInfo").html(data);
                    }
                })
            }
    </script>
</head>
<body>

<p>
    用户名:<input id="name" type="text" onblur="a1()">
    <span id="userInfo"></span>
</p>
<p>
    密码:<input id="pwd" type="text" onblur="a2()">
    <span id="pwdInfo"></span>
</p>
</body>
</html>
