<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ include file="/../jsp/header.jsp"%>
<div class="container">
	<div class="row">
		<h1 class="heading">EDIT Event</h1>     
<form:form class="form-horizontal" action="editEvent" modelAttribute="event">
<fieldset>
<form:input id="" path="eventId" class="form-control input-md" required="" type="hidden"/>
<!-- Text input-->
<div class="form-group">
  <form:label class="col-md-4 control-label" for="textinput" path="">Customer Name</form:label>  
  <div class="col-md-4">
  <form:input id="userFirstName" path="customerName" placeholder="Enter Customer Name" class="form-control input-md" required="" type="text"/>
  <form:errors path=""/>
  <span class="help-block"> </span>  
  </div>
</div>
<!-- Text input-->
<div class="form-group">
  <form:label class="col-md-4 control-label" for="textinput" path="">Phone Number</form:label>  
  <div class="col-md-4">
  <form:input id="userFirstName" path="phoneNumber" placeholder="Enter your Phone Number" class="form-control input-md" required="" type="text"/>
  <form:errors path=""/>
  <span class="help-block"> </span>  
  </div>
</div>
<!-- Text input-->
<div class="form-group">
  <form:label class="col-md-4 control-label" for="textinput" path="">Email Id</form:label>  
  <div class="col-md-4">
  <form:input id="userFirstName" path="emailId" placeholder="Enter your Email Id" class="form-control input-md" required="" type="text"/>
  <form:errors path=""/>
  <span class="help-block"> </span>  
  </div>
</div>
<!-- Text input-->
<div class="form-group">
  <form:label class="col-md-4 control-label" for="textinput" path="">Event Date</form:label>  
  <div class="col-md-4">
  <form:input id="userFirstName" path="eventDate" placeholder="Enter Event Date" class="form-control input-md" required="" type="text"/>
  <form:errors path=""/>
  <span class="help-block"> </span>  
  </div>
</div>
<!-- Text input-->
<div class="form-group">
  <form:label class="col-md-4 control-label" for="textinput" path="">Event Time</form:label>  
  <div class="col-md-4">
  <form:input id="userFirstName" path="eventTime" placeholder="Enter Event Time" class="form-control input-md" required="" type="text"/>
  <form:errors path=""/>
  <span class="help-block"> </span>  
  </div>
</div>
<!-- Text input-->
<div class="form-group">
  <form:label class="col-md-4 control-label" for="textinput" path="">Name Of Event</form:label>  
  <div class="col-md-4">
  <form:input id="userFirstName" path="eventName" placeholder="Enter Event Name" class="form-control input-md" required="" type="text"/>
  <form:errors path=""/>
  <span class="help-block"> </span>  
  </div>
</div>
<!-- Text input-->
<div class="form-group">
  <form:label class="col-md-4 control-label" for="textinput" path="">Venue</form:label>  
  <div class="col-md-4">
  <form:input id="userFirstName" path="venue" placeholder="Enter Venue Name" class="form-control input-md" required="" type="text"/>
  <form:errors path=""/>
  <span class="help-block"> </span>  
  </div>
</div>
<!-- Text input-->
<div class="form-group">
  <form:label class="col-md-4 control-label" for="textinput" path="">Total Expected Guests</form:label>  
  <div class="col-md-4">
  <form:input id="userFirstName" path="totalExpectedGuests" placeholder="Total Expected Guests" class="form-control input-md" required="" type="text"/>
  <form:errors path=""/>
  <span class="help-block"> </span>  
  </div>
</div>
<!-- Text input-->
<div class="form-group">
  <form:label class="col-md-4 control-label" for="textinput" path="">Table Size</form:label>  
  <div class="col-md-4">
  <form:input id="userFirstName" path="tableSize" placeholder="Enter Table Size" class="form-control input-md" required="" type="text"/>
  <form:errors path=""/>
  <span class="help-block"> </span>  
  </div>
</div>
<!-- Text input-->
<div class="form-group">
  <form:label class="col-md-4 control-label" for="textinput" path="">Number Of Empty Seats at Table</form:label>  
  <div class="col-md-4">
  <form:input id="userFirstName" path="noOfseatsAvailable" placeholder="Enter Event Date" class="form-control input-md" required="" type="text"/>
  <form:errors path=""/>
  <span class="help-block"> </span>  
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <form:label class="col-md-4 control-label" for="textinput" path="">Event Planner</form:label>  
  <div class="col-md-4">
  <form:input id="userFirstName" path="eventPlanner" placeholder="Enter Event Planner" class="form-control input-md" required="" type="text"/>
  <form:errors path=""/>
  <span class="help-block"> </span>  
  </div>
</div>
<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label" for="singlebutton"> </label>
  <div>
	<button type="submit"  class="btn btn-success col-md-2" style="margin-right: 24px">SAVE</button>
	<button type="button" class="btn btn-success col-md-2">CANCEL</button>
</div>
</div>

</fieldset>
</form:form>
  </div>
	</div>