package recursion;

    public class towerofhonai {
        static void hanoi(int n, char from, char to, char aux) {
            if (n == 1) {
                System.out.println("Move disk 1 from " + from + " to " + to);
                return;
            }
            hanoi(n - 1, from, aux, to);
            System.out.println("Move disk " + n + " from " + from + " to " + to);
            hanoi(n - 1, aux, to, from);
        }
        public static void main(String[] args) {

            hanoi(3, 'A', 'B', 'C');
        }
    }


