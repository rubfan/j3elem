import org.junit.Test;
import org.junit.Assert;

public class MassJoinTest {

    MassJoin mass = new MassJoin();

    @Test
    public void union2Arrtest() {


        int[] a = {1, 3, 5};

        int[] b = {2, 4, 8, 9, 12};

        int[] c = {1, 2, 3, 4, 5, 8, 9, 12};

        Assert.assertArrayEquals(c, mass.union2Arr(a, b));

    }

    @Test
    public void sortingArrTest(){
        int[] input = {1, 3, 5, 2, 4, 8, 9, 12};

        int[] output = {1, 2, 3, 4, 5, 8, 9, 12};

        Assert.assertArrayEquals(output, mass.sortingArr(input));

    }
}
