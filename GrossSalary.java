/*Write a JAVAprogram to input basiJAVAsalary of an employee and calculate its Gross salary according to following:
BasiJAVASalary <= 10000 : HRA = 20%, DA = 80%
BasiJAVASalary <= 20000 : HRA = 25%, DA = 90%
BasiJAVASalary > 20000 : HRA = 30%, DA = 95%
*/
import java.util.Scanner;
class GrossSalary
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Basic Salary :");
		int basicSalary = sc.nextInt();
		float HRA=0,DA=0,Total;
    Total=basicSalary + HRA + DA;
		if(basicSalary<=10000)
		{			
			HRA = basicSalary*0.2f;
			DA = basicSalary*0.8f;
		}
		else if(basicSalary<=20000)
		{
			HRA = basicSalary*0.25f;
			DA = basicSalary*0.9f;
		}
		else
		{
			HRA = basicSalary*0.3f;
			DA = basicSalary*0.95f;
		}
		System.out.println("Gross Salary : "+(basicSalary+HRA+DA));
	}
}