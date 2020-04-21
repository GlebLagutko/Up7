package sample;


interface Subject {
    void addObserver(Observer o);

    void deleteObserver(Observer o);

    void deleteObservers();

    void notifyObservers();

}