/**
 * Created by etsvigun on 7/17/15.
 */
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import tests.DesktopLauncher;


public class DesktopTest {
        @Test
        public void launchTest() throws InterruptedException {
            assertEquals(DesktopLauncher.launch().getVersion(), 0);
        }
}
