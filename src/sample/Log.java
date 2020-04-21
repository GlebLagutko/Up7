package sample;

import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.List;

public class Log implements Observer {
    private Text text;
    private List<String> log = new ArrayList<>();

    public Log( Text text) {

        this.text = text;
    }

    @Override
    public void update(String s) {
        log.add(s);
        StringBuilder str = new StringBuilder();
        for (String st : log) {
            str.append(st).append(" ");
        }
        text.setText(str.toString());
    }
}