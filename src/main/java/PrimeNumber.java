
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String k ="";
		for(int i =2; i<100;i++){
			int cot = 0;
			for(int y = i; y>=1;y--){
			if(i%y == 0)
				cot+=1;
				
			}
			if(cot==2)
				k+=i +" ";
		}
		System.out.println("prime number "+k);
		System.out.println("prime number "+k.split("\\s").length);
	}

}
