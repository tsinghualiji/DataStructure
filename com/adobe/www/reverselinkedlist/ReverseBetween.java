package com.adobe.www.reverselinkedlist;

public class ReverseBetween {

	public ListNode reverseBetween(ListNode head, int m, int n){
		
		ListNode dumy = new ListNode(0);
		dumy.next = head;
		ListNode preM = dumy;
		ListNode prev = dumy;
		ListNode curr = dumy;
		for(int i = 0; i < n; i++){
			if(i < m){
				preM = preM.next;
			}else if(i == m){
				prev = preM.next;
				curr = prev.next;
			}else{
				prev.next = curr.next;
				curr.next = preM.next;
				preM.next = curr;
				curr = prev.next;
			}
		}
		return dumy.next;
	}
	
	public static void main(String[] args){
		
		ListNode v1 = new ListNode(1);
		ListNode v2 = new ListNode(2);
		ListNode v3 = new ListNode(3);
		ListNode v4 = new ListNode(4);
		ListNode v5 = new ListNode(5);
		ListNode v6 = new ListNode(6);
		v1.next = v2;
		v2.next = v3;
		v3.next = v4;
		v4.next = v5;
		v5.next = v6;
	}
}
