package arrayexample;

//sum of array
public class ArrayAddition {
	public void m1() {
		int sum=0;
		int[] x= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<x.length;i++) {
		System.out.println("array is:"+x[i]);
		}
		
		//using for each loop
		for(int arrayelement:x) {
			System.out.print(arrayelement+" ");
			sum= sum + arrayelement;
		}
		System.out.println("\nsum is:"+sum);
	}
		
	public static void main(String[] args) {
		ArrayAddition ad=new ArrayAddition();
		ad.m1();
		
	}

}
