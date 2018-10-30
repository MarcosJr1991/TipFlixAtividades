package marcosjr.com.calendarview;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CalendarView calendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendarView = (CalendarView) findViewById(R.id.calendar);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int dayofMonth) {
                Toast.makeText(getApplicationContext(),dayofMonth + "/" + month + "/ " + year,Toast.LENGTH_LONG).show();
            }
        });
    }
}
