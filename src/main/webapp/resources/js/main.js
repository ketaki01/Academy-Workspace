/**
 * 
 */
//register.jsp
function hideError() {
	$("#emailvalidation").hide();
	 $("#associateidvalidation").hide();
	 $("#usernamevalidation").hide();
}
 $(document).ready(function(){
	 	hideError();
		    $("#registersubmit").click(function(){
		    	var user=[];
		    	$.ajax({
		    	    method:"GET",
		    	    url: "http://localhost:8080/O2_Academy/allUser",
		    	    async:false,
		    	    success: function(data) {
		    	            user=data;
		    	            //alert("Data"+userinfo+"Data"+data+"length"+userinfo.length+"name"+userinfo[0].name);
		    	        },
		    	        error : function(xhr, status, error) {
		                    alert(xhr.responseText);
		    	        }
		    });
		    	var emailid=$('#email').val();
		    	var username=$('#username').val();
		    	var associateid=$('#associateid').val();
		    	var count=0;
		    	for(var i=0;i<userinfo.length;i++){
		    		if(emailid==userinfo[i].emailId){
		    			$("#emailvalidation").show();
		    			count++;
		    		}
		    		if(username==userinfo[i].userName){
		    			$("#usernamevalidation").show();
		    			count++;
		    		}
		    		if(associateid==userinfo[i].associateId){
		    			$("#associateidvalidation").show();
		    			count++;
		    		}
		    	}
		    	if(count>0){
		    		event.preventDefault();
		    		$("form")[0].reset();
		    	}
		});
		    
		    $("input").change(function(){
		    	hideError();
		    });

	 });