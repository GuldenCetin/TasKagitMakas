
package Nesneler;


public class Kagit extends Nesne{
    private double makasMukavemet;
    private double kagitMukavemet;
    private double tasMukavemet;
     private double ustaMakasMukavemet;
    private double ozelKagitMukavemet;
    private double agirTasMukavemet;
    private int nufuz;

    public Kagit() {
        
        this.nufuz = 0;
        this.nesneKullanildiMi=false;
    }

    public Kagit(int nufuz, double dayaniklilik, int seviyePuani,String name) {
        super(dayaniklilik, seviyePuani,name);
        this.nufuz = nufuz;
        this.nesneKullanildiMi=false;
    }

    @Override
    public double durumGuncelle(double a) {
        double durum=getDayaniklilik()-a;
        setDayaniklilik((getDayaniklilik()-a));
        return durum ;
    }

    @Override
    public double etkiHesapla(Object a ) {
      //  super.etkiHesapla(); 
      if(a instanceof Kagit)
        {
            setKagitMukavemet(0);
            return  getKagitMukavemet();
        }

         if(a instanceof Tas)
        {
            setTasMukavemet(1.25);
            return getTasMukavemet();
        }

         if(a instanceof Makas)
        {
            setMakasMukavemet(5);
            return getMakasMukavemet();
        }
         
              if(a instanceof UstaMakas)
        {
            setUstaMakasMukavemet(10);
            return getUstaMakasMukavemet();
        }
         
         
           if(a instanceof AgirTas)
        {
            setAgirTasMukavemet(2.50);
            return getAgirTasMukavemet();
        }
  
          if(a instanceof OzelKagit)
        {
            setOzelKagitMukavemet(0);
            return  getOzelKagitMukavemet();
        }

         
         
         
         
         
         
         
         
         
        return 0;
    }

    @Override
    public void nesnePuaniGoster(double a) {
          System.out.println("Kagit son dayaniklilik degeri "+ a);
        //super.nesnePuaniGoster();
    }

    
    public int getNufuz() {
        return nufuz;
    }

    public void setNufuz(int nufuz) {
        this.nufuz = nufuz;
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
