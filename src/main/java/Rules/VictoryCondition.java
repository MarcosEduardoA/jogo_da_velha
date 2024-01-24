package Rules;

public class VictoryCondition {

	public boolean Victory(String[][] plays1, String[][] plays2) {
		
		for (int r = 0; r < plays1.length; r++) {
			for (int c = 0; c < plays1.length; c++) {
				
				// X
				if (plays1[0][0] == "X" && plays1[0][1] == "X" && plays1[0][2] == "X") { //Line 1
					System.out.println("Player1 ganhou!!!");
					return true;
				}
				else if (plays1[1][0] == "X" && plays1[1][1] == "X" && plays1[1][2] == "X") { // Line 2
					System.out.println("Player1 ganhou!!!");
					return true;
				}
				else if (plays1[2][0] == "X" && plays1[2][1] == "X" && plays1[2][2] == "X") { // Line 3
					System.out.println("Player1 ganhou!!!");
					return true;
				}
				
				if (plays1[0][0] == "X" && plays1[1][0] == "X" && plays1[2][0] == "X") { // Column 1
					System.out.println("Player1 ganhou!!!");
					return true;
				}
				else if (plays1[0][1] == "X" && plays1[1][1] == "X" && plays1[2][1] == "X") { // Column 2
					System.out.println("Player1 ganhou!!!");
					return true;
				}
				else if (plays1[0][2] == "X" && plays1[1][2] == "X" && plays1[2][2] == "X") { // Column 3
					System.out.println("Player1 ganhou!!!");
					return true;
				}
				if (plays1[0][0] == "X" && plays1[1][1] == "X" && plays1[2][2] == "X") { // Diagonal 1
					System.out.println("Player1 ganhou!!!");
					return true;
				}
				else if (plays1[2][0] == "X" && plays1[1][1] == "X" && plays1[0][2] == "X") { // Diagonal 2
					System.out.println("Player1 ganhou!!!");
					return true;
				}
				
				//Y
				if (plays2[0][0] == "Y" && plays2[0][1] == "Y" && plays2[0][2] == "Y") { //Line 1
					System.out.println("Player2 ganhou!!!");
					return true;
				}
				else if (plays2[1][0] == "Y" && plays2[1][1] == "Y" && plays2[1][2] == "Y") { // Line 2
					return true;
				}
				else if (plays2[2][0] == "Y" && plays2[2][1] == "Y" && plays2[2][2] == "Y") { // Line 3
					return true;
				}
				
				if (plays2[0][0] == "Y" && plays2[1][0] == "Y" && plays2[2][0] == "Y") { // Column 1
					return true;
				}
				else if (plays2[0][1] == "Y" && plays2[1][1] == "Y" && plays2[2][1] == "Y") { // Column 2
					return true;
				}
				else if (plays2[0][2] == "Y" && plays2[1][2] == "Y" && plays2[2][2] == "Y") { // Column 3
					return true;
				}
				if (plays2[0][0] == "Y" && plays2[1][1] == "Y" && plays2[2][2] == "Y") { // Diagonal 1
					return true;
				}
				else if (plays2[2][0] == "Y" && plays2[1][1] == "Y" && plays2[0][2] == "Y") { // Diagonal 2
					return true;
				}
				
			}
		}
		return false;
	}
	
}
