package wtmberlinstudyjam.parrotapp;

import android.databinding.ObservableField;
import android.view.View;

public class Parrot {

    private String parrotSays;

    public ObservableField<String> somethingSaid = new ObservableField<>();
    public ObservableField<String> repeatSomethingSaid = new ObservableField<>();

    public Parrot(String parrotSays) {
        this.parrotSays = parrotSays;
    }

    public void repeatSomethingSaid(View view) {

        // Concatenate "Parrot says..." with the value in somethingSaid
        repeatSomethingSaid.set(parrotSays + " " + somethingSaid.get());
    }
}
