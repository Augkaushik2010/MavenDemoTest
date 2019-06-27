package firstLevel;

import org.testng.annotations.Test;

import firstLevelMethods.mathsExamplesMethods;
public class mathsExamplesTest {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		mathsExamplesMethods obj1=new mathsExamplesMethods();
		@Test
		public void whatyouwillgive() {
		
			//printing reversed string
			String reversedString = obj1.revString("RAJESH");
			System.out.println(reversedString);
		
		
		//printing strings are matched or not
		System.out.println(obj1.strCompare("rajesh", "rajesh"));
		//Text contains string
		System.out.println(obj1.txtContains("My company name is WellsFargo", "company"));
		//Array elements usage
		char[] charsArrayRetrned = obj1.retArrayOfChracters("RAJESH");
		System.out.println(charsArrayRetrned[2]);
		//string split using de-limiter
		String[] strSplitted = obj1.strSplitUsingDeLimiter("This is ,an awesome, project", ",");
		System.out.println(strSplitted[0]);
		System.out.println(strSplitted[1]);
		//find out bigger element in the array
		int strArray[] = {10,20,30,15,5,60,30,4};
		int BiggerNum = obj1.retBiggerNumberFromTheList(strArray);
		System.out.println(BiggerNum);
		//find out small number in the array
		int SmallerNum = obj1.retSmallerNumberFromTheList(strArray);
		System.out.println(SmallerNum);
		//using switch statements 
		//obj1.switchSample("Tuesday");

	}
}
//}
