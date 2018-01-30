package greeter;

public class TestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter greet = new Greeter("Dingo", 25);
		System.out.println(greet.toString());
		
		Greeter[] arr = new Greeter[5];
		arr[0] = new Greeter("Bdam", 32);
		arr[1] = new Greeter("Beric", 18);
		arr[2] = new Greeter("Back", 23);
		arr[3] = new Greeter("Brook", 27);
		arr[4] = new Greeter("Bradley Boon", 2);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());
		}
			
	}

}
