package marcosjr.com.splashtipflixgif;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import com.felipecsl.gifimageview.library.GifImageView;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Handler;


public class SplashScreen extends AppCompatActivity {

    private GifImageView gifImageView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        gifImageView = (GifImageView)findViewById(R.id.gifimageview);
        progressBar = (ProgressBar)findViewById(R.id.progressbar);
        progressBar.setVisibility(progressBar.VISIBLE);

        //vamos obter imagem gif de ativos e convertê-lo em array de bytes

       //definir recurso gifimaview
        try {
            InputStream inputStream = getAssets().open("tresd.gif");//nome do gif da pasta assets
            byte[] bytes = IOUtils.toByteArray(inputStream);
            gifImageView.setBytes(bytes);
            gifImageView.startAnimation();
        }
        catch (IOException ex){

        }
        //agora vamos pular actity por 4 segundos
        //espere por segundos e comece activity main

        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SplashScreen.this.startActivity(new Intent(SplashScreen.this,MainActivity.class));
                SplashScreen.this.finish();
            }
        },4000);//4000 = 4 segundos

        }

    }

