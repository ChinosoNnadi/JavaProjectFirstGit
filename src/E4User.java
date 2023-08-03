import java.util.Scanner;

public class E4User {
    public static void main(String[] args) {
        System.out.println("Please Enter your name");
        //creating the object of the Scanner class
        //so that we can use reuse the logic from this class
        // which is already written for us by java developers
        Scanner input =new Scanner(System.in);
        //taking an input from the user and storing in int a name
        //variable
        String name = input.nextLine();
        if(name.equals("Chinoso Nnadi")){
            System.out.println("I'm your husband");
        }else{
            System.out.println("I don't know you");
        }
        //System.out.println("Hello "+name);

    }
}
