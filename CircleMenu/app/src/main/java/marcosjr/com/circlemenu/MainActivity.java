package marcosjr.com.circlemenu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class MainActivity extends AppCompatActivity {

    String arrayName[]={"comedia",
                        "terror",
                        "suspense",
                        "Drama",
                        "acao"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CircleMenu circleMenu = (CircleMenu)findViewById(R.id.circle_menu);
        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"),R.drawable.ic_add,R.drawable.ic_remove)
                .addSubMenu(Color.parseColor("#258CFF"),R.drawable.comedia)
                .addSubMenu(Color.parseColor("#6d4c41"),R.drawable.terror)
                .addSubMenu(Color.parseColor("#ff0000"),R.drawable.suspense)
                .addSubMenu(Color.parseColor("#03a9f4"),R.drawable.drama)
                .addSubMenu(Color.parseColor("#1a237e"),R.drawable.acao)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int i) {
                        Toast.makeText(MainActivity.this,"você selecionou" + arrayName[i],Toast.LENGTH_SHORT).show();

                    }
                });

    }
}
