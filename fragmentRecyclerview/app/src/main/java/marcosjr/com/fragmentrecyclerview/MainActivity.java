package marcosjr.com.fragmentrecyclerview;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout)findViewById(R.id.tablayout_id);
        viewPager = (ViewPager)findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        //adicionando Fragment aqui
        adapter.AddFragment(new Fragment1(),"Lista 1");
        adapter.AddFragment(new Fragment2()," Lista 2");
        adapter.AddFragment(new Fragment3(),"Lista 3");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_local_movies);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_movie);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_movie_filter);

        //remover sombra da barra de ação

        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);

    }
}
