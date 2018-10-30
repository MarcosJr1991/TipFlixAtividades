package marcosjr.com.fragmentrecyclerview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Fragment3 extends Fragment {

    View v;
    private RecyclerView myrecyclerView;
    private List<Filme>filmeList;

    public Fragment3() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       v = inflater.inflate(R.layout.fragment3,container,false);
       myrecyclerView = (RecyclerView)v.findViewById(R.id.film_recyclerview);
       RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),filmeList);
       myrecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
       myrecyclerView.setAdapter(recyclerViewAdapter);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        filmeList = new ArrayList<>();
        filmeList.add(new Filme("Capitão America","Ação",R.drawable.capitanamerica));
        filmeList.add(new Filme("Capitão America","Ação",R.drawable.capitanamerica));
        filmeList.add(new Filme("Capitão America","Ação",R.drawable.capitanamerica));
        filmeList.add(new Filme("Capitão America","Ação",R.drawable.capitanamerica));
        filmeList.add(new Filme("Capitão America","Ação",R.drawable.capitanamerica));
        filmeList.add(new Filme("Capitão America","Ação",R.drawable.capitanamerica));
        filmeList.add(new Filme("Capitão America","Ação",R.drawable.capitanamerica));
        filmeList.add(new Filme("Capitão America","Ação",R.drawable.capitanamerica));
    }
}
