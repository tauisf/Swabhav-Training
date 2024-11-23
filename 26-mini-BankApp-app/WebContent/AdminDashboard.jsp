<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Home</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
    <h2 class="mt-5 text-primary">Admin Home</h2>
    <%
    String username = (String) session.getAttribute("username");
    %>

    <!-- Styled Welcome Message -->
    <div class="text-center my-4">
        <h1 class="display-4 text-success">Welcome, <%= username %></h1>
    </div>

    <!-- Bootstrap Navbar -->
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Admin Panel</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="AddCustomerController">Add New Customer</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="GenerateAccount">Add Bank Account</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="ViewCustomerController">View Customers</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="TransactionViewController">View Transactions</a>
                    </li>
                </ul>
                <!-- Logout Button -->
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item">
                        <a class="btn btn-danger" href="LogoutController">Logout</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
</div>
    
    <c:if test="${not empty ViewTransaction}">
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
                            <td>${transaction.getTransactionId()}</td>
                            <td>${transaction.getAccountId()}</td>
                            <td>${transaction.getType()}</td>
                            <td>${transaction.getAmount()}</td>
                            <td>${transaction.getToAccount()}</td>
                            <td>${transaction.getDate()}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </c:if>

        <c:if test="${empty transactions}">
            <p class="text-center text-danger">No transactions found.</p>
        </c:if>
    </div>
    </c:if>
    
    
    
   <c:if test="${not empty ViewCustomer}">
    <div class="container mt-4">
        <h2 class="text-center">Customers</h2>
        <form class="mb-3" action="ViewCustomerController" method="get">
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

        <c:if test="${not empty customers}">
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>Customer ID</th>
                        <th>FirstName</th>
                        <th>LastName</th>
                        <th>Email</th>
                        <th>AccountNumber</th>
                        <th>Balance</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="customer" items="${customers}">
                        <tr>
                            <td>${customer.getCustomerId()}</td>
                            <td>${customer.getFirstName()}</td>
                            <td>${customer.getLastName()}</td>
                            <td>${customer.getEmail()}</td>
                            <td>${customer.getAccountNumber()}</td>
                            <td>${customer.getBalance()}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </c:if>

        <c:if test="${empty customers}">
            <p class="text-center text-danger">No customers found.</p>
        </c:if>
       
    </div>
    </c:if>
    
    
    <!-- Add Account Form -->
    <c:if test="${not empty AddAccount}">
        <div class="container">
            <h3 class="mt-5">Add Bank Account</h3>
            <form action="GenerateAccount" method="POST">
                <div class="mb-3">
                    <label for="customerId" class="form-label">Customer ID</label>
                    <input type="text" class="form-control" id="customerId" name="customerId" required>
                </div>
                <button type="submit" class="btn btn-primary">Generate Account</button>
                <a class="btn btn-secondary" href="AdminDashboard.jsp">Cancel</a>
            </form>
            <c:if test="${not empty errorMessage}">
            <p class="text-center text-danger">${errorMessage}</p>
        </c:if>
        <!-- Success Message -->
        <c:if test="${not empty successMessage}">
            <div class="alert alert-success text-center">${successMessage}</div>
        </c:if>
        </div>
    </c:if>

    
    <c:if test="${not empty AddCustomer }">
    <div class="container">
        <h2 class="mt-5">Add New Customer</h2>
        <form action="AddCustomerController" method="POST">
            <div class="mb-3">
                <label for="firstName" class="form-label">First Name</label>
                <input type="text" class="form-control" id="firstName" name="firstName" required>
            </div>
            <div class="mb-3">
                <label for="lastName" class="form-label">Last Name</label>
                <input type="text" class="form-control" id="lastName" name="lastName" required>
            </div>
            <div class="mb-3">
                <label for="email" class="form-label">Email</label>
                <input type="email" class="form-control" id="email" name="email" required>
            </div>
            <div class="mb-3">
                <label for="password" class="form-label">Password</label>
                <input type="password" class="form-control" id="password" name="password" required>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
            <button type="button" class="btn btn-secondary" onclick="window.location.href='AdminDashboard.jsp'">Cancel</button>
        </form>
        
         <c:if test="${not empty errorMessage}">
            <p class="text-center text-danger">${errorMessage}</p>
        </c:if>
        <!-- Success Message -->
        <c:if test="${not empty successMessage}">
            <div class="alert alert-success text-center">${successMessage}</div>
        </c:if>
    </div>
    </c:if>
 	
 
    
   
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
