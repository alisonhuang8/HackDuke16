
public class Data_Profile {
	private String name, netid;
	private String charity;
	private String password;
	private int cap;
	private double foodBalance;
	private double multiplier;
	
	
	
	public Data_Profile(String netid1, String password1, double foodBalance1,  String charity1){
		netid = netid1;
		password = password1;
		foodBalance = foodBalance1;
		charity = charity1;
//		cap = cap1;
		
	}
	//Prints in CSV format
	public void printFunc(){
		System.out.println("");
		System.out.println(netid+ ", " + password + ", " +  foodBalance + ", "+ charity);
		System.out.println("");
		
	}
	//main function
	public static void main(String[] args){
		String[] names = {"Stu", "Noa", "Jeff", "Ali", "Mark", "Bill", "Peter"};
		String[] charities = {"A", "B","C","D","E"};
		// Generates comma seperated values
		for (int i = 0; i <20; i++){
			int num = 1+(int)(Math.random()*4);
			int num2 = 1+(int)(Math.random()*4);
			double balance = 1 + (Math.random()*100000);
			Data_Profile temp = new Data_Profile("netid", "password", balance, charities[num]);
			temp.printFunc();
			
		}
		
		
		
		
	}

}
