package com.ge20070469.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    private TextView scale, rotate, trans, alpha;
    private Button anim1, anim2, anim3, anim4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scale = findViewById(R.id.scale);
        rotate = findViewById(R.id.rotate);
        trans = findViewById(R.id.translate);
        alpha = findViewById(R.id.alpha);
        anim1 = findViewById(R.id.anim1);
        anim2 = findViewById(R.id.anim2);
        anim3 = findViewById(R.id.anim3);
        anim4 = findViewById(R.id.anim4);

        anim1.setOnClickListener(this);
        anim2.setOnClickListener(this);
        anim3.setOnClickListener(this);
        anim4.setOnClickListener(this);





    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.anim1:

                scale.animate().scaleX(0.5f).scaleY(0.5f);
                break;

            case R.id.anim2:

                rotate.animate().rotationBy(10000);

                break;

            case R.id.anim3:

                trans.animate().translationX(180f);
                break;

            case R.id.anim4:

                alpha.animate().alpha(0.5f);
                break;

        }

    }
}
