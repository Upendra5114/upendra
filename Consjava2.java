public class Consjava2{
    public static void Consjava2(String[] args) {
        Consjava2 obj1 = new Consjava2("upoendra",528,90.0,"MVGR",33);
        System.out.println("\n"+" details of student1: ");
        obj1.display();
        Consjava2 obj2 = new Consjava2();
        System.out.println("\n"+" details of student2: ");
        obj2.display();
        
    }
    String fullName;
    int rollNum;
    double semPerentage;
     String collegeName;
    int collegeCode;
    Consjava2()
    {
        this(null,0,0.0,"MVGR",33);
    }
    Consjava2(String fullName,int rollNum, double semPerentage,String collegeName,int collegeCode )
    {
        this.fullName=fullName;
        this.rollNum=rollNum;
        this.semPerentage=semPerentage;
        this.collegeName=collegeName;
        this.collegeCode=collegeCode;
    }
    void display() {
        System.out.println(
                "Full Name: " + this.fullName +
                "\nRoll Number: " + this.rollNum +
                "\nSemester Percentage: " + this.semPerentage +
                "\nCollege Name: " + this.collegeName +
                "\nCollege Code: " + this.collegeCode
        );
    
    }
        protected void finalize()  
        {  
        System.out.println("Object is destroyed by the Garbage Collector");  
        }  
    }
