package hu.nje.njebead;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import hu.nje.njebead.models.Player;

public class PlayersAdapter extends RecyclerView.Adapter<PlayersAdapter.PlayerHolder>{

    private TeamDetailsFragment teamDetailsFragment;
    private List<Player> playerList;

    public PlayersAdapter(TeamDetailsFragment teamDetailsFragment, List<Player> playerList) {
        this.teamDetailsFragment = teamDetailsFragment;
        this.playerList = playerList;
    }

    @Override
    public PlayersAdapter.PlayerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.player_list_row, parent, false);

        return new PlayersAdapter.PlayerHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PlayersAdapter.PlayerHolder holder, int position) {
        Player player = playerList.get(position);
        holder.nameTextView.setText(player.getVezeteknev());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return playerList.size();
    }

    public class PlayerHolder extends RecyclerView.ViewHolder {
        public TextView nameTextView;


        public PlayerHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.nameTextView);
        }
    }
}
