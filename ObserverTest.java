package javaproje2;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ObserverTest {
    
    public static void main(String[] args) {
     
        HisseSenedi h1= new HisseSenedi(5); // Hisse Senetlerinin Tutulması
        ThreadClass setterThread=new ThreadClass(h1);  // Setlemek için Thread Yapısı
        new FirmaGozlemci(h1); // Gözlemciler
        new FirmaGozlemci(h1);
        new FirmaGozlemci(h1);
        new FirmaGozlemci(h1);
        new FirmaGozlemci(h1);
        try{
            
            File dosya = new File("Guncelleme.txt");
            FileWriter yazici = new FileWriter(dosya,true);
            BufferedWriter yaz = new BufferedWriter(yazici);
            yaz.write("------  A-B-C-D-E Firmalarının Atanan Default Hisse Miktarları -------");
            yaz.write("\n"+"A Firmasının Hisse Miktarı:"+h1.getHisseSenedi("A")+"\n");
            yaz.write("\n"+"B Firmasının Hisse Miktarı:"+h1.getHisseSenedi("B")+"\n");
            yaz.write("\n"+"C Firmasının Hisse Miktarı:"+h1.getHisseSenedi("C")+"\n");
            yaz.write("\n"+"D Firmasının Hisse Miktarı:"+h1.getHisseSenedi("D")+"\n");
            yaz.write("\n"+"E Firmasının Hisse Miktarı:"+h1.getHisseSenedi("E")+"\n");
             yaz.close();
            }
            catch (Exception hata){
                  hata.printStackTrace();
            }
        System.out.println("------  A-B-C-D-E Firmalarının Atanan Default Hisse Miktarları -------");
        System.out.println("A Firmasının Hisse Miktarı:"+h1.getHisseSenedi("A"));
        System.out.println("B Firmasının Hisse Miktarı:"+h1.getHisseSenedi("B"));
        System.out.println("C Firmasının Hisse Miktarı:"+h1.getHisseSenedi("C"));
        System.out.println("D Firmasının Hisse Miktarı:"+h1.getHisseSenedi("D"));
        System.out.println("E Firmasının Hisse Miktarı:"+h1.getHisseSenedi("E"));
     
        ExecutorService executorService = Executors.newCachedThreadPool(); //Thread Çalışma Mantığı
        executorService.execute(setterThread);
        executorService.shutdown();
    } 
}
