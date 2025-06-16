// Java day 1
import java.util.Scanner; // import java package to scan keyboard inputs
// create class for this java file :)
public class MyGoatJavaTestOfIO{
    //Create a new no return function that getio and can be called from main method
    public void GetIO(){
        try {
            // create a new scanner variable called input and let it be input from keyboard (sys.in)
            Scanner input = new Scanner(System.in);
            // print message to get name = input ("what your name boi")
            System.out.print("\nwhat your name boi??? ");
            // create a new string variable named name and assign it to read input variable of whole line (nextline)
            String name = input.nextLine();
            // print this + name
            System.out.println("Wassup my g " + name);
        }
        catch(Exception e){
         System.out.print("ERROR EWWWWWWWWWWWW");
        }
    }
    // Main method to call and create objects
    public static void main(String[] args){
        // basic print statement
        System.out.print("Ts pmo fr -_-");
        // create new object of method in class mygoat == 'GETIO = MyGoatJavaTestofIO()'
        MyGoatJavaTestOfIO GetIO = new MyGoatJavaTestOfIO();
        // call da object :)
        GetIO.GetIO();
    }
}