public class T1ClassWork {
    public static void main(String[] args) {
        boolean certificate=true;
        double gpaScore=3.8;

        if(certificate==true){
            System.out.println("Congratulation");
            if(gpaScore>=3.5){
                System.out.println("You are eligible for scholarship");
            }else{
                System.out.println("You should have studied harder");
            }
        }else {
            System.out.println("You should get a degree");
        }

    }
}
