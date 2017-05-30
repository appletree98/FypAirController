package sg.edu.rp.c346.fypaircontroller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    Button btnGate, btnMsg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnGate = (Button)findViewById(R.id.btnGate);
        btnMsg = (Button)findViewById(R.id.btnMsg);

        btnGate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MenuActivity.this, GateActivity.class);
                startActivity(a);
            }
        });

    }

}
