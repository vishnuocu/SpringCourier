<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/../jsp/header.jsp"%>
<%@page session="true"%>
<html>
<body>
<div id="common_id"></div>
</body>
</html>
<script type="text/javascript">
$(document).ready(function(){
	getEvents('user_list_tmpl','common_id')
})
</script>
<script id="user_list_tmpl" type="text/x-jsrender">
<div class="container">
	<div class="row">
		<h1 class="heading">EVENTS LIST</h1>
<table class="table table-bordered table-hover">
    <thead>
      <tr>
        <th>EVENT NAME</th>
        <th>CUSTOMER NAME</th>
        <th>VENUE</th>
        <th>TIME AND DATE</th>
        <th>EVENT PLANNER</th>
		<th>EDIT</th>
		<th>DELTE</th>
      </tr>
    </thead>
    <tbody>
		<c:forEach var="event" items="${eventList}">
                    <tr>
       				 <td>${event.getEventName()}</td>
					<td>${event.getCustomerName()}</td>
					<td>${event.getVenue()}</td>
					<td>${event.getEventDate()} & ${event.getEventTime()}</td>
					<td>${event.getEventPlanner()}</td>
       				<td><a href="#"><img class="details_edit"  src="./images/edit_icon.png" alt="Edit" onClick="editEvent(${event.getEventId()})"></a></td>
					<td><a href="#"><img class="details_edit" src="./images/close_icon.png" alt="Delete" onClick="deleteEvent(${event.getEventId()})"></a></td>
      			</tr>
    
                </c:forEach>
    </tbody>
  </table>
</div>
</div>

</script>
