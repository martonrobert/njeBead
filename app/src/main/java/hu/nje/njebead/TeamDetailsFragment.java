package hu.nje.njebead;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import hu.nje.njebead.models.Player;
import hu.nje.njebead.models.Team;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TeamDetailsFragment extends Fragment {
    ApiInterface apiInterface;
    List<Player> players;
    RecyclerView recyclerView;
    static TeamDetailsFragment listFragment;


    public TeamDetailsFragment() {
    }

    public static TeamDetailsFragment newInstance() {
        TeamDetailsFragment fragment = new TeamDetailsFragment();
        listFragment = fragment;
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.team_detail_fragment, container, false);
        MainActivity activity;
        Team selectedTeam;

        activity = (MainActivity) getActivity();
        selectedTeam = activity.getSelectedTeam();


        recyclerView = rootView.findViewById(R.id.playersRecyclerView);
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity()
                .getApplicationContext(), DividerItemDecoration.VERTICAL));
        RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(getActivity()
                        .getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        apiInterface = ApiClient.getApiClient().create(ApiInterface.class);

        apiInterface.getTeamPlayers(selectedTeam.getId()).enqueue(new Callback<List<Player>>() {
            @Override
            public void onResponse(Call<List<Player>> call, Response<List<Player>> response) {
                players = response.body();
                recyclerView.setAdapter(new PlayersAdapter(listFragment, players));
            }

            @Override
            public void onFailure(Call<List<Player>> call, Throwable t) {

            }
        });

        return rootView;
    }
}
