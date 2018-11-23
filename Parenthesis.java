package com.datastructureprograms;

import java.util.Stack;

import com.utility.Utility;

public class Parenthesis {
	public static void main(String[] args) {
		System.out.println("Enter max size: ");
		int size = Utility.getInt();

		/* Creating Stack */
		StackClass stack = new StackClass(size);
		System.out.println("Enter expression: ");
		String expression = Utility.getString(); // take input string
		System.out.println("Expression is= " + expression);

		int length = expression.length();// Calculate length of string
		System.out.println("Result : ");

		for (int i = 0; i < length; i++) {
			char ch = expression.charAt(i);

			if (ch == '(') {
				stack.push(i); // found '(' then push into stack
			} else if (ch == ')') {
				stack.pop(i);// found ')' then pop from stack
			}
		}
		if (!stack.isEmpty()) // if stack is empty it means expression is balanced
		{
			System.out.println("Unbalenced expression");
		} else {
			System.out.println("Balenced expression");
		}

	}
}
