package badebaba.myapplication;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import badebaba.myapplication.RecyclerViews.TeacherAdapter;

public class Teacher extends Fragment {


    RecyclerView recyclerView2;
    LinearLayoutManager linearLayoutManager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.teacherrecycler, container, false);

        recyclerView2 = (RecyclerView) rootview.findViewById(R.id.teacher_recycler);

        TeacherAdapter adapter = new TeacherAdapter(rootview.getContext());
        linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView2.setAdapter(adapter);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setLayoutManager(linearLayoutManager);

        return rootview;
    }
    }
