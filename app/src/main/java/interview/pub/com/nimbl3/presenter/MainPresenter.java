package interview.pub.com.nimbl3.presenter;

import java.util.List;

import javax.inject.Inject;

import interview.pub.com.nimbl3.SurveyService;
import interview.pub.com.nimbl3.base.BasePresenter;
import interview.pub.com.nimbl3.model.Survey;
import interview.pub.com.nimbl3.model.User;
import interview.pub.com.nimbl3.presenter.contact.MainContract;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import timber.log.Timber;

/**
 * Created by Pub on 12/9/2559.
 */
public class MainPresenter extends BasePresenter implements MainContract.Presenter {

    private MainContract.View mView;
    public MainPresenter(MainContract.View mView) {
        super();
        this.mView = mView;
    }

    @Override
    public void fetchAllData() {
        mView.updateProgress(true);
        Call<List<Survey>> call = mService.getSurvey(mUser.AccessToken);
        call.enqueue(new Callback<List<Survey>>() {
            @Override
            public void onResponse(Call<List<Survey>> call, Response<List<Survey>> response) {
                if(response!=null){
                    mView.bindUI(response.body());
                    mView.updateProgress(false);
                }
            }

            @Override
            public void onFailure(Call<List<Survey>> call, Throwable t) {
                mView.updateProgress(false);
                t.printStackTrace();
            }
        });
    }

    @Override
    public void fetchDatapagination(int page, int topage) {
        Call<List<Survey>> call = mService.getSurvey(mUser.AccessToken,page,topage);
        call.enqueue(new Callback<List<Survey>>() {
            @Override
            public void onResponse(Call<List<Survey>> call, Response<List<Survey>> response) {
                if(response!=null){
                    mView.addMore(response.body());
                }
            }

            @Override
            public void onFailure(Call<List<Survey>> call, Throwable t) {
                Timber.e(t);
            }
        });
    }


}
