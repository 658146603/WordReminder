package xyz.qscftyjm.wordreminder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bt_login, bt_register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        bt_login=findViewById(R.id.bt_login);
        bt_register=findViewById(R.id.bt_register);
        bt_register.setOnClickListener(this);
        bt_login.setOnClickListener(this);

    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.bt_login:
                Intent intent0=new Intent(this, LoginActivity.class);
                startActivity(intent0);
                Toast.makeText(this, "Login", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_register:
                Intent intent1=new Intent(this, RegisterActivity.class);
                startActivity(intent1);
                Toast.makeText(this, "Register", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
