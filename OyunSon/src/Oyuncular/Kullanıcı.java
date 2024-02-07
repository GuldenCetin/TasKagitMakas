
package Oyuncular;

import Nesneler.*;
import java.util.Scanner;

public class Kullanıcı extends Oyuncu{
    boolean d1=true;
    boolean d2=true;
    boolean d3=true;
    boolean d4=true;
    boolean d5=true;
    private double toplamCan=100;
    Scanner scan=new Scanner(System.in);
        public Kullanıcı()
	{
		super(0, "Kullanıcı", 0);
	}

	public Kullanıcı(int oyuncuID, String oyuncuAdi, int Skor)
	{
		super(oyuncuID, oyuncuAdi, Skor);
	}

    @Override
    public Object nesneSec(Object s) {
       
        System.out.println(s);
        System.out.println("");
        while(true)
        {
        System.out.println("Oynamak istediğiniz nesneyi seçiniz.");
        int secim=scan.nextInt();
        if(!d1 && !d2 && !d3 && !d4 && !d5)
        {
            return  nesneListesi.get(secim);
        }
        else{
            if(secim==1){
                
                if(d1){
                    d1=false;
                    return  nesneListesi.get(secim-1);
                     }
                    else
                    {
                            System.out.println("5 tur bitmeden aynı nesneler seçilemez.");
                    }
            }
            if(secim==2){
                if(d2){
                    d2=false;
                    return  nesneListesi.get(secim-1);
                     }
                    else
                    {
                            System.out.println("5 tur bitmeden aynı nesneler seçilemez.");
                    }
            }
            if(secim==3){
                if(d3){
                    d3=false;
                    return  nesneListesi.get(secim-1);
                     }
                    else
                    {
                            System.out.println("5 tur bitmeden aynı nesneler seçilemez.");
                    }
            }
            if(secim==4)
            {
                if(d4){
                    d4=false;
                    return  nesneListesi.get(secim-1);
                     }
                    else
                    {
                            System.out.println("5 tur bitmeden aynı nesneler seçilemez.");
                    }
            }
            if(secim==5)
            {
                if(d5){
                    d5=false;
                    return  nesneListesi.get(secim-1);
                     }
                    else
                    {
                            System.out.println("5 tur bitmeden aynı nesneler seçilemez.");
                    }
                }
            }
        
    }
          
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
        
    


