
package Nesneler;


public class AgirTas extends Tas {

    private double sıcaklık;
    private double makasMukavemet;
    private double kagitMukavemet;
    private double tasMukavemet;
    private double ustaMakasMukavemet;
    private double ozelKagitMukavemet;
      private double agirTasMukavemet;
    public AgirTas(int katilik, double dayaniklilik, int seviyePuani, String name) {
        super(katilik, dayaniklilik, seviyePuani, name);
        this.sıcaklık = sıcaklık;
    }

    public AgirTas() {
        this.sıcaklık=sıcaklık;
    }

    @Override
    public void nesnePuaniGoster(double a) {
         System.out.println("Agir Tas son dayaniklilik degeri "+ a);
        //super.nesnePuaniGoster(a); 
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
            setKagitMukavemet(2.5);
            return  getKagitMukavemet();
        }

         if(a instanceof Tas)
        {
            setTasMukavemet(0);
            return getTasMukavemet();
        }

         if(a  instanceof Makas)
        {
            setMakasMukavemet(0.625);
            return getMakasMukavemet();
        }
         
         
           if(a  instanceof UstaMakas)
        {
            setUstaMakasMukavemet(1.25);
            return getUstaMakasMukavemet();
        }
           
            if(a  instanceof AgirTas)
        {
            setUstaMakasMukavemet(0);
            return getUstaMakasMukavemet();
        }
           
           
            if(a  instanceof OzelKagit)
        {
            setUstaMakasMukavemet(1.25);
            return getUstaMakasMukavemet();
        }
     return 0;
       // return super.etkiHesapla(a); 
    }

 
    
    
    public double getSıcaklık() {
        return sıcaklık;
    }

    public void setSıcaklık(double sıcaklık) {
        this.sıcaklık = sıcaklık;
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
