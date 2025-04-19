package loopstatment;
// 1 2 2 3 3 3 4 4 4 4 5 5 5
public class series2 {
    public static void main(String[] args) {
        int start = 1;
        int increment = 1;
        int count = 1;
        for(int i = 0 ;i<=12;i++)
        {
            if(count<=increment){
                start = start + increment;
                count++;

            }
            else {
                increment++;
                start = start+increment;
                count = 2;

            }
            System.out.print(" "+increment);
    
} 
}}


