package conversio;

public class BinaryAndDecimal {

    int length = 0;
    int ctr = 0;

    public void DecimalToBinary(double decimal) {
        setLength((int) decimal);
        int array[] = new int[length];
        while (ctr < array.length) {
            decimal /= 2;
            if (decimal % 1 == 0) {
                array[ctr] = 0;
            } else {
                array[ctr] = 1;
                decimal = (int) decimal;
            }
            ctr++;
        }
        printAnswer(array);
    }

    public void BinaryToDecimal(String binary) {
        int array[] = new int[binary.length()];
        array[binary.length() - 1] = 1;
        int answer = 0;
        for (int i = array.length - 2; i >= 0; i--) {
            array[i] = array[i + 1] * 2;
            if (binary.charAt(i) == '1') {
                answer = answer + array[i];
            }
        }
        System.out.println(answer + 1);
    }

    public void setLength(int decimal) {
        while (decimal > 0) {
            decimal /= 2;
            length++;
        }
    }

    public void printAnswer(int array[]) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }

}
