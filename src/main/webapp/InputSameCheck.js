function inputCheck(){
	const fromPlaceValue = document.getElementById('from_place').value;
	const toPlaceValue = document.getElementById('to_place').value;
	
	if(fromPlaceValue==toPlaceValue){
		alert("From and To Place cannot be same");
		
	}
	else{
		consple.log("Proceed");
	}
	
}