package marcosjr.com.botaoflutuante;

import android.support.design.internal.NavigationMenu;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import io.github.yavski.fabspeeddial.FabSpeedDial;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FabSpeedDial fabSpeedDial = (FabSpeedDial)findViewById(R.id.fabSpeedDial);
        fabSpeedDial.setMenuListener(new FabSpeedDial.MenuListener() {
            @Override
            public boolean onPrepareMenu(NavigationMenu navigationMenu) {
                return true;  //false: don`t show menu
            }

            @Override
            public boolean onMenuItemSelected(MenuItem menuItem) {
                Toast.makeText(MainActivity.this,""+menuItem.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            }

            @Override
            public void onMenuClosed() {

            }
        });
    }
}
