 import java.util.*;
class patient_doctor
{
	String p_fname,p_lname,disease,outcome,blood_group,qf,doc_fname,d_name,doc_lname;
	int i,p_id,p_age,advance_fee,treatment_fee,total_fee,weight,d_id,d_age,salary;
	long p_contact,doc_contact;
	
	public void pat_setdata()
	{
		System.out.println("Enter id");
		Scanner sc= new Scanner(System.in);
		p_id=sc.nextInt();
		System.out.println("Enter first name");
		p_fname=sc.next();
  
		for(i=0;i<p_fname.length();i++)
		{
			char ch=p_fname.charAt(i);
			if(ch=='!' || ch=='@' || ch=='#' || ch=='$' || ch=='%' || ch=='^' || ch=='&' || ch=='*' || ch=='(' || ch==')')
			{
				System.out.println("Enter valid name"); 
				p_fname=sc.next();
			}
		}
  
		System.out.println("Enter last name");
		p_lname=sc.next();
		 for(i=0;i<p_lname.length();i++)
		{
			char ch=p_lname.charAt(i);
			if(ch=='!' || ch=='@' || ch=='#' || ch=='$' || ch=='%' || ch=='^' || ch=='&' || ch=='*' || ch=='(' || ch==')')
			{
				System.out.println("Enter valid name"); 
				p_lname=sc.next();
			}
		}
		System.out.println("Enter Patient age");
		p_age=sc.nextInt();
		System.out.println("Enter diagnosis/disease patient is suffering from");
		disease=sc.next();
		System.out.println("Enter Patient's Contact Number");
		p_contact=sc.nextLong();
		System.out.println("Enter Patient's Advance fee");
		advance_fee=sc.nextInt();
		System.out.println("Enter Patient's Treatment fee");
		treatment_fee=sc.nextInt();
		System.out.println("Enter Patient's Blood Group");
		blood_group=sc.next();
		System.out.println("Enter Patient's Weight");
		weight=sc.nextInt();
		System.out.println("Enter Doctor who is treating the patient");
		d_name=sc.next();
		System.out.println("Enter Patient outcome(Under treatment/Discharged/Death)");
		outcome=sc.next();
	}
  
	public void pat_putdata()
	{
		System.out.println("Patient ID : "+p_id);
		System.out.println("Name of patient is "+p_fname+" "+p_lname);
		System.out.println("Age is "+p_age+" years");
		System.out.println("Contact Number of the Patient is "+p_contact);
		System.out.println("Patient is suffering from "+disease);
		System.out.println("Patient is treated by Dr."+d_name);
		System.out.println("Patient's Blood Group is "+blood_group);
		System.out.println("Patient's Weight is "+weight+" kgs.");
		System.out.println("Patient's Advance Fee is Rs."+advance_fee);
		System.out.println("Patient's Treatment Fee is Rs."+treatment_fee);
		System.out.println("Outcome : "+outcome);
	}

	public void calculate_fee()
	{
		total_fee=advance_fee+treatment_fee;
		System.out.println("---------------------------------------------");
		System.out.println("Patient's Total Fee is Rs."+total_fee);
		System.out.println("---------------------------------------------");
	}
 
	public void doc_setdata()
	{
		System.out.println("Enter  doctor id");
		Scanner sc= new Scanner(System.in);
		d_id=sc.nextInt();
		System.out.println("Enter Doctor's first name");
		doc_fname=sc.next();
		for(i=0;i<doc_fname.length();i++)
		{
			char ch=doc_fname.charAt(i);
			if(ch=='!' || ch=='@' || ch=='#' || ch=='$' || ch=='%' || ch=='^' || ch=='&' || ch=='*' || ch=='(' || ch==')')
			{
				System.out.println("Enter valid first name"); 
				doc_fname=sc.next();
			}
		}
		System.out.println("Enter Doctor's last name");
		doc_lname=sc.next();
  
		for(i=0;i<doc_lname.length();i++)
		{
			char ch=doc_lname.charAt(i);
			if(ch=='!' || ch=='@' || ch=='#' || ch=='$' || ch=='%' || ch=='^' || ch=='&' || ch=='*' || ch=='(' || ch==')')
			{
				System.out.println("Enter valid last name"); 
				doc_lname=sc.next();
			}
		}
  
		System.out.println("Enter Doctor age");
		d_age=sc.nextInt();
		System.out.println("Enter Doctor's Contact Number");
		doc_contact=sc.nextLong();
		System.out.println("Enter Doctor's salary");
		salary=sc.nextInt();
		System.out.println("Enter Doctor's qualification");
		qf=sc.next();
	}

