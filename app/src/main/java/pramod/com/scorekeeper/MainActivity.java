package pramod.com.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.result);
    }

    public void decrementScore(View view) {
        Toast.makeText(this, "Decrement is Pressed", Toast.LENGTH_SHORT).show();
        count--;
        tv.setText(count);
    }

    public void incrementScore(View view) {
        Toast.makeText(this, "Increment is Pressed", Toast.LENGTH_SHORT).show();
        count++;
        tv.setText(count);
    }
}