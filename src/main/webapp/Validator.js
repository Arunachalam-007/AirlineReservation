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
	

	if (nameValue === "")  {
		inputDiv[0].classList.add("error");
	} else {
		inputDiv[0].classList.remove("error");
	}
	if (addressValue === "") {
		inputDiv[1].classList.add("error");
	} else {
		inputDiv[1].classList.remove("error");
	}
	if (mobileValue === "")  {
		inputDiv[2].classList.add("error");
	} else {
		inputDiv[2].classList.remove('error');
	}
	if (emailValue === "") {
		
		inputDiv[3].classList.add("error");
		
	} else {
		inputDiv[3].classList.remove("error");
	}
	if (usernameValue === "") {
		inputDiv[4].classList.add("error");
	} else {
		inputDiv[4].classList.remove("error");
	}
	if (passwordValue === "")  {
		inputDiv[5].classList.add("error");
	} else {
		inputDiv[5].classList.remove("error");
	}
	if (dobValue === "") {
		inputDiv[6].classList.add("error");
	} else {
		inputDiv[6].classList.remove("error");
	}
	
}