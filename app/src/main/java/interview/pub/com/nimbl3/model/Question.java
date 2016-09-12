package interview.pub.com.nimbl3.model;

import java.util.List;

import interview.pub.com.nimbl3.util.Helper;

/**
 * Created by Pub on 12/9/2559.
 */
public class Question {
    String id;                          //  "4e95c503c277a5689456",
    String text;                        //: "Your comments are welcomed.",
    String help_text;                   //: null,
    int display_order;                  //: 2,
    String short_text;                  //: "New question",
    String pick;                        // "none",
    String display_type;                // "textarea",
    boolean is_mandatory;               // false,
    String correct_answer_id;           // null,
    String facebook_profile;            // null,
    String twitter_profile;             // null,
    String image_url;                   // null,
    String cover_image_url;             // "https://dhdbhh0jsld0o.cloudfront.net/m/562d2299c0ad3f22751b_",
    String cover_image_opacity;         // 1,
    String cover_background_color;      // null,
    boolean is_shareable_on_facebook;   // false,
    boolean is_shareable_on_twitter;    // false,
    String font_face;                   // null,
    String font_size;                   // null,
    String tag_list;                    // "",
    List<Answer> answers;

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getHelp_text() {
        return help_text;
    }

    public int getDisplay_order() {
        return display_order;
    }

    public String getShort_text() {
        return short_text;
    }

    public String getPick() {
        return pick;
    }

    public String getDisplay_type() {
        return display_type;
    }

    public boolean is_mandatory() {
        return is_mandatory;
    }

    public String getCorrect_answer_id() {
        return correct_answer_id;
    }

    public String getFacebook_profile() {
        return facebook_profile;
    }

    public String getTwitter_profile() {
        return twitter_profile;
    }

    public String getImage_url(boolean isBig) {
        return isBig ? Helper.getBigImage(image_url) : image_url;
    }

    public String getCover_image_url(boolean isBig) {
        return isBig ? Helper.getBigImage(cover_image_url) : cover_image_url;
    }

    public String getCover_image_opacity(boolean isBig) {
        return isBig ? Helper.getBigImage(cover_image_opacity) : cover_image_opacity;
    }

    public String getCover_background_color() {
        return cover_background_color;
    }

    public boolean is_shareable_on_facebook() {
        return is_shareable_on_facebook;
    }

    public boolean is_shareable_on_twitter() {
        return is_shareable_on_twitter;
    }

    public String getFont_face() {
        return font_face;
    }

    public String getFont_size() {
        return font_size;
    }

    public String getTag_list() {
        return tag_list;
    }

    public List<Answer> getAnswers() {
        return answers;
    }
}
