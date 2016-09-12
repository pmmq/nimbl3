package interview.pub.com.nimbl3.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by Pub on 12/9/2559.
 */
public class Survey {
    String id;                  // "eab10fa9a55c3a2e758d",
    String title;               // "Thanachart Bank",
    String description;         // "Customer Satisfaction Survey ",
    String access_code_prompt;  // null,
    String thank_email_above_threshold; // null,
    String thank_email_below_threshold; // null,
    String footer_content; // null,
    boolean is_active; // true,
    String cover_image_url; // "https://dhdbhh0jsld0o.cloudfront.net/m/562d2299c0ad3f22751b_",
    String cover_background_color; // "#000000",
    String type; // "Travel",
    Date created_at; // "2016-08-17T15:33:38.719+07:00",
    Date active_at; // "2016-05-02T07:00:00.000+07:00",
    Date inactive_at; // null,
    int survey_version; // 0,
    String short_url; // "Thanachart",
    String[] language_list; // ["en"],
    String default_language; // "en",
    String tag_list; // "Thanachart",
    String is_access_code_required; // false,
    String is_access_code_valid_required; // false,
    String access_code_validation; // "",
    Map<String, String> theme; // { "color_active; // "#FFD801", "color_inactive; // "#ffffff", "color_question; // "#ffffff", "color_answer_normal; // "#3a3838", "color_answer_inactive; // "#3a3838"}
    List<Question> questions;
}
