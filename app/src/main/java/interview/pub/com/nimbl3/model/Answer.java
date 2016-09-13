package interview.pub.com.nimbl3.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

/**
 * Created by Pub on 12/9/2559.
 */
public class Answer implements Parcelable {

    String id;                      //"eb94a7262e3e9d8636c3",
    String question_id;             // "4e95c503c277a5689456",
    String text;                    // null,
    String help_text;               // null,
    String input_mask_placeholder;  // null,
    String short_text;              // "answer_1",
    boolean is_mandatory;           //: false,
    boolean is_customer_first_name; //: false,
    boolean is_customer_last_name;  //: false,
    boolean is_customer_title;      //: false,
    boolean is_customer_email;      //: false,
    boolean prompt_custom_answer;   //: false,
    String weight;                  //: null,
    int display_order;              //: 0,
    String display_type;            //: "default",
    String input_mask;              //: null,
    Date date_constraint;           //: null,
    String default_value;           //: null,
    String response_class;          //: "text",
    String reference_identifier;    //: null,
    String score;                   //: null,
    //        "alerts": []


    public String getId() {
        return id;
    }

    public String getQuestion_id() {
        return question_id;
    }

    public String getText() {
        return text;
    }

    public String getHelp_text() {
        return help_text;
    }

    public String getInput_mask_placeholder() {
        return input_mask_placeholder;
    }

    public String getShort_text() {
        return short_text;
    }

    public boolean is_mandatory() {
        return is_mandatory;
    }

    public boolean is_customer_first_name() {
        return is_customer_first_name;
    }

    public boolean is_customer_last_name() {
        return is_customer_last_name;
    }

    public boolean is_customer_title() {
        return is_customer_title;
    }

    public boolean is_customer_email() {
        return is_customer_email;
    }

    public boolean isPrompt_custom_answer() {
        return prompt_custom_answer;
    }

    public String getWeight() {
        return weight;
    }

    public int getDisplay_order() {
        return display_order;
    }

    public String getDisplay_type() {
        return display_type;
    }

    public String getInput_mask() {
        return input_mask;
    }

    public Date getDate_constraint() {
        return date_constraint;
    }

    public String getDefault_value() {
        return default_value;
    }

    public String getResponse_class() {
        return response_class;
    }

    public String getReference_identifier() {
        return reference_identifier;
    }

    public String getScore() {
        return score;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.question_id);
        dest.writeString(this.text);
        dest.writeString(this.help_text);
        dest.writeString(this.input_mask_placeholder);
        dest.writeString(this.short_text);
        dest.writeByte(this.is_mandatory ? (byte) 1 : (byte) 0);
        dest.writeByte(this.is_customer_first_name ? (byte) 1 : (byte) 0);
        dest.writeByte(this.is_customer_last_name ? (byte) 1 : (byte) 0);
        dest.writeByte(this.is_customer_title ? (byte) 1 : (byte) 0);
        dest.writeByte(this.is_customer_email ? (byte) 1 : (byte) 0);
        dest.writeByte(this.prompt_custom_answer ? (byte) 1 : (byte) 0);
        dest.writeString(this.weight);
        dest.writeInt(this.display_order);
        dest.writeString(this.display_type);
        dest.writeString(this.input_mask);
        dest.writeLong(this.date_constraint != null ? this.date_constraint.getTime() : -1);
        dest.writeString(this.default_value);
        dest.writeString(this.response_class);
        dest.writeString(this.reference_identifier);
        dest.writeString(this.score);
    }

    public Answer() {
    }

    protected Answer(Parcel in) {
        this.id = in.readString();
        this.question_id = in.readString();
        this.text = in.readString();
        this.help_text = in.readString();
        this.input_mask_placeholder = in.readString();
        this.short_text = in.readString();
        this.is_mandatory = in.readByte() != 0;
        this.is_customer_first_name = in.readByte() != 0;
        this.is_customer_last_name = in.readByte() != 0;
        this.is_customer_title = in.readByte() != 0;
        this.is_customer_email = in.readByte() != 0;
        this.prompt_custom_answer = in.readByte() != 0;
        this.weight = in.readString();
        this.display_order = in.readInt();
        this.display_type = in.readString();
        this.input_mask = in.readString();
        long tmpDate_constraint = in.readLong();
        this.date_constraint = tmpDate_constraint == -1 ? null : new Date(tmpDate_constraint);
        this.default_value = in.readString();
        this.response_class = in.readString();
        this.reference_identifier = in.readString();
        this.score = in.readString();
    }

    public static final Parcelable.Creator<Answer> CREATOR = new Parcelable.Creator<Answer>() {
        @Override
        public Answer createFromParcel(Parcel source) {
            return new Answer(source);
        }

        @Override
        public Answer[] newArray(int size) {
            return new Answer[size];
        }
    };
}
