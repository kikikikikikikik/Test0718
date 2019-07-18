public class Max{
	public static void main(String[] args){
		int[] a=new int[]{2,4,6,8,1,9,3,5,7,0};
		System.out.println("max="+max(a));
	}
	public static int max(int[] a){
			int max=a[0];
		for(int i=0;i<a.length-1;i++){
			if(max<a[i+1]){
				max=a[i+1];
			}
		}
		return max;
	}
}