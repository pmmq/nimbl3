package interview.pub.com.nimbl3.activity;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

import interview.pub.com.nimbl3.base.BaseActivity;
import interview.pub.com.nimbl3.model.Survey;
import interview.pub.com.nimbl3.presenter.MainPresenter;
import interview.pub.com.nimbl3.presenter.contact.MainContract;
import timber.log.Timber;

public class MainActivity extends BaseActivity implements MainContract.View {

    MainContract.Presenter mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = new MainPresenter(this);
        mPresenter.fetchAllData();
    }

    @Override
    public void bindUI(List<Survey> surveyData) {
        List<Survey> data = surveyData;
    }

    @Override
    public void addMore(List<Survey> surveysData) {

    }
}
