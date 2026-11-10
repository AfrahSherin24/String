package FirstProgram;

public class String8 {

	public static void main(String[] args) {
		String str = "Java is easy";
		int start =0;
		
		for(int i=0; i<=str.length(); i++) {
			
			if(i == str.length() || str.charAt(i) == ' ') {
				for(int j = i-1; j>=start; j--) {
					System.out.println(str.charAt(j));
				}
				System.out.println(" ");
				start =i+1;
			}
		}
		

	}

}
