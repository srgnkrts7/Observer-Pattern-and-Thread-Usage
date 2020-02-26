package javaproje2;
import java.util.ArrayList;
import java.util.List;
import java.security.SecureRandom;

public class HisseSenedi {
    
    public List<Observer> observers = new ArrayList<Observer>();
    public List<Integer> hisseSenetleri;
    private static final SecureRandom generator = new SecureRandom();
    
    public HisseSenedi(int size) {
     hisseSenetleri= new ArrayList<Integer>(size);
     hisseSenetleri.add(100);
     hisseSenetleri.add(200);
     hisseSenetleri.add(300);
     hisseSenetleri.add(400);
     hisseSenetleri.add(500);
   } 
    public int getHisseSenedi(String firmaIsim) {
        if(firmaIsim=="A"){
            return hisseSenetleri.get(0);
        }else if(firmaIsim=="B"){
            return hisseSenetleri.get(1);
        }else if(firmaIsim=="C"){
            return hisseSenetleri.get(2);
        }else if(firmaIsim=="D"){
            return hisseSenetleri.get(3);
        }else{
            return hisseSenetleri.get(4);
        }
    }

    public void setHisseSenedi(int indeks,int randomSayi) {
    try {
         
        Thread.sleep(generator.nextInt(5000)); 
    } 
    catch (InterruptedException ex) {
        Thread.currentThread().interrupt(); 
    }
    hisseSenetleri.add(indeks, randomSayi);
    System.out.println((indeks+1)+".Elemanın Güncellenmiş Hali:"+hisseSenetleri.get(indeks));
    notifyNecessaryObservers(observers.get(indeks));
   }

   public void attach(Observer observerObject){
      observers.add(observerObject);		
   }
   public void deattach(Observer observerObject){
      observers.remove(observerObject);		
   }

   public void notifyNecessaryObservers(Observer observer){
      
       observer.update();
      
   } 	
}
