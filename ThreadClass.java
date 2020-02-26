package javaproje2;
import java.util.Random;
public class ThreadClass implements Runnable
{
    private final HisseSenedi hisseSenediList;
    public ThreadClass( HisseSenedi h1){
      hisseSenediList = h1;
    }
    
   @Override
    public void run() {
        Random rand = new Random(); 
        for (int i = 0; i<5 ; i++) {
            int value = 20*(rand.nextInt(50));
            System.out.println("Eklenecek İndeks ve Oluşturulan Random Sayi:"+i+"//"+value);
            hisseSenediList.setHisseSenedi(i,value); 
        } 
    }
}
