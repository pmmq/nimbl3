package interview.pub.com.nimbl3.presenter.contact;

import java.util.List;

import interview.pub.com.nimbl3.model.Question;
import interview.pub.com.nimbl3.model.Survey;

/**
 * Created by Pub on 12/9/2559.
 */
public interface MainContract {

    interface View {
        void bindUI(List<Survey> surveyData);
        void addMore(List<Survey> surveysData);
    }

    interface Presenter {
        void fetchAllData();
        void fetchDatapagination(int page,int topage);
    }

}
