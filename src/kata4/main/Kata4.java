
package kata4.main;

import java.util.List;


public class Kata4 {


    public static void main(String[] args) {
        
        String nameFile = new String("email.txt");
        List<Mail> mailList = MailHistogramReader.read(nameFile);
        
        Histogram<String> histogram = MailHistogramBuilder.built(mailList);
        
  
        HistogramDisplay histogramDisplay = new HistogramDisplay("HistogramDisplay", histogram);
        histogramDisplay.execute();
        
    }
    
}

