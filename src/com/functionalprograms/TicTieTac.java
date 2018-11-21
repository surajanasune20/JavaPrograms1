package com.functionalprograms;

import java.util.Random;

import com.utility.Utility;

/**
 * Write a Program to play a Cross Game or Tic-Tac-Toe Game. Player 1 is the
 * Computer and the Player 2 is the user. Player 1 take Random Cell that is the
 * Column and Row.
 * 
 * @author bridgeit
 *
 */
public class TicTieTac {

	public static void main(String[] args) {

		char arr[][] = new char[3][3];
		Utility.fill('C', arr);
		Utility.show(arr);
		int count = 9;
		Random r = new Random();
		boolean flag = true;
		while (count > 0) {
			if (flag) {
				boolean flag2 = true;
				while (flag2) {
					int x = r.nextInt(3);
					int y = r.nextInt(3);
					if (arr[x][y] == 'C') {
						flag2 = false;
						arr[x][y] = 'X';
					}

				}
				System.out.println();
				Utility.show(arr);
				boolean flag3 = Utility.winCheck('X', arr);
				if (flag3) {
					System.out.println("Computer Win's");
					break;
				}
				count--;
				flag = !flag;
			} else {
				System.out.println("User Chance");
				System.out.println("Enter Row and Column Between 1 and 3");
				int x = Utility.getInt();
				int y = Utility.getInt();

				if (arr[x - 1][y - 1] == 'C') {
					arr[x - 1][y - 1] = 'O';
				} else {
					while (arr[x - 1][y - 1] != 'C') {
						System.out.println("Already Occupied Take Another Chance");
						x = Utility.getInt();
						y = Utility.getInt();
					}
					arr[x - 1][y - 1] = 'O';
				}
				boolean flag3 = Utility.winCheck('O', arr);

				if (flag3) {
					System.out.println("User Win's");
					break;
				}
				flag = !flag;
				count--;
			}
		}
		if (count < 0) {
			System.out.println("Match is Tie");
		}

	}

}
