package wtmberlinstudyjam.parrotapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtain the EditText and the TextView from the activity_main layout

        // Because findViewById returns a View, we need to cast it to EditText
        editText = (EditText) findViewById(R.id.editText);
        
        // Because findViewById returns a View, we need to cast it to TextView
        textView = (TextView) findViewById(R.id.textView);
    }

    // This method runs when the Button is clicked.
    // We declare that the button runs this method in the activity_main.xml
    // android:onClick="onClickButton"
    public void onClickButton(View view) {

        // getText() method returns "Editable", we need to convert to String to use it
        String somethingSaid = editText.getText().toString();

        // Get the String defined in the strings.xml file
        String parrotSays = getString(R.string.parrot_says);

        // Concatenate "Parrot says..." with the value in somethingSaid
        textView.setText(parrotSays + " " + somethingSaid);
    }
}
