
package Nesneler;


public class Makas extends Nesne{
    
    private double makasMukavemet;
    private double kagitMukavemet;
    private double tasMukavemet;
    private double ustaMakasMukavemet;
    private double ozelKagitMukavemet;
      private double agirTasMukavemet;
    private int keskinlik;
    public boolean nesneKullanildiMi;

    public Makas(int keskinlik, double dayaniklilik, int seviyePuani,String name) {
        super(dayaniklilik, seviyePuani,name);
        this.keskinlik = keskinlik;
        this.nesneKullanildiMi=false;
    }
    
      public Makas() {
        this.keskinlik = 0;
        this.nesneKullanildiMi=false;
    }

    @Override
    public double durumGuncelle(double a) {
        double durum=getDayaniklilik()-a;
        setDayaniklilik((getDayaniklilik()-a));
        return durum ;
    }

    @Override
    public double etkiHesapla(Object a) {
           
        
        if(a instanceof Kagit)
        {
            setKagitMukavemet(1.25);
            return  getKagitMukavemet();
        }

         if(a instanceof Tas)
        {
            setTasMukavemet(5);
            return getTasMukavemet();
        }

         if(a instanceof Makas)
        {
            setMakasMukavemet(0);
            return getMakasMukavemet();
        }
         
           if(a instanceof UstaMakas)
        {
            setUstaMakasMukavemet(0);
            return getUstaMakasMukavemet();
        }
         
         
             if(a instanceof AgirTas)
        {
            setAgirTasMukavemet(10);
            return getAgirTasMukavemet();
        }

                if(a instanceof OzelKagit)
        {
            setOzelKagitMukavemet(2.5);
            return getOzelKagitMukavemet();
        }
         
         
         
      return 0;  
    }

    @Override
    public void nesnePuaniGoster(double a) {
        //super.nesnePuaniGoster();
        System.out.println("Makas son dayanıklilik degeri :"+ a);
        
    }

    
    public int getKeskinlik() {
        return keskinlik;
    }

    public void setKeskinlik(int keskinlik) {
        this.keskinlik = keskinlik;
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
