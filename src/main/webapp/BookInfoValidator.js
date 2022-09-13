function validation() {

	const inputDiv = document.querySelectorAll('.input-div');
	
	var nameValue = document.getElementById('name').value;
	var emailValue = document.getElementById('email').value;
	var nationalityValue = document.getElementById('nationality').value;
	var mobileValue = document.getElementById('mobile').value;
	var addressValue = document.getElementById('address').value;
	var dobValue=document.getElementById('dob').value;
	
	
	var nameExpression = "[A-Z]{1}[A-Za-z]{3, 18}";
	var addressExpression="[A-Za-z0-9'\.\-\s\,]";
	var mobileExpression="(0/91)?[7-9][0-9]{9}";
	var emailExpression="/^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/";
	var nationalityExpression="[A-Z]{1}[A-Za-z]{3, 18}";
	
	

	if ((nameValue === "") ||(!nameValue.match(nameExpression))) {

		inputDiv[0].classList.add("error");
	} else {
		inputDiv[0].classList.remove("error");
	}
	if ((emailValue === "") ||(!emailValue.match(emailExpression))) {

		inputDiv[1].classList.add("error");
		
	} else {
		inputDiv[1].classList.remove("error");
	}
	if (dobValue === "") {

		inputDiv[2].classList.add("error");
		
	} else {
		inputDiv[2].classList.remove("error");
	}
	if ((nationalityValue === "") ||(!nationalityValue.match(nationalityExpression))) {
		
		inputDiv[3].classList.add("error");
		
	} else {
		inputDiv[3].classList.remove("error");
	}
	if ((mobileValue === "") ||(!mobileValue.match(mobileExpression))) {

		inputDiv[4].classList.add("error");
	} else {
		inputDiv[4].classList.remove('error');
	}
	if ((addressValue === "") ||(!addressValue.match(addressExpression))) {

		inputDiv[5].classList.add("error");
	} else {
		inputDiv[5].classList.remove("error");
	}
		
	
}