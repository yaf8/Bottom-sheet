package com.example.bottom_sheet_full;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnShow = findViewById(R.id.btnShow);
        btnShow.setOnClickListener(v -> {
            BottomSheetDialog dialog = new BottomSheetDialog(this);

            View view = LayoutInflater.from(getApplicationContext()).inflate(R.layout.bottom_sheet, (LinearLayout) findViewById(R.id.bottom_sheet_container), false);

            view.findViewById(R.id.proceedPayment).setOnClickListener(v1 -> {
                Toast.makeText(getApplicationContext(), "Make Payment", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            });
            dialog.setContentView(view);
            dialog.show();
        });



    }
}
