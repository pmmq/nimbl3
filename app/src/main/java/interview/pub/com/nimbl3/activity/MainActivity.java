package interview.pub.com.nimbl3.activity;

import android.graphics.Point;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import interview.pub.com.nimbl3.R;
import interview.pub.com.nimbl3.adatper.SurveyPageAdapter;
import interview.pub.com.nimbl3.base.BaseActivity;
import interview.pub.com.nimbl3.model.Survey;
import interview.pub.com.nimbl3.presenter.MainPresenter;
import interview.pub.com.nimbl3.presenter.contact.MainContract;
import interview.pub.com.nimbl3.view.VerticalViewPager;
import me.relex.circleindicator.CircleIndicator;
import timber.log.Timber;

public class MainActivity extends BaseActivity implements MainContract.View , View.OnClickListener {

    MainContract.Presenter mPresenter;
    @BindView(R.id.pager_main)
    VerticalViewPager pager;
    @BindView(R.id.indicator)
    CircleIndicator indicator;
    @BindView(R.id.btn_refresh)
    ImageView btnRefresh;
    @BindView(R.id.progress_container)
    RelativeLayout progressContainer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mPresenter = new MainPresenter(this);
        mPresenter.fetchAllData();
    }

    @Override
    public void bindUI(List<Survey> surveyData) {
        List<Survey> data = surveyData;
        pager.setAdapter(new SurveyPageAdapter(getSupportFragmentManager(),surveyData));
        indicator.setViewPager(pager);
        // get sceen width
        int paddingright = 150;
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        // hack indicator to vertical
        indicator.setRotation(90);
        indicator.setPadding(0,0,0,(size.x - paddingright));
        // enable refresh
        btnRefresh.setOnClickListener(this);
    }

    @Override
    public void addMore(List<Survey> surveysData) {

    }

    @Override
    public void updateProgress(boolean isShowing) {
        progressContainer.setVisibility(isShowing?View.VISIBLE:View.GONE);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_refresh :
                mPresenter.fetchAllData();
                // disable while fetching
                btnRefresh.setOnClickListener(null);
                break;
        }
    }
}
