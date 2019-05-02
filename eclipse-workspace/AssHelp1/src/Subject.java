public class Subject {

   private String name;
   private String tutor;
   private String room;

   public Subject(String _name, String _tutor, String _room) {
      name = _name;
      tutor = _tutor;
      room = _room;
   }
   
   public Subject(String _name) { name = _name; }
   
   public Subject(Subject _Subject) {
      
      if (_Subject == null) {
         System.out.println("Fatal Error.");
         System.exit(0);
      }
      name = _Subject.name;
      tutor = _Subject.tutor;
      room = _Subject.room;
   }
   
   public String getName() { return name; }
   public String getTutor() { return tutor; }
   public String getRoom() { return room; }

   public void setTutor(String _tutor) { tutor = _tutor; }
   public void setRoom(String _room) { room = _room; }
   
   public boolean equals(Object obj) {
      
      if (obj == null) return false;
      else if (getClass() != obj.getClass()) return false;
      else {
         Subject otherSub = (Subject)obj;
         return name.equals(otherSub.name); 
      }
   }
   
   public String toString() {
      return name;
   }
   
   public String getDetails() {
      return "Name : " + name + "\nTutor : " + tutor + "\nRoom : " + room;
   }
}