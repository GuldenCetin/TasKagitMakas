
package Nesneler;


public abstract class Nesne {
   
    public double dayaniklilik=20;
    private int seviyePuani;
    private String name;
    public boolean nesneKullanildiMi;
    
    public Nesne() {
        this.setDayaniklilik(20);
        this.setSeviyePuani(0); 
        this.nesneKullanildiMi=false;
        
    }

    public Nesne(double dayaniklilik, int seviyePuani,String name) {  
        this.setDayaniklilik(dayaniklilik);
        this.setSeviyePuani(seviyePuani);
        this.setName(name);
        this.nesneKullanildiMi=false;
       
    }
    
    public void nesnePuaniGoster(double a)
    {
        
    };
    
    public double etkiHesapla(Object a)
    {
        return 0;
    };
    
    public double durumGuncelle(double a)
    {
        return 0;
    };
    
     public double getDayaniklilik() {
        return dayaniklilik;
    }

    public  void setDayaniklilik(double dayaniklilik) {
        this.dayaniklilik = dayaniklilik;
    }

    public int getSeviyePuani() {
        return seviyePuani;
    }

    public void setSeviyePuani(int seviyePuani) {
        this.seviyePuani = seviyePuani;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNesneKullanildiMi() {
        return nesneKullanildiMi;
    }

    public void setNesneKullanildiMi(boolean nesneKullanildiMi) {
        this.nesneKullanildiMi = nesneKullanildiMi;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
