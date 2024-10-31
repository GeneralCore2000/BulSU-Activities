package conversio;

import java.util.Scanner;

public class Conversion {
    
    BinaryAndDecimal bad = new BinaryAndDecimal();
    HexadecimalAndDecimal had = new HexadecimalAndDecimal();
    Scanner in = new Scanner(System.in);
    char choice = ' ';
    
    public Conversion() {
        System.out.println("============================================");
        System.out.println("                Conversion");
        System.out.println("============================================");
        System.out.println("[A] Binary to Decimal | [B] Decimal to Binary");

        System.out.print("Select Conversion >>: ");
        choice = in.next().toUpperCase().charAt(0);
        
        switch (choice) {
            case 'A':
                System.out.print("Enter Binary >>: ");
                bad.BinaryToDecimal(in.next());
                break;
            case 'B':
                System.out.print("Enter Decimal >>: ");
                bad.DecimalToBinary(in.nextLong());
                break;
            case 'C':
                System.out.print("Enter Decimal >>: ");
                had.DecimalToHexaDecimal(in.nextInt());
            default:
        }
    }
    
    public static void main(String[] args) {
        new Conversion();
    }
    
}
