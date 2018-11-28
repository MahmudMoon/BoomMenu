package com.example.moon.boommenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.nightonke.boommenu.BoomButtons.BoomButton;
import com.nightonke.boommenu.BoomButtons.SimpleCircleButton;
import com.nightonke.boommenu.BoomMenuButton;
import com.nightonke.boommenu.OnBoomListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    BoomMenuButton bmb;
    int[] icons = {R.drawable.car,R.drawable.mag,R.drawable.man,R.drawable.icon,R.drawable.car};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bmb = (BoomMenuButton)findViewById(R.id.bmb);



        for (int i = 0; i < bmb.getButtonPlaceEnum().buttonNumber(); i++) {
            bmb.addBuilder(new SimpleCircleButton.Builder()
                    .normalImageRes(icons[i]));
        }


        bmb.setOnBoomListener(new OnBoomListener() {
            @Override
            public void onClicked(int index, BoomButton boomButton) {
               Toast.makeText(getApplicationContext(),""+index+"Clicked",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onBackgroundClick() {

            }

            @Override
            public void onBoomWillHide() {

            }

            @Override
            public void onBoomDidHide() {

            }

            @Override
            public void onBoomWillShow() {

            }

            @Override
            public void onBoomDidShow() {

            }
        });


    }
}
