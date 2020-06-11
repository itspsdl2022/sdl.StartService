package jp.ac.titech.itpro.sdl.startservice;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate in " + Thread.currentThread());
        setContentView(R.layout.activity_main);
    }

    public void onClickTest1(View v) {
        Log.d(TAG, "onClickTest1 in " + Thread.currentThread());
        Intent intent = new Intent(this, Service1.class);
        intent.putExtra(Service1.EXTRA_MYARG, "Hello, Service1");
        startService(intent);
    }

    public void onClickTest2(View v) {
        Log.d(TAG, "onClickTest2 in " + Thread.currentThread());
        Intent intent = new Intent(this, Service2.class);
        intent.putExtra(Service2.EXTRA_MYARG, "Hello, Service2");
        startService(intent);
    }
}
