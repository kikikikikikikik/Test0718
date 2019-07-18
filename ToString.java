import java.util.Arrays;
public class ToString{
	public static void main(String[] args){
		int[] a={12,34,56,89};
		System.out.println(tostring(a));
	}
	public static String tostring(int[] a){
		String s="[";
		for(int i=0;i<a.length;i++){
			s=s+" "+a[i];
		}
		return s+"]";
	}
}