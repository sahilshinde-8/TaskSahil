class Fibonacci{
	public static void main(String args[]){
		int firstnum = 0, secondnum = 1, thirdnum, count = 11;
		System.out.print( firstnum  + " " + secondnum);
		
		for(int i = 2; i < count; i++){
		thirdnum = firstnum + secondnum;
		System.out.print(" " + thirdnum);
		firstnum = secondnum;
		secondnum = thirdnum;
		}
		}
		}