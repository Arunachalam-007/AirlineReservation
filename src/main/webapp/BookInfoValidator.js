function bookConfirmValidator() {
	let inputName = document.getElementById("name");
	let inputEmail = document.getElementById("email");
	let inputDOB = document.getElementById("dob");
	let inputNationality = document.getElementById("nationality");
	let inputMobile = document.getElementById("mobile");
	let inputAddress = document.getElementById("address");

	let nameExpression = "^[A-Z\\s]+";
	let emailExpression = "/^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/";
	let dobExpression = "^(0[1-9]|1[012])[-/.](0[1-9]|[12][0-9]|3[01])[-/.](19|20)\\d\\d$";
	let nationalityExpression = "[A-Z]{1}[A-Za-z]{3, 18}";
	let mobileExpression = "(0/91)?[7-9][0-9]{9}";
	let addressValidation = "[A-Za-z0-9'\.\-\s\,]";
	let date = new Date();
	//month 0-11 so add +1
	let today = date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate();
	if ( inputName == '') {
		alert("Name should contain Capital letters and white spaces,cannot be empty");
	}
	else if (inputEmail == '') {
		alert("Please enter the valid email and email cannot be empty");
	}
	else if ((inputDOB > today) || (inputEmail == '')) {
		alert("Please enter the correct Date Of Birth and Date Of Birth cannot be empty");
	}
	else if (inputNationality == '') {
		alert("Nationality should contain letters and white spaces,First Letter shoud be capital and Nationality cannot be empty");
	}
	else if (inputMobile == '') {
		alert("Please enter the valid mobile Number and Mobile cannot be empty");
	}
	else if (inputAddress == '') {
		alert("Please Enter valid address and Address cannot be empty");
	}
	else {
		console.log("Proceed");
	}
}