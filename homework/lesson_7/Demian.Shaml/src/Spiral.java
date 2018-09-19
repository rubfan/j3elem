public class Spiral {
    private int[][] array;
    int i = 0;
    int j = 0;
    int count = 1;

    Spiral(int i, int j) {
        array = new int[i][j];
        array[0][0] = count;
        generalArr();
    }

    private void generalArr() {
        while (isFilled()) {
            stepRight();
            stepDown();
            stepLeft();
            stepUp();
        }
    }

    private void step() {
        count++;
        array[i][j] = count;
    }

    private boolean isValidRangeI(int i) {
        if (i < array.length - 1) {
            return true;
        }
        return false;
    }

    private boolean isValidRangeIdec(int i) {
        if (i > 0) {
            return true;
        }
        return false;
    }

    private boolean isValidRangeJ(int j) {
        if (j < array[0].length - 1) {
            return true;
        }
        return false;
    }

    private boolean isValidRangeJdec(int j) {
        if (j > 0) {
            return true;
        }
        return false;
    }

    private boolean isEmpty(int i, int j) {
        if (array[i][j] == 0) {
            return true;
        }
        return false;
    }

    private boolean isFilled() {
        int hight = array.length;
        int width = array[0].length;
        int countEnd = (hight * width);
        if (count != countEnd) {
            return true;
        }
        return false;
    }

    public int[][] getFilledArray() {
        return array;
    }

    private void stepRight() {
        while (isValidRangeJ(j) && isEmpty(i, j + 1)) {
            j++;
            step();
        }
    }

    private void stepDown() {
        while (isValidRangeI(i) && isEmpty(i + 1, j)) {
            i++;
            step();
        }
    }

    private void stepLeft() {
        while (isValidRangeJdec(j) && isEmpty(i, j - 1)) {
            j--;
            step();
        }
    }

    private void stepUp() {
        while (isValidRangeIdec(i) && isEmpty(i - 1, j)) {
            i--;
            step();
        }
    }
}
