package interview.pub.com.nimbl3.dagger;

import android.app.Application;
import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import interview.pub.com.nimbl3.BuildConfig;
import interview.pub.com.nimbl3.SurveyService;
import interview.pub.com.nimbl3.model.User;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Pub on 12/9/2559.
 */

@Module
public class ApplicationModule {
    private Context context;
    private Application mApp;

    public ApplicationModule(Application app){
        mApp = app;
    }

    @Provides
    @Singleton
    SurveyService provideApi(){

        Gson gson = new GsonBuilder()
                .registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
                    DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSz");
                    @Override
                    public Date deserialize(final JsonElement json, final Type typeOfT, final JsonDeserializationContext context)
                            throws JsonParseException {
                        try {
                            return df.parse(json.getAsString());
                        } catch (ParseException e) {
                            return null;
                        }
                    }
                })
                .serializeNulls().create();

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BuildConfig.SERVER_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(gson)).build();

        return retrofit.create(SurveyService.class);
    }

    @Provides
    @Singleton
    User provideUser(){
        return new User("6eebeac3dd1dc9c97a06985b6480471211a777b39aa4d0e03747ce6acc4a3369");
    }
}
