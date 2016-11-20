
public class Data_Profile {
	private String name, netid;
	private String charity;
	private int uniqueId;
	private double foodBalance;
	private double multiplier;
	
	
	//Basic parameters of users...should be changed later
	public Data_Profile(String name1, String netid1, String charity, int uniqueId1, double foodBalance1, double multiplier1){
		name = name1;
		netid = netid1;
		uniqueId = uniqueId1;
		foodBalance = foodBalance1;
		multiplier = multiplier1;
		
	}
	// Prints User Information
	public void printFunc(){
		System.out.println("");
		System.out.println("Name: "+ name);
		System.out.println("Netid: "+ netid);
		System.out.println("Unique ID: " + uniqueId);
		System.out.println("FoodBalance: " + foodBalance);
		System.out.println("Multiplier: " + multiplier);
		System.out.println("---------------------");
		System.out.println("");
		
	}
	//main function
	public static void main(String[] args){
		String[] names = {"Stu", "Noa", "Jeff", "Ali", "Mark", "Bill", "Peter"};
		String[] charities = {"A", "B","C","D","E"};
		int id = 1;
		
		int n = 20;
		// generates n test cases, number values can be changed. 
		for (int i = 0; i <n; i++){
			int num = 1+(int)(Math.random()*4);
			int num2 = 1+(int)(Math.random()*4);
			double balance = 1 + (Math.random()*100000);
			double multiplier = (1 + (Math.random()*10))/10;
			Data_Profile temp = new Data_Profile(names[num],"netid",charities[num2],id, balance, multiplier);
			temp.printFunc();
			
		}
		
		
		
		
	}

}
