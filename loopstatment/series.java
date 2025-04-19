package loopstatment;

public class series {
    public static void main(String[] args) {
        int start = 1;
        int increment = 3;
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
            System.out.print(" "+start);
        }
    }
    
}
