public class Donor {
    public static void main(String[] args) {
        int age=19;
        int weight=106;

        if(age==19){
            System.out.println("You are a donor");
            if(weight>=106){
                System.out.println("You are Eligible");
            }else{
                System.out.println("we cannot accept such a patient");
            }
        }else{
            System.out.println("You are not a donor");
        }
    }
}
