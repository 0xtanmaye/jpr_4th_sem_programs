public class ArrayReference {
	public static void main(String[] args) {
		int array[] = new int[7];
		for(int i=0;i<array.length;i++) {
		       	array[i]=i+1;	
			System.out.println(array[i]); 
		}
		int arrray[] = array;
		if(arrray == array)
			System.out.println("They both are pointing to the same address");

		for(int i : arrray) {
			System.out.println(i); 
		} 
	}
}
