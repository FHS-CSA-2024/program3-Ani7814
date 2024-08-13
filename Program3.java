//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
public class program3{
    public static void main(String[] args){
        //Declare Variable
        int length = 0;
        int width = 0;
        int area = 0;
        int perimeter = 0;
        //Create Scanner
        Scanner numScanner = new Scanner(System.in);
        
        //Ask for user Input
        System.out.println("Enter the length: ");
        length = numScanner.nextInt();
        System.out.println("Enter the width: ");
        width = numScanner.nextInt();
    
        //Calculate
        area = length*width;
        perimeter = 2*(length+width);
        //Print results
        System.out.println("The length is "+length);
        System.out.println("The width is "+width);
        System.out.println("The area is "+area);
        System.out.println("The perimeter is "+perimeter);
    }
}

//Paste console output below:
/*
Enter the length: 
15
Enter the width: 
4
The length is 15
The width is 4
The area is 60
The perimeter is 38

*/
