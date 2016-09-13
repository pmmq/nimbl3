package interview.pub.com.nimbl3.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import interview.pub.com.nimbl3.R;
import interview.pub.com.nimbl3.base.BaseActivity;
import interview.pub.com.nimbl3.fragment.SurveyFragment;
import interview.pub.com.nimbl3.model.Survey;

/**
 * Created by Pub on 14/9/2559.
 */
public class DetailActivity extends BaseActivity {

    @BindView(R.id.iv_survey)
    ImageView ivSurvey;
    @BindView(R.id.tv_description)
    TextView tvDescriotion;
    @BindView(R.id.tv_name)
    TextView tvName;

    private Survey mSurvey;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);
        mSurvey = getIntent().getExtras().getParcelable(SurveyFragment.SURVEY_BUNDLE_KEY);
        initView();
    }

    private void initView(){
        if(mSurvey!=null){
            Glide.with(this)
                    .load(mSurvey.getCover_image_url(true))
                    .centerCrop()
                    .into(ivSurvey);
            tvDescriotion.setText(mSurvey.getDescription());
            tvName.setText(mSurvey.getTitle());
        }
    }

    public static Intent getIntent(Context context){
        Intent intent = new Intent(context,DetailActivity.class);
        return intent;
    }



}
