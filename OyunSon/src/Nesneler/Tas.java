
package Nesneler;

import java.util.Objects;

public class Tas extends Nesne{
    
    private double makasMukavemet;
    private double kagitMukavemet;
    private double tasMukavemet;
    private double ustaMakasMukavemet;
    private double ozelKagitMukavemet;
      private double agirTasMukavemet;
    private int katilik;
    public boolean nesneKullanildiMi;
    public Tas(int katilik, double dayaniklilik, int seviyePuani,String name) {
        super(dayaniklilik, seviyePuani,name);
        this.katilik = katilik;
        this.nesneKullanildiMi=false;
    }
    
    public Tas() {
        this.katilik = 0;
        this.nesneKullanildiMi=false;
    }
    @Override
    public double durumGuncelle(double a ) {
        double durum=getDayaniklilik()-a;
        setDayaniklilik((getDayaniklilik()-a));
        return durum ;
    }
    @Override
    public double etkiHesapla(Object a) {
        if(a instanceof Kagit)
        {
            setKagitMukavemet(5);
            return  getKagitMukavemet();
        }

         if(a instanceof Tas)
        {
            setTasMukavemet(0);
            return getTasMukavemet();
        }

         if(a  instanceof Makas)
        {
            setMakasMukavemet(1.25);
            return getMakasMukavemet();
        }
         
         
           if(a  instanceof UstaMakas)
        {
            setUstaMakasMukavemet(2.5);
            return getUstaMakasMukavemet();
        }
           
            if(a  instanceof AgirTas)
        {
            setUstaMakasMukavemet(0);
            return getUstaMakasMukavemet();
        }
           
           
            if(a  instanceof OzelKagit)
        {
            setUstaMakasMukavemet(10);
            return getUstaMakasMukavemet();
        }
 
           
        return 0;
    }
   @Override
    public void nesnePuaniGoster(double a) {
        System.out.println("Taş son dayaniklilik degeri:"+ a);
};

    
    public int getKatilik() {
        return katilik;
    }

    public void setKatilik(int katilik) {
        this.katilik = katilik;
    }

    public double getMakasMukavemet() {
        return makasMukavemet;
    }

    public void setMakasMukavemet(double makasMukavemet) {
        this.makasMukavemet = makasMukavemet;
    }

    public double getKagitMukavemet() {
        return kagitMukavemet;
    }

    public void setKagitMukavemet(double kagitMukavemet) {
        this.kagitMukavemet = kagitMukavemet;
        
    }
     public double getTasMukavemet() {
        return tasMukavemet;
    }

    public void setTasMukavemet(double tasMukavemet) {
        this.tasMukavemet = tasMukavemet;
        
    }

    public boolean isNesneKullanildiMi() {
        return nesneKullanildiMi;
    }

    public void setNesneKullanildiMi(boolean nesneKullanildiMi) {
        this.nesneKullanildiMi = nesneKullanildiMi;
    }

    public double getUstaMakasMukavemet() {
        return ustaMakasMukavemet;
    }

    public void setUstaMakasMukavemet(double ustaMakasMukavemet) {
        this.ustaMakasMukavemet = ustaMakasMukavemet;
    }

    public double getOzelKagitMukavemet() {
        return ozelKagitMukavemet;
    }

    public void setOzelKagitMukavemet(double ozelKagitMukavemet) {
        this.ozelKagitMukavemet = ozelKagitMukavemet;
    }

    public double getAgirTasMukavemet() {
        return agirTasMukavemet;
    }

    public void setAgirTasMukavemet(double agirTasMukavemet) {
        this.agirTasMukavemet = agirTasMukavemet;
    }
    
    
    
}