package sg.edu.rp.c346.fypaircontroller;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class GateActivity extends AppCompatActivity {

    Spinner spnGate,spnFlight;
    EditText etDirection;
    Button btnDone;
    String defaultTextForSpinnerGate = "Choose the gate";
    String defaultTextForSpinnerFlight = "Choose the flight";
    String[] arrayForGateSpinner = {"E1"};
    String[] arrayForFlightSpinner = {"A101"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gate);

        spnFlight = (Spinner)findViewById(R.id.spnFlight);
        spnGate = (Spinner)findViewById(R.id.spnGate);
        etDirection = (EditText)findViewById(R.id.etDirection);
        btnDone = (Button)findViewById(R.id.btnDone);
        spnGate.setAdapter(new CustomSpinnerAdapter(this, R.layout.activity_gate, arrayForGateSpinner, defaultTextForSpinnerGate));
        spnFlight.setAdapter(new CustomSpinnerAdapter(this, R.layout.activity_gate, arrayForFlightSpinner, defaultTextForSpinnerFlight));

        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GateActivity.this, MenuActivity.class);
                startActivity(i);
            }
        });


    }

}
