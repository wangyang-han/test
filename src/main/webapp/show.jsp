<%--
  Created by IntelliJ IDEA.
  User: 刘娅
  Date: 2020/2/15
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form id="form1" name="form1" method="get" action="/getAll">
    部门名称:
    <select id="select1" name="nameid">
        <option value="">请选择</option>
    </select>
    <input type="hidden" name="page" value="1" id="setpage"/>
    入职日期:
    <label for="textfield2"></label>
    <input type="date" name="start" id="textfield2"
           value="<fmt:formatDate value="${pageUtil.start}" pattern="yyyy-MM-dd"></fmt:formatDate>"/>
    --
    <label for="textfield3"></label>
    <input type="date" name="end" id="textfield3"
           value="<fmt:formatDate value="${pageUtil.end}" pattern="yyyy-MM-dd"></fmt:formatDate>"/>
    <input type="submit" name="button" id="button" value="查询" />
    <input type="button" name="button2" id="button2" value="添加" />
</form>
<table width="100%%">
    <tr>
        <td>标题</td>
        <td>记账时间</td>
        <td>类别</td>
        <td>金额</td>
        <td>说明</td>
        <td>修改</td>
        <td>删除</td>
    </tr>
    <c:forEach items="${info.list}" varStatus="i" var="a">
    <tr>
        <td>${a.title}</td>
        <td><fmt:formatDate value="${a.time}" pattern="yyyy-MM-dd"></fmt:formatDate> </td>
        <td>${a.name}</td>
        <td>${a.price}</td>
        <td>${a.explain}</td>
        <td><a href="/getOne?id=${a.id}">修改</a></td>
    </tr>
    </c:forEach>
</table>
共${info.total}条,当前第${info.pageNum}页
<a href="javascript:go(1)">首页</a>
<a href="javascript:go(${info.prePage==0?1:info.prePage})">上一页</a>
<a href="javascript:go(${info.nextPage==0?info.pages:info.nextPage})">下一页</a>
<a href="javascript:go(${info.pages})">尾页</a>
<p>&nbsp;</p>
</body>
</html>
<script type="text/javascript" language="JavaScript" src="statics/js/jquery.min.js"></script>
<script language="JavaScript">
    function go(page) {
        document.getElementById("setpage").value=page;
        document.getElementById("form1").submit();
    }
    $(function () {
       $.post("getAll2",null,function (data) {
           for(var i=0;i<data.length;i++){
               var option="<option value="+data[i].id+">"+data[i].name+"</option>";
               $("#select1").append(option);
           }
           //回显
           $("#select1").val(${pageUtil.nameid})
       },"json")

    });
</script>
