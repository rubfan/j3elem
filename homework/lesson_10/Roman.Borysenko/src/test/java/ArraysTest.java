import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ArraysTest {

    ArraysNew a;
    Integer[] array1,array2;

    @Before
    public void init() {

        a = new ArraysNew();
        array1 = a.getFirstArray();
        array2 = a.getSecondArray();
    }

    @Test
    public void testGetArray() {

        assertThat(array1, arrayWithSize(9));
        assertThat(array1,hasItemInArray(4));
    }

    @Test
    public void testGetSum() {

        assertThat(a.getSum(),lessThanOrEqualTo(100));
    }

    @Test
    public void testIsSum() {

        assertThat(a.isSum(array1,a.getSum()),not(equalTo(0)));
    }

    @Test
    public void testGetSize() {

        Integer length = array1.length + array2.length;
        assertThat(a.getSize(),equalTo(length));
    }

    @Test
    public void testCopyArray() {

        Integer length1 = array1.length;
        Integer length2 = array2.length;
        Integer[] array3 = new Integer[a.getSize()];
        System.arraycopy(array1,0,array3,0,array1.length);
        System.arraycopy(array2,0,array3,array1.length,array2.length);
        assertThat(a.getArray(array1,array2),not(equalTo(array3)));
    }
}
