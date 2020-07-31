package pramod.com.scorekeeper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tv = null;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.result);
        if(savedInstanceState!=null){
            count = savedInstanceState.getInt("KEY");
            tv.setText(String.valueOf(count));
        }
    }

    public void decrementScore(View view) {
        Toast.makeText(this, "Decrement is Pressed", Toast.LENGTH_SHORT).show();
        count--;
        tv.setText(String.valueOf(count));
    }

    public void incrementScore(View view) {
        Toast.makeText(this, "Increment is Pressed", Toast.LENGTH_SHORT).show();
        count++;
        tv.setText(String.valueOf(count));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle out) {
        super.onSaveInstanceState(out);
        out.putInt("KEY", count);
    }
}