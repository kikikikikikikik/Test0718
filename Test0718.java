public class Test0718{
	public static void main(String[] args){
		int[] a={10,20};
		swap(a);
		System.out.println(a[0]+" "+a[1]);
	}
	public static void swap(int []a){
		int c;
		c=a[0];
		a[0]=a[1];
		a[1]=c;
	}
}