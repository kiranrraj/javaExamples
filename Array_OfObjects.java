
public class Array_OfObjects{
    public static void main(String[] args){

        class Student {
            public int rollNum;
            public String name;
            Student(int rollNum, String name){
                this.rollNum = rollNum;
                this.name = name;
            }
        }

        Student[] arr = new Student[5];

        arr[0] = new Student(1, "kiran raj r");
        arr[1] = new Student(2, "vishnu");
        arr[2] = new Student(3, "anitha");
        arr[3] = new Student(4, "rajendran");
        arr[4] = new Student(5, "kathu");

        for(int i=0; i<arr.length;i++){
            System.out.println("Name : "+ arr[i].name);
            System.out.println("Roll Number : "+ arr[i].rollNum);
        }

    } 
    
}