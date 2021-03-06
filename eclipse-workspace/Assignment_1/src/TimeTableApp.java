
import java.util.Scanner;

public class TimeTableApp {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		TimeTable tt = new TimeTable();
		int num, num2, num3;
		
		String name, tutor, room, day;
		int period;
		boolean check;
		
//		tt.setSchedule("THU".toLowerCase(), 1, "OOP", "Lee", "509");
//		tt.setSchedule("mon".toLowerCase(), 2, "OS", "Kim", "507");
//		tt.setSchedule("mon".toLowerCase(), 3, "OS", "Kim", "507");
		
		while(true) {
			mainMenu();
			num = sc.nextInt();
			//sc.nextLine();
			switch(num) {
			case 1:
				System.out.print("Day : ");
				day = sc.next().toUpperCase();
				System.out.print("Period : ");
				period = sc.nextInt();
				//sc.nextLine();
				System.out.print("Name : ");
				name = sc.next();
				System.out.print("Tutor : ");
				tutor = sc.next();
				System.out.print("Room : ");
				room = sc.next();
				
				check = tt.setSchedule(day.toLowerCase(), period, name, tutor, room);
				
				if (check == true)
					System.out.println("Class successfully added");
				else
					System.out.println("Class was NOT successfully added");
				
				break;
			
			case 2:
				System.out.println("==============View the Class=============");
				System.out.println("(1) At a specific period");
				System.out.println("(2) By subject title");
				num2 = sc.nextInt();
				//sc.nextLine();
				
				if(num2 == 1) {
					System.out.print("Day : ");
					day = sc.next().toUpperCase();
					System.out.print("Period : ");
					period = sc.nextInt();
					//sc.nextLine();
					System.out.println("At that time you have");
					System.out.println(tt.getSchedule(day.toLowerCase(), period).getDetails()); //�̰͵� OK
				}
				
				else if(num2 == 2) {
					System.out.println("=============By subject title============");
					System.out.println("(1) Specific title");
					System.out.println("(2) View all subjects");
					num3 = sc.nextInt();
					//sc.nextLine();
					
					if(num3 == 1) {
						System.out.print("Title : ");
						String tarName = sc.next();
						//System.out.println(tarName);
						if(tt.getSubjectByTitle(tarName) != null) 
							System.out.println(tt.getSubjectByTitle(tarName).getDetails());
						else
							System.out.println("It doesn't exist");
					}
					
					else if(num3 == 2) {
						Subject[] sa = tt.getAllSubject();
						
						for(int i=0;i<sa.length;i++) {
							System.out.println("------------\n" + sa[i].getDetails() + "\n------------");
						}
					}
					else
						System.out.println("Insert 1~2");	
				}
				else
					System.out.println("Insert 1~2");
				break;
				
			case 3:
				tt.printTimeTable();
				break;
				
			case 4:
				System.out.println("Exit the application");
				sc.close();
				System.exit(0);
				
			default:
				System.out.println("Insert 1~4");	
				break;
			}
		}
	}
	public static void mainMenu() {
		System.out.println("================Main Menu================\n" + "(1) Add a class to my time table\n" + "(2) View the class at a specific time\n" + "(3) Print the time table\n" + "(4) Exit the program");
	}
}