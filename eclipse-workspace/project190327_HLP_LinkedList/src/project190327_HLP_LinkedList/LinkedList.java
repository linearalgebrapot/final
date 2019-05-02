package project190327_HLP_LinkedList;

public class LinkedList {
	   
	private Node head=new Node();
	   private Node tail=new Node();
	   private int size=0;
	   public int size() {
	      return size;
	   }
	   
	   Node node(int idx) {
	      Node x=head;
	      for (int i=0;i<idx;i++) {
	         x=x.getNext();
	      }
	      return x;
	   }
	   
	   public void addFirst(int ele) {
	      Node newNode= new Node(ele);
	      if (head.getNext()==null) {
	         head.setNext(newNode);
	         newNode.setNext(tail);
	      }else {
	         newNode.setNext(head.getNext());
	         head.setNext(newNode);
	      }
	      size++;
	   }
	   
	   public void insert(int e, int idx) {
	      if (idx==0) {
	         addFirst(e);
	         return;
	      }
	      Node temp=node(idx);
	      Node todoInserted=new Node(e);
	      node(idx-1).setNext(todoInserted);
	      todoInserted.setNext(temp);
	   }
	   
	   public void addLast(int e) {
	      insert(e,size-1);
	   }
	   
	   public String toString() {
	      if (size==0) {
	         return "[]";
	      }
	      String str="[";
	      Node temp=head;
	      while(temp.getNext()!=tail) {
	         temp=temp.getNext();
	         str+=String.valueOf(temp.getElement())+",";
	      }
	      str+=String.valueOf(temp.getElement());
	      return str+"]";
	   }
	   
	   public void remove(int idx) {
	      if (idx==0) {
	         head.setNext(tail);
	      }
	      Node temp=node(idx+1);
	      node(idx-1).setNext(temp);
	   }
	   
	   public int get(int idx) {
	      return node(idx).getElement();
	   }
	}
