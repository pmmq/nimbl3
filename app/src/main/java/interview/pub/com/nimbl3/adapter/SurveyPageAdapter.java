package interview.pub.com.nimbl3.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

import interview.pub.com.nimbl3.fragment.SurveyFragment;
import interview.pub.com.nimbl3.model.Survey;

/**
 * Created by Pub on 14/9/2559.
 */
public class SurveyPageAdapter extends FragmentPagerAdapter {

    List<Survey> mSurvey;
    public SurveyPageAdapter(FragmentManager fm, List<Survey> mSurvey) {
        super(fm);
        this.mSurvey = mSurvey;
    }

    @Override
    public Fragment getItem(int position) {
        return SurveyFragment.getInstance(mSurvey.get(position));
    }

    @Override
    public int getCount() {
        return mSurvey.size();
    }
}
