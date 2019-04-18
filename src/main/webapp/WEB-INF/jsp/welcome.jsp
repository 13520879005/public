<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    String webapp = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + webapp + "/";
%>
<!DOCTYPE html>
<html lang="en">
<script type="text/javascript" src="/static/js/jquery-1.11.3.js"></script>
<script type="text/javascript">
    $(function(){
        alert("1111111111")
    })
</script>
<body>
Time:  ${ss}
<br>
Message: ${ss}
</body>

</html>