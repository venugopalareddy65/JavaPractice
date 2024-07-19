package day2lab3;

public class Triangle {
	public static void main(String[] args) {
		
		int angle1 = 60, angle2 = 60, angle3 = 60;//here we cane give 3 angles of tingle
		
		int sumOfAngles = angle1 + angle2 + angle3;//here adding three angles takes place
		
		//checking triangle angles sum property
		if (sumOfAngles == 180) {
			System.out.println("The given Angles forms Triangle");
		}
                 else {
			System.out.println("The given Angles not form Triangle");

		}
	}

}
