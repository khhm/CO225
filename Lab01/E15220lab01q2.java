import java.util.Scanner;

public class E15220lab01q2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.printf("Enter the color: ");
        int x = keyboard.nextInt(); //Get the user input
        int y = keyboard.nextInt();
        int z = keyboard.nextInt();

        if((x>=0 && x<=255) && (y>=0 && y<=255) && (z>=0 && z<=255)){
        
           int complement_x = 255-x;
           int complement_y = 255-y; //Complement the colour
           int complement_z = 255-z;
        
           int difference_x = complement_x-x;
           int difference_y = complement_y-y; //Get the difference between original value and complement value
           int difference_z = complement_z-z;
        
           if(difference_x < 0)
               difference_x *= -1;
           if(difference_y < 0)
               difference_y *= -1; // If differences are negetive here they changed to positive
           if(difference_z < 0)
               difference_z *= -1;
        
           if(difference_x <= 32 && difference_y <= 32 && difference_z <= 32){     // Here check difference between original value and complement value is less or equal to 32
               complement_x = x+128; 
               complement_y = y+128;                                               // If difference less or equal to 32 here add 128 to original value
               complement_z = z+128;                                               
               if(complement_x > 255)                                              // If new value (x+128) larger than 255 in here reduse 128 from original value 
                  complement_x = x-128;
               if(complement_y > 255)      
                  complement_y = y-128;
               if(complement_z > 255)
                  complement_z = z-128;
           }
        

           System.out.println("The complement: "+complement_x+" "+complement_y+" "+complement_z);
        }else{
           System.out.println("Invalid Input");
        }
    }
    
}
