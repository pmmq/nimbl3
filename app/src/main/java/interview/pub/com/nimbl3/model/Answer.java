package interview.pub.com.nimbl3.model;

import java.util.Date;

/**
 * Created by Pub on 12/9/2559.
 */
public class Answer {

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
}
