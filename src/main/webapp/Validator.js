const togglePassword = document.querySelector('#togglePassword');
const password = document.querySelector('#id_password');

togglePassword.addEventListener('click', function(e) {

	const type = password.getAttribute('type') === 'password' ? 'text' : 'password';
	password.setAttribute('type', type);

	this.classList.toggle('bi-eye');
});

function validation() {

	const inputDiv = document.querySelectorAll('.input-div');
	const nameValue = document.getElementById('name').value;
	const addressValue = document.getElementById('address').value;
	const mobileValue = document.getElementById('mobile').value;
	const emailValue = document.getElementById('email').value;
	const usernameValue = document.getElementById('username').value;
	const passwordValue = document.getElementById('id_password').value;
	const dobValue = document.getElementById('dob').value;
	

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