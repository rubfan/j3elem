import org.junit.Test;
import org.junit.Assert;

public class SunInArrTest {

    SumInArr sum = new SumInArr();

    int[] a = {1, 5, 7, 9, 12};

    @Test
    public void isSumExistTest1(){

        Assert.assertTrue(sum.isSumExist(a, 12));
    }

    @Test
    public void isSumExistTest2(){

        Assert.assertTrue(sum.isSumExist(a, 6));
    }

    @Test
    public void isSumExistTest3(){

        Assert.assertTrue(sum.isSumExist(a, 10));
    }

    @Test
    public void isSumExistTest4(){

        Assert.assertFalse(sum.isSumExist(a, 2));
    }

    @Test
    public void isSumExistTest5(){

        Assert.assertFalse(sum.isSumExist(a, 3));
    }

    @Test
    public void isSumExistTest6(){

        Assert.assertFalse(sum.isSumExist(a, 7));
    }
}
