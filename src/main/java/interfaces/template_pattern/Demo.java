package interfaces.template_pattern;

public class Demo {
    public static void main(String[] args) {
        System.out.println("################################################################");
        CSVDataProcessor csvDataProcessor = new CSVDataProcessor();
        XMLDataProcessor xmlDataProcessor = new XMLDataProcessor();
        csvDataProcessor.processData();
        xmlDataProcessor.processData();

    }
}
