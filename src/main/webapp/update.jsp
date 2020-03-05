<%--
  Created by IntelliJ IDEA.
  User: 刘娅
  Date: 2020/2/18
  Time: 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>

<body>
${one.title}1 1
<form id="form1" name="form1" method="post" action="/update">
    <!--修改的时候要用到id-->
    <input type="hidden" name="id" value="${one.id}"/>
    <p id="p1">类型:${one.typeid}

    </p>
    <p>标题:
        <label for="textfield"></label>
        <input type="text" name="title" id="textfield" value="${one.title}"/>
    </p>
    <p>日期:
        <label for="textfield2"></label>
        <input type="date" name="time" id="textfield2"
               value="<fmt:formatDate value="${one.time}" pattern="yyyy-MM-dd"></fmt:formatDate>"/>
    </p>
    <p>金额:
        <input type="text" name="price" id="textfield3" value="${one.price}" />
    </p>
    <p>说明:
        <label for="textarea"></label>
        <textarea name="explain" id="textarea" cols="45" rows="5">
            ${one.explain}
        </textarea>
    </p>
    <p>
        <input type="submit" name="button" id="button" value="保存" />
    </p>
</form>
</body>
<script type="text/javascript" language="JavaScript" src="statics/js/jquery.min.js"></script>
<script language="JavaScript">
    $(function () {

        $.post("getAll2",null,function (data) {
            var id = ${one.typeid};
            for(var i=0;i<data.length;i++){
                if (id == data[i].id) {
                    //回显
                   var radio="<input checked type='radio' name='nameid'  value="+data[i].id+"/>"+data[i].name;
                }else {
                var radio="<input  type='radio' name='nameid'  value="+data[i].id+"/>"+data[i].name;
                }
                $("#p1").append(radio);
            }
        },"json")

    });
</script>
</html>
