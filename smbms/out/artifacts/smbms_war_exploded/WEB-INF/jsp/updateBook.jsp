<%--
  Created by IntelliJ IDEA.
  User: XDD
  Date: 2021/5/12
  Time: 12:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
    <%--BootStrap美化界面--%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>
    <%--出现的问题:我们提交了修改的Sql请求，但是修改失败，初次考虑，是事务问题，配置完毕事务，依旧失败--%>
    <%--Sql执行失败,缺少bookid--%>
    <%--前端传递隐藏域--%>
    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <input type="hidden" name="bookID" value="${QBooks.bookID}">
        <div class="form-group">
            <label>书籍名称:</label>
            <input type="text" class="form-control" name="bookName" value="${QBooks.bookName}" required>
        </div>
        <div class="form-group">
            <label>书籍数量:</label>
            <input type="text" class="form-control" name="bookCounts" value="${QBooks.bookCounts}" required>
        </div>
        <div class="form-group">
            <label>书籍描述:</label>
            <input type="text" class="form-control" name="detail" value="${QBooks.detail}" required>
        </div>
        <button type="submit" class="btn btn-default">修改</button>
    </form>


</div>
</body>
</html>
