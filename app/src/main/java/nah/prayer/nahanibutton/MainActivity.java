package nah.prayer.nahanibutton;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import nah.prayer.anibuttonlib.TransTouchListener;
import nah.prayer.nahanibutton.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding b = DataBindingUtil.setContentView(this,R.layout.activity_main);
/*        NahImageView iv = findViewById(R.id.iv);
        NahImageButton iv_btn = findViewById(R.id.iv_btn);
        NahButton btn = findViewById(R.id.btn);
        NahLayout layout = findViewById(R.id.layout);
        NahTextView tv = findViewById(R.id.tv);*/

        b.iv.setOnTouchListerer(new TransTouchListener() {
            @Override
            public void onTouch() {
                Toast.makeText(MainActivity.this, "iv click", Toast.LENGTH_SHORT).show();
            }
        });

        b.ivBtn.setOnTouchListerer(new TransTouchListener() {
            @Override
            public void onTouch() {
                Toast.makeText(MainActivity.this, "iv_btn click", Toast.LENGTH_SHORT).show();
            }
        });

        b.btn.setOnTouchListerer(new TransTouchListener() {
            @Override
            public void onTouch() {
                Toast.makeText(MainActivity.this, "btn click", Toast.LENGTH_SHORT).show();
            }
        });

        b.layout.setOnTouchListerer(new TransTouchListener() {
            @Override
            public void onTouch() {
                Toast.makeText(MainActivity.this, "layout click", Toast.LENGTH_SHORT).show();
            }
        });

        b.tv.setOnTouchListerer(new TransTouchListener() {
            @Override
            public void onTouch() {
                Toast.makeText(MainActivity.this, "tv click", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
