package conditionalstatement;

public class ifelse {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        int c = 30;
        int d = 40;
        String check;
         if (a>b && a>c && a>d){
             check = "a greter";}
         else if (b>c&&b>d){
            check = " b greater";
         }else if(c>a&&b>d){
            check = " c grater ";}
            else {
                check = " d greater ";
            } 
            System.out.println("check number"+check);
            
        
    }
    
}
