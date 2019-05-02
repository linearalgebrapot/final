package project190327_HLP_LinkedList;

public class Run {

	   public static void main(String[] args) {
	      LinkedList list = new LinkedList();
	      System.out.println(list.size());
	      System.out.print("init list : \t\t");
	      list.addFirst(5);
	      list.addFirst(14);
	      list.addFirst(55);
	      list.addLast(99);
	      list.addLast(105);
	      System.out.println(list.toString());
	      System.out.println(list.size());
	      System.out.print("remove(2) : \t\t");
	      list.remove(2);
	      System.out.println(list.toString());
	      System.out.print("insert(44, 2) : \t");
	      list.insert(44, 2);
	      System.out.println(list.toString());
	      System.out.print("insert(6, 5) : \t");
	      list.insert(6, 5);
	      System.out.println(list.toString());
	      System.out.print("remove(0) : \t\t");
	      list.remove(0);
	      System.out.println(list.toString());
	      System.out.print("remove(4) : \t\t");
	      list.remove(4);
	      System.out.println(list.toString());
	      System.out.print("insert(1, 0) : \t");
	      list.insert(1, 0);
	   }

	}