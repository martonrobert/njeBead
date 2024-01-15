package hu.nje.njebead;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import hu.nje.njebead.models.Team;


public class TeamsAdapter extends RecyclerView.Adapter<TeamsAdapter.TeamHolder> {

    private TeamListFragment teamListFragment;
    private List<Team> teamList;

    public TeamsAdapter(TeamListFragment teamListFragment, List<Team> teamList) {
        this.teamListFragment = teamListFragment;
        this.teamList = teamList;
    }

    @Override
    public TeamHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.team_list_row, parent, false);

        return new TeamHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull TeamHolder holder, int position) {
        Team team = teamList.get(position);
        holder.nameTextView.setText(team.getCsapatnev());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamListFragment.selectItemAndNavigate(team);
            }
        });

    }

    @Override
    public int getItemCount() {
        return teamList.size();
    }

    public class TeamHolder extends RecyclerView.ViewHolder {
        public TextView nameTextView;


        public TeamHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.nameTextView);
        }
    }

}

