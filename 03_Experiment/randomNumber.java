//PROGRAM 3: Generate a random number upto 100 and print whether it is prime or not.

public class randomNumber {
    public static void main(String[] args){
        //generating a random number
        int randomNum = (int) (Math.random()*100)+1;
        System.out.println("Generated random number:=> "+randomNum);

        //checking if it's prime or not
        boolean flag = true;
        for(int i=2; i<randomNum; i++){
            if(randomNum % 2 == 0){
                flag = false;
                break;
            }
        }
        if(flag==false){
            System.out.println("Number is NOT PRIME..");
        }else{
            System.out.println("Number is PRIME..");
        }
    }
}
