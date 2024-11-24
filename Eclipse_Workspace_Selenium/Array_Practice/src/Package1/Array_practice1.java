package Package1;

public class Array_practice1 {
  public static void main(String[] args) {
	int a[][] = {
			{1,2,3},
			{11,22,33},
			{111,222,333},
			{1111,2222,3333}
	};
	for(int i=0; i<4; i++) {
		for(int j=0; j<3;j++) {  //row
			System.out.print(a[i][j]); //column
		}
		System.out.println();
	}
}
}
