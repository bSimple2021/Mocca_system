<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>

    <thead>
        <tr>
            <td>部门</td>
            <td>负责人</td>
            <td>部门人数</td>
            <td>部门电话</td>
            <td>创建时间</td>
            <td>最后修改时间</td>
        </tr>
    </thead>
    <tbody>
    <c:forEach var="Department" items="${requestScope.get('msg')}">
        <tr>
            <td>${Department.getDepartmentName()}</td>
            <td></td>
            <td></td>
            <td>${Department.getDepartmentNumber()}</td>
            <td>${Department.getDepartmentCreateTime()}</td>
            <td>${Department.getDepartmentLastModifyTime()}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
