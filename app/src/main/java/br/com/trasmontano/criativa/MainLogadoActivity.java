package br.com.trasmontano.criativa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainLogadoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_logado);

        overridePendingTransition(R.anim.slide_direita, R.anim.splash );

        new Timer().schedule(new TimerTask() {

            @Override
            public void run() {
                finish();
                Intent i = new Intent(MainLogadoActivity.this, MainActivity.class);
                startActivity(i);

            }
        }, 6600);


    }
}
