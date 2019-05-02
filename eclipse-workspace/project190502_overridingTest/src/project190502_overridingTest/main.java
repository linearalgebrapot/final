package project190502_overridingTest;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent myP = new Parent();
		Child myC = new Child();
		
		myP.myFunc();
		myP.myStaticFunc();
		System.out.println("----------------------------");
		myC.myFunc();
		myC.myStaticFunc();
		System.out.println("----------------------------");
		Parent myV = new Child();
		
		myV.myFunc();
		myV.myStaticFunc();
		System.out.println("----------------------------");
		Parent myP2 = myV;
		myP2.myFunc();
		myP2.myStaticFunc();
	}

}
