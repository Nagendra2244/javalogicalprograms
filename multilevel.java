import java.util.Scanner;

class Student {
    String sname;
    int SIdno;
    int phy,che,maths;
    
 void setMarks(int p, int c, int m) {
        phy=p;
        che=c;
        maths=m;
    }
}

class Average extends Student {
    int total;
    int average;
    
 void calculateAverage() {
        total=phy+che+maths;
        average=total/3;
    }
}

class Grading extends Average {
    char grade;
    
 void calculateGrade() {
        if (average>=90) {
            grade='A';
        } else if (average>=80) {
            grade='B';
        } else if (average>=70) {
            grade='C';
        } else if (average>=60) {
            grade='D';
        } else {
            grade='F';
        }
    }
    
 void report() {
        System.out.println("   STUDENT DETAILS   ");
        System.out.println("------------------------");
        System.out.println("Student name:"+sname);
        System.out.println("Student number is:"+SIdno);
        System.out.println("Physics marks:"+phy);
        System.out.println("Chemistry marks:"+che);
        System.out.println("Maths marks:"+maths);
        System.out.println("Total marks:"+total);
        System.out.println("Average marks:"+average);
        System.out.println("Grade:"+grade);
    }
}

class multilevel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student Name:");
        String sname = sc.nextLine();
        System.out.println("Enter student Number:");
        int SIdno = sc.nextInt();
        System.out.println("Enter physics Marks:");
        int phy = sc.nextInt();
        System.out.println("Enter chemistry Marks:");
        int che = sc.nextInt();
        System.out.println("Enter maths Marks:");
        int maths = sc.nextInt();
        
        Grading s1 = new Grading();
        s1.sname = sname;
        s1.SIdno = SIdno;
        s1.setMarks(phy, che, maths);
        s1.calculateAverage();
        s1.calculateGrade();
        s1.report();
    }
}
