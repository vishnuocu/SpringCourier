<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/../jsp/header.jsp"%>
<%@page session="true"%>
<html>
<body>
<div id="common_id"></div>
</body>
</html>
<div class="container">
	<div class="row">
		<h1 class="heading">USERS LIST</h1>
<table class="table table-bordered table-hover">
    <thead>
      <tr>
        <th>FIRST NAME</th>
        <th>LAST NAME</th>
        <th>ROLE</th>
        <th>PHONE NO</th>
		<th>USER NAME</th>
		<th>PASSWORD</th>
		<th>EDIT</th>
		<th>DELETE</th>
      </tr>
    </thead>
    <tbody>
		<c:forEach var="user" items="${userList}">
                    <tr>
       				 <td>${user.getFirstName()}</td>
       				 <td>${user.getLastName()}</td>
        			<td>${user.getUserRolesEntity().getRole()}</td>
       				<td>${user.getPhoneNumber()}</td>
					<td>${user.getUsername()}</td>
					<td>${user.getPwd()}</td>
					<td><a href="#"><img class="details_edit"  src="./images/edit_icon.png" alt="Edit" onclick="editUser(${user.getUserInfoId()})"></a></td>
					<td><a href="#"><img class="details_edit" src="./images/close_icon.png" alt="Delete" onclick="deleteUser(${user.getUserInfoId()})"></a></td>
      			</tr>
    
                </c:forEach>
    </tbody>
  </table>
</div>
</div>