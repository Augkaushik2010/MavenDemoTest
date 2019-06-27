package firstLevelMethods;

public class mathsExamplesMethods {

	//Reverse a String method
		public String revString(String strToBeReversed) {
			String outString = "";
			int i;
			for(i=strToBeReversed.length()-1;i>=0;i--) {
				outString = outString + strToBeReversed.charAt(i);
			}
			return outString;
		}
		public String strCompare(String str1,String str2) {
			if(str1.toString()== str2.toString()){
				return "Strings are matched";
					
			}
			else {
				return "Strings not matched.";
			}
			
		}
		public String txtContains(String strText,String str1) {
			if(strText.contains(str1)) {
				return "'"+strText+"' contains '"+str1+"'";
			}
			else {
				return "'"+strText+"' Doesn't contains '"+str1+"'";
			}
		}
		
		public char[] retArrayOfChracters(String strToBeChanged) {
			
			char[] strToBeReturned;
			strToBeReturned = strToBeChanged.toCharArray();
			return strToBeReturned;
			
		}
		
		public String[] strSplitUsingDeLimiter(String strToBeSplit, String strRegex) {
			
			String[] strSplitString = strToBeSplit.split(strRegex);
			return strSplitString;
		}
		
		public int retBiggerNumberFromTheList(int[] intArray) {
			int i;
			int BiggerNum = 0;
			int k = 0;
			for(i=0;i<=intArray.length-1;i++) {
				int j = intArray[i];
				if(j>k) {
					BiggerNum = j;
					k = j;
				}
			}
			return BiggerNum;
		}
		
		public int retSmallerNumberFromTheList(int[] intArray) {
			int i;
			int SmallNum = intArray[0];
			for(i=1;i<=intArray.length-1;i++) 
			{
				int j = intArray[i];
				if(j<SmallNum) 
				{
					SmallNum = j;
				}
			}
			return SmallNum;
		}
		
		/*public void switchSample(String weekdayis) {
			switch(weekdayis) {
			case "Monday":
			System.out.println("Today is Monday.");
			break;
			case "Tuesday":
			System.out.println("Today is Tuesday");
			break;
			case "Wednesday":
			System.out.println("Today is Wednesday.");
			break;
			case "Thursday":
			System.out.println("Today is Thursday.");
			break;
			case "Friday":
			System.out.println("Today is Friday.");
			break;
			case "Saturday":
			System.out.println("Today is Saturday.");
			break;
			default:
			System.out.println("Today is Sunday");
			
			}
				
		}*/

}
