<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Asking for details</title>
    </head>

    <body>
        <h1>Enter your info kind sir</h1>
        <br>
        <form:form action="/employee/showDetails" modelAttribute="employee">
            Name: <form:input path="name"/>
            <br>
            Surname: <form:input path="surname"/>
            <br>
            Salary: <form:input path="salary"/>
            <br>
            Department:
            <form:select path="department">
                <form:option value="Information technologies" label="IT"/>
                <form:option value="Human resources" label="HR"/>
                <form:option value="Sales" label="Sales"/>
            </form:select>
            <br>
            <input type="submit" value="OK!">
        </form:form>
    </body>

</html>