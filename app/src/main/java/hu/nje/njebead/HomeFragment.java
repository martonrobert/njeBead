package hu.nje.njebead;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.button.MaterialButton;

import java.util.List;

import hu.nje.njebead.models.Team;

public class HomeFragment extends Fragment {

    MaterialButton button;
    TextView textView;

    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.home_fragment, container, false);

        button = rootView.findViewById(R.id.button_Id);
        textView = rootView.findViewById(R.id.TextView_Id);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TeamListFragment teamListFragment = new TeamListFragment();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, teamListFragment).commit();
            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TeamListFragment teamListFragment = new TeamListFragment();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, teamListFragment).commit();
            }
        });

        return rootView;
    }


    @Override
    public void onResume() {
        super.onResume();

        // Ellenőrizze, hogy a HomeFragment látható-e
        if (isVisible()) {
            // A HomeFragment látható, tehát megjelenítjük a gombot
            button.setVisibility(View.VISIBLE);
        } else {
            // A HomeFragment nem látható, tehát elrejtjük a gombot
            button.setVisibility(View.GONE);
        }
    }
}

