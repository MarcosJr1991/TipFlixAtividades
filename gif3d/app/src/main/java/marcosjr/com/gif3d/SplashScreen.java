package marcosjr.com.gif3d;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.felipecsl.gifimageview.library.GifImageView;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

public class SplashScreen extends AppCompatActivity {

    private GifImageView gifImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        gifImageView = (GifImageView)findViewById(R.id.gifimageView);

        //vamos obter o gif image a partir de ativos e convertê-lo em array de bytes
        //definir recurso gifimageview
        try{
            InputStream inputStream = getAssets().open("tresd.gif");
            byte[]bytes = IOUtils.toByteArray(inputStream);
            gifImageView.setBytes(bytes);
            gifImageView.startAnimation();

        }
        catch (IOException ex){

        }

        //agora vamos pular a atividade por 3 segundos e começar a atividade
        //aguarde segundos e inicie a atividade principal
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SplashScreen.this.startActivity(new Intent(SplashScreen.this,MainActivity.class));
                SplashScreen.this.finish();
            }
        },3000);//3000 = 3 segundos
    }
}
