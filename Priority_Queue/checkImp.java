

import java.util.Comparator;
import java.util.PriorityQueue;

public class checkImp {
    

    private static class Student {

        String name;
        int roll_no;
        String dob;
        int marks;

    }
    
    private static class StudentComparator implements Comparator<Student> {

        public int compare(Student s1, Student s2) {

            if(s1.marks > s2.marks) {
                return 1;
            }
    
            else if(s1.marks < s2.marks) return -1;
    
            return 0;
        }

    }

    

    public static void main(String[] args) {

        PriorityQueue<Student> studentPQ = new PriorityQueue<>(new StudentComparator());
        
        Student akshay = new Student();

        akshay.name = "akshay";
        akshay.roll_no = 15;
        akshay.dob = "13 july 2003";
        akshay.marks = 91;


        Student vaibhav = new Student();

        vaibhav.name = "vaibhav";
        vaibhav.roll_no = 20;
        vaibhav.dob = "9 may 2004";
        vaibhav.marks = 90;


        studentPQ.add(vaibhav);
        studentPQ.add(akshay);

        System.out.println(studentPQ.peek().name);
        System.out.println(studentPQ.peek().name);

        





    }

}
