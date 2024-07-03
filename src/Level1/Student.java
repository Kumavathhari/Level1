package Level1;

public class Student {
    public String name;
    public int age,ID;

    public Student(String name,int age,int ID){
        this.name=name;
        this.age=age;
        this.ID=ID;
    }

    public void details(){
        System.out.println("Student Name : "+name+", Student age : "+age+", Student ID : "+ID);
    }

    public static void main(String[] args) {
        Student s = new Student("Hari",25,1);
        s.details();
    }
}
