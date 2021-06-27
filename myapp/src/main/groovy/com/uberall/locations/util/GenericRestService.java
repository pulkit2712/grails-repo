package com.uberall.locations.util;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory ;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


@Service
public class GenericRestService {
    private static Map<String,Retrofit> urlAPICache=new HashMap();





    public <T> T creatClient(final String baseUrl, Class<T> clazz,String token) {
        if(urlAPICache.get(baseUrl)!=null)
        {
            return urlAPICache.get(baseUrl).create(clazz) ;
        }
        try {

            Retrofit retrofit =  new Retrofit.Builder()
                    .baseUrl(baseUrl)

                    //ToDO Uncomment this when HTTPS client code avaiable
                    .client(createHttpClient(token))
                    .addConverterFactory(GsonConverterFactory.create()).build();

            urlAPICache.put(baseUrl,retrofit);
            return retrofit.create(clazz);

        } catch (NoSuchAlgorithmException e) {

        }

        return null;

    }

    private OkHttpClient createHttpsClient(String token) {

        //todo need to add HTTPS specific implementation,considering certificates location.
        return null;
    }


    private OkHttpClient createHttpClient(final String token) throws NoSuchAlgorithmException {



        OkHttpClient.Builder builder = null;


        builder = new OkHttpClient.Builder()
                .readTimeout(1, TimeUnit.MINUTES)
                .connectTimeout(1, TimeUnit.MINUTES)
                .callTimeout(1, TimeUnit.MINUTES)
                .writeTimeout(1, TimeUnit.MINUTES)
                .addInterceptor(new Interceptor() {
                    @Override
            public Response intercept(Interceptor.Chain chain) throws IOException {
                Request original = chain.request();

                Request request = original.newBuilder()
                        .header("privateKey", token)
                        .method(original.method(), original.body())
                        .build();
                return chain.proceed(request);
            }
        })
                ;

        return builder.build();

    }

}