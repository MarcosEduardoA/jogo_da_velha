package Estrutura;

import java.util.Scanner;

import Rules.VictoryCondition;

public class Table {
	
	private static Integer rows = 3; 
	private static Integer columns = 3;
	private Integer[][] positions = {{1,2,3}, {4,5,6}, {7,8,9} };
	private String[][] plays1 = new String[rows][columns];
	private String[][] plays2 = new String[rows][columns];
	
	public Table() {
	}
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Player1 - X");
		System.out.println("Player2 - Y");
		VictoryCondition victoryCondition = new VictoryCondition();
		while (true) {
	
					for (int r = 0; r < positions.length; r++) {
						for (int c = 0; c < positions.length; c++) {
							if (plays1[r][c] == "X") {
								System.out.print(plays1[r][c] + " ");
							}
							else if (plays2[r][c] == "Y") {
								System.out.print(plays2[r][c] + " ");
							}
							else {
								System.out.print(positions[r][c] + " ");
							}
							/*System.out.println(plays1[r][c]);*/
							}
						System.out.println();
						}
					
					if (victoryCondition.Victory(plays1, plays2)) {
						break;
					}
					
					System.out.print("Escolha a posição do X(1a9): ");
					scanX(sc.nextInt());
					System.out.print("Escolha a posição do Y(1a9): ");
					scanY(sc.nextInt());
					
		}
		sc.close();
	}
	
	public void scanX(Integer x) {
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < columns; c++) {
				if (positions[r][c] == x) {
					plays1[r][c] = "X";
				}
			}
		}
	}
	
	public void scanY(Integer y) {
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < columns; c++) {
				if (positions[r][c] == y) {
					plays2[r][c] = "Y";
				}
			}
		}
	}
}
