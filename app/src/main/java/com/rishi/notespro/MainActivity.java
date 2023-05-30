package com.rishi.notespro;

import static com.rishi.notespro.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton addNoteBtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        addNoteBtn = findViewById(id.add_note_btn);

        addNoteBtn.setOnClickListener((v) -> startActivity(new Intent(MainActivity.this,NoteDetailsActivity.class)));
    }
}