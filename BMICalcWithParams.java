public class BMICalcWithParams {

	public static void main(String[] args) {
		
		class Human{
			/*
			private String name;
			private int age;
			private float height;
			private float weight;
			*/
			static final double fToM = 0.3048;
			
			public double ftToMeter(float ft) {
				double heightInM = ft * fToM;
				return heightInM;
			}
			
			public void getBMI(float height, float weight) {
				double heightInM = ftToMeter(height);
				double bmi = weight / (heightInM * heightInM);
				System.out.println("The BMI is : "+ bmi);
			}
			
			public void displayDetails(String name, int age) {
				System.out.println("Name : "+ name);
				System.out.println("Age : "+ age);
			}
		}
		
		Human objKiran = new Human();
		objKiran.displayDetails("kiran raj r", 32);
		objKiran.getBMI(5.9f, 81.5f);
	}

}