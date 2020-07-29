package pramod.com.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void decrementScore(View view) {
        Toast.makeText(this, "Decrement is Pressed", Toast.LENGTH_SHORT).show();
    }

    public void incrementScore(View view) {
        Toast.makeText(this, "Increment is Pressed", Toast.LENGTH_SHORT).show();
    }
}