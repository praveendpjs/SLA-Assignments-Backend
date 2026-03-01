<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Student Form</title>
</head>
<body>

<h2>Enter Student Details</h2>

<%
    String error = (String) request.getAttribute("error");
    if (error != null) {
%>
    <p style="color:red;"><%= error %></p>
<%
    }
%>

<form action="student" method="post">
    Name: <input type="text" name="name" required /><br/><br/>
    Email: <input type="email" name="email" required /><br/><br/>
    Course: <input type="text" name="course" required /><br/><br/>
    Marks: <input type="number" name="marks" required /><br/><br/>

    <input type="submit" value="Submit" />
</form>

</body>
</html>