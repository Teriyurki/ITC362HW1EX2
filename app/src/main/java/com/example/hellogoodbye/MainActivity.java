package com.example.hellogoodbye;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private static ImageView imgview;
    private static TextView txtview;
    private static Button buttonsbm;
    private int current_image;
    int [] images={R.drawable.img,R.drawable.img_1};
    private int current_text;
    int [] texts={R.string.Hello,R.string.GoodBye};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonclick();
    }
        public void buttonclick()
        {
            imgview=(ImageView)findViewById(R.id.imageView_1);
            txtview=(TextView)findViewById(R.id.tv_1);
            buttonsbm=(Button)findViewById(R.id.button_1);
            buttonsbm.setOnClickListener(
                  new View.OnClickListener()
                  {
                      @Override
                      public void onClick(View view)
                      {
                          current_image++;
                          current_image=current_image % images.length;
                          imgview.setImageResource(images[current_image]);
                          current_text++;
                          current_text=current_text % texts.length;
                          txtview.setText(texts[current_text]);
                      }
                  }
            );
        }
    }

