package conversio;

public class HexadecimalAndDecimal {

    int length = 0;

    public void DecimalToHexaDecimal(int decimal) {
        setLength(decimal);
        String array[] = new String[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = decimal % 16 + "";
            if (!(decimal / 16 < 1)) {
                decimal = decimal / 16;
            }
            switch (array[i]) {
                case "10" -> array[i] = "A";
                case "11" -> array[i] = "B";
                case "12" -> array[i] = "C";
                case "13" -> array[i] = "D";
                case "14" -> array[i] = "E";
                case "15" -> array[i] = "F";
            }
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
        System.out.println("");
    }

    public void setLength(int decimal) {
        while (decimal > 0) {
            decimal /= 16;
            length++;
        }
    }
}
