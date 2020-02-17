<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/styles.css"/>
<script src="js/jquery-1.11.3.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/common.js"></script>
<script src="js/jsviews.min.js"></script>
<h1 class="heading">Event Management System</h1>
<ul>
	<div class="dropdown">
	  <a href="/getEvents"><button class="dropbtn">HOME PAGE</button></a>
	</div>
  	<div class="dropdown">
	  <a href="/getUsers"><button class="dropbtn">USERS</button></a>
	  <div class="dropdown-content">
	    <a href="/addUser">ADD USERS</a>
	  </div>
	</div>
	<!--<div class="dropdown">
	  <button class="dropbtn" onClick="getEvents('customer_list_tmpl','common_id')">CUSTOMERS</button>
	   <div class="dropdown-content">
	    <a href="#" onClick="getEvents('customer_list_tmpl','common_id')">ADD CUSTOMERS</a>
	    <a href="#">EDIT CUSTOMERS</a>
	    <a href="#">DELETE CUSTOMERS</a>
	  </div> -->
	</div>
	<div class="dropdown">
	  <a href="/getEvents"><button class="dropbtn">MANAGE EVENTS</button></a>
	  <div class="dropdown-content">
	    <a href="/addEvent" >ADD EVENTS</a>
	  </div>
	</div> 
	<div class="dropdown">
	  <button class="dropbtn">COMPANY REPORTS</button>
	  <div class="dropdown-content">
	    <a href="#">GET REPORTS</a>
	  </div>
	</div>
	<div class="dropdown">
	  <a href="/addCompanyDetails"><button class="dropbtn">COMPANY INFO</button></a>
	</div>  
	<div class="dropdown">
	  <button class="dropbtn">Welcome</button>
	  <div class="dropdown-content">
	    <a href="javascript:formSubmit()">LOGOUT</a>
	  </div>
	</div>   
</ul>
<c:url value="/j_spring_security_logout" var="logoutUrl" />

	<!-- csrt for log out-->
	<form action="${logoutUrl}" method="post" id="logoutForm">
	  <input type="hidden"
		name="${_csrf.parameterName}"
		value="${_csrf.token}" />
	</form>
<script>
		function formSubmit() {
			document.getElementById("logoutForm").submit();
		}
	</script>