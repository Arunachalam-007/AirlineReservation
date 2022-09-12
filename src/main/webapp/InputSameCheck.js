function inputCheck(){
	var fromPlaceValue = document.getElementById('from_place').value;
	var toPlaceValue = document.getElementById('to_place').value;
	
	if(fromPlaceValue==toPlaceValue){
		alert("From and To Place cannot be same");
		
	}
	else{
		consple.log("Proceed");
	}
	
}