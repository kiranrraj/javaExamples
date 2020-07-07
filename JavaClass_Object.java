
class Human{
    String name;
    int age;
    double salary;

    void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);
    }
}


class JavaClass_Object{
    public static void main(String args[]){
        Human obj = new Human();
        obj.name = "Kiran";
        obj.age = 32;
        obj.salary = 90000;

        obj.display();
    }
}