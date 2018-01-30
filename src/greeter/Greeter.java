package greeter;

public class Greeter {

		private String name;
		private int age;
	
		public Greeter(String xName, int xAge) {
			
			name = xName;
			age = xAge;
			
		}
		public Greeter() {
			name = "Bob";
			age = 35;
		}
		public String toString() {
			return name + ", " + age;
		}
}
