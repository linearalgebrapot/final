
class Subject {
	private String name, tutor, room;
	
	public Subject(String name, String tutor, String room) {
		this.name = name;
		this.tutor = tutor;
		this.room = room;
	}
	
	public Subject(String name) {
		this(name, null, null);
	}
	
	public Subject(Subject another) {
		this.name = another.name;
		this.tutor = another.tutor;
		this.room = another.room;
	}
	
//	public void setName(String name) {
//		this.name = name;
//	}
	public String getName() {
		return this.name;
	}
	
	public String getTutor() {
		return this.tutor;
	}
	public void setTutor(String tutor) {
		this.tutor = tutor;
	}
	
	public String getRoom() {
		return this.room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	
	public boolean equals(Object obj) {
	      
	      if (obj == null) return false;
	      else if (getClass() != obj.getClass()) return false;
	      else {
	         Subject otherSub = (Subject)obj;
	         return name.equals(otherSub.name); 
	      }
	   }
	
	//@Override
	public String toString() {
		return this.name;
	}
	
	public String getDetails() {
		return "Name : " + this.name + "\nTutor : " + this.tutor + "\nRoom : " + this.room;
	}
}
