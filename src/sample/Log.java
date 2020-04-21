package sample;

import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.List;

public class Log implements Observer {
    private Text text;

    public Log(Text text) {

        this.text = text;
    }

    @Override
    public void update(String s) {
        text.setText(text.getText() + " " + s);
    }
}