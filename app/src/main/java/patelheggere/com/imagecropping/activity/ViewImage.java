package patelheggere.com.imagecropping.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import patelheggere.com.imagecropping.R;

public class ViewImage extends AppCompatActivity {

        // Declare Variable
        TextView text;
        ImageView imageview;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.view_image);
            Intent i = getIntent();
            int position = i.getExtras().getInt("position");
            String[] filepath = i.getStringArrayExtra("filepath");
            String[] filename = i.getStringArrayExtra("filename");
            text = findViewById(R.id.imagetext);
            text.setText(filename[position]);
            imageview = findViewById(R.id.full_image_view);
            Bitmap bmp = BitmapFactory.decodeFile(filepath[position]);
            imageview.setImageBitmap(bmp);

        }
    }
