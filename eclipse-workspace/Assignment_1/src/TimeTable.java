
class TimeTable {
	private Subject[][] schedule = new Subject[10][5]; //여기서 private Subject[][] schedule; 만 해주고
	
	public TimeTable(){
		for (int i=0;i<10;i++) {
			for (int j =0;j<5;j++) {
				schedule[i][j] = new Subject("", null, null);
			}
		}
		
		initialize();
	}
	
	private void initialize() {
		for (int i=0;i<10;i++) {
			for (int j =0;j<5;j++) {
				if (i == 2)
					this.schedule[i][j] = new Subject("BREAK");
				else if (i == 6)
					this.schedule[i][j] = new Subject("LUNCH");
				else
					this.schedule[i][j] = new Subject("----");
			}
		}
	}
	
	private int getNumByDay(String day) {
		//System.out.println(day.toLowerCase());
		if(day.toLowerCase().equals("mon"))
			return 0;
		else if(day.toLowerCase().equals("tue"))
			return 1;
		else if(day.toLowerCase().equals("wed"))
			return 2;
		else if(day.toLowerCase().equals("thu"))
			return 3;
		else if(day.toLowerCase().equals("fri"))
			return 4;
		else
			return -1;
	}
	
	public Subject getSchedule(String day, int period) {
		int j = 0;
		
		switch(getNumByDay(day)) {
		case 0:
			j=1;
			break;
		case 1:
			j=2;
			break;
		case 2:
			j=3;
			break;
		case 3:
			j=4;
			break;
		case 5:
			j=5;
			break;
		}
		
		return new Subject(this.schedule[period-1][j-1]);
	}
	
	public Subject[] getAllSubject(){
		int cnt = 0, idx = 0;
		
		for (int i=0;i<10;i++) {
			for (int j =0;j<5;j++) {
				if(schedule[i][j].toString() != "----" && schedule[i][j].toString() != "BREAK" && schedule[i][j].toString() != "LUNCH")
					cnt++;
			}
		}
		
		Subject[] result = new Subject[cnt];
		
		for (int i=0;i<10;i++) {
			for (int j =0;j<5;j++) {
				if(schedule[i][j].toString() != "----" && schedule[i][j].toString() != "BREAK" && schedule[i][j].toString() != "LUNCH") {
					result[idx] = new Subject(schedule[i][j]);
					idx++;
				}
			}
		}
		
		return result;
			
	}
	
	public Subject getSubjectByTitle(String title) {
		Subject returnSubject = null;
		
		for (int i=0;i<10;i++) {
			for (int j =0;j<5;j++) {
				if(schedule[i][j].toString().equals(title))
					returnSubject = schedule[i][j];
			}
		}
		//System.out.println(returnSubject.getDetails());
		if(returnSubject == null)
			return returnSubject;
		else
			return new Subject(returnSubject);
	} //같은 title의 수업이 2개 이상이면?
	
	public boolean setSchedule(String day, int period, String name, String tutor, String room) {
		int j = 0;
		
		switch(getNumByDay(day)) {
		case 0:
			j=1;
			break;
		case 1:
			j=2;
			break;
		case 2:
			j=3;
			break;
		case 3:
			j=4;
			break;
		case 5:
			j=5;
			break;
		}
		//System.out.println(j);
		
		if ((period-1 != 2) && (period-1 != 6)) {
			//System.out.println((period-1) + " " + (j-1));
			this.schedule[period-1][j-1] = new Subject(name, tutor, room);
			return true;
		}
		
		else
			return false;
	}
	
	public void printTimeTable() {
		System.out.printf("\tMON\tTUE\tWED\tTHU\tFRI\n");
		for (int i=0;i<10;i++) {
			System.out.printf("%2d\t", i+1);
			for (int j =0;j<5;j++) {
				System.out.printf("%s\t", this.schedule[i][j].toString());

			}
			System.out.println();
		}
	}
}