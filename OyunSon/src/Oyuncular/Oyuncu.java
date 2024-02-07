
package Oyuncular;
import java.util.List;
import java.util.ArrayList;

public abstract class Oyuncu {
    private double toplamCan;
    private int oyuncuID;
    private String oyuncuAdi;
    private int Skor;
    public ArrayList<Object> nesneListesi;
    public Oyuncu()
	{
		this.setOyuncuID(-1);
		this.setOyuncuAdi("Bilinmeyen");
		this.setSkor(0);
                nesneListesi=new ArrayList<Object>();
	}
    
    public Oyuncu(int oyuncuID, String oyuncuAdi, int Skor)
	{
		this();
		this.setOyuncuID(oyuncuID);
		this.setOyuncuAdi(oyuncuAdi);
		this.setSkor(Skor);
                nesneListesi=new ArrayList<Object>();  
	}
    
    public void skorGoster(double a)
    {
       
    };
    
    public Object nesneSec(Object s)
    {
        
        return null;
        
    };
    
      public double netSkorugor()
    {
        getToplamCan();
        return 0;
    };
    
    
    
    public int getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public int getSkor() {
        return Skor;
    }

    public void setSkor(int Skor) {
        this.Skor = Skor;
    }
      public double getToplamCan() {
        return toplamCan;
    }

    public double setToplamCan(double toplamCan) {
       
        return  this.toplamCan = toplamCan;
    }
    
    
}
