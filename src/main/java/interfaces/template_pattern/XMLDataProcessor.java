package interfaces.template_pattern;

public class XMLDataProcessor extends DataProcessor {
    @Override
    public void readData() {
        System.out.println("XMLDataProcessor is reading!");
    }

    @Override
    public void manipulateData() {
        System.out.println("XMLDataProcessor is manipulating!");
    }

    @Override
    public void saveData() {
        System.out.println("XMLDataProcessor is saving!");
    }

}
