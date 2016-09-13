package interview.pub.com.nimbl3.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import interview.pub.com.nimbl3.util.Helper;

/**
 * Created by Pub on 12/9/2559.
 */
public class Survey implements Parcelable {
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

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getAccess_code_prompt() {
        return access_code_prompt;
    }

    public String getThank_email_above_threshold() {
        return thank_email_above_threshold;
    }

    public String getThank_email_below_threshold() {
        return thank_email_below_threshold;
    }

    public String getFooter_content() {
        return footer_content;
    }

    public boolean is_active() {
        return is_active;
    }

    /**
     * get Image path with if it's true fuction will return large image path
     * @param isBigPicuture
     * @return
     */
    public String getCover_image_url(boolean isBigPicuture) {
        return isBigPicuture ? Helper.getBigImage(cover_image_url) : cover_image_url;
    }

    public String getCover_background_color() {
        return cover_background_color;
    }

    public String getType() {
        return type;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public Date getActive_at() {
        return active_at;
    }

    public Date getInactive_at() {
        return inactive_at;
    }

    public int getSurvey_version() {
        return survey_version;
    }

    public String getShort_url() {
        return short_url;
    }

    public String[] getLanguage_list() {
        return language_list;
    }

    public String getDefault_language() {
        return default_language;
    }

    public String getTag_list() {
        return tag_list;
    }

    public String getIs_access_code_required() {
        return is_access_code_required;
    }

    public String getIs_access_code_valid_required() {
        return is_access_code_valid_required;
    }

    public String getAccess_code_validation() {
        return access_code_validation;
    }

    public Map<String, String> getTheme() {
        return theme;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeString(this.access_code_prompt);
        dest.writeString(this.thank_email_above_threshold);
        dest.writeString(this.thank_email_below_threshold);
        dest.writeString(this.footer_content);
        dest.writeByte(this.is_active ? (byte) 1 : (byte) 0);
        dest.writeString(this.cover_image_url);
        dest.writeString(this.cover_background_color);
        dest.writeString(this.type);
        dest.writeLong(this.created_at != null ? this.created_at.getTime() : -1);
        dest.writeLong(this.active_at != null ? this.active_at.getTime() : -1);
        dest.writeLong(this.inactive_at != null ? this.inactive_at.getTime() : -1);
        dest.writeInt(this.survey_version);
        dest.writeString(this.short_url);
        dest.writeStringArray(this.language_list);
        dest.writeString(this.default_language);
        dest.writeString(this.tag_list);
        dest.writeString(this.is_access_code_required);
        dest.writeString(this.is_access_code_valid_required);
        dest.writeString(this.access_code_validation);
        dest.writeInt(this.theme.size());
        for (Map.Entry<String, String> entry : this.theme.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeString(entry.getValue());
        }
        dest.writeList(this.questions);
    }

    public Survey() {
    }

    protected Survey(Parcel in) {
        this.id = in.readString();
        this.title = in.readString();
        this.description = in.readString();
        this.access_code_prompt = in.readString();
        this.thank_email_above_threshold = in.readString();
        this.thank_email_below_threshold = in.readString();
        this.footer_content = in.readString();
        this.is_active = in.readByte() != 0;
        this.cover_image_url = in.readString();
        this.cover_background_color = in.readString();
        this.type = in.readString();
        long tmpCreated_at = in.readLong();
        this.created_at = tmpCreated_at == -1 ? null : new Date(tmpCreated_at);
        long tmpActive_at = in.readLong();
        this.active_at = tmpActive_at == -1 ? null : new Date(tmpActive_at);
        long tmpInactive_at = in.readLong();
        this.inactive_at = tmpInactive_at == -1 ? null : new Date(tmpInactive_at);
        this.survey_version = in.readInt();
        this.short_url = in.readString();
        this.language_list = in.createStringArray();
        this.default_language = in.readString();
        this.tag_list = in.readString();
        this.is_access_code_required = in.readString();
        this.is_access_code_valid_required = in.readString();
        this.access_code_validation = in.readString();
        int themeSize = in.readInt();
        this.theme = new HashMap<String, String>(themeSize);
        for (int i = 0; i < themeSize; i++) {
            String key = in.readString();
            String value = in.readString();
            this.theme.put(key, value);
        }
        this.questions = new ArrayList<Question>();
        in.readList(this.questions, Question.class.getClassLoader());
    }

    public static final Parcelable.Creator<Survey> CREATOR = new Parcelable.Creator<Survey>() {
        @Override
        public Survey createFromParcel(Parcel source) {
            return new Survey(source);
        }

        @Override
        public Survey[] newArray(int size) {
            return new Survey[size];
        }
    };
}
