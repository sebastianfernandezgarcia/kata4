
package kata4.main;

import kata4.view.HistogramDisplay;
import kata4.model.Mail;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailHistogramReader;
import java.util.List;
import kata4.model.Histogram;


public class Kata42 {


    public static void main(String[] args) {
        
        String nameFile = new String("email.txt");
        List<Mail> mailList = MailHistogramReader.read(nameFile);
        
        Histogram<String> histogram = MailHistogramBuilder.built(mailList);
        
  
        HistogramDisplay histogramDisplay = new HistogramDisplay("HistogramDisplay", histogram);
        histogramDisplay.execute();
        
    }
    
}

