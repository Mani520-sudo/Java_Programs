package Student_Details;

import java.util.*;

public class Main {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Student's Id:");
		int sid = s.nextInt();
		System.out.println("Enter Student's Name:");
		String sname = s.next();
		System.out.println("Enter Student's address:");
		String sadrs = s.next();
		while(true)
		{
			System.out.println("Whether the student is from NIT(Yes/No):");
			String yn = s.next();
			if(yn.toLowerCase().equals("yes"))
			{
				Student s1 = new Student(sid,sname,sadrs);
				System.out.println("Student id:"+s1.getStudentId());
				System.out.println("Student name:"+s1.getStudentName());
				System.out.println("Address:"+s1.getStudentAddress());
				System.out.println("College name:"+s1.getCollegeName());
				break;
			}
			else if(yn.toLowerCase().equals("no"))
			{
				System.out.println("Enter the college name:");
				String cname = s.next();
				Student s1 = new Student(sid,sname,sadrs,cname);
				System.out.println("Student id:"+s1.getStudentId());
				System.out.println("Student name:"+s1.getStudentName());
				System.out.println("Address:"+s1.getStudentAddress());
				System.out.println("College name:"+s1.getCollegeName());
				break;
			}
			else
			{
				System.out.println("Wrong Input");
			}
		}	


	}

}
