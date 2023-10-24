package Register_a_Candidate;
import java.util.*;

public class Main
{
	public static Candidate getCandidateDetails() throws InvalidSalaryException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the candidate Details ");
		System.out.println("Name ");
		String name = sc.nextLine();
		System.out.println("Gender ");
		String gender = sc.next();
		System.out.println("Expected Salary ");
		double salary = sc.nextInt();
		
		if(salary < 10000)
		{
			throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
		}
		else
		{
			Candidate c = new Candidate();
			c.setName(name);
			c.setGender(gender);
			c.setExpectedSalary(salary);
			return c;
		}	
	}
	
	public static void main(String[] args)
	{
		try
		{
			Candidate c = getCandidateDetails();
			System.out.println("Registration Successful");

		}
		catch(InvalidSalaryException i)
		{
			System.out.println(i.getMessage());
		}
		
	}
}
