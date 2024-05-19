package Javaprograms;

public class primenumbers {
    public static void main(String[] args){
        int limt=100;
        int sum=0;
        int even=0;


        for(int i=1;i<=limt;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                     count++;

                }
            }
            if(count==2){
                System.out.println(i+" : number is prime");
                sum=sum+i;



            }

        }

        System.out.println(sum +" : is the sum of all prime numbers");






    }
}
