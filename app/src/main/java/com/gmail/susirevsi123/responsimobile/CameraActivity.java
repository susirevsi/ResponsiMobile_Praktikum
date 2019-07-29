package com.gmail.susirevsi123.responsimobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CameraActivity extends AppCompatActivity {

    private Button btCamera;
    private ImageView ivCamera;
    private static final String TAG = CameraActivity.class.getSimpleName();
    private static final int CAMERA_REQUEST_CODE = 7777;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        btCamera = (Button) findViewById(R.id.bt_camera);
        ivCamera = (ImageView) findViewById(R.id.iv_camera);

        btCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, CAMERA_REQUEST_CODE);
            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case (CAMERA_REQUEST_CODE):
                if (resultCode == Activity.RESULT_OK)
                {
                    Bitmap bitmap;
                    bitmap = (Bitmap) data.getExtras().get("data");
                    ivCamera.setImageBitmap(bitmap);
                }
                break;
        }
    }
}
