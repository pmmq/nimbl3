package interview.pub.com.nimbl3.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import butterknife.BindView;
import butterknife.ButterKnife;
import interview.pub.com.nimbl3.R;
import interview.pub.com.nimbl3.activity.DetailActivity;
import interview.pub.com.nimbl3.model.Survey;

/**
 * Created by Pub on 13/9/2559.
 */
public class SurveyFragment extends Fragment implements View.OnClickListener {

    @BindView(R.id.btn_take_survey)
    Button btnTakeSurvey;
    @BindView(R.id.iv_survey)
    ImageView ivSurvey;
    @BindView(R.id.tv_description)
    TextView tvDescriotion;
    @BindView(R.id.tv_name)
    TextView tvName;

    public static String SURVEY_BUNDLE_KEY = "SURVEY_BUNDLE_KEY";

    private Survey mSurvey;
    public static SurveyFragment getInstance(Survey survey){
        SurveyFragment fragment = new SurveyFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(SURVEY_BUNDLE_KEY,survey);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_survey,container,false);
        if(savedInstanceState==null){
            mSurvey = getArguments().getParcelable(SURVEY_BUNDLE_KEY);
        }else {
            mSurvey = savedInstanceState.getParcelable(SURVEY_BUNDLE_KEY);
        }
        ButterKnife.bind(this,rootView);
        initView();
        return rootView;
    }

    private void initView(){
        if(mSurvey!=null){
            //Picasso.with(this.getContext()).load(mSurvey.getCover_image_url(true)).fit().centerCrop().into(ivSurvey);
            Glide.with(getContext())
                    .load(mSurvey.getCover_image_url(true))
                    .centerCrop()
                    .into(ivSurvey);
            tvDescriotion.setText(mSurvey.getDescription());
            tvName.setText(mSurvey.getTitle());
            btnTakeSurvey.setOnClickListener(this);
        }
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_take_survey :
                Intent intent = DetailActivity.getIntent(getContext());
                intent.putExtra(SURVEY_BUNDLE_KEY,getArguments().getParcelable(SURVEY_BUNDLE_KEY));
                startActivity(intent);
                break;
        }
    }



    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelable(SURVEY_BUNDLE_KEY,mSurvey);
    }
}
