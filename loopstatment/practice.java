package loopstatment;

public class practice {
    public static void main(String[] args) {
        int n = 5;
        int counter = 10;
        for (int i = 1;i<n;i++){
          //  System.out.println(counter);
            counter = counter-2;



        }
//12,10,8,6,4,2
        int numbervalue = n*2;
        for(int i = n ;i>0;i--){
           // System.out.println(numbervalue);
            numbervalue = numbervalue-2;
        }
// n = 6    1,3,6,10 15,21
        int value = 0;
        for(int i= 1;i<=n;i++){

            value = value +i;
           // System.out.println(value);

        }
// 1,,3,6,10,15,13,10,6,1
       value = 1;
        int number = 2;
        for(int i =0;i<(n*2)-1;i++){

            System.out.println(value);
            if(number>n)
            {
                number = 2;
            }
            if(i<n-1)
            {
                value = value +number;
            }
            else
            {
                value = value - number;
            }
            number++;

        }

    }
}

