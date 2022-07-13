package linkedlist;

import java.util.Scanner;

class DoubleNode{
	Node<Integer> head;
	Node<Integer> tail;
	DoubleNode(){
		
	}
	DoubleNode(){
		this.head=head;
		this.tail=tail;
		
	}
}

public class LinkedListUSe {
	
//	public static Node<Integer> createLinkedList() {
//		Node<Integer> n1= new Node(10);
//		Node<Integer> n2= new Node(20);
//		Node<Integer> n3= new Node(30);
//		Node<Integer> n4= new Node(40);
//		n1.next=n2;
//		n2.next=n3;
//		n3.next=n4;
//		
//		return n1;
//	}
	
	public static Node<Integer> delete(Node<Integer> head ,int pos) {
		
		if(head== null) return head;
		if(pos==0) return head.next;
		int count =0;
		Node<Integer> currHead=head;
		while(currHead!=null && count<(pos-1)) {
			currHead=currHead.next;
			count++;
		}
		if(currHead==null || currHead.next==null) return head;
		currHead.next=currHead.next.next;
		return head;
		
	}
	
	
	public static void increment(Node<Integer> head) {
		while(head!=null) {
		head.data++;
		head=head.next;
		}
		
	}
	public static int length(Node<Integer> head) {
		int l=0;
		while(head!=null) {
			l++;
			head=head.next;
			
		}
		return l;
	}
	
	public static void printIth(Node<Integer> head, int i ) {
		int pos=0;
		Node<Integer> temp = head;
		while(temp!=null &&pos<i) {
			temp=temp.next;
			pos=pos+1;
		}
		if(temp!=null) System.out.println(temp.data);
	}
	
	
	public static Node<Integer> takeInput(){
		Scanner s= new Scanner(System.in);
		int data=s.nextInt();
		Node<Integer> head = null , tail=null;
		while(data!=-1) {
			Node<Integer> currentNode=new Node<Integer>(data);
			if(head==null) {
				head=currentNode;
				tail=head;
			}
			else {
//				Node<Integer> tail=head;
//				while(tail.next!=null) {
//					tail=tail.next;
//				}
				tail.next=currentNode;
				tail=tail.next;
			}
			data = s.nextInt();
			
			
		}
		return head;
	}
	
	
	public static Node<Integer> insert(Node<Integer> head, int elem , int pos) {
		Node<Integer> nodeTobeInserted=new Node<Integer>(elem);
		if(pos==0) {
			nodeTobeInserted.next=head;
//			head=nodeTobeInserted;
			return nodeTobeInserted;
		}else {
	int count=0;
	Node<Integer> prev=head;
	while(count<pos-1 && prev!=null) {
		count++;
		prev=prev.next;
	}
	if(prev!=null) {
	nodeTobeInserted.next=prev.next;

	prev.next=nodeTobeInserted;
	} 
		
		
	}
//		while(head!=null) {
//			System.out.println(head.data);
//			head=head.next;
//		}
		return head;
	}
	public static Node<Integer> deleteR(Node<Integer> head, int pos){
		if(head==null) return head;
		if(pos==0) return head.next;
		Node<Integer> smallHead=deleteR(head.next,pos-1);
		head.next=smallHead;
		return head;
	}
	
	public static void printR(Node<Integer> head) {
		if(head==null) return;
		
	
		System.out.print(head.data + " ");
		printR(head.next);
	}
	
	public static void RprintR(Node<Integer> head) {
		if(head==null) return;
		RprintR(head.next);
		System.out.print(head.data + " ");
	}
	
	public static Node<Integer> insertR(Node<Integer> head, int elem ,int pos){
		
		if(head==null && pos>0) return head ;
		
		if(pos==0) {
			Node<Integer> newNode= new Node<>(elem);
			newNode.next=head;
			return newNode	;
			}
		else {
			Node<Integer> smallerHead=insertR(head.next, elem , pos-1);
			head.next=smallerHead;
			return head;
		}
	}
	
	
	public static Node<Integer> reverseR(Node<Integer> head){
		if(head==null || head.next==null) return head;
		Node<Integer> smallHead=reverseR(head.next);
		Node<Integer> tail=smallHead;
		while(tail.next!=null) tail=tail.next;
		tail.next=head;
		head.next=null;
		return smallHead;
		
	}
	
	public static DoubleNode reverseRBetter(Node<Integer> head) {
		DoubleNode ans;
		if(head==null||head.next==null) {
			ans=new DoubleNode();
			ans.head=head;
			ans.tail=head;
			return ans;
		}
		
		DoubleNode smallans=reverseRBetter(head.next);
		smallans.tail.next=head;
		head.next=null;
		ans=new DoubleNode();
		ans.head=smallans.head;
		ans.tail=head;
		return ans;
	}
	
	
	public static Node<Integer> reverseRBest(Node<Integer> head){
		if(head==null || head.next==null) return head;
		Node<Integer> smallHead=reverseRBest(head.next);
		Node<Integer> reversedTail=head.next;
		reversedTail.next=head;
		head.next=null;
		return smallHead;
		
	}
	
	
	
	public static Node<Integer> midpoint(Node<Integer> head){
		Node<Integer> slow=head, fast=head;
		while(fast.next!=null && fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			
		}
		return slow;
	}
	
	
	public static Node<Integer> merge(Node<Integer> head1,Node<Integer> head2){
		if(head1==null) return head2;
		if(head2==null) return head1;
		Node<Integer> newHead=null,newTail=null;
		
		while(head1!=null && head2!=null) {
		if(head1.data<head2.data) {
			newHead=head1;
			newTail=head1;
			head1=head1.next;
		}else {
			newHead=head2;
			newTail=head2;
			head2=head2.next;
		}
	}
		if(head1!=null) newTail.next=head1;
		if(head2!=null) newTail.next=head2;
		return newHead;
	}
	
	
	public static Node<Integer> mergeSort(Node<Integer> head){
		if(head==null || head.next==null) return head;
		Node<Integer> mid=midpoint(head);
		Node<Integer> h1=head;
		Node<Integer> h2=mid.next;
		mid.next=null;
		h1=mergeSort(h1);
		h2=mergeSort(h2);
		Node<Integer> finalHead=merge(h1,h2);
		return finalHead;
				
		
	}
	
	
	
	public static void main(String[] args) {
//
		Node<Integer> head=takeInput();  //createLinkedList();
//		head=insert(head,98,0);
//		delete(head,3);
//		increment(head);
//		System.out.println(length(head));
//		printIth(head,2);
//		while(head!=null) {
//			System.out.println(head.data);
//			head=head.next;
//		}
//		head=insertR(head, 20 , 5);
//		head=deleteR(head,4);
//		head=reverseR(head);
//		printR(head);
//		DoubleNode ans=reverseRBetter(head);
//		printR(ans.head);
		Node<Integer> mid=midpoint(head);
		System.out.println(mid.data);
  
	}

}
