package twoDarray;

public class SumOfTwoEqualThird {
	public static void main(String[] args) {
		int [][]arr = {{4,5,9},{2,3,5},{3,4,7}};
		
		boolean abc = false;
		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			for(int j=0; j<arr[i].length; j++) {
				if(j!=arr[i].length-1) {
					sum = sum + arr[i][j];
				}
				else if(j==arr[i].length-1) {
					if(sum==arr[i][j]) {
						abc = true;
					}
					else {
						abc=false;
						break;
					}
				}
			}
			if(abc==false) break;
		}
		System.out.println(abc);
	}
}
