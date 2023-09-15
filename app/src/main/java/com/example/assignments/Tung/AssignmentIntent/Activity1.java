package com.example.assignments.Tung.AssignmentIntent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.example.assignments.R;

public class Activity1 extends AppCompatActivity {
    private final int REQUEST_CODE = 3333;
    private Button btnSendData;
    private ImageView img;
    private Button btnGetImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.asm_intent_activity_1);

        btnSendData = (Button) findViewById(R.id.btn_send_data);
        img = (ImageView) findViewById(R.id.img);
        btnGetImage = (Button) findViewById(R.id.btn_get_image);

        btnSendData.setOnClickListener(v -> {
            // Send Serializable by Intent
            MyObj obj = new MyObj(333, "username");
            Intent intent = new Intent(Activity1.this, Activity2.class);
//            intent.putExtra("DATA", obj);
//            startActivity(intent);

            // Send Serializable by Bundle
            Bundle bundle = new Bundle();
            bundle.putSerializable("DATA", obj);
            intent.putExtras(bundle);
            startActivity(intent);
        });

        btnGetImage.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
            intent.setType("image/*");
            startActivityForResult(intent, REQUEST_CODE);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK && data != null) {
            Uri uri = data.getData();
            img.setImageURI(uri);
        }
    }
}