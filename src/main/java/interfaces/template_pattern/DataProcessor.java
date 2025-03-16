package interfaces.template_pattern;

public abstract class DataProcessor {
    public void processData() {
        readData();
        manipulateData();
        saveData();
    }
    public abstract void readData();
    public abstract void manipulateData();
    public abstract void saveData();

}
