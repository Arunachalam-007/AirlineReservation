const togglePassword = document.querySelector('#togglePassword');
const password = document.querySelector('#id_password');

togglePassword.addEventListener('click', function(e) {

	const type = password.getAttribute('type') === 'password' ? 'text' : 'password';
	password.setAttribute('type', type);

	this.classList.toggle('bi-eye');
});

function validation() {

	const inputDiv = document.querySelectorAll('.input-div');
	var nameValue = document.getElementById('name').value;
	var addressValue = document.getElementById('address').value;
	var mobileValue = document.getElementById('mobile').value;
	var emailValue = document.getElementById('email').value;
	var usernameValue = document.getElementById('username').value;
	var passwordValue = document.getElementById('id_password').value;
	var dobValue = document.getElementById('dob').value;
	
	var nameExpression = "[A-Z]{1}[A-Za-z]{3, 18}";
	var addressExpression="[A-Za-z0-9'\.\-\s\,]";
	var mobileExpression="(0/91)?[7-9][0-9]{9}";
	var emailExpression="/^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/";
	var usernameExpression="^[a-zA-Z0-9](_(?!(\.|_))|\.(?!(_|\.))|[a-zA-Z0-9]){6,18}[a-zA-Z0-9]$";
	var passwordExpression="^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";
	

	if ((nameValue === "") ||(!nameValue.match(nameExpression))) {
		inputDiv[0].classList.add("error");
	} else {
		inputDiv[0].classList.remove("error");
	}
	if ((addressValue === "") ||(!addressValue.match(addressExpression))) {
		inputDiv[1].classList.add("error");
	} else {
		inputDiv[1].classList.remove("error");
	}
	if ((mobileValue === "") ||(!mobileValue.match(mobileExpression))) {
		inputDiv[2].classList.add("error");
	} else {
		inputDiv[2].classList.remove('error');
	}
	if ((emailValue === "") ||(!emailValue.match(emailExpression))) {
		
		inputDiv[3].classList.add("error");
		
	} else {
		inputDiv[3].classList.remove("error");
	}
	if ((usernameValue === "") ||(!usernameValue.match(usernameExpression))) {
		inputDiv[4].classList.add("error");
	} else {
		inputDiv[4].classList.remove("error");
	}
	if ((passwordValue === "") ||(!passwordValue.match(passwordExpression))) {
		inputDiv[5].classList.add("error");
	} else {
		inputDiv[5].classList.remove("error");
	}
	if ((dobValue === "")) {
		inputDiv[6].classList.add("error");
	} else {
		inputDiv[6].classList.remove("error");
	}
	
}