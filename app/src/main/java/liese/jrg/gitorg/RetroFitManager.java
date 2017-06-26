//gitorg -> ehemalige Name des Projektes aber, dass wir den Packagenamen noch nicht aktualisiert haben gitorg in retrofit
package liese.jrg.gitorg;

/**
 * Created by john_smith on 19.06.17.
 */

 //Datei zur Verbindung der API von GitHub
 
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroFitManager {
	
    public static final String BASE_URL = "https://api.github.com";
    public static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
