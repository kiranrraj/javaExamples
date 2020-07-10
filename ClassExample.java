class Student{
    String name;
    int rollNum;
    float mark1, mark2, mark3, total=0;
    void calcTotal(){
        total = mark1 + mark2 + mark3;
        System.out.println("Total mark is : "+ total);
    }
}

public class ClassExample {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Kiran";
        s1.rollNum = 2343;
        s1.mark1 = 88;
        s1.mark2 = 78.8f;
        s1.mark3 = 89.9f;
        s1.calcTotal();
    }
    
}