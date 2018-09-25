import jdk.nashorn.internal.runtime.regexp.RegExpMatcher;
import org.hamcrest.text.StringContainsInOrder;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class FlashLightTest {

    FlashLight f;
    int battery;
    int function;

    @Before
    public void init() {

        battery = 2;
        f = new FlashLight(battery,"Test");
        function = 2;
    }

    @Test
    public void testGetFunctionFlashLight() {

        assertThat(f.getFunctionFlashLight(function),equalTo(1));
    }

    @Test
    public void testSetFunctionFlashLight() {

        assertThat(f.setFunctionFlashLight(function),containsString("light"));
    }
}
