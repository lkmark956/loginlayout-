package com.example.myapplication;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        MaterialButton btnBack = findViewById(R.id.btnBack);
        MaterialCardView cardFiguras = findViewById(R.id.cardFiguras);
        MaterialCardView cardMangas  = findViewById(R.id.cardMangas);
        MaterialCardView cardPoster  = findViewById(R.id.cardPoster);
        MaterialCardView cardMerch   = findViewById(R.id.cardMerch);

        btnBack.setOnClickListener(v -> finish());

        cardFiguras.setOnClickListener(v ->
                Toast.makeText(this, "Figuras", Toast.LENGTH_SHORT).show());

        cardMangas.setOnClickListener(v ->
                Toast.makeText(this, "Mangas", Toast.LENGTH_SHORT).show());

        cardPoster.setOnClickListener(v ->
                Toast.makeText(this, "Poster", Toast.LENGTH_SHORT).show());

        cardMerch.setOnClickListener(v ->
                Toast.makeText(this, "Merch", Toast.LENGTH_SHORT).show());
    }
}
