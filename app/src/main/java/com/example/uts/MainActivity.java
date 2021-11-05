package com.example.uts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }

    public void login() {
        //akun
        String usernameAkun = "test";
        String passwordAkun = "123456";
        //Ambil nilai inputan
        TextView usernameTV = findViewById(R.id.username_input);
        TextView passwordTV = findViewById(R.id.password_input);
        String username = usernameTV.getText().toString();
        String password = passwordTV.getText().toString();

        //Cek apakah username dan password benar
        if (username.equals(usernameAkun) && password.equals(passwordAkun)) {
            //menuju home activity
            Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
            startActivity(intent);
            this.finish();
        }  else {
            //Jika tidak tampilkan pesan error
            Toast toast = Toast.makeText(getApplicationContext(), "Username/Password salah", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}