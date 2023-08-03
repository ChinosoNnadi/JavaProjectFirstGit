public class T3 {
    public static void main(String[] args) {
        int num1=50, num2=40, num3=90;
        int largeNum=190;

        if(largeNum==190){
            System.out.println("Largest Number");
            if(num1==90){
                System.out.println("First Number");
            }else{
                System.out.println("Not the First Number");
            }if(num2==40){
                System.out.println("Second Number");
            }else{
                System.out.println("Unavailable Second Number");
            }if(num3==100){
                System.out.println("Third Number");
            }else{
                System.out.println("You can't find Third Number");
            }
        }else{
            System.out.println("The number you choose does not exist");
        }
    }
}
