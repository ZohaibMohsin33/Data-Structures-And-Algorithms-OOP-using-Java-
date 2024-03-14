package oop;

public class One {

    public static void main(String[] args) {

        Student Zohaib = new Student(12,"Zohaib Mohsin", 66.6F);
        System.out.println(Zohaib.name);

        Student Hassan = new Student();
        System.out.println(Hassan.name);

        Student arslan = new Student(Hassan);
        System.out.println(arslan.name + arslan.marks);


    }
}

 class Student{

    int rno ;
    String name;
    float marks ;

    Student(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
    Student(){
        this(13,"hehe",67f);
    }

    Student(Student other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

}
