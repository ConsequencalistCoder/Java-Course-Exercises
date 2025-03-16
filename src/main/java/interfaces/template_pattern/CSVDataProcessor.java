package interfaces.template_pattern;

public class CSVDataProcessor extends DataProcessor {
    @Override
    public void readData() {
        System.out.println("CSVDataProcessor is reading!");
    }

    @Override
    public void manipulateData() {
        System.out.println("CSVDataProcessor is manipulating!");
    }

    @Override
    public void saveData() {
        System.out.println("CSVDataProcessor is saving!");
    }

}
