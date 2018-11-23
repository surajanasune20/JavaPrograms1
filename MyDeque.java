package com.datastructureprograms;

public class MyDeque {

	int cap=0,rear=-1,front=-1;
	Object obj1[];

public MyDeque(int scap) 
	{
		this.cap=scap;
		obj1=new Object[cap];
		front=cap-1;
		
	}

boolean addRear(Object data)
{
	if(rear==cap-1)
	{
		System.out.println("deque overflow");
		return true;
	}
	
	obj1[++rear]=data;
	return true;
}

boolean addFront(Object data)
{
	
	if(front==rear)
	{
		System.out.println("dequeue");
		return true;
	}
	
		obj1[front--]=data;
	return true;
}


public Object removeRear() {
	
	if(rear==-1)
	{
		System.out.println("no elemnets");
	return null;
	}
	
	return obj1[rear--];
}

public Object removeFront() {
	
	if(front==cap)
	{
		System.out.println("no elements");
	return null;
	}
	
	
	return obj1[++front];
}
}
