public class E2nestedIf {
    public static void main(String[] args) {
        boolean winter=true;
        String jacketColor="Black";
        if(winter==true){
            System.out.println("it's Very Cold");
            if(jacketColor.equals("Red")){
                System.out.println("Lets go with Blue Nike shoes");
            }else{
                System.out.println("Lets go with the blue ones");
            }
        }else {
            System.out.println("No need to wear jackets");
        }
    }
}
