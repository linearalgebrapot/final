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

interface  PhoneInterface{//Ŭ�����ʹ� ������
	public abstract void call();
	void message(String text);//public abstract void message();�� ����
}

class SomePhone implements PhoneInterface{
	//�޼ҵ� ����� ����.
	public void call(){
		System.out.println("�츮�� ��ȭ�̴ϴ�");
	}
	public void message(String text){
		System.out.println(text+" ��� ���¾��");
	}
	public void func1(){
		System.out.println("func1����");
	}

	
}

