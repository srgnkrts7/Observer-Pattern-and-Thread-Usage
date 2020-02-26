package javaproje2;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FirmaGozlemci extends Observer{

    public FirmaGozlemci(HisseSenedi h1){
        this.senetList=h1;
        this.senetList.attach(this);
    }
    @Override
    public void update() {
        try{
            File dosya = new File("Sonuclar.txt");
            FileWriter yazici = new FileWriter(dosya,true);
            BufferedWriter yaz = new BufferedWriter(yazici);
                
            if(senetList.observers.get(0).hashCode()==this.hashCode()){
                      
                yaz.write(this.hashCode()+"No'lu Gözlemci Tarafından Güncellenen Firma ve Güncellenmiş HisseSenedi:"+"A FİRMASI: "+senetList.getHisseSenedi("A")+"\n");
                
            }else if(senetList.observers.get(1).hashCode()==this.hashCode()){
                      
                yaz.write(this.hashCode()+"No'lu Gözlemci Tarafından Güncellenen Firma ve Güncellenmiş HisseSenedi:"+"B FİRMASI: "+senetList.getHisseSenedi("B")+"\n");
                        
            }else if(senetList.observers.get(2).hashCode()==this.hashCode()){
                      
                yaz.write(this.hashCode()+"No'lu Gözlemci Tarafından Güncellenen Firma ve Güncellenmiş HisseSenedi:"+"C FİRMASI: "+senetList.getHisseSenedi("C")+"\n");
            }
            else if(senetList.observers.get(3).hashCode()==this.hashCode()   ){
                      
                yaz.write(this.hashCode()+"No'lu Gözlemci Tarafından Güncellenen Firma ve Güncellenmiş HisseSenedi:"+"D FİRMASI: "+senetList.getHisseSenedi("D")+"\n");
                       
            }else if(senetList.observers.get(4).hashCode()==this.hashCode()) {
                      
                yaz.write(this.hashCode()+"No'lu Gözlemci Tarafından Güncellenen Firma ve Güncellenmiş HisseSenedi:"+"E FİRMASI: "+senetList.getHisseSenedi("E")+"\n");
            }
                   yaz.close();
        }
        catch (Exception hata){
            hata.printStackTrace();
        }
    }
}
