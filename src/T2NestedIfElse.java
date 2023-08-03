public class T2NestedIfElse {
    public static void main(String[] args) {
        double mortRate=4.3, mortPrice=60000;

        if(mortRate>4.5){
            System.out.println("User will not buy a house");
            if(mortPrice>50000){
                System.out.println("User will take a loan");
            }else{
                System.out.println("User will pay cash");
            }
            }else {
            System.out.println("User will consider buying");
        }
    }
}
