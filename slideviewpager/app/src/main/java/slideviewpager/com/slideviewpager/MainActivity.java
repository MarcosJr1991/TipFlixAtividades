package slideviewpager.com.slideviewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private String[] imageUrls = new String[]{

            "https://cdn.pixabay.com/photo/2018/01/24/17/33/light-bulb-3104355_1280.jpg",
            "https://cdn.pixabay.com/photo/2018/08/28/17/16/light-bulb-3637997_1280.jpg",
            "https://cdn.pixabay.com/photo/2018/08/23/07/34/workplace-3625400_1280.jpg",
            "https://cdn.pixabay.com/photo/2018/08/28/11/45/code-3637299_1280.jpg",
            "https://cdn.pixabay.com/photo/2018/06/21/20/22/lamp-3489394_960_720.jpg",
            "https://cdn.pixabay.com/photo/2018/05/08/08/44/artificial-intelligence-3382507_1280.jpg"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.view_pager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(this,imageUrls);
        viewPager.setAdapter(adapter);
    }
}
