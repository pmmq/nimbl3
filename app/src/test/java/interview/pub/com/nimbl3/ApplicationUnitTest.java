package interview.pub.com.nimbl3;

import org.junit.Assert;
import org.junit.Test;

import interview.pub.com.nimbl3.util.Helper;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ApplicationUnitTest {
    @Test
    public void getBigImageIsCorrect() throws Exception {

        // case ""
        String result = Helper.getBigImage("");
        Assert.assertEquals("l",result);

        // case normal url
        result = Helper.getBigImage("https://dhdbhh0jsld0o.cloudfront.net/m/562d2299c0ad3f22751b_");
        Assert.assertEquals("https://dhdbhh0jsld0o.cloudfront.net/m/562d2299c0ad3f22751b_l",result);

        // case null
        result = Helper.getBigImage(null);
        Assert.assertEquals(null,result);

    }
}