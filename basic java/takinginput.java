import java.util.Scanner;
class Takinginput{
    public static void main(String args[]){
        Scanner st = new Scanner(System.in);

        System.out.println("enter your name");
        String name = st.nextLine();
        

        System.out.println("enter your roll-number");
        int roll = st.nextInt();
        

        System.out.println("enter your cgpa ");
        Float cgpa = st.nextFloat();
       
        System.out.println("enter your ip address");
        Double ip = st.nextDouble();
        
        System.out.println("your name is " +name);
        System.out.println("your ip-address is " +ip);
        System.out.println("your cgpa grade is " +cgpa);
        System.out.println("your roll-number is " +roll);
    }
    
}