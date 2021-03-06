import java.util.Scanner;

public class TimeTableApp {

   public static void main(String[] args) {
      
      TimeTable t = new TimeTable();
      Scanner k = new Scanner(System.in);
      
      while (true) {
         System.out.print("===============Main Menu===============\n"
                     +"(1) Add a class to my time table\n"
                     +"(2) View the clase\n"
                     +"(3) Print the entire time table\n"
                     +"(4) Exit the program\n");
         int i1 = k.nextInt();
         
         switch (i1) {
            case 1: System.out.print("Day : ");
                  String day1 = k.next().toUpperCase();
                  
                  System.out.print("Period : ");
                  int period1 = k.nextInt();
                  
                  System.out.print("Name : ");
                  String name = k.next();
                  
                  System.out.print("Tutor : ");
                  String tutor = k.next();
                  
                  System.out.print("Room : ");
                  String room = k.next();
            
                  t.setSchedule(day1, period1, name, tutor, room);
                  break;
                  
            case 2: System.out.print("===============View the Class===============\n"
                              +"(1) At a specific period\n"
                              +"(2) By subject title\n");
                  int i2 = k.nextInt();
                  if (i2 == 1) {
                     System.out.print("Day : ");
                     String day2 = k.next().toUpperCase();
                     
                     System.out.print("Period : ");
                     int period2 = k.nextInt();
                     
                     System.out.println("At that time you have");
                     
                     Subject tmpSub = t.getSchedule(day2, period2);
                     System.out.print("Name : " + tmpSub.getName()
                                 +"Tutor : " + tmpSub.getTutor()
                                 +"Room : " + tmpSub.getRoom() + "\n");         
                  }
                  else if (i2 == 2) {
                     System.out.print("By subject title\n"
                                 +"(1) Specific title\n"
                                 +"(2) View all subjects\n");
                     int i22 = k.nextInt();
                     if (i22 == 1) {
                        System.out.print("Title : ");
                        String title = k.next();
                        
                        Subject tmpSub = t.getSubjectByTitle(title);
                        System.out.print("Name : " + tmpSub.getName()
                                    +"\nTutor : " + tmpSub.getTutor()
                                    +"\nRoom : " + tmpSub.getRoom() + "\n");
                     }
                     else if (i22 == 2) {
                        Subject[] arrSub = t.getAllSubjects();
                        for (int i = 0; arrSub[i] != null; ++i) {
                           System.out.print("----------\n"
                                       +"Name : " + arrSub[i].getName()
                                       +"\nTutor : " + arrSub[i].getTutor()
                                       +"\nRoom : " + arrSub[i].getRoom()
                                       +"\n----------\n");
                        }
                     }
                     else System.out.println("Insert 1 ~ 2");
                  }
                  else System.out.println("Insert 1 ~ 2");
                  break;
                  
            case 3: t.printTimetable();
                  break;
                  
            case 4: 
                  System.out.println("Exit the application");
                  System.exit(0);
                  
            default: 
                   System.out.println("Insert 1 ~ 4");
                   continue;
         }
      }
   }
}