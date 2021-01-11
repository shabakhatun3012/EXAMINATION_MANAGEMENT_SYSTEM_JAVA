import java.util.*;
import java.io.*;

class Admin
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	int no_of_students;
	int no_of_invigilators;
	
	int  roomSetup()
	{
		int room_no;
		
		int room_capacity;
		
		
		System.out.println("ENTER ROOM NO");
		room_no=sc.nextInt();
		System.out.println(" ENTER NO OF STUDENTS");
		no_of_students=sc.nextInt();
		System.out.println(" ENTER NO OF INVIGILATORS");
		no_of_invigilators=sc.nextInt();
		System.out.println("ENTER ROOM CAPACITY");
		room_capacity=sc.nextInt();
		
		
		System.out.println("\n"+"\n"+"\n"
        +"\n"+"\n"+"\n"
        +" \t  *******************************************************"+"\n"
        +"\t  **                                                   **"+"\n"
        +"\t  **               DETAILS OF ROOMS AND CAPACITY                **"+"\n"
        +"\t  **                                                   **"+"\n"
        +"\t  *******************************************************"+"\n");
		
		
		
		System.out.println("      ROOM_NO     "+room_no);
		System.out.println("      NO_OF_STUDENTS    "+no_of_students);
		System.out.println("      NO_OF_INVIGILATORS     "+no_of_invigilators);
		System.out.println("      ROOM_CAPACITY    "+room_capacity);
		

	}
	
		
	}}
	class invigilationSetup extends Admin
	{
		Scanner p=new Scanner(System.in);
		int invigilator()
		
	{
		
		int no_of_exam_days;
		int employee_id;
		String designation;
		String name;
		//int room_allocated;
		
		
		for(int i=0;i<(ad.no_of_invigilators);i++)
		{
		System.out.println(" ENTER NO OF EXAM DAYS");
		no_of_exam_days=p.nextInt();
		System.out.println("ENTER EMPLOYEE ID");
		employee_id=p.nextInt();
		System.out.println("ENTER DESIGNATION");
		designation=p.next();
		System.out.println(" ENTER NAME");
		name=p.next();
		//System.out.println(" ROOM ALLOCATED");
		//room_allocated =p.nextInt();
		}
		
		System.out.println("\n"+"\n"+"\n"
        +"\n"+"\n"+"\n"
        +" \t  *******************************************************"+"\n"
        +"\t  **                                                   **"+"\n"
        +"\t  **               DETAILS OF INVIGILATORS                **"+"\n"
        +"\t  **                                                   **"+"\n"
        +"\t  *******************************************************"+"\n");
		
		
		for(int i=0;i<no_of_invigilators;i++)
		{
		System.out.println("      NO_OF_EXAM_DAYS    "+no_of_exam_days);
		System.out.println("      EMPLOYEE_ID    "+employee_id);
		System.out.println("      DESIGNATION    "+designation);
		System.out.println("      NAME    "+name);
		//System.out.println("      ROOM ALLOCATED    "+room_allocated);
	    }  
		}
		
	}
	
	class studentSeatingPlan extends Admin
	{
		Scanner t=new Scanner(System.in);
           int student()
		   {		   
	
		int reg_no;
		String student_name;
		String student_department;
		 
		for(int i=0;i<=(ad.no_of_students);i++)
		{
		System.out.println("ENTER REGISTERATION NO");
		reg_no_no=t.nextInt();
		System.out.println("ENTER STUDENT NAME");
		student_name=t.next();
		System.out.println("ENTER STUDENT DEPARTMENT");
		student_department=t.next();
		}
		
		System.out.println("\n"+"\n"+"\n"
        +"\n"+"\n"+"\n"
        +" \t  *******************************************************"+"\n"
        +"\t  **                                                   **"+"\n"
        +"\t  **               DETAILS OF STUDENT                **"+"\n"
        +"\t  **                                                   **"+"\n"
        +"\t  *******************************************************"+"\n");
		
		
		for(int i=0;i<no_of_students;i++)
		{
		System.out.println("      REGISTERATION_NO    "+ reg_no);
		System.out.println("      STUDENT_NAME    "+ student_name);
		System.out.println("STUDENT_DEPARTMENT"+"  "+ student_department);
		}
	}
		
	
	}
	

/* cv*************************************add room data into file***********************************************************************cv*/
class Add_room_data
{
	public void createRoomFile()
	{
	
	ad.roomSetup();
	try{
File f1=new File("file"+ad.room_no+".txt");
if(f1.createNewFile())
{
FileWriter myWriter = new FileWriter("file"+ad.room_no+".txt");
myWriter.write("ROOM NO :"+ad.room_no+"\n"+"NO OF INVIGILATORS   :"+ad.no_of_invigilators+"\n"+"NO OF STUDENT :"+ad.no_of_students+

"ROOM CAPACITY   :"+ad.room_capacity);
myWriter.close();
System.out.println("room details added");
}
else {
System.out.println("room details already exist");
}
}catch(Exception e){System.out.println(e);}
}
	
}

/* cv***************************************add student data into file******************************************************************* cv */

class Add_student_data
{
public void createStudentFile()
{  

studentSeatingPlan sd =new studentSeatingPlan();
sd.student();
try{
File f1=new File("file"+sd.reg_no+".txt");
if(f1.createNewFile())
{
FileWriter myWriter = new FileWriter("file"+sd.reg_no+".txt");
myWriter.write("REG NO:"+sd.reg_no+"\n"+"STUDENT NAME    :"+sd.student_name+"\n"+

"STUDENT DEPARTMENT   :"+sd.student_department);
myWriter.close();
System.out.println("student added");
}
else {
System.out.println("student_detail already exist");
}
}catch(Exception e){System.out.println(e);}
}
}	
/* cv**********************************add invigilator details into file********************************************************** cv */
class Add_invigilator_data
{
public void createInvigilatorFile()
{  

invigilationSetup is =new invigilationSetup();
is.invigilator();
try{
File f1=new File("file"+is.employee_id+".txt");
if(f1.createNewFile())
{
FileWriter myWriter = new FileWriter("file"+is.employee_id+".txt");
myWriter.write("no_of_exam_days"+is.no_of_exam_days+"\n"+"EMPLOYEE ID    :"+is.employee_id+"\n"+"DESIGNATION "+is.designation+"\n"+
"NAME OF EMPLOYEE "+is.name

);
myWriter.close();
System.out.println("invigilation  added");
}
else {
System.out.println("invigilation details already exist");
}
}catch(Exception e){System.out.println(e);}
}
}	

class Select  
{
	
	public static void main(String args[])
	{
		int i=1;
		Admin ad=new Admin();
		while((i>0)&&(i<3))
		{
			System.out.println("\n1.room details  \n 2.invigilationSetup  \n 3.studentSeatingPlan \n 4.Exit");
			i=sc.nextInt();
			switch(i)
			{
				case 1:
				{
					Add_room_data ar =new Add_room_data();
					ar.createRoomFile();
					break;
				}
				
				
				case 2:
				{
					Add_invigilator_data ai= new Add_invigilator_data();
					ai.createInvigilatorFile();
					break;
				}
				
				
				case 3:
				{
					Add_student_data as= new Add_student_data();
                    as.createStudentFile();
                    break;					
				}
				
				
				case 4:
				System.exit(0);
			}
		}
		
		
	}
	
}