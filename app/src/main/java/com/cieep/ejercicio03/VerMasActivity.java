package com.cieep.ejercicio03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.cieep.ejercicio03.databinding.ActivityVerMasBinding;

public class VerMasActivity extends AppCompatActivity {

    ActivityVerMasBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityVerMasBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        if (getIntent().getExtras() != null){
            binding.lblDesc.setText(getIntent().getExtras().getInt("DESC"));
            binding.lblNombre.setText(getIntent().getExtras().getInt("NAME"));
            binding.imgDesc.setImageResource(getIntent().getExtras().getInt("IMAGEN"));
        }
    }
}