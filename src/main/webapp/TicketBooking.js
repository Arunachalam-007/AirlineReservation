function seatAlert() {

	const seatValue = document.getElementById('seatavailabilityresult').value;
	if (seatValue == 0) {
		alert("Seat is not available");

	}
	else {
		console.log("Proceed");
	}
}