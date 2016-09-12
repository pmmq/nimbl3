package interview.pub.com.nimbl3;

import android.content.Context;

import java.util.List;

import interview.pub.com.nimbl3.model.Survey;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Pub on 12/9/2559.
 */
public interface SurveyService {


    public static String ACCESS_TOKEN_KEY = "access_token";
    public static String PAGE_KEY = "page";
    public static String PER_PAGE_KEY = "per_page";

    @GET("/app/surveys.json")
    Call<List<Survey>> getSurvey(@Query(ACCESS_TOKEN_KEY) String token);

    @GET("/app/surveys.json")
    Call<List<Survey>> getSurvey(@Query(ACCESS_TOKEN_KEY) String token,@Query(PAGE_KEY) int page, @Query(PER_PAGE_KEY) int perpage);

}
