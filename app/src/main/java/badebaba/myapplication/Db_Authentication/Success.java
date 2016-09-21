package badebaba.myapplication.Db_Authentication;

/**
 * Created by badebaba on 9/21/2016.
 */

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import badebaba.myapplication.BottomMain;
import badebaba.myapplication.R;

public class Success extends AppCompatActivity {

    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.otpsuccess);

        handler.post(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Success.this, BottomMain.class));
            }
        });
    }
}
