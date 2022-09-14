function seatAlert() {

	var seatValue = document.getElementById('seatavailabilityresult').value;
	if (seatValue == 36) {
		alert("Seat is not available");

	}
	else {
		console.log("Proceed");
	}
}