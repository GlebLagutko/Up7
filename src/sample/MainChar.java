package sample;

import javafx.scene.text.Text;

public class MainChar implements Observer {
    private Text text;

    public MainChar(Text text) {
        this.text = text;
    }

    @Override
    public void update(String s) {
        text.setText(s);
    }
}