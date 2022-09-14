function validation() {
	const inputDiv = document.querySelectorAll('.input-div');
	
	var flightIdValue = document.getElementById('flightId').value;
	var flightNameValue = document.getElementById('flightName').value;
	var departureValue = document.getElementById('departure').value;
	var arrivalValue = document.getElementById('arrival').value;
	var startTimeValue = document.getElementById('startTime').value;
	var endTimeValue = document.getElementById('endTime').value;
	var fromPlaceValue = document.getElementById('fromPlace').value;
	var toPlaceValue = document.getElementById('toPlace').value;
	var priceValue = document.getElementById('price').value;
	var seatValue = document.getElementById('seat').value;
	
	
	console.log(flightIdValue);
	
	if (flightIdValue == "") {

		inputDiv[0].classList.add("error");
		alert("flight ID cannot be empty");
		return false;
	} else {
		inputDiv[0].classList.remove("error");

	}if (flightNameValue == "") {

		inputDiv[1].classList.add("error");
		alert("flight Name cannot be empty");
		return false;

	} else {
		inputDiv[1].classList.remove("error");
	}
	if (departureValue == "") {

		inputDiv[2].classList.add("error");
		alert("Departure cannot be empty");
		return false;

	} else {
		inputDiv[2].classList.remove("error");
	}
	if (arrivalValue == "") {

		inputDiv[3].classList.add("error");
		alert("Arrival cannot be empty");
		return false;

	} else {
		inputDiv[3].classList.remove("error");
	}
	if (startTimeValue == "") {

		inputDiv[4].classList.add("error");
		alert("Start Time cannot be empty");
		return false;
		
	} else {
		inputDiv[4].classList.remove('error');
	}
	if (endTimeValue == "") {

		inputDiv[5].classList.add("error");
		alert("End Time cannot be empty");
		return false;
	} else {
		inputDiv[5].classList.remove("error");
	}if (fromPlaceValue === "") {

		inputDiv[6].classList.add("error");
		alert("From Place cannot be empty");
		return false;
	} else {
		inputDiv[6].classList.remove("error");

	}
	if (toPlaceValue == "") {

		inputDiv[7].classList.add("error");
		alert("To Place cannot be empty");
		return false;

	} else {
		inputDiv[7].classList.remove("error");
	}
	if (priceValue == "") {

		inputDiv[8].classList.add("error");
		alert("Price cannot be empty");
		return false;

	} else {
		inputDiv[8].classList.remove("error");
	}
	if (seatValue == "") {

		inputDiv[9].classList.add("error");
		alert("Seat cannot be empty");
		return false;

	} else {
		inputDiv[9].classList.remove("error");
	}
	
	
	
	
}