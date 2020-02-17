<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ include file="/../jsp/header.jsp"%>
<div class="container">
	<div class="row">
		<h1 class="heading">ADD/EDIT USER</h1>     
<form:form class="form-horizontal" action="addUser" modelAttribute="userInfo">
<fieldset>
<!-- Text input-->
<div class="form-group">
  <form:label class="col-md-4 control-label" for="textinput" path="firstName">First Name</form:label>  
  
  <div class="col-md-4">
  <form:input id="userFirstName" path="firstName" placeholder="Insert your First Name" class="form-control input-md" required="" type="text"/>
  <form:errors path="firstName"/>
  <span class="help-block"> </span>  
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <form:label class="col-md-4 control-label" for="textinput" path="lastName">Last Name</form:label>  
  <div class="col-md-4">
  <form:input id="userLastName" path="lastName" placeholder="Insert your Last Name" class="form-control input-md" required="" type="text"/>
 <form:errors path="lastName"/>
  <span class="help-block"> </span>  
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <form:label class="col-md-4 control-label" for="textinput" path="">Phone Number</form:label>  
  <div class="col-md-4">
  <form:input id="phoneNumber" path="phoneNumber" placeholder="Please Enter Phone Number" class="form-control input-md" required="" type="text"/>
 <form:errors path="phoneNumber"/>
  <span class="help-block"> </span>  
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="textinput">Role</label>  
  <div class="col-md-4">
  <%-- <form:select class="form-control" id="role_type" path="role">
	<option selected>Role Type</option>
	<option value="ROLE_ADMIN">Admin</option>
	<option value="ROLE_USER">User</option>
	<option value="ROLE_GUEST">Customer</option>
</form:select> --%>
<%-- <form:select path="role">
   <form:option value="NONE" label="--- Select ---"/>
   <form:options items="${roleList.role}" />
</form:select> --%>
<form:select path="userRolesEntity.roleId">
                <form:option value="0" label="--- Select ---" />
                <c:forEach var="role" items="${roleList}">
                    <form:option value="${role.getRoleId()}"><c:out value="${role.getRole()}"/></form:option>
                </c:forEach>
                </form:select>
                
  <span class="help-block"> </span>  
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <form:label class="col-md-4 control-label" path="username" for="textinput">User Name</form:label>  
  <div class="col-md-4">
  <form:input id="user_UserName" path="username" placeholder="Enter User Name" class="form-control input-md" required="" type="text"/>
  <form:errors path="username"/>
  <span class="help-block"> </span>  
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label"  for="textinput">Password</label>  
  <div class="col-md-4">
  <form:input id="userPWD" path="pwd" placeholder="Enter Password" class="form-control input-md" required="" type="password"/>
 <form:errors path="pwd"/>
  <span class="help-block"> </span>  
  </div>
</div>
<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label" for="singlebutton"> </label>
  <div>
	<button type="submit"  class="btn btn-success col-md-2" style="margin-right: 24px" onclick="addUser()">SAVE</button>
	<button type="button" class="btn btn-success col-md-2">CANCEL</button>
</div>
</div>

</fieldset>
</form:form>
  </div>
	</div>