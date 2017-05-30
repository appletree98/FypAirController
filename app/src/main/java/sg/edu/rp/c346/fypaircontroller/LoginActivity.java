//package sg.edu.rp.c346.fypaircontroller;
//
//import android.app.ProgressDialog;
//import android.content.Intent;
//import android.os.Bundle;
//import android.support.annotation.NonNull;
//import android.support.v7.app.AppCompatActivity;
//import android.text.TextUtils;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.Toast;
//
///**
// * Created by 15017452 on 30/5/2017.
// */
//
//public class LoginActivity extends AppCompatActivity {
//
//    private EditText mLoginEmailField;
//    private EditText mLoginPasswordField;
//    private Button mLoginBtn;
//    private Button mCreateBtn;
//    private Button mForgetBtn;
//
//
//    private FirebaseAuth mAuth;
//
//    private DatabaseReference mDatabaseUsers;
//
//    private ProgressDialog mProgress;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login);
//
//        mProgress = new ProgressDialog(this);
//
//        mAuth = FirebaseAuth.getInstance();
//
//        mDatabaseUsers = FirebaseDatabase.getInstance().getReference().child("Users");
//
//        mLoginEmailField = (EditText)findViewById(R.id.loginEmailField);
//        mLoginPasswordField = (EditText)findViewById(R.id.loginPasswordField);
//        mLoginBtn = (Button) findViewById(R.id.loginBtn);
//        mCreateBtn = (Button)findViewById(R.id.loginCreateAccountBtn);
//        mForgetBtn = (Button)findViewById(R.id.forgetPasswordBtn);
//
//        mLoginBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                checkLogin();
//
//            }
//        });
//
//        mCreateBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
//            }
//        });
//
//        mForgetBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(LoginActivity.this, ForgetPasswordActivity.class));
//            }
//        });
//
//
//
//
//
//    }
//
//    private void checkLogin() {
//
//        String email = mLoginEmailField.getText().toString().trim();
//        String password = mLoginPasswordField.getText().toString().trim();
//
//        if(!TextUtils.isEmpty(email) && !TextUtils.isEmpty(password)){
//
//            mProgress.setMessage("Logging In...");
//            mProgress.show();
//
//            mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                @Override
//                public void onComplete(@NonNull Task<AuthResult> task) {
//
//                    if(task.isSuccessful()){
//
//                        checkUserExist();
//                        mProgress.dismiss();
//
//                    } else {
//                        Toast.makeText(LoginActivity.this, "Error Login", Toast.LENGTH_LONG).show();
//                    }
//
//                }
//            });
//
//        }
//
//
//    }
//
//    private void checkUserExist() {
//
//        final String user_id = mAuth.getCurrentUser().getUid();
//
//
//
//        mDatabaseUsers.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//
//                if(dataSnapshot.hasChild(user_id)){
//
//                    Intent mainIntent = new Intent(LoginActivity.this, MainActivity.class);
//                    mainIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                    startActivity(mainIntent);
//
//                } else {
//
//                    Toast.makeText(LoginActivity.this, "You need to setup an account", Toast.LENGTH_LONG).show();
//
//                }
//
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });
//
//    }
//}
//
