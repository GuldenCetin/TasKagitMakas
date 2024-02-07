
package Oyuncular;
import java.util.Random;

public class Bilgisayar extends Oyuncu{
    private double toplamCan=100;
    public Bilgisayar()
	{
		super(1, "Bilgisayar", 0);
	}

	public Bilgisayar(int oyuncuID, String oyuncuAdi, int Skor)
	{
		super(oyuncuID, oyuncuAdi, Skor);
	}

        
    @Override
    public Object nesneSec(Object s) {
        
    Random r=new Random();
    int randomInt=r.nextInt(5);
    return nesneListesi.get(randomInt); 
    }

    @Override
    public void skorGoster(double a) {
     
        setToplamCan(getToplamCan()-a);
        
        
    }
    
     public double netSkorugor()
    {
     return getToplamCan();
    };
    
  public double getToplamCan() {
        return toplamCan;
    }

    public double setToplamCan(double toplamCan) {
       
        return  this.toplamCan = toplamCan;
    }
 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
}
