public class Bubble{
	public static void main(String[] args){
		int[] a=new int[]{1,23,46,32,68,79,9,12,67};
		int [] b=bubble(a);
		for(int i=0;i<b.length;i++){
			System.out.print(b[i]+" ");
		}
	}
	public static int[] bubble(int[] a){
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}
}