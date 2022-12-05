package com.example.git_source;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.git_source.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        click();
        restart();
    }

    private void click(){
        binding.btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Thread.sleep(3000);
                    binding.textResult.setText("Update");
                    binding.btnClick.setVisibility(View.INVISIBLE);
                    binding.btnRestart.setVisibility(View.VISIBLE);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
    private void restart(){
        binding.btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.btnRestart.setVisibility(View.INVISIBLE);
                binding.textResult.setText("Develop");
                binding.btnClick.setVisibility(View.VISIBLE);
            }
        });
    }
}