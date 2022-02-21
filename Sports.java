package Assignment2;
//overloading
public class Sports {
	public void Achiever(String name , int medalCount ) {
		System.out.println("Name"+" "+name+" "+"Medals"+" "+medalCount);
		
		
	}
	public void Achiever(String country ,String sportName, int rank) {
		System.out.println("Country"+" "+country+" "+"Name1"+" "+sportName+" "+"Rank"+" "+rank);
		
		
	}
	public void Achiever(float weight, int height, long contactNo) {
		System.out.println("Weight"+" "+weight+" "+"Height"+" "+height+" "+"Contactno"+" "+contactNo);
		
	}
	public void Achiever(String tournamentName, long prizeMoney) {
		System.out.println("Name2"+" "+tournamentName+" "+"Prize"+" "+prizeMoney);
		
	}
	public static void main(String[] args) {
		Sports spt = new Sports();
		spt.Achiever("ronaldo",30 );
		spt.Achiever("Portugal","Football" , 1);
		spt.Achiever(50, 5, 1234567889);
		spt.Achiever("Euro", 10000000);
	}

}
