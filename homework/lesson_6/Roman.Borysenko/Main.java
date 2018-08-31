import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int type = 0;
        int mas[];
	    while(type != 12) {
            System.out.println("1. Series of four digit numbers");
            System.out.println("2. Series of first 55 numbers with step i+2");
            System.out.println("3. Series of not negative numbers");
            System.out.println("4. Series of first 20 numbers with step i*2");
            System.out.println("5. Additional of the first n elements");
            System.out.println("6. Min and max value of array" );
            System.out.println("7. Additional of all chet and nonchet numbers");
            System.out.println("8. Happy tickets");
            System.out.println("9. Convert to binary! ");
            System.out.println("10. Find 5 min values!");
            System.out.println("11. Additional all digits!!!!");
            System.out.println("12. Exit");
            type = new Scanner(System.in).nextInt();
            System.out.println();

            switch(type) {

                case 1:
                    System.out.println("Series of four digit numbers: ");
                    getDigitNumbersSeries();
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Series of first 55 numbers with step i+2:");
                    getFirstNumbers(1,1,55);
                    System.out.println();
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Series of not negative numbers");
                    getNotNegativeNumbers();
                    System.out.println();
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Series of first 20 numbers with step i*2:");
                    getFirstNumbers(1,2,20);
                    System.out.println();
                    System.out.println();
                    break;

                case 5:
                    mas = setArray();
                    System.out.println();
                    System.out.println("Please Enter  number  of additioanal elements");
                    int count = new Scanner(System.in).nextInt();
                    System.out.println("Additional of the first " + count + " elements: " + getSum(mas, count));
                    System.out.println();
                    break;

                case 6:
                    mas = setArray();
                    System.out.println();
                    getMinMax(mas);
                    System.out.println();
                    break;

                case 7:
                    mas = setArray();
                    System.out.println();
                    getSumChetNeChet(mas);
                    System.out.println();
                    break;

                case 8:
                    Integer a = 100000;
                    int i =0;
                    while (a <= 999999) {
                        if(getLuckyTicket(a) != null) {
                            System.out.print(a + " ");
                            i++;
                            i = setRowEnd(i,10);
                        }
                        a++;
                    }
                    System.out.println();
                    System.out.println();
                    break;

                case 9:
                    int j;
                    System.out.println("Please Enter the number!!!!:");
                    j = new Scanner(System.in).nextInt();
                    System.out.println(j + " in binary: " + Integer.toBinaryString(j));
                    System.out.println();
                    break;

                case 10:
                    mas = setArray();
                    System.out.println();
                    System.out.print("Min values: ");
                    int[] mas2 = getMinValues(mas);
                    for(int k =0; k < 5; k++) {
                        System.out.print(mas2[k] + " ");
                    }
                    System.out.println();
                    System.out.println();
                    break;

                case 11:
                    System.out.println("Please Enter the number!!!!");
                    Integer number = new Scanner(System.in).nextInt();
                    getSumDigits(number);
                    System.out.println();
                    break;

                case 12 :
                    return;

                default:
                    System.out.println("Error!!!!");
                    System.out.println();
            }
	    }
    }

    static void getSumDigits(Integer number) {

        String str = "Digital root of ";
        str += number + " = ";
        String strNumber;
        number = Math.abs(number);
        strNumber = number.toString();
        Integer len = strNumber.length();
        while(len > 1) {
            number = 0;
            for(int i =0; i < strNumber.length();i++) {
                number += Integer.parseInt(strNumber.substring(i,i+1));
                str += strNumber.substring(i,i+1);
                if(i < len - 1 ) {
                    str += " + ";
                }
            }
            str += " = " + number;
            strNumber = number.toString();
            len = strNumber.length();
            if(len > 1) {
                str += " = ";
            }
        }
      System.out.println(str);
    }

    static int[] getMinValues(int[] mas) {

        for(int i = mas.length -1; i >0;i--) {
            for(int j=0;j<i;j++) {
                if(mas[j] > mas[j+1]) {
                    int tmp = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = tmp;
                }
            }
        }

        return mas;
    }

    static Integer getLuckyTicket(Integer t) {

        String str;
        Integer sum1, sum2, f, a, b, c;
        f = null;
        str = t.toString();
        a = getValue(str,0,1);
        b = getValue(str,1,2);
        c = getValue(str,2,3);
        sum1 = a + b + c;
        a = getValue(str,3,4);
        b = getValue(str,4,5);
        c = getValue(str,5,6);
        sum2 = a + b + c;
        if( sum1 == sum2) {
            f = a;
        }

        return f;
    }

    static Integer getValue(String str, int a,int b) {

        Integer f;
        f = Integer.parseInt(str.substring(a,b));

        return f;
    }

    static void getDigitNumbersSeries() {

        Integer a = 1000;
        int i = 0;
        String str = a.toString();
        int len = str.length();
        while(len < 5) {
            System.out.print(a + " ");
            a += 3;
            str = a.toString();
            len = str.length();
            i++;
            i = setRowEnd(i,40);
        }
    }

    static void getFirstNumbers(double a, int step, int n) {

        int i = 0;
        int count = 0;
        while(count < 55) {
            System.out.print(a + " ");
            count++;
            switch(step) {
                case 1:
                    a += 2;
                    break;
                case 2:
                    a *= 2;
                    break;
            }
            i++;
            i = setRowEnd(i,10);
        }
    }

    static void getNotNegativeNumbers() {

        int a = 90;
        int i = 0;
        while( a >= 0) {
            System.out.print(a + " ");
            a -= 5;
            i++;
            i = setRowEnd(i,20);
        }
    }

    static void getMinMax(int[] mas) {

        int min,max;
        min = max = mas[0];
        for(int i =0; i < mas.length; i++) {
            if(min > mas[i]) {
                min = mas[i];
            }
            if(max < mas[i]) {
                max = mas[i];
            }
        }
        System.out.println("Min value: " + min + " Max value: " + max);
    }

    static void getSumChetNeChet(int[] mas) {

       long sumChet, sumNechet;
        sumChet = sumNechet = 0;
        for(int i =0; i < mas.length; i++) {
            if(getChet(mas[i] ) == 1) {
                sumChet += mas[i];
            }
            else {
                sumNechet += mas[i];
            }
        }
        System.out.println("Additional of chet numbers :" + sumChet + " non-chet numbers: " + sumNechet);
    }

    static int setRowEnd(int i,int end) {

        if(i == end) {
            i = 0;
            System.out.println();

        }

        return i;
    }

    static int[] setArray() {

        int[] mas = {3,8,5,9,13,67,35,89,15,23,54};
        System.out.print("Array data:" );
        for(int i = 0; i < mas.length; i++) {
           System.out.print(mas[i] + " ");
        }

        return mas;
    }

    static int getSum(int[] mas, int count) {

        int sum = 0;
        for(int i = 0; i < count; i++) {
            sum += mas[i];
        }

        return sum;
    }

    static int getChet(int a) {

        if(a % 2 == 0) {

            return 1;
        }

            return 0;
    }
}
