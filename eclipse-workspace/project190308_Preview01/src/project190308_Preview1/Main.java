package project190308_Preview1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SomePhone myPhone1 = new SomePhone();
		PhoneInterface myPhone2 = new SomePhone();
		
		myPhone1.call();
		myPhone1.message("Hello");
		myPhone1.func1();
		
		myPhone2.call();
		myPhone2.message("Hello");
		myPhone2.func1();
	}
}

interface  PhoneInterface{//클래스와는 구분함
	public abstract void call();
	void message(String text);//public abstract void message();와 같음
}

class SomePhone implements PhoneInterface{
	//메소드 지우면 에러.
	public void call(){
		System.out.println("띠리링 전화겁니다");
	}
	public void message(String text){
		System.out.println(text+" 라고 보냈어요");
	}
	public void func1(){
		System.out.println("func1실행");
	}

	
}

