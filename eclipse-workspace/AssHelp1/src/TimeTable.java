public class TimeTable {

   //?
   private Subject[][] timeTable = new Subject[10][5];
   
   public TimeTable() {
      
      for (int i = 0; i < 10; ++i) {
         for (int j = 0; j < 5; ++j)
            timeTable[i][j] = new Subject("", null, null);
      }
      initialize();
   }
   
   private void initialize() {
   
      for (int i = 0; i < 10; ++i) {
         for (int j = 0; j < 5; ++j) {
            if (i == 2)   timeTable[i][j] = new Subject("BREAK");
            else if (i == 6) timeTable[i][j] = new Subject("LUNCH");
            else timeTable[i][j] = new Subject("----");
         }
      }
   }
   
   private int getNumByDay(String day) {
      
      //enum!?
      if (day.equals("MON")) return 0;
      else if (day.equals("TUE")) return 1;
      else if (day.equals("WED")) return 2;
      else if (day.equals("THU")) return 3;
      else if (day.equals("FRI")) return 4;
      
      else return -1;
   }
   
   public Subject getSchedule(String day, int period) {
      return timeTable[period-1][getNumByDay(day)];
   }
   
   public Subject[] getAllSubjects() {
      
      Subject[] arrSub = new Subject[40];
      
      for (int i = 0, z = 0; i < 10; ++i) {
         for (int j = 0; j < 5; ++j)
            if (timeTable[i][j].getName() != "BREAK"
                && timeTable[i][j].getName() != "LUNCH"
                && timeTable[i][j].getName() != "----") {
               arrSub[z] = new Subject(timeTable[i][j]);
               ++z;
            }
      }
      return arrSub;
   }
   
   public Subject getSubjectByTitle(String title) {
      
      Subject tmpSub = new Subject(title);
      
      for (int i = 0; i < 10; ++i) {
         for (int j = 0; j < 5; ++j) {
            if (tmpSub.equals(timeTable[i][j])) 
            	return timeTable[i][j];
         }
      }
      System.out.println("It doesn't exist");
      return tmpSub;
      //right return??
   }
   
   public boolean setSchedule(String day, int period, String _name, String _tutor, String _room) {
      //System.out.println(getNumByDay(day) + " " + (period-1));
      if (period == 3 || period == 7) {
         System.out.println("Class was NOT successfully added");
         return false;
      }
      timeTable[period-1][getNumByDay(day)] = new Subject(_name, _tutor, _room);
      System.out.println("Class successfully added");
      return true;
   }
   
   public void printTimetable() {
      
      System.out.println("\tMON\tTUE\tWED\tTHU\tFRI");
      
      for (int i = 0; i < 10; ++i) {
         System.out.printf("%d\t", i+1);
         for (int j = 0; j < 5; ++j) {
            System.out.printf("%s\t", timeTable[i][j].getName());
         }
         System.out.println();
      }
   }
}