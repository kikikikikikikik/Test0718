public class Div{
	public static void main(String[] args){
		System.out.println("最大公约数为"+div(36,12));
	}
	public static int div(int a,int b){
		if(a<b){
			a=a^b;
			b=a^b;
			a=a^b;
		}
		while(a%b != 0){
			int temp=a%b;
			a=b;
			b=temp;
		}
		return b;
	}
}