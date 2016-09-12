package interview.pub.com.nimbl3.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import interview.pub.com.nimbl3.SurveyApplication;
import interview.pub.com.nimbl3.SurveyService;
import interview.pub.com.nimbl3.model.User;

/**
 * Created by Pub on 12/9/2559.
 */
public abstract class BaseActivity extends AppCompatActivity {
    // plan to inject feature object
    @Inject protected User mUser;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SurveyApplication.getComponent().inject(this);
    }
}
