package twoDarray;

public class DaigonalValueSameOrNot {
	public static void main(String[] args) {
		int [][]arr = {{1,0,0},{0,1,0},{1,1,1}};
		
		boolean flag = false;
		for(int i=1; i<arr.length; i++) {
			for(int j=1; j<arr[i].length; j++) {
				if(i==j) {
					if(arr[i][j]==arr[i-1][j-1]) {
						flag = true;
					}
					else {
						flag = false;
						break;
						}
				}
				
			}
          if(flag==false) break;
		}
		System.out.println(flag);
	}

}
