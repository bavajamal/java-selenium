package Assgnment3;
//overriding
public class Pc extends Laptop {
	public void getSystemInfo() {
		System.out.println("linux");
		
	}
	public static void main(String[] args) {
		Pc pc1 = new Pc();
		pc1.getSystemInfo();
	}

}
