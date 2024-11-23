<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Passbook</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h2>Passbook</h2>

        <form action="PassBookController" method="GET" class="mb-4">
            <div class="row">
                <div class="col-md-6">
                    <label for="accountNumber" class="form-label">Account Number</label>
                    <input type="text" id="accountNumber" name="accountNumber" class="form-control" placeholder="Enter account number (optional)">
                </div>
                <div class="col-md-6 d-flex align-items-end">
                    <button type="submit" class="btn btn-primary">Filter Transactions</button>
                </div>
            </div>
        </form>

        <c:if test="${not empty transactions}">
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Transaction ID</th>
                        <th>Account Number</th>
                        <th>Transaction Type</th>
                        <th>Amount</th>
                        <th>To Account</th>
                        <th>Date</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="transaction" items="${transactions}">
                        <tr>
                         <td>${transaction.getTransactionId()}</td>
                            <td>${transaction.getAccountId()}</td>
                            <td>${transaction.getType()}</td>
                            <td>${transaction.getAmount()}</td>
                            <td><c:out value="${transaction.getToAccount()}" default="N/A" /></td>
                            <td>${transaction.getDate()}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </c:if>

        <c:if test="${empty transactions}">
            <p class="text-center text-warning">No transactions found.</p>
        </c:if>

        <c:if test="${not empty errorMessage}">
            <p class="text-center text-danger">${errorMessage}</p>
        </c:if>

        <button class="btn btn-secondary mt-3" onclick="window.location.href='UserDashboard.jsp'">Back to Dashboard</button>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
