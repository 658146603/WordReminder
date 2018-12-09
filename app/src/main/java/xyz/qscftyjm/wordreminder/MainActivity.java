package xyz.qscftyjm.wordreminder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends Activity implements View.OnClickListener{

    public  static String TAG = "WordReminder";
    private Button bt_tab[]=new Button[3];
    private LinearLayout lin_page[]=new LinearLayout[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "MainActivity : onCreate");
        lin_page[0]=findViewById(R.id.page_home);
        lin_page[1]=findViewById(R.id.page_wordlist);
        lin_page[2]=findViewById(R.id.page_userinfo);
        bt_tab[0]=findViewById(R.id.bt_tab_home);
        bt_tab[1]=findViewById(R.id.bt_tab_wordlist);
        bt_tab[2]=findViewById(R.id.bt_tab_userinfo);
        bt_tab[0].setOnClickListener(this);
        bt_tab[1].setOnClickListener(this);
        bt_tab[2].setOnClickListener(this);
        startActivity(new Intent(MainActivity.this, WelcomeActivity.class));
        startService(new Intent(this, MakeNotificationService.class));

    }


    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.bt_tab_home:
                lin_page[0].setVisibility(View.VISIBLE);
                lin_page[1].setVisibility(View.GONE);
                lin_page[2].setVisibility(View.GONE);
                break;
            case R.id.bt_tab_wordlist:
                lin_page[0].setVisibility(View.GONE);
                lin_page[1].setVisibility(View.VISIBLE);
                lin_page[2].setVisibility(View.GONE);
                break;
            case R.id.bt_tab_userinfo:
                lin_page[0].setVisibility(View.GONE);
                lin_page[1].setVisibility(View.GONE);
                lin_page[2].setVisibility(View.VISIBLE);
            default:
                break;
        }
    }
}
