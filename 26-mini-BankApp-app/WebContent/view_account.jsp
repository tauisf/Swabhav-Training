<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View Account</title>
    <link rel="stylesheet" href="styles.css"> <!-- Link to your CSS if you have one -->
</head>
<body>
  
        <h1>View Account</h1>
        
        <a href="Userdashboard.jsp">Got to DashBoard</a> <!-- Link to logout -->
   

    <div>
        <!-- Display error message if account details are not found -->
        <c:if test="${not empty errorMessage}">
            <div class="error-message">
                <p>${errorMessage}</p>
            </div>
        </c:if>

        <!-- Display account details if available -->
        <c:if test="${not empty accounts}">
            <div class="account-details">
                <h2>Account Details</h2>
                <table border="1">
                    <tr>
                        <th>CustomerId</th>
                        <td>${accounts.getCustomerId()}</td>
                    </tr>
                    <tr>
                        <th>FirstName</th>
                        <td>${accounts.getFirstName()}</td>
                    </tr>
                    <tr>
                        <th>LastName</th>
                        <td>${accounts.getLastName()}</td>
                    </tr>
                    <tr>
                        <th>AccountNumber</th>
                        <td>${accounts.getAccountNumber()}</td>
                    </tr>
                    <tr>
                        <th>Balance</th>
                        <td>${accounts.getBalance()}</td>
                    </tr>
                   
                </table>
            </div>
        </c:if>

        <!-- Show a message if no account is found -->
        <c:if test="${empty accounts}">
            <div class="no-account-message">
                <p>No account found or the account does not exist.</p>
            </div>
        </c:if>

    </div>

   
</body>
</html>
