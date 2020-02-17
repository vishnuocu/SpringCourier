<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ include file="/../jsp/header.jsp"%>
<%@page session="true"%>
<html>
<body>
<div id="common_id"></div>
</body>
</html>
<div class="container">
	<div class="row">
		<h1 class="heading">Company Information</h1>
        
        <form:form class="form-horizontal" action="addCompanyDetails" modelAttribute="companyDetails">
<fieldset>

<!-- Form Name -->

<form:input id="" path="companyId" type="hidden"/>
<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="textinput">Company Name</label>  
  <div class="col-md-4">
  <form:input id="textinput" path="companyName" name="textinput" placeholder="Enter Company Name" class="form-control input-md" required="" type="text"/>
  <span class="help-block"> </span>  
  </div>
</div>

<!-- Text Area input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="textinput">Company Address</label>  
  <div class="col-md-4">
  <form:textarea path="address" class="form-control" rows="5" id="comment" placeholder="Enter Company Address"></form:textarea>
  <span class="help-block"> </span>  
  </div>
</div>
<!-- Text Area input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="textinput">Contact Info</label>  
  <div class="col-md-4">
  <form:textarea path="contactDetails" class="form-control" rows="3" id="comment" placeholder="Enter Contact info"></form:textarea>
  <span class="help-block"> </span>  
  </div>
</div>
<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label" for="singlebutton"> </label>
  <div>
<button type="submit" class="btn btn-success" style="margin-right: 24px">SAVE</button>
	<button type="button" class="btn btn-success">CANCEL</button>
</div>
</div>

</fieldset>
</form:form>
  
	</div>
</div>