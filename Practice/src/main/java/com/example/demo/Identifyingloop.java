package com.example.demo;

import java.util.HashSet;
import java.util.Set;

public class Identifyingloop {

	public static void main(String[] args) {
		    Node n1 = new Node(34);
	        Node n2 = new Node(25);
	        Node n3 = new Node(31);
	        Node n4 = new Node(56);
	        Node n5 = new Node(45);
	        
	        
	        n1.next=n2;
	        n2.next=n3;
	        n3.next=n4;
	        n4.next=n5;
	        n5.next=n3;
	        
	        System.out.println("Is loop is identified :" +identifyLoop(n1));
	}

	private static Boolean identifyLoop(Node head) {
		Set<Node> table=new HashSet<>();
		while(head!=null)
		{
			if(table.contains(head))
			{
				return Boolean.TRUE;
			}
			
			table.add(head);
			head=head.next;
		}
		return Boolean.FALSE;
	}
}
