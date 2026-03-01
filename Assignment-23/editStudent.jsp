<form action="student" method="post">
    <input type="hidden" name="id" value="${student.id}"/>

    Name: <input type="text" name="name" value="${student.name}" required/><br/>
    Email: <input type="email" name="email" value="${student.email}" required/><br/>
    Course: <input type="text" name="course" value="${student.course}" required/><br/>

    <input type="submit" value="Update"/>
</form>