	public void doc_putdata()
	{
		System.out.println("id="+d_id);
		System.out.println("Name is Dr."+doc_fname+" "+doc_lname);
		System.out.println("age="+d_age);
		System.out.println("Contact number is "+doc_contact);
		System.out.println("Doctor's Salary is "+salary);
		System.out.println("Doctor's Qualification : "+qf);
	}
 
}

class hospital_management extends patient_doctor
{
	static int count1=0;
	public static void main(String args[])
	{
		int i,ch,m,n,total,c1=0,c2=0;
		hospital_management[] patient=new hospital_management[50];
		hospital_management[] doctor=new hospital_management[50];
		Scanner scanner=new Scanner(System.in);
		System.out.println("----------------------------------------------------------");
		System.out.println("WELCOME TO HOSPITAL MANAGEMENT SYSTEM");
		System.out.println("----------------------------------------------------------");
		System.out.println("How Many Patient Records You Want To Enter?");
		n=scanner.nextInt();
		System.out.println("How Many Doctor Records You Want To Enter?");
		m=scanner.nextInt();
	do
	{
		System.out.println("----------------------------------------------------------");
		System.out.println("1.Insert Patient Details");
		System.out.println("2.Insert Doctor Details");
		System.out.println("3.Update Patient's Record");
		System.out.println("4.Update Doctor's Record");
		System.out.println("5.Delete Patient's Record");
		System.out.println("6.To Calculate Patient's Total Fee");
		System.out.println("7.Display the count of patients who are dischared/admitted/died");
		System.out.println("8.Display all the patient details/doctor details Or Retrieve all data");
		System.out.println("9.To exit from the system");
		System.out.println("Enter your choice");
		System.out.println("----------------------------------------------------------");
		Scanner sc1=new Scanner(System.in);
		ch=sc1.nextInt();
		if(ch==5)
		{
			count1++;
		}
		switch(ch)
		{
			case 1: System.out.println("");
					System.out.println("----------------------------------------------------------");
					System.out.println("Enter Patient details");
					for(i=0;i<n;i++)
					{
						patient[i]=new hospital_management();
					}
					for(i=0;i<n;i++)
					{
						patient[i].pat_setdata();
					}
					System.out.println("----------------------------------------------------------");
					break;
					
			case 2: 
					System.out.println("----------------------------------------------------------");
					System.out.println("Enter doctor details");
					for(i=0;i<m;i++)
						doctor[i] =  new hospital_management(); 
					for(i=0;i<m;i++)
					{
						doctor[i].doc_setdata();
					}
					System.out.println("----------------------------------------------------------");
					break;
					
			case 3:   
					System.out.println("Enter id to search");
					int id2=sc1.nextInt();
					for(i=0;i<n;i++)
					{
						if(id2==patient[i].p_id)
						{
							System.out.println("What do you want to update?");
							System.out.println("1.Age 2.Disease 3.Bill 4.Outcome 5.Weight");
							System.out.println("Enter your choice");
							int ch2=sc1.nextInt();
							if(ch2==1)
							{
								System.out.println("Enter age you want to update");
								int age2=sc1.nextInt();
								patient[i].p_age=age2;
							}
							if(ch2==2)
							{
								System.out.println("Enter Disease");
								String dis2=sc1.next();
								patient[i].disease=dis2;
							}
							if(ch2==3)
							{
								System.out.println("Enter patient's treatment fee");
								int new_fee=sc1.nextInt();
								patient[i].treatment_fee=new_fee;
							}
							if(ch2==4)
							{
								System.out.println("Enter outcome");
								String new_outcome=sc1.next();
								patient[i].outcome=new_outcome;
							}
							if(ch2==5)
							{
								System.out.println("Enter weight");
								int new_weight=sc1.nextInt();
								patient[i].weight=new_weight;
							}
							System.out.println("");
							System.out.println("----------------------------------------------------------");
							System.out.println("Updated Record :");
							patient[i].pat_putdata();
							System.out.println("----------------------------------------------------------");
						}
					}
					break;
					
			case 4:  
					System.out.println("Enter  doctor's id to search");
					int id3=sc1.nextInt();
					for(i=0;i<m;i++)
					{
						if(id3==doctor[i].d_id)
						{
							System.out.println("What do you want to update?");
							System.out.println("1.Age 2.Salary 3.Contact Number");
							System.out.println("Enter your choice");
							int ch3=sc1.nextInt();
							if(ch3==1)
							{
								System.out.println("Enter age you want to update");
								int age3=sc1.nextInt();
								doctor[i].d_age=age3;
							}
							if(ch3==2)
							{
								System.out.println("Enter Doctor's new salary");
								int new_sal=sc1.nextInt();
								doctor[i].salary=new_sal;
							}
							if(ch3==3)
							{
								System.out.println("Enter Doctor's new contact number");
								long new_contact=sc1.nextLong();
								doctor[i].doc_contact=new_contact;
							}
							System.out.println("");
							System.out.println("----------------------------------------------------------");
							System.out.println("Updated record :");
							doctor[i].doc_putdata();
							System.out.println("----------------------------------------------------------");
						}
					}
					break;
					
			case 5:   
					System.out.println("Enter record number to delete");
					int pos=sc1.nextInt();
					if(pos>n)
					{
						System.out.println("Record does not exist"); 
					}
					for(i=pos;i<n;i++)
					{
						patient[i-1].p_id=patient[i].p_id;
						patient[i-1].p_fname=patient[i].p_fname;
						patient[i-1].p_lname=patient[i].p_lname;
						patient[i-1].p_age=patient[i].p_age;
						patient[i-1].advance_fee=patient[i].advance_fee;
						patient[i-1].treatment_fee=patient[i].treatment_fee;
						patient[i-1].disease=patient[i].disease;
						patient[i-1].d_name=patient[i].d_name;
						patient[i-1].outcome=patient[i].outcome;
						n--;
					}
					System.out.println("----------------------------------------------------------");
					System.out.println("Record deleted successfully");
					System.out.println("Displaying all patient details");
					for(i=0;i<n-1;i++)
					{
						System.out.println("------------------------------------------");
						patient[i].pat_putdata();
						System.out.println("------------------------------------------");
					}
					System.out.println("----------------------------------------------------------");
					break;
           
			case 6: 
					System.out.println("Enter patient ID whose total fee you want to find??");
					int t1=sc1.nextInt();
					for(i=0;i<n;i++)
					{
						if(t1==patient[i].p_id)
						{
							patient[i].calculate_fee();
						}
					}
					break;
					
			case 7: 
					int count=0;
					String temp;
					for(i=0;i<n;i++)
					{ 
						temp=patient[i].outcome;
						if(temp.equals("death"))
						{
							count=count+1;
						}
					}
					System.out.println("----------------------------------------------------------");
					System.out.println("Number of patients who died are : "+count); 
					System.out.println("----------------------------------------------------------");
					break;
   
			case 8: total=n-count1; 
					for(i=0;i<total;i++)
					{
						int j=i+1;
						System.out.println("----------------------------------------------------------");
						System.out.println("Displaying details of Patient "+j);
						patient[i].pat_putdata();
						System.out.println("----------------------------------------------------------");
					}
					System.out.println("");
           
					for(i=0;i<m;i++)
					{
						int j=i+1;
						System.out.println("----------------------------------------------------------");
						System.out.println("Displaying details of Doctor "+j);
						doctor[i].doc_putdata();
						System.out.println("----------------------------------------------------------");
					}
					break;
   
			case 9: 
					System.exit(0);
		}
	}while(ch!=9);
	}
}
