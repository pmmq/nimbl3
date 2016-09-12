package interview.pub.com.nimbl3.dagger;

import javax.inject.Singleton;

import dagger.Component;
import interview.pub.com.nimbl3.SurveyService;
import interview.pub.com.nimbl3.SurveyApplication;
import interview.pub.com.nimbl3.base.BaseActivity;
import interview.pub.com.nimbl3.base.BasePresenter;

/**
 * Created by Pub on 12/9/2559.
 */

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(SurveyApplication app);
    void inject(BaseActivity app);
    void inject(BasePresenter app);
    void inject(SurveyService app);

}
