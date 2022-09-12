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

const togglePassword = document.querySelector("#togglePassword");
const password = document.querySelector("#password");

togglePassword.addEventListener("click", function() {

	const type = password.getAttribute("type") === "password" ? "text" : "password";
	password.setAttribute("type", type);

	this.classList.toggle("bi-eye");
});


const form = document.querySelector("form");
form.addEventListener('submit', function(e) {
	e.preventDefault();
});

/*var input = document.getElementById("pwdId");
var text = document.getElementById("text");
input.addEventListener("keyup", function(event) {

if (event.getModifierState("CapsLock")) {
	text.style.display = "block";
  } else {
	text.style.display = "none"
  }
});*/