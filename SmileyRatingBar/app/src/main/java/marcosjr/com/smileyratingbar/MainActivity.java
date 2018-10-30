package marcosjr.com.smileyratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hsalf.smilerating.SmileRating;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SmileRating smileRating = (SmileRating) findViewById(R.id.smile_rating);
        smileRating.setOnSmileySelectionListener(new SmileRating.OnSmileySelectionListener() {
            @Override
            public void onSmileySelected(int smiley, boolean reselected) {

                switch (smiley){
                    case SmileRating.BAD:
                        Toast.makeText(MainActivity.this,"BAD",Toast.LENGTH_SHORT).show();
                        break;
                    case SmileRating.GOOD:
                        Toast.makeText(MainActivity.this,"GOOD",Toast.LENGTH_SHORT).show();
                        break;
                    case SmileRating.GREAT:
                        Toast.makeText(MainActivity.this,"GREAT",Toast.LENGTH_SHORT).show();
                        break;
                    case SmileRating.OKAY:
                        Toast.makeText(MainActivity.this,"OKAY",Toast.LENGTH_SHORT).show();
                        break;
                    case SmileRating.TERRIBLE:
                        Toast.makeText(MainActivity.this,"TERRIBLE",Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
        smileRating.setOnRatingSelectedListener(new SmileRating.OnRatingSelectedListener() {
            @Override
            public void onRatingSelected(int level, boolean reselected) {
                Toast.makeText(MainActivity.this,"SELECTED RATING"+level,Toast.LENGTH_SHORT).show();

            }
        });

    }
}
