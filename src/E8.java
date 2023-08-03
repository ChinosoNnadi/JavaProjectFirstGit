import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your Name");
        String name=scanner.next();
        if(name.equals("Cyril")){
            System.out.println("Senior in the bootCamp");
        } else if (name.equals("Modestus")) {
            System.out.println("I live in England");
        } else if (name.equals("Devon")) {
            System.out.println("I am friendly");
        } else if (name.equals("Millz")) {
            System.out.println("Doctor's appointment");
        } else if (name.equals("Chidera")) {
            System.out.println("She's my wife");
        }
    }
}
