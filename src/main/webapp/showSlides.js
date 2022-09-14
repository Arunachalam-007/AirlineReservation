let slideIndex = 0;
showSlides();

function showSlides() {
	let i;
	let slides = document.getElementsByClassName("slides");
	for (i = 0; i < slides.length; i++) {
		slides[i].style.display = "none";
	}
	slideIndex++;
	if (slideIndex > slides.length) {
		slideIndex = 1
	}
	slides[slideIndex - 1].style.display = "block";
	setTimeout(showSlides, 2000);
}

const togglePassword = document.querySelector('#togglePassword');
const password = document.querySelector('#id_password');

togglePassword.addEventListener('click', function(e) {

	const type = password.getAttribute('type') === 'password' ? 'text' : 'password';
	password.setAttribute('type', type);

	this.classList.toggle('bi-eye');
});


function validator() {
	const inputUserName = document.getElementById('username').value;
	const inputPassword = document.getElementById('id_password').value;
	const pattern = "^[a-zA-Z0-9](_(?!(\.|_))|\.(?!(_|\.))|[a-zA-Z0-9]){6,18}[a-zA-Z0-9]$";
	const passwordPattern = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";

	if ((inputUserName == '') || (inputPassword == '')) {
		alert("username and password cannot be empty");

	}
	if (!inputUserName.match(pattern)) {
		alert("For Username First character is alphanum,should contain 8 characters, then 6 to 18 characters, last character is alphanum.");
	}
	if (!inputPassword.match(passwordPattern)) {
		alert("The password must contain atleast 8 character and one upper case,lowercase atleast 1 digit 1 special symbol");
	}

	else {
		console.log("Proceed");
	}




}
