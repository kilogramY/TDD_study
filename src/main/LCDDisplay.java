package main;

public class LCDDisplay {
	public static String display(int number) {
		
		
		String[] firstLines  = {"._.","...","._.","._.","...","._.","._.","._.","._.","._.",};
		String[] secondLines = {"|.|","..|","._|","._|","|_|","|_.","|_.","..|","|_|","|_|",};
		String[] thirdLines  = {"|_|","..|","|_.","._|","..|","._|","|_|","..|","|_|","._|",};
		
		String firstLine="";
		String secondLine="";
		String thirdLine="";
		String result;
				
		do {
			int tempNum = number%10;
		
			firstLine = String.join("",firstLines[tempNum],firstLine);
			secondLine = String.join("",secondLines[tempNum],secondLine);
			thirdLine = String.join("",thirdLines[tempNum],thirdLine);
			
			number /= 10;
		} while (number != 0);
		
		
		/*if (number == 1 || number ==4) {
			firstLine = "...";
		} else firstLine = "._.";
		
		if (number == 0) {
			secondLine = "|.|";
		} else if (number == 1 || number == 7) {
			secondLine = "..|";
		} else if (number == 2 || number == 3) {
			secondLine = "._|";
		} else if (number == 4 || number == 8 || number == 9) {
			secondLine = "|_|"; 
		} else {
			secondLine = "|_.";
		}*/
		
		
		result = String.join("\n",firstLine,secondLine,thirdLine);
		return result;
	}
}
