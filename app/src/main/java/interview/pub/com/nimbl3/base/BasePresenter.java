package interview.pub.com.nimbl3.base;

import javax.inject.Inject;

import interview.pub.com.nimbl3.SurveyApplication;
import interview.pub.com.nimbl3.SurveyService;
import interview.pub.com.nimbl3.model.User;

/**
 * Created by Pub on 12/9/2559.
 */
public class BasePresenter {

    @Inject
    protected SurveyService mService;
    @Inject
    protected User mUser;

    public BasePresenter() {
        SurveyApplication.getComponent().inject(this);
    }
}
