function getEvents(tmpl,id){
	$.templates("#"+tmpl).link('#'+id, { });	
}
function _ajax_server_call(url, params, callback) {
	 $.ajax({
	  type: "GET",
	  url: url,
	  dataType: "json",
	  data:params,
	  "content-type": "application/x-www-form-urlencoded",
	  success:function(data){
	  if(callback)
	      callback(data);
	  }
	 });
	 }
function deleteUser(id){
	var params='id='+id;
	_ajax_server_call("http://localhost:8080/deleteUser",params,function(data){
		alert("User deleted Successfully");
		window.location.href="/getUsers";
	});
}

function deleteEvent(id){
	var params='id='+id;
	_ajax_server_call("http://localhost:8080/deleteEvent",params,function(data){
		alert("Event deleted Successfully");
		window.location.href="/getEvents";
	});
}

function editUser(id){
	var params='id='+id;
	window.location.href="/editUser"+"?id="+id;
	/*_ajax_server_call("http://localhost:8080/editUser",params,function(data){
		alert("Event edit Successfully");
		window.location.href="/getEvents";
	});*/
}
function editEvent(id){
	var params='id='+id;
	window.location.href="/editEvent"+"?id="+id;
	/*_ajax_server_call("http://localhost:8080/editUser",params,function(data){
		alert("Event edit Successfully");
		window.location.href="/getEvents";
	});*/
}