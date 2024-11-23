<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View Transactions</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-4">
        <h2 class="text-center">Transactions</h2>
        <form class="mb-3" action="TransactionViewController" method="get">
            <div class="row">
                <div class="col-md-4">
                    <input type="text" name="customerId" class="form-control" placeholder="Enter Customer ID">
                </div>
                <div class="col-md-2">
                    <button type="submit" class="btn btn-primary">Filter</button>
                    <button type="button" class="btn btn-danger" onclick="window.location.href='AdminDashboard.jsp'">Cancel</button>
                </div>
                 
        			
      		   
            </div>
        </form>

        <c:if test="${not empty transactions}">
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>Transaction ID</th>
                        <th>Account Id</th>
                        <th>Type</th>
                        <th>Amount</th>
                        <th>To Account</th>
                        <th>Date</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="transaction" items="${transactions}">
                        <tr>
                            <td>${transaction.transactionId}</td>
                            <td>${transaction.accountId}</td>
                            <td>${transaction.type}</td>
                            <td>${transaction.amount}</td>
                            <td>${transaction.toAccount}</td>
                            <td><fmt:formatDate value="${transaction.date}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </c:if>

        <c:if test="${empty transactions}">
            <p class="text-center text-danger">No transactions found.</p>
        </c:if>
    </div>
</body>
</html>
