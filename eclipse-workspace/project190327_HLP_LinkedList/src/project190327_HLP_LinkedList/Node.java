package project190327_HLP_LinkedList;

public class Node {
	   private Integer element;
	   private Node next;
	   
	   public Node() {
		   element = null;
		   next=null;
	   }
	   
	   public Node(int e) {
	      element=e;
	      next=null;
	   }
	   
	   public int getElement() {
	      return element;
	   }
	   
	   public Node getNext() {
	      return this.next;
	   }
	   
	   public void setNext(Node node) {
	      next=node;
	   }
	}