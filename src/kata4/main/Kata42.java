
package kata4.main;

import kata4.view.HistogramDisplay;
import kata4.model.Mail;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailHistogramReader;
import java.util.List;
import kata4.model.Histogram;


public class Kata42 {
        
    public static List<Mail> input() {
        String nameFile = new String("email.txt");
        List<Mail> mailList = MailHistogramReader.read(nameFile);
        return mailList;
    }
            
    public static Histogram<String> process(List<Mail> mailList){
            Histogram<String> histogram = MailHistogramBuilder.built(mailList);
            return histogram;
        }
        
  public static void output(Histogram<String> histogram) {
        HistogramDisplay histogramDisplay = new HistogramDisplay("HistogramDisplay", histogram);
        histogramDisplay.execute();
  }
      
  
  public static void execute() {
      List<Mail> mailList = input();
      Histogram<String> histogram = process(mailList);
      output(histogram);
  }
        
    public static void main(String[] args) {
        Kata42 kata4 = new Kata42();
        kata4.execute();    
    }
    
}

