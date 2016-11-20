/* 
FP = food points
IDA = individual donation amount
CAP = capped donations per day
DC = daily counter
CHAR = charity ID number 1-5

*/

function transaction(FP, IDA, cap, DC, charID, funds){

	var X = Math.floor((Math.random()*100)+1);
	var donation;

	if(DC >= CAP){
		FP = FP - X;
		return 0;
	} else {
		donation = ceil(X) - X;

		if(donation > (CAP - DC)){
			donation = (CAP - DC);
		}
		FP -= (X + donation);
		IDA += donation;
		DC += donation;

		return donation;

	}
	return 0; 
}

