<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View Customers</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-4">
        <h2 class="text-center">Customers</h2>
        <form class="mb-3" action="ViewCustomerController" method="get">
            <div class="row">
                <div class="col-md-4">
                    <input type="text" name="customernId" class="form-control" placeholder="Enter Customer ID">
                </div>
                <div class="col-md-2">
                    <button type="submit" class="btn btn-primary">Filter</button>
                    <button type="button" class="btn btn-danger" onclick="window.location.href='AdminDashboard.jsp'">Cancel</button>
                </div>
            </div>
        </form>

        <c:if test="${not empty customers}">
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>Customer ID</th>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Phone</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="customer" items="${customers}">
                        <tr>
                            <td>${customer.getCustomerId()}</td>
                            <td>${customer.getFirstName()}</td>
                            <td>${customer.getLastName()}</td>
                            <td>${customer.getEmail()}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </c:if>

        <c:if test="${empty customers}">
            <p class="text-center text-danger">No customers found.</p>
        </c:if>
       
    </div>
</body>
</html>
