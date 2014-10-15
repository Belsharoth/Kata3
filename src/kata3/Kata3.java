package kata3;
public class Kata3 {
    public static void main(String[] args) {
        MailReader reader = new MailReader("mails.txt");
        HistogramBuilder<String> builder = new HistogramBuilder<>();
        Histogram<String> histogram = builder.build(reader.readDomain());
        new HistogramViewer<String>().print(histogram);
        
    }
    
}
