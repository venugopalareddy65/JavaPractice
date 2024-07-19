package day2lab1;

public class SimpleInterest {
	//This program helps to calculate simple interest
		public static void main(String[] args) {

			double principle = 100000;// this is the principle amount
			double rateOfIntrest = 24;// this is rate of interest for one year
			float timeDuration = 1.5f;// this is the time duration which was took by borrower.
			
			// this is formula to calculating  simple interest
			double prod = principle * timeDuration * rateOfIntrest;
			double intrest = prod / 100;
			
			//this is interest printing part
			System.out.println("Intrest is:"+intrest);
			
			//this is total amount printing part along with interest 
					System.out.println("Total amount is:"+intrest+principle);
			
		}
}
