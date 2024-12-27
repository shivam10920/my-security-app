package myCodePractice;



public class FindTheMissingNum {
	public int findNUm(int[] a) {
	int length = a.length+1;
	int sumOfNums = length*(length+1)/2;
	int arraySum=0;
	for(int n :a) {
		arraySum =arraySum+n;
	}
	
		return sumOfNums-arraySum;
				
	}
	public static void main(String[] args) {
		int[]a = {1,2,3,4,6};
		
		FindTheMissingNum n = new FindTheMissingNum();
		System.out.println(n.findNUm(a));;

	}

}
