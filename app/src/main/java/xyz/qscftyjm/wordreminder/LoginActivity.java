package xyz.qscftyjm.wordreminder;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;


public class LoginActivity extends AppCompatActivity {

    private  final static String TAG = "WordReminder";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Log.d(TAG, "LoginActivity : onCreate");


    }

}

