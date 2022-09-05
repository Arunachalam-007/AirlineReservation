function signupValidateForm() {
	let name = document.signup.pname.value;
	if (name == null || name == ""||name.length<=2) {
		alert("Name can't be blank");
		return false;
	}
}