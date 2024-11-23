<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customer Home</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <h2 class="mt-5">Customer Home</h2>

        <% 
            String username = (String) session.getAttribute("username");
        %>

        <h1>Welcome, <%=username%></h1>
        
        <!-- Navbar -->
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#">Customer Dashboard</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="UserDashboard.jsp">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="PassBookController">Passbook</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="new_transaction.jsp">New Transaction</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="edit_profile.jsp">Edit Profile</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="AccountViewController">View Accounts</a> <!-- Added View Accounts link -->
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="LogoutController">Logout</a>
                    </li>
                </ul>
            </div>
        </nav>

        <c:if test="${not empty passbook}">
            <div class="container mt-5">
                <h2>Passbook</h2>

                <form action="PassBookController" method="GET" class="mb-4">
                    <div class="row">
                        <div class="col-md-6">
                            <label for="accountNumber" class="form-label">Account Number</label>
                            <input type="text" id="accountNumber" name="accountNumber" class="form-control" placeholder="Enter account number (optional)">
                        </div>
                        <div class="col-md-3">
                            <label for="transactionType" class="form-label">Transaction Type</label>
                            <select id="transactionType" name="transactionType" class="form-control">
                                <option value="">All</option>
                                <option value="Credit">Credit</option>
                                <option value="Debit">Debit</option>
                                <option value="Transfer">Transfer</option>
                            </select>
                        </div>
                        <div class="col-md-3 d-flex align-items-end">
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
        </c:if>

        <c:if test="${not empty ViewAccounts}">
            <div class="container mt-5">
                <h2>View Accounts</h2>

                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th>Customer ID</th>
                            <th>First Name</th>
                            <th>Last Name</th>
                            <th>Account Number</th>
                            <th>Balance</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="account" items="${accounts}">
                            <tr>
                                <td>${account.customerId}</td>
                                <td>${account.firstName}</td>
                                <td>${account.lastName}</td>
                                <td>${account.accountNumber}</td>
                                <td>${account.balance}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
                  <c:if test="${empty accounts}">
		            <p class="text-center text-warning">No accounts found.</p>
		        </c:if>
		
		        <c:if test="${not empty errorMessage}">
		            <p class="text-center text-danger">${errorMessage}</p>
		        </c:if>
               <button class="btn btn-secondary mt-3" onclick="window.location.href='UserDashboard.jsp'">Back to Dashboard</button>
            </div>
        </c:if>

      

       

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
