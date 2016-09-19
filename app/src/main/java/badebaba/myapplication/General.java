package badebaba.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import badebaba.myapplication.RecyclerViews.CardAdapter;

/**
 * Created by badebaba on 9/18/2016.
 */

public class General extends Fragment {

    public static final String TAG = "TAG";
    RecyclerView recyclerView2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.cardviewrecycler, container, false);
        recyclerView2 = (RecyclerView) rootView.findViewById(R.id.my_recycler_view2);

        CardAdapter cardAdapter = new CardAdapter(getActivity());
        recyclerView2.setAdapter(cardAdapter);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getActivity()));

        return rootView;
    }
}
