package liese.jrg.gitorg;

/**
 * Created by john_smith on 19.06.17.
 */

/**
 * Created by john_smith on 19.06.17.
 */

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Jörg.Liese on 16.06.2017.
 */

public interface ApiInterace {
    @GET("/organizations")
    Call<List<Organization>> orgList();
}