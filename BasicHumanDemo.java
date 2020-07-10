public class BasicHumanDemo {
	
	public static class Human{
		static final int LIFESPAN = 100;
		private String name;
		private int age;
		private float height;
		
		public String getName() {
			return name;
		}
		
		public int getAge() {
			return age;
		}
		
		public float getHeight() {
			return height;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		
		public void setHeight(float height) {
			this.height = height;
		}
	}

	public static void main(String[] args) {
	
		Human humanObj = new Human();
		humanObj.name = "Kiran raj r ";
		humanObj.age = 32;
		humanObj.height = 5.91f;
		
		System.out.println("Name   : "+humanObj.name);
		System.out.println("Age    : "+humanObj.age);
		System.out.println("Height : "+humanObj.height);
		System.out.println(Human.LIFESPAN);
		//System.out.println(humanObj.LIFESPAN);
		
		String nameUp = humanObj.getName();
		int ageUp =humanObj.getAge();
		float heightUp =humanObj.getHeight();
		
		System.out.printf("%s : %d : %f\n",nameUp, ageUp, heightUp);
		
		humanObj.setName("vishnu r");
		humanObj.setAge(25);
		humanObj.setHeight(6.1f);
		
		String nameUp2 = humanObj.getName();
		int ageUp2 =humanObj.getAge();
		float heightUp2 =humanObj.getHeight();
		
		System.out.printf("%s : %d : %f\n",nameUp2, ageUp2, heightUp2);
		
		
	}

}
