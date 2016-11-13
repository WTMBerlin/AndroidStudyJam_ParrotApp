package wtmberlinstudyjam.parrotapp;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import wtmberlinstudyjam.parrotapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // Get the String defined in the strings.xml file
        String parrotSays = getString(R.string.parrot_says);

        // Create and bind the parrot to the layout
        binding.setParrot(new Parrot(parrotSays));
    }
}
