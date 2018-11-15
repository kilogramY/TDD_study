package main;

public class RomanNumConvert_Alex {
	public static String convert(int number) {
		int[] ArrayN = {1000, 500, 100, 50, 10, 5, 1};
		char[] ArrayS = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
		int num = number;
		String output="";

		if (num >= ArrayN[0] * 5)
		{
		       num = 0;
		       output = "Number is too big";
		}

		for(int i = 0; i < ArrayN.length; i++) {
			if (i%2 ==0 ){
		          if (i > 0 && num >= ArrayN[i] * 4) {
		                     output += ArrayS[i];
		                     output += ArrayS[i - 1];
		                     num -= ArrayN[i] * 4;
		          }
		          while (num >= ArrayN[i]) {
		                  output += ArrayS[i];
		                  num = num - ArrayN[i];
		          }
		    } else {
		         if (num >= ArrayN[i] + (ArrayN[i+1] * 4)) {
		                output += ArrayS[i + 1];
		                output += ArrayS[i - 1];
		                num -= (ArrayN[i] + (ArrayN[i+1] * 4));
		            } else {
		            	if (num >= ArrayN[i]) {
			               output += ArrayS[i];
			               num -= ArrayN[i];
			               while( num >= ArrayN[i] + ArrayN[i + 1]){
			                          output += ArrayS[i + 1];
			                          num -= ArrayN[i + 1];
			              }
		            	}
		            }
		      }
		}

		return output;
	}
}
