import java.util.Scanner;

public class SmartHomeApp {

    public static void main(String[] args){

        Laptop laptop = new Laptop();
        Refrigerator refrigerator  = new Refrigerator();
        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();

        PowerOutlet laptopAdapter = new LaptopAdapter(laptop);
        PowerOutlet refrigeratorAdapter = new RefrigeratorAdapter(refrigerator);
        PowerOutlet smartphoneAdapter = new SmartphoneAdapter(smartphoneCharger);
        
        Scanner s = new Scanner(System.in);

        System.out.println("SMART HOME APP\n");

        while (true) {
            System.out.println("MANAGE AND CONTROL DEVICE");
            System.out.println("1. Laptop \n2. Refrigerator \n3. Smartphone Charger \n4. Exit ");
            System.out.print("\nSelect a Device to Manage or Control: ");
            System.out.print("");

            int device = s.nextInt();

            PowerOutlet selectedAdapter = null;

            switch (device) {
                case 1:
                    selectedAdapter = laptopAdapter;
                    break;

                case 2:
                    selectedAdapter = refrigeratorAdapter;
                    break;

                case 3:
                    selectedAdapter = smartphoneAdapter;
                    break;

                case 4:
                    System.out.println("\nSmart Home App Exited");
                    System.out.println("");
                    s.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nNo Device is registered to that number. Please try again.\n");
                    continue; 
            }

            if (selectedAdapter != null) {
                System.out.println("\nControlled Device: " + selectedAdapter.plugIn() + "\n");
            }
        }
    }
}