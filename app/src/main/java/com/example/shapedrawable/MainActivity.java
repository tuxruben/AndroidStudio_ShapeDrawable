package com.example.shapedrawable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    private ShapeDrawable miImagen;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(new EjemploView(this));

            miImagen = new ShapeDrawable(new OvalShape());
            miImagen.getPaint().setColor(0xff0000ff);
            miImagen.setBounds(10, 10, 310, 60);
        }


        public class EjemploView extends View {
            public EjemploView (Context context) {
                super(context);
            }
            @Override
            protected void onDraw (Canvas canvas) {

                miImagen.draw(canvas);
            }
        }
    }