package interview.pub.com.nimbl3.util;

import android.support.annotation.NonNull;

/**
 * Created by Pub on 12/9/2559.
 */
public class Helper {

    /**
     * this function just add l as suffix to get larger image path
     * @param url original url
     * @return
     */

    public static String getBigImage(@NonNull String url){
        return url!=null? url+"l" : null;
    }
}
