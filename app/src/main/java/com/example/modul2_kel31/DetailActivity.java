package com.example.modul2_kel31;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    private TextView tvFirstName;
    private TextView tvEmail;
    private ImageView imgAvatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvFirstName = findViewById(R.id.tv_first_name);
        tvEmail = findViewById(R.id.tv_email);
        imgAvatar = findViewById(R.id.img_avatar);

        if (getIntent().hasExtra("name")) {
            String firstName = getIntent().getStringExtra("name");
            tvFirstName.setText(firstName);
        }

        if (getIntent().hasExtra("email")) {
            String email = getIntent().getStringExtra("email");
            tvEmail.setText(email);
        }

        if (getIntent().hasExtra("avatar")) {
            String avatarUrl = getIntent().getStringExtra("avatar");
            Glide.with(this).load(avatarUrl).into(imgAvatar);
        }
    }
}
