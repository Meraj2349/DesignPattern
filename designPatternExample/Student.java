package designPatternExample;

public class Student {



    public int age ;
    String name ;

    Student(int age , String name )
    {
          this.age=age;
          this.name=name;

    }
    Student()
    {
          
    }

    Student(Student s)
    {
        this.age=s.age;
        this.name=s.name;   
    }
    @Override
    protected Student clone(){

        return new Student(this);
    }



}

/**
 * InnerStudent
 
 main */
 class InnerStudent {
    public static void main(String[] args) {
        Student a=new Student(20, "meraj");
        Student b= a.clone();
        System.out.println(b.name);
        b.name = "saiksdlfksklfjsdklfjdsklj";
         System.out.println(b.name + " " + a.name);
        
    }

    
}
