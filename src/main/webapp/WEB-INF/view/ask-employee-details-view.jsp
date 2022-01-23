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
            <form:errors path="name"/>
            <br>
            Surname: <form:input path="surname"/>
            <form:errors path="surname"/>
            <br>
            Salary: <form:input path="salary"/>
            <form:errors path="salary"/>
            <br>
            Department:
            <form:select path="department">
                <form:option value="InTech" label="IT"/>
                <form:option value="Human resources" label="HR"/>
                <form:option value="Sales" label="Sales"/>
            </form:select>
            <br>
            Select car brand:
            <form:radiobuttons path="carBrand" items="${employee.carsList}"/>
            <br>
            Foreign languages knowledge:
            EN <form:checkbox path="languages" value="English"/>
            FR <form:checkbox path="languages" value="French"/>
            DE <form:checkbox path="languages" value="Deutch"/>
            <br>
            PhoneNumber: <form:input path="phoneNumber"/>
            <form:errors path="phoneNumber"/>
            <br>
            Email: <form:input path="email"/>
            <form:errors path="email"/>
            <br>
            <input type="submit" value="OK!">
        </form:form>
    </body>

</html>