public class BMICalculator {

	public static void main(String[] args) {
		
		class Human{
			private String name;
			private int age;
			private float height;
			private float weight;
			double fToM = 0.3048;
			
			public double ftToMeter(float ft) {
				double heightInM = ft * fToM;
				return heightInM;
			}
			
			public void getBMI() {
				double heightInM = ftToMeter(height);
				double bmi = weight / (heightInM * heightInM);
				System.out.println("The BMI is : "+ bmi);
			}
			
			public void displayDetails() {
				System.out.println("Name : "+ name);
				System.out.println("Age : "+ age);
			}
		}
		
		Human objKiran = new Human();
		objKiran.name = "Kiran Raj R.";
		objKiran.age = 32;
		objKiran.height = 5.9f;
		objKiran.weight = 82.5f;
		
		objKiran.displayDetails();
		objKiran.getBMI();
	}

}
