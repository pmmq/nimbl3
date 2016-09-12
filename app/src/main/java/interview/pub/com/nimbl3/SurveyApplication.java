package interview.pub.com.nimbl3;

import android.app.Application;
import android.content.Context;

import interview.pub.com.nimbl3.dagger.ApplicationComponent;
import interview.pub.com.nimbl3.dagger.ApplicationModule;
import interview.pub.com.nimbl3.dagger.DaggerApplicationComponent;

/**
 * Created by Pub on 12/9/2559.
 */
public class SurveyApplication extends Application {

    static private ApplicationComponent mComponent;
    protected static Context mAppContext;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppContext = getApplicationContext();

        mComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();

        mComponent.inject(this);
    }


    public static ApplicationComponent getComponent(){
        return mComponent;
    }
}
