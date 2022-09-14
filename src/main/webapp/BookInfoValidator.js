function validation() {

	const inputDiv = document.querySelectorAll('.input-div');

	const nameValue = document.getElementById('name').value;
	const emailValue = document.getElementById('email').value;
	const nationalityValue = document.getElementById('nationality').value;
	const mobileValue = document.getElementById('mobile').value;
	const addressValue = document.getElementById('address').value;
	const dobValue = document.getElementById('dob').value;
	
	

	if (nameValue === "") {

		inputDiv[0].classList.add("error");
	} else {
		inputDiv[0].classList.remove("error");

	}
	if (emailValue === "") {

		inputDiv[1].classList.add("error");

	} else {
		inputDiv[1].classList.remove("error");
	}
	if (dobValue === "") {

		inputDiv[2].classList.add("error");

	} else {
		inputDiv[2].classList.remove("error");
	}
	if (nationalityValue === "") {

		inputDiv[3].classList.add("error");

	} else {
		inputDiv[3].classList.remove("error");
	}
	if (mobileValue === "") {

		inputDiv[4].classList.add("error");
	} else {
		inputDiv[4].classList.remove('error');
	}
	if (addressValue === "") {

		inputDiv[5].classList.add("error");
	} else {
		inputDiv[5].classList.remove("error");
	}


	if (nameValue.length<=2) {
		alert("Name must be greater than 2 characters,should be capital and cannot be empty");
		return false;
	}
	
	
	if(nationalityValue.length<=2){
		alert("Nationality must be greater than 2 characters and cannot be empty");
		return false;
	}
	


}