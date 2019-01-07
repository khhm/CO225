import java.util.Scanner;

public class E15220lab01q1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.printf("Enter a number: ");
        int x = keyboard.nextInt(); //getting user input

        String ans; //Variable make to store answer

        if(x > 999 && (x%5 ==0 && x%6 ==0 && x%18 !=0)){  //Here check whether input number is lager than 999,is divided by 5,6 or 18
            if(x%15 == 0){
                ans = " is special, big, weird, scary.";
            }else{
                ans = " is scary, but not special.";
            }
        }else if(x <= 999 && (x%5 ==0 && x%6 ==0 && x%18 !=0)){
            if(x%15 == 0){
                ans = " is special, weird, scary, but not big.";
            }else{
                ans = " is weird, scary, but not big.";
            }
        }else if(x > 999 && (x%5 !=0 || x%6 !=0 || x%18 ==0)){
            if(x%15 == 0){
                ans = " is special, big, scary, but not weird.";
            }else{
                ans = " is big, scary, but not weird.";
            }
        }else{
            if(x%15 == 0){
                ans = " is special, but not scary.";
            }else{
                ans = " is not special, scary.";
            }
        }

        System.out.println(x+ans); //Printin the answer
    }
    
}
