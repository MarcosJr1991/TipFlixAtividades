package marcosjr.com.recyclerviewanimation;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.Button;

import marcosjr.com.recyclerviewanimation.Adapter.SimpleRecyclerAdapter;


public class MainActivity extends AppCompatActivity {

    Button btnFallDown, btnSlideFromBottom,btnSlideFromRight;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFallDown = (Button)findViewById(R.id.btnFallDown);
        btnSlideFromBottom = (Button)findViewById(R.id.btnBottom);
        btnSlideFromRight = (Button)findViewById(R.id.btnRight);


        recyclerView =(RecyclerView)findViewById(R.id.recyclerview);
        //recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(new GridLayoutManager(this,4));

       btnFallDown.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
                runAnimation(recyclerView,0);
           }
       });

       btnSlideFromBottom.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               runAnimation(recyclerView,1);
           }
       });

      btnSlideFromRight.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               runAnimation(recyclerView,3);
           }
       });




    }

    private void runAnimation(RecyclerView recyclerView, int type) {
        Context context = recyclerView.getContext();
        LayoutAnimationController controller = null;

        if (type == 0)//fall down animation
            controller = AnimationUtils.loadLayoutAnimation(context,R.anim.layout_fall_down);

        else if (type == 1)//SLIDE FROM BOTTOM
            controller = AnimationUtils.loadLayoutAnimation(context,R.anim.layout_slide_from_bottom);

        else if (type == 2)//Slide from Right
            controller = AnimationUtils.loadLayoutAnimation(context,R.anim.item_animation_slide_from_right);

        else if (type == 3)//Slide from left
            controller = AnimationUtils.loadLayoutAnimation(context,R.anim.item_animation_slide_from_left);



        SimpleRecyclerAdapter adapter = new SimpleRecyclerAdapter();
        recyclerView.setAdapter(adapter);


        //set anim
        recyclerView.setLayoutAnimation(controller);
        recyclerView.getAdapter().notifyDataSetChanged();
        recyclerView.scheduleLayoutAnimation();

    }
}
