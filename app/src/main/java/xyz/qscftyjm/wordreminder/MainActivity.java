package xyz.qscftyjm.wordreminder;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

    private Button bt_tab[]=new Button[3];
    private LinearLayout lin_page[]=new LinearLayout[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lin_page[0]=(LinearLayout)findViewById(R.id.page_home);
        lin_page[1]=(LinearLayout)findViewById(R.id.page_wordlist);
        lin_page[2]=(LinearLayout)findViewById(R.id.page_userinfo);
        bt_tab[0]=(Button)findViewById(R.id.bt_tab_home);
        bt_tab[1]=(Button)findViewById(R.id.bt_tab_wordlist);
        bt_tab[2]=(Button)findViewById(R.id.bt_tab_userinfo);

        bt_tab[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lin_page[0].setVisibility(View.VISIBLE);
                lin_page[1].setVisibility(View.GONE);
                lin_page[2].setVisibility(View.GONE);
            }
        });

        bt_tab[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lin_page[0].setVisibility(View.GONE);
                lin_page[1].setVisibility(View.VISIBLE);
                lin_page[2].setVisibility(View.GONE);
            }
        });

        bt_tab[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lin_page[0].setVisibility(View.GONE);
                lin_page[1].setVisibility(View.GONE);
                lin_page[2].setVisibility(View.VISIBLE);
            }
        });

    }

    
}
