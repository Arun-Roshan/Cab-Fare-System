import java.util.Scanner;

//Cab Fare System

class Cab {
    int fare;

    void showFare() {
        System.out.print("Fare Amount: " + fare);
    }
}

public class RideCab {
    public static void main(String args[]) {
        Cab id = new Cab();
        try (Scanner sc = new Scanner(System.in)) {
            int d;

            System.out.print("Enter the travel distance(im Km) : ");
            d = sc.nextInt();

            id.fare = 12 * d;
        }
        id.showFare();
    }

    
}