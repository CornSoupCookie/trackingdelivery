package com.example.trackingdelivery.View.OtherAti;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.trackingdelivery.R;
import com.example.trackingdelivery.View.Delivery.DeliveryDetail;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    String company = "kr.cjlogistics";
    String invoiceNumber = "623106564786";




    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_delivery:

                    return true;
                case R.id.navigation_search:

                    intent = new Intent(MainActivity.this, DeliveryDetail.class);
                    intent.putExtra("company", company);
                    intent.putExtra("invoiceNumber", invoiceNumber);
                    startActivity(intent);

                    return true;
                case R.id.navigation_myhome:

                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
