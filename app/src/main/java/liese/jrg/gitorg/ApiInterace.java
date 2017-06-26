package liese.jrg.gitorg;

/**
 * Created by john_smith on 19.06.17.
 */

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

//Schnittstelle die sich mit einem Befehl die Organisationen holt
//Erstellt eine Liste von Objekten der Klasse Organisation
//Speichert in der Methode orgList(); ab 
public interface ApiInterace {
    @GET("/organizations")
    Call<List<Organization>> orgList();
}
