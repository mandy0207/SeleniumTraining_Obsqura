package Demo;

public class StringManipulation {

	public static void main(String[] args) {
		 String str1 = "Selected Color : Yellow";
		 
		//System.out.println(str1.substring(17));
		
		String[] output = str1.split(": ");
		System.out.println(output[0]);
		System.out.println(output[1]);

	}

}
