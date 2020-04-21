package sample;

import java.util.ArrayList;
import java.util.List;

public class TextLogger implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String newText;

    @Override
    public void addObserver(Observer o) {
        if (o != null) {
            observers.add(o);
        }
    }

    @Override
    public void deleteObserver(Observer o) {
        if (o != null) {
            observers.remove(o);
        }
    }

    @Override
    public void deleteObservers() {
        observers.clear();
    }

    @Override
    public void notifyObservers() {
        for (Observer elem : observers) {
            elem.update(newText);
        }
    }

    public void setText(String s) {
        newText = s;
        notifyObservers();
    }

}