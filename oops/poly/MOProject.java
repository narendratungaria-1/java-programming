package oops.poly;
import java.util.Scanner;
public class MOProject {
    // Overloaded method: Display information about a single crop
        public static void showInfo(String cropName) {
            switch (cropName.toLowerCase()) {
                case "wheat":
                    System.out.println(" Wheat: Requires cool climate, harvested in 100-120 days.");
                    break;
                case "rice":
                    System.out.println(" Rice: Requires flooded fields, harvested in 120-150 days.");
                    break;
                case "corn":
                    System.out.println(" Corn: Thrives in warm climates, harvested in 60-100 days.");
                    break;
                default:
                    System.out.println(" No information available for this crop.");
            }
        }

        // Overloaded method: Display information about a single fruit
        public static void showInfo(String fruitName, boolean isFruit) {
            if (isFruit) {
                switch (fruitName.toLowerCase()) {
                    case "apple":
                        System.out.println(" Apple: Grows in temperate regions, takes 150-180 days to mature.");
                        break;
                    case "mango":
                        System.out.println(" Mango: Thrives in tropical climates, harvested in 120-140 days.");
                        break;
                    case "banana":
                        System.out.println(" Banana: Requires warm climate, takes 9-12 months to harvest.");
                        break;
                    default:
                        System.out.println(" No information available for this fruit.");
                }
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input number of crops
            System.out.print("Enter the number of crops to check: ");
            int cropCount = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            String[] crops = new String[cropCount];

            for (int i = 0; i < cropCount; i++) {
                System.out.print("Enter crop name (Wheat, Rice, Corn): ");
                crops[i] = scanner.nextLine();
                showInfo(crops[i]); // Show crop details
            }

            // Input number of fruits
            System.out.print("\nEnter the number of fruits to check: ");
            int fruitCount = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            String[] fruits = new String[fruitCount];

            for (int i = 0; i < fruitCount; i++) {
                System.out.print("Enter fruit name (Apple, Mango, Banana): ");
                fruits[i] = scanner.nextLine();
                showInfo(fruits[i], true); // Show fruit details
            }

            
            scanner.close();
        }
    }




