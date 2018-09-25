import java.util.Arrays;

public class ArraysNew {

    public static void main(String[] args) {

        Integer[] a,b;
        Integer sum;
    }

    static Integer[] getFirstArray() {

        Integer[] a;
        a = new Integer[]{5,7,89,4,3,6,8,9,11};

        return a;
    }

    static Integer[] getSecondArray() {

        Integer[] a;
        a = new Integer[]{4,9,3,5,2,4,99,4,222,56,7,34};

        return a;
    }

    static Integer getSum() {

        return 96;
    }

    static int isSum(Integer[] a, Integer b) {

        for(int i = 0; i <  a.length; i++) {
            for(int j = i + 1; j < a.length;j++) {
                if(a[i] + a[j] == b) {
                    System.out.println(a[i] + " + " + a[j] + " = " + b + " :true");

                    return 1;
                }
            }
        }

        return 0;
    }

    static Integer getSize() {

        return 21;
    }

    static Integer[] getArray(Integer[] a, Integer[] b) {

        Integer[] c = new Integer[getSize()];
        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);
        Arrays.sort(c);

        return c;
    }
  }