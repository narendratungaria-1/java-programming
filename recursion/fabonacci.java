package recursion;

public class fabonacci {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(n+" "+fab(n));

    }
    static int fab(int n){
        if(n==0||n==1){
            return 1;

        }
        else{
            int result = fab(n-1)+fab(n-2);
            return result;
        }
    }
}
