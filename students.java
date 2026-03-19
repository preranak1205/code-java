package experiment2;
import java.util.*;

class Student 
{
    int rollNo;
    String name;
    double marks;

    Student(int rollNo, String name, double marks) 
    {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public String toString() 
    {
        return rollNo + " " + name + " " + marks;
    }
}

class SortByMarks implements Comparator<Student>
{
    public int compare(Student s1, Student s2)
    {
        return Double.compare(s2.marks, s1.marks);
    }
}

public class students
{
	 public static void main(String[] args)
	 {

	        ArrayList<Student> list = new ArrayList<>();
	        list.add(new Student(23, "chandrakala", 89));
	        list.add(new Student(10, "vaishnavi", 85));
	        list.add(new Student(11, "prerana", 84));
	        list.add(new Student(26, "sayali", 76));

	        System.out.println("Student Records:");
	        for (Student s : list)
	        {
	            System.out.println(s);
	        }
	        Collections.sort(list, new SortByMarks());

	        System.out.println("\nStudents Sorted by Marks:");
	        for (Student s : list)
	        {
	            System.out.println(s);
	        }
	    }
}


