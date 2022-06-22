package com.example.webviewactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
    CircleImageView android, ios, flutter, game, ethical, cyberSecurity, dataScience, machineLearning;
    public Menu menu;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android = findViewById(R.id.android);
        ios = findViewById(R.id.ios);
        flutter = findViewById(R.id.flutter);
        game = findViewById(R.id.game);
        ethical = findViewById(R.id.ethical);
        cyberSecurity = findViewById(R.id.cyberSecurity);
        dataScience = findViewById(R.id.dataScience);
        machineLearning = findViewById(R.id.machineLearning);
        toolbar = findViewById(R.id.toolbarMain);
        setSupportActionBar(toolbar);


        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/mXjZQX3UzOs");

            }
        });
        ios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gotoUrl("https://youtu.be/3CMYu5Nomgc");

            }
        });
        flutter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gotoUrl("https://youtu.be/j-LOab_PzzU");
            }
        });
        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gotoUrl("https://youtu.be/6luTavBJ3gw");
            }
        });
        ethical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gotoUrl("https://youtu.be/Rgvzt0D8bR4");
            }
        });
        cyberSecurity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gotoUrl("https://youtu.be/yr1Psapupsc");
            }
        });
        dataScience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gotoUrl("https://youtu.be/-ETQ97mXXF0");
            }
        });
        machineLearning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gotoUrl("https://youtu.be/IoZGSQ07e8g");
            }
        });
    }

    private void setSupportActionBar(Toolbar toolbar) {
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.search_icon);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }

    public boolean onCreateOptionMenu() {
        getMenuInflater().inflate(R.menu.home_menu, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuExit:
                Toast.makeText(this, "Exit", Toast.LENGTH_SHORT).show();
                finish();
                break;
            case R.id.menuShare:
                share();
                Toast.makeText(this, "Share Your App", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    private void share() {
        try {
            String appUrl = "https://youtu.be/mXjZQX3UzOs";

            Intent sharing = new Intent(Intent.ACTION_SEND);
            sharing.setType("text/plain");
            sharing.putExtra(Intent.EXTRA_TEXT, appUrl);
            startActivity(Intent.createChooser(sharing, "Share Via"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}