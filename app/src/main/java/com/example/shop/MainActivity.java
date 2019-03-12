package com.example.shop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Mechanism megaBicycle = new Bicycle("015", "black");
        Mechanism miniScooter = new Scooter("07","white");
        Parameters strongHelmet = new Helmet("05","black");
        Parameters goodBoots = new Boots("13","grey");

        goodBoots.deliver();
        strongHelmet.sell();
        miniScooter.make();

    }
}
