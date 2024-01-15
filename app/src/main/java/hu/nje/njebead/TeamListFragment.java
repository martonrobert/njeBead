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

import hu.nje.njebead.models.Team;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class TeamListFragment extends Fragment {

    ApiInterface apiInterface;
    List<Team> teams;
    RecyclerView recyclerView;
    static TeamListFragment listFragment;

    public TeamListFragment() {

    }

    public static TeamListFragment newInstance() {
        TeamListFragment fragment = new TeamListFragment();
        listFragment = fragment;
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.team_list_fragment, container, false);


        recyclerView = rootView.findViewById(R.id.teamsRecyclerView);
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity()
                .getApplicationContext(), DividerItemDecoration.VERTICAL));
        RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(getActivity()
                        .getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        apiInterface = ApiClient.getApiClient().create(ApiInterface.class);
        apiInterface.getCsapatok().enqueue(new Callback<List<Team>>() {
            @Override
            public void onResponse(Call<List<Team>> call, Response<List<Team>> response) {
                teams = response.body();
                recyclerView.setAdapter(new TeamsAdapter(listFragment, teams));
            }

            @Override
            public void onFailure(Call<List<Team>> call, Throwable t) {
                List<Team> teamList = TeamManager.getTeamList();
                TeamsAdapter adapter = new TeamsAdapter(listFragment, teamList);
                recyclerView.setAdapter(adapter);
            }
        });



        return rootView;
    }

    public void selectItemAndNavigate(Team team) {
        ((MainActivity) getActivity()).navigateToDetails(team);
    }


}
