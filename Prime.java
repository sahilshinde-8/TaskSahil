import java.util.Scanner;
class Prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no ");
        int number = sc.nextInt();
        int temp = 0;
        for(int i = 2 ; i <= number - 1; i++){
            if(number % i == 0){
              temp = temp + 1;
            }
        }
        if(temp > 1){
            System.out.println("Composite number");
        }
        else{
            System.out.println("Prime number");
        }
    }
    
}
