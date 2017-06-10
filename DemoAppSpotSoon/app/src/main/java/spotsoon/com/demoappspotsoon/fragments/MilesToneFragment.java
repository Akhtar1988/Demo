package spotsoon.com.demoappspotsoon.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import spotsoon.com.demoappspotsoon.R;
import spotsoon.com.demoappspotsoon.adapters.FragmentCutomAdapter;

/**
 *  Created by Akhtar.
 */
public class MilesToneFragment extends Fragment {


    RecyclerView recyclerView;
    FragmentCutomAdapter fragmentCutomAdapter;
    int[] data = new int[10];


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_miles_tone, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.milesRecyclerView);
        fragmentCutomAdapter = new FragmentCutomAdapter(getContext(), data);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(fragmentCutomAdapter);
        fragmentCutomAdapter.notifyDataSetChanged();
        return view;
    }

}
