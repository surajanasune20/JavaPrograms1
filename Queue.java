package com.datastructureprograms;

import com.utility.Utility;

public class Queue {
	int front, rear, size, person;
	int[] arr;

	public Queue(int front, int rear) {
		front = 0;
		this.rear = rear;
		this.size = size;
		this.person = person;
		arr = new int[size];
		System.out.println("Queue is ready...");

	}

	public int getSizeOfQueue() {

		return rear - front;
	}

	public void deQueue() {
		if (front == rear) {
			System.out.println("Queue is empty");
		} else {
			front += 1;
		}
	}

	public void enQueue() {
		
		if(rear==size)
		{
			System.out.println("Queue is full");
		}
		else
		{
			rear=rear+1;
		}
	}

}
