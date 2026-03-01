<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<a href="student?action=new">Add Student</a>

<table border="1">
<tr>
    <th>ID</th><th>Name</th><th>Email</th><th>Course</th><th>Actions</th>
</tr>

<c:forEach var="student" items="${listStudent}">
<tr>
    <td>${student.id}</td>
    <td>${student.name}</td>
    <td>${student.email}</td>
    <td>${student.course}</td>
    <td>
        <a href="student?action=edit&id=${student.id}">Edit</a>
        <a href="student?action=delete&id=${student.id}">Delete</a>
    </td>
</tr>
</c:forEach>
</table>