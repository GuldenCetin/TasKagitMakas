package Nesneler;

public class UstaMakas extends Makas {

    private double hiz;
    private double makasMukavemet;
    private double kagitMukavemet;
    private double tasMukavemet;
    private double ustaMakasMukavemet;
    private double ozelKagitMukavemet;
    private double agirTasMukavemet;

    public UstaMakas(double hiz, int keskinlik, double dayaniklilik, int seviyePuani, String name) {
        super(keskinlik, dayaniklilik, seviyePuani, name);
        this.hiz = hiz;
    }

    public UstaMakas() {
        ;
    }

    public UstaMakas(double hiz) {
        this.hiz = hiz;
    }

    @Override
    public void nesnePuaniGoster(double a) {
         System.out.println("Usta Makas son dayaniklilik degeri "+ a);
        //super.nesnePuaniGoster(a);
    }

    @Override
    public double durumGuncelle(double a) {
        double durum = getDayaniklilik() - a;
        setDayaniklilik((getDayaniklilik() - a));
        return durum;
    }

    @Override
    public double etkiHesapla(Object a) {
        if (a instanceof Kagit) {
            setKagitMukavemet(0.625);
            return getKagitMukavemet();
        }

        if (a instanceof Tas) {
            setTasMukavemet(2.5);
            return getTasMukavemet();
        }

        if (a instanceof Makas) {
            setMakasMukavemet(0);
            return getMakasMukavemet();
        }

        if (a instanceof UstaMakas) {
            setUstaMakasMukavemet(0);
            return getUstaMakasMukavemet();
        }

        if (a instanceof AgirTas) {
            setAgirTasMukavemet(5);
            return getAgirTasMukavemet();
        }

        if (a instanceof OzelKagit) {
            setOzelKagitMukavemet(1.25);
            return getOzelKagitMukavemet();
        }

        return 0;
    }

    public double getHiz() {
        return hiz;
    }

    public void setHiz(double hiz) {
        this.hiz = hiz;
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
