public class constm{
    public static void main(String[] args) {
        int a = 9;
        int b= 578;
        int c =9;
        int d = 111;
        String maximum = null; 
        String secondmax =null;

        if(a>b&&a>c&&a>d){
           maximum = "a";
           if(b>c&&b>d){
            secondmax ="b";

           }
           else if(c>d){
            secondmax ="c";
           }
           else{
            secondmax ="d";
           }
        }  else if (b>c&&b>d){
            maximum = "b";
            if(a>c&&a>d){
                secondmax= "a";
            }else if(c>d){
                secondmax ="c";
            }else{
                secondmax = "d";
            }
        }  else if (c>d){
            maximum = " c";
            if(a>b&&a>d){
                secondmax ="a";
            }else if(b>d){
                secondmax="b";
            }else{
                secondmax="d";
            }
        }  else {
            maximum = "d";
            if(a>b&&a>c){
                secondmax="a";
            }else if(b>c){
                secondmax ="b";
            }else{
                secondmax ="c";
            }
        }
        System.out.println("maximum number: "+maximum);
        System.out.println("second maximum number: "+secondmax);
    }
}