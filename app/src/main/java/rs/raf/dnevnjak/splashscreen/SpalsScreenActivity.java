package rs.raf.dnevnjak.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import rs.raf.dnevnjak.MainActivity;
import rs.raf.dnevnjak.R;

public class SpalsScreenActivity extends AppCompatActivity {

    private Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spals_screen);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SpalsScreenActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },2000);
    }
}