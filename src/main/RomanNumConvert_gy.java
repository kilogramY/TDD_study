package main;

public class RomanNumConvert_gy {
	public static String convert(int number) {
		
		/*1000:M
		 * 500:D
		 * 100:C
		 *  50:L
		 *  10:X
		 *   5:V
		 *   1:I		*/
		
		int num = number;
		String output="";
		
		int theNums[] = {1000,500,100,50,10,5,1};
		char theChars[] = {'M','D','C','L','X','V','I'};
		
		for (int i=0 ; i<theNums.length;i+=2) {
			int quot=num/theNums[i];
			System.out.println(theNums[i]+":"+quot);
			
			if (quot == 9) {
				output += theChars[i];
				output += theChars[i-2];
			} else if (quot >= 5) {
				int remainder=quot%5;
				output += theChars[i-1];
				for(int j=0; j<remainder;j++) {
					output += theChars[i];
				}
			} else if (quot == 4) {
				output += theChars[i];
				output += theChars[i-1];
			} else if (quot > 0) {
				for (int k=0 ; k<quot ; k++) {
					output += theChars[i];
				}
			}
			
			num=num-(theNums[i]*quot);
			System.out.println(num);
			if (num==0) break;
		}
		
		return output;
	}
}
