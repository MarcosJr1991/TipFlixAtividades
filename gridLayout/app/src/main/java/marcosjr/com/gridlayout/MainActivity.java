package marcosjr.com.gridlayout;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainGrid = (GridLayout)findViewById(R.id.mainGrid);

        //Definir evento
       // setSingleEvent(mainGrid);

        setToggleEvent(mainGrid);
    }

    private void setToggleEvent(GridLayout mainGrid) {
        // dá um loop em todos os itens filhos da grade principal
        for (int i =0;i<mainGrid.getChildCount();i++){

            // você pode ver, todo item filho é cardview, então apenas passamos objeto para cardview
            final CardView cardView = (CardView)mainGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (cardView.getCardBackgroundColor().getDefaultColor()==-1){

                        // muda a cor de fundo
                        cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                        Toast.makeText(MainActivity.this,"estado: verdadeiro",Toast.LENGTH_SHORT).show();

                    }
                    else {
                        // muda a cor de fundo
                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                        Toast.makeText(MainActivity.this,"estado: falso",Toast.LENGTH_SHORT).show();

                    }
                }
            });
        }
    }

    private void setSingleEvent(GridLayout mainGrid) {
        // dá um loop em todos os itens filhos da grade principal
        for (int i =0;i<mainGrid.getChildCount();i++){


            // você pode ver, todo item filho é cardview, então apenas passamos objeto para cardview
            CardView cardView = (CardView)mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // aqui você pode substituir o torrado com start new activity code
                    Toast.makeText(MainActivity.this,"clicado no indice"+ finalI,Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
