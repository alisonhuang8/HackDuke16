/* 
FP = food points
IDA = individual donation amount
CAP = capped donations per day
DC = daily counter
CHAR = charity ID number 1-5

*/

function transaction(FP, IDA, cap, DC){

	/*ap = document.getElementById("cap").value;*/
	var X = Math.random()*100+1;
	console.log(X);
	var donation;

	if(DC >= cap){
		FP = FP - X;
		return 0;
	} else {
		donation = Math.ceil(X) - X;

		if(donation > (cap - DC)){
			donation = (cap - DC);
		}
		FP -= (X + donation);
		IDA += donation;
		DC += donation;
		donation = Math.round(donation*100)/100;
		console.log(donation);
		return donation;


	}
	console.log(0);
	return 0; 
}
var cap = document.getElementById("cap").value;
console.log(cap)
transaction(2000,50,cap,0);
