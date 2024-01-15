package hu.nje.njebead;

import java.util.List;

import hu.nje.njebead.models.Player;
import hu.nje.njebead.models.Team;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {

    @GET("csapatok")
    Call<List<Team>> getCsapatok();


    @GET("csapatok/{id}/jatekosok")
    Call<List<Player>> getTeamPlayers(@Path("id") int id);

}
