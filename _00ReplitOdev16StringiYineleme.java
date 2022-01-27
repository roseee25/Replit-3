package _00Replit;

public class _00ReplitOdev16StringiYineleme {

		public static void main(String[] args) {
	 
		
		String cumle = "Javaisalsoesy";
		
		String kova="";
		
		for (int i = 0; i < cumle.length();i++ ) {
			
			for (int j= i + 1 ; j < cumle.length(); j++) {
				
				if (cumle.substring(i, i+1).equals(cumle.substring(j, j+1))
						
				&& !kova.contains(cumle.substring(i, i+1))) {
					
					kova += cumle.substring(i, i +1 ) + " " ;
				}
				 
				
			}
		}
		System.out.println(kova);
}
}