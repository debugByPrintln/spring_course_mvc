<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Showing employee details</title>
    </head>

    <body>
        <h1>
            Welcome, kind sir!!!
        </h1>
        <br>
        <%--<h1>Your name: ${param.employeeName}</h1>--%>
        <h1>Name: ${employee.name}</h1>
        <br>
        <h1>Surname: ${employee.surname}</h1>
        <br>
        <h1>Salary: ${employee.salary} $$$</h1>
        <br>
        <h1>Department: ${employee.department}</h1>
        <br>
        <h1>Car brand: ${employee.carBrand}</h1>
        <br>
        <h1>Languages:
            <ul>
                <c:forEach var="lang" items="${employee.languages}">
                <li>
                    ${lang}
                </li>
                </c:forEach>
            </ul>
        </h1>
        <br>
        <h1>Phone number: ${employee.phoneNumber}</h1>
        <br>
        <h1>Email: ${employee.email}</h1>
    </body>
</html>