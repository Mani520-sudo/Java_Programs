package Contact_Details_of_Hosteller;

import java.util.*;

public class Main
{
	public static Hosteller getHostellerDetails()
	{
		Hosteller h = new Hosteller();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Details:");
		System.out.println("Student Id");
		int i = scanner.nextInt();
		h.setStudentId(i);
		System.out.println("Student Name");
		String name = scanner.next();
		h.setName(name);
		System.out.println("Department Id");
		int dpid = scanner.nextInt();
		h.setDepartmentId(dpid);
		System.out.println("Gender");
		String g = scanner.next();
		h.setGender(g);
		System.out.println("Phone Number");
		String phno = scanner.next();
		h.setPhone(phno);
		System.out.println("Hostel Name");
		String hname = scanner.next();
		h.setHostelName(hname);
		System.out.println("Room Number");
		int rno = scanner.nextInt();
		h.setRoomNumber(rno);
		return h;
	}
	public static void main(String[] args)
	{
		Hosteller h = getHostellerDetails();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Modify Room Number(Y/N)");
		String mrn = scanner.next();
		if(mrn.equals("Y"))
		{
			System.out.println("New Room Number");
			int rno = scanner.nextInt();
			h.setRoomNumber(rno);
		}
		System.out.println("Modify Phone Number(Y/N)");
		String mphno = scanner.next();
		if(mphno.equals("Y"))
		{
			System.out.println("New Phone Number");
			String phno = scanner.next();
			h.setPhone(phno);
		}
		System.out.println("The Student Details");
		System.out.println(h.getStudentId() +" "+ h.getName()+" "+h.getDepartmentId()+" "+
				h.getGender()+" "+h.getPhone()+" "+h.getHostelName()+" "+h.getRoomNumber());
	}
}
