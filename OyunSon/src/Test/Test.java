package Test;

import java.util.List;
import Oyuncular.Kullanıcı;
import Oyuncular.Bilgisayar;
import Nesneler.*;
import Nesneler.Nesne;
import Nesneler.Kagit;
import Nesneler.Makas;
import Nesneler.Tas;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Object> list1 = new ArrayList<Object>();
    static ArrayList<Object> list2 = new ArrayList<Object>();
    static ArrayList<Object> list3 = new ArrayList<Object>();
    static Bilgisayar bilgisayar1 = new Bilgisayar();
    static Bilgisayar bilgisayar2 = new Bilgisayar();
    static Kullanıcı kullanıcı = new Kullanıcı();

    public static void main(String[] args) {


        System.out.println("Taş-Kağıt-Makas oyununa hoşgeldiniz.");
        System.out.println("Lütfen seçim yapınız:");
        System.out.println("1-Bilgisayar [VS] Bilgisayar");
        System.out.println("2-Kullanıcı [VS] Bilgisayar");
        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                battleNpcMenu();
                break;
            case 2:
                battleUserMenu();
                break;
        }
    }
    public void menu() {


    }

    public static void BnesneUret(ArrayList<Object> list) {

        for (int j = 0; j < 5; j++) {
            Random r = new Random();
            int rInt = r.nextInt(3);
            if (rInt == 0) {
                list.add(new Tas());
            }
            if (rInt == 1) {
                list.add(new Makas());
            } else if (rInt == 2) {
                list.add(new Kagit());
            }
        }

    }

    public static void UnesneUret(ArrayList<Object> list) {
        System.out.println("Almak istediğiniz 5 nesneyi destenize ekleyiniz.");
        System.out.println("1-Taş 2-Kağıt 3-Makas");
        int i = 0;
        int j;
        while (i < 5) {
            System.out.println("Seçim yapınız: ");
            int secim;
            secim = scan.nextInt();
            switch (secim) {
                case 1:
                    list.add(new Tas());
                    System.out.println("Taş eklendi.");
                    break;
                case 2:
                    list.add(new Kagit());
                    System.out.println("Kağıt eklendi.");
                    break;
                case 3:
                    list.add(new Makas());
                    System.out.println("Makas eklendi.");
                    break;
            }
            i++;
        }
    }

    public static void battleNpcMenu() {
        int i = 0;
        BnesneUret(list1);
        BnesneUret(list2);
        bilgisayar1.nesneListesi = list1;
        bilgisayar2.nesneListesi = list2;
        System.out.println("Bilgisayar1 ile Bilgisayar2 karşılaşıyor.");
        System.out.println("");
        System.out.println("**********Nesneler**********");
        System.out.println("");
        System.out.println("Bilgisayar1 'in nesne listesi:\n" + bilgisayar1.nesneListesi);
        System.out.println("");
        System.out.println("Bilgisayar2 'nin nesne listesi:\n" + bilgisayar2.nesneListesi);
        System.out.println("");
        System.out.println("**********Nesneler**********");
        System.out.println("Oyun max 10 tur sürecektir");
        System.out.println("");
        while (i < 25) {
            System.out.println("Oynatmak için (1)e basınız.");
            int secim;
            secim = scan.nextInt();
            switch (secim) {
                case 1:
                    battle(bilgisayar1.nesneListesi, bilgisayar2.nesneListesi, i);
            }
            i++;
        }
    }

    public static void battleUserMenu() {
        BnesneUret(list1);
        bilgisayar1.nesneListesi = list1;
        kullanıcı.nesneListesi = list3;
        System.out.println("Kullanıcı ile Bilgisayar1 karşılaşıyor.");
        UnesneUret(list3);
        System.out.println("");
        System.out.println("**********Nesneler**********");
        System.out.println("");
        System.out.println("Kullanıcı'nın nesne listesi:\n" + kullanıcı.nesneListesi);
        System.out.println("");
        System.out.println("Bilgisayar1 'in nesne listesi: {Görünmüyor}\n");
        System.out.println("");
        System.out.println("**********Nesneler**********");
        System.out.println("Oyun max 10 tur sürecektir");
        System.out.println("");
        int i = 0;
        while (i < 10) {
            System.out.println("Oynamak için (1)e basınız.");
            int secim;
            secim = scan.nextInt();
            switch (secim) {
                case 1:

                    battleUser(kullanıcı.nesneListesi, bilgisayar1.nesneListesi, i);

            }
            i++;
        }
    }

    public static void battle(ArrayList list1, ArrayList list2, int i) {

        ArrayList lista = new ArrayList();
        ArrayList<Object> listb = new ArrayList<Object>();
        bilgisayar1.nesneListesi = list1;
        bilgisayar2.nesneListesi = list2;
        Object a = bilgisayar1.nesneSec(bilgisayar1.nesneListesi);
        Object b = bilgisayar2.nesneSec(bilgisayar2.nesneListesi);

        if (i < 5) {
            if (!((Nesne) a).isNesneKullanildiMi()) {
                ((Nesne) a).setNesneKullanildiMi(true);
            } else {
                while (((Nesne) a).isNesneKullanildiMi()) {
                    a = bilgisayar1.nesneSec(bilgisayar1.nesneListesi);
                }
                ((Nesne) a).setNesneKullanildiMi(true);
            }

            if (!((Nesne) b).isNesneKullanildiMi()) {
                ((Nesne) b).setNesneKullanildiMi(true);
            } else {
                while (((Nesne) b).isNesneKullanildiMi()) {
                    b = bilgisayar2.nesneSec(bilgisayar2.nesneListesi);
                }
                ((Nesne) b).setNesneKullanildiMi(true);
            }

        } else {
            a = bilgisayar1.nesneSec(bilgisayar1.nesneListesi);
            b = bilgisayar2.nesneSec(bilgisayar2.nesneListesi);
        }

        System.out.println(i);
        System.out.println("**********Seçimler**********");
        System.out.println("");
        System.out.println("Bilgisayar1'ın seçimi: " + a);
        System.out.println("");
        System.out.println("Bilgisayar2'nin seçimi: " + b);
        System.out.println("");
        System.out.println("**********Seçimler**********");
        System.out.println("");

        System.out.println("*******************************");
        System.out.println("Bilgisayar'1 in kalan toplam dayanıklılık: ");
        bilgisayar1.netSkorugor();
        System.out.println("Bilgisayar'2 nin kalan toplam dayanıklılık: ");
        bilgisayar2.netSkorugor();

        System.out.println("*******************************");

        if (a instanceof Tas) {
            if (b instanceof Kagit) {
                ((Tas) a).nesnePuaniGoster(((Tas) a).durumGuncelle(((Tas) a).etkiHesapla(b)));
                ((Kagit) b).nesnePuaniGoster(((Kagit) b).durumGuncelle(((Kagit) b).etkiHesapla(a)));

                bilgisayar1.skorGoster(((Kagit) b).etkiHesapla(a));
                bilgisayar2.skorGoster(((Tas) a).etkiHesapla(b));

                if (((Tas) a).getDayaniklilik() <= 20) {
                    ((Kagit) b).setSeviyePuani(((Kagit) b).getSeviyePuani() + 20);
                    System.out.println("Kagıt son seviye puanı:" + ((Kagit) b).getSeviyePuani());
                    System.out.println("Tas son seviye puanı:" + ((Tas) a).getSeviyePuani());
                    if (((Kagit) b).getSeviyePuani() >= 30) {
                        bilgisayar2.nesneListesi.add(new OzelKagit(2.0, ((Kagit) b).getNufuz(), ((Kagit) b).getDayaniklilik(), ((Kagit) b).getSeviyePuani(), ((Kagit) b).getName()));
                        bilgisayar2.nesneListesi.remove(b);
                    }
                }
            }
         else   if (b instanceof Tas) {

                ((Tas) a).nesnePuaniGoster(((Tas) a).durumGuncelle(((Tas) a).etkiHesapla(b)));
                ((Tas) b).nesnePuaniGoster(((Tas) b).durumGuncelle(((Tas) b).etkiHesapla(a)));

                System.out.println("Etki yok , berabere");

            }
         else   if (b instanceof Makas) {

                bilgisayar1.skorGoster(((Tas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((Makas) b).etkiHesapla(a));

                ((Tas) a).nesnePuaniGoster(((Tas) a).durumGuncelle(((Tas) a).etkiHesapla(b)));
                ((Makas) b).nesnePuaniGoster(((Makas) b).durumGuncelle(((Makas) b).etkiHesapla(a)));
                if (((Makas) b).getDayaniklilik() <= 20) {
                    ((Tas) a).setSeviyePuani(((Tas) a).getSeviyePuani() + 20);
                    System.out.println("Tas son seviye puanı:" + ((Tas) a).getSeviyePuani());
                    System.out.println("Makas son seviye puanı:" + ((Makas) b).getSeviyePuani());
                    if (((Tas) a).getSeviyePuani() >= 30) {
                        bilgisayar1.nesneListesi.add(new AgirTas());
                        bilgisayar1.nesneListesi.remove(a);
                    }
                }
            }
        }

       else if (a instanceof Makas) {
            if (b instanceof Kagit) {
                ((Makas) a).nesnePuaniGoster(((Makas) a).durumGuncelle(((Makas) a).etkiHesapla(b)));
                ((Kagit) b).nesnePuaniGoster(((Kagit) b).durumGuncelle(((Kagit) b).etkiHesapla(a)));

                bilgisayar1.skorGoster(((Makas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((Kagit) b).etkiHesapla(a));
                if (((Kagit) b).getDayaniklilik() <= 20) {
                    ((Makas) a).setSeviyePuani(((Makas) a).getSeviyePuani() + 20);
                    System.out.println("Makas son seviye puanı:" + ((Makas) a).getSeviyePuani());
                    System.out.println("Kagıt son seviye puanı:" + ((Kagit) b).getSeviyePuani());
                    if (((Makas) a).getSeviyePuani() >= 30) {
                        bilgisayar1.nesneListesi.add(new UstaMakas());
                        bilgisayar1.nesneListesi.remove(a);

                    }
                }

            }

          else  if (b instanceof Tas) {
                ((Makas) a).nesnePuaniGoster(((Makas) a).durumGuncelle(((Makas) a).etkiHesapla(b)));
                ((Tas) b).nesnePuaniGoster(((Tas) b).durumGuncelle(((Tas) b).etkiHesapla(a)));

                bilgisayar1.skorGoster(((Makas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((Tas) b).etkiHesapla(a));
                if (((Makas) a).getDayaniklilik() <= 20) {
                    ((Tas) b).setSeviyePuani(((Tas) b).getSeviyePuani() + 20);
                    System.out.println("Tas son seviye puanı:" + ((Tas) b).getSeviyePuani());
                    System.out.println("Makas son seviye puanı:" + ((Makas) a).getSeviyePuani());
                    if (((Tas) b).getSeviyePuani() >= 30) {
                        bilgisayar2.nesneListesi.add(new AgirTas());
                        bilgisayar2.nesneListesi.remove(b);
                        System.out.println(bilgisayar2.nesneListesi);

                    }
                }

            }
          else  if (b instanceof Makas) {
                ((Makas) a).nesnePuaniGoster(((Makas) a).durumGuncelle(((Makas) a).etkiHesapla(b)));
                ((Makas) b).nesnePuaniGoster(((Makas) b).durumGuncelle(((Makas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((Makas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((Makas) b).etkiHesapla(a));
                System.out.println("Etki yok ,berabere");
            }
        }

      else  if (a instanceof Kagit) {
            if (b instanceof Kagit) {
                ((Kagit) a).nesnePuaniGoster(((Kagit) a).durumGuncelle(((Kagit) a).etkiHesapla(b)));
                ((Kagit) b).nesnePuaniGoster(((Kagit) b).durumGuncelle(((Kagit) b).etkiHesapla(a)));

                System.out.println("Etki yok,berabere");
            }

          else  if (b instanceof Tas) {
                ((Kagit) a).nesnePuaniGoster(((Kagit) a).durumGuncelle(((Kagit) a).etkiHesapla(b)));
                ((Tas) b).nesnePuaniGoster(((Tas) b).durumGuncelle(((Tas) b).etkiHesapla(a)));

                bilgisayar1.skorGoster(((Kagit) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((Tas) b).etkiHesapla(a));
                if (((Tas) b).getDayaniklilik() <= 20) {
                    ((Kagit) a).setSeviyePuani(((Kagit) a).getSeviyePuani() + 20);
                    System.out.println("Kagıt son seviye puanı:" + ((Kagit) a).getSeviyePuani());
                    System.out.println("Tas son seviye puanı:" + ((Tas) b).getSeviyePuani());
                    if (((Kagit) a).getSeviyePuani() >= 30) {
                        bilgisayar1.nesneListesi.add(new OzelKagit());
                        bilgisayar1.nesneListesi.remove(a);
                        System.out.println(bilgisayar1.nesneListesi);

                    }

                }

            }
          else  if (b instanceof Makas) {
                ((Kagit) a).nesnePuaniGoster(((Kagit) a).durumGuncelle(((Kagit) a).etkiHesapla(b)));
                ((Makas) b).nesnePuaniGoster(((Makas) b).durumGuncelle(((Makas) b).etkiHesapla(a)));

                bilgisayar1.skorGoster(((Kagit) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((Makas) b).etkiHesapla(a));

                if (((Kagit) a).getDayaniklilik() <= 20) {
                    ((Makas) b).setSeviyePuani(((Makas) b).getSeviyePuani() + 20);
                    System.out.println("Makas son seviye puanı:" + ((Makas) b).getSeviyePuani());
                    System.out.println("Kagıt son seviye puanı:" + ((Kagit) a).getSeviyePuani());
                    if (((Makas) b).getSeviyePuani() >= 30) {
                        bilgisayar2.nesneListesi.add(new UstaMakas());
                        bilgisayar2.nesneListesi.remove(b);

                    }
                }

            }

        }

      else  if (a instanceof OzelKagit) {
            if (b instanceof Kagit) {
                System.out.println("Etki yok .berabere ");
            }

           else  if (b instanceof OzelKagit) {
                System.out.println("Etki yok .berabere ");
            }
            else if (b instanceof UstaMakas) {
                ((UstaMakas) b).nesnePuaniGoster(((UstaMakas) b).durumGuncelle(((UstaMakas) b).etkiHesapla(a)));
                ((OzelKagit) a).nesnePuaniGoster(((OzelKagit) a).durumGuncelle(((OzelKagit) a).etkiHesapla(b)));
                bilgisayar1.skorGoster(((UstaMakas) b).etkiHesapla(a));
                bilgisayar2.skorGoster(((OzelKagit) a).etkiHesapla(b));
                if (((OzelKagit) b).getDayaniklilik() <= 20) {
                    ((UstaMakas) a).setSeviyePuani(((UstaMakas) a).getSeviyePuani() + 20);
                    System.out.println("  Usta Makas son seviye puanı:" + ((UstaMakas) b).getSeviyePuani());
                    System.out.println(" Ozel Kagit son seviye puanı:" + ((OzelKagit) a).getSeviyePuani());
                }
            }

          else  if (b instanceof Makas) {
                ((Makas) b).nesnePuaniGoster(((Makas) b).durumGuncelle(((Makas) b).etkiHesapla(a)));
                ((OzelKagit) a).nesnePuaniGoster(((OzelKagit) a).durumGuncelle(((OzelKagit) a).etkiHesapla(b)));
                bilgisayar1.skorGoster(((Makas) b).etkiHesapla(a));
                bilgisayar2.skorGoster(((OzelKagit) a).etkiHesapla(b));
                if (((OzelKagit) a).getDayaniklilik() <= 20) {
                    ((Makas) b).setSeviyePuani(((Makas) a).getSeviyePuani() + 20);
                    System.out.println("  Usta Makas son seviye puanı:" + ((Makas) b).getSeviyePuani());
                    System.out.println(" Ozel Kagit son seviye puanı:" + ((OzelKagit) a).getSeviyePuani());
                }
            }

          else  if (b instanceof Tas) {
                ((Tas) b).nesnePuaniGoster(((Tas) b).durumGuncelle(((Tas) b).etkiHesapla(a)));
                ((OzelKagit) a).nesnePuaniGoster(((OzelKagit) a).durumGuncelle(((OzelKagit) a).etkiHesapla(b)));
                bilgisayar1.skorGoster(((Tas) b).etkiHesapla(a));
                bilgisayar2.skorGoster(((OzelKagit) a).etkiHesapla(b));
                if (((Tas) b).getDayaniklilik() <= 20) {
                    ((OzelKagit) a).setSeviyePuani(((OzelKagit) a).getSeviyePuani() + 20);
                    System.out.println("  Tas son seviye puanı:" + ((Tas) b).getSeviyePuani());
                    System.out.println(" Ozel Kagit son seviye puanı:" + ((OzelKagit) a).getSeviyePuani());
                }
            }

          else  if (b instanceof AgirTas) {
                ((AgirTas) b).nesnePuaniGoster(((AgirTas) b).durumGuncelle(((AgirTas) b).etkiHesapla(a)));
                ((OzelKagit) a).nesnePuaniGoster(((OzelKagit) a).durumGuncelle(((OzelKagit) a).etkiHesapla(b)));
                bilgisayar1.skorGoster(((AgirTas) b).etkiHesapla(a));
                bilgisayar2.skorGoster(((OzelKagit) a).etkiHesapla(b));
                if (((AgirTas) b).getDayaniklilik() <= 20) {
                    ((OzelKagit) a).setSeviyePuani(((OzelKagit) a).getSeviyePuani() + 20);
                    System.out.println(" Agir Tas son seviye puanı:" + ((AgirTas) b).getSeviyePuani());
                    System.out.println(" Ozel Kagit son seviye puanı:" + ((OzelKagit) a).getSeviyePuani());
                }
            }

        }

        ////////////////////////////////////////
      else  if (b instanceof OzelKagit) {
            if (a instanceof Tas) {
                ((Tas) a).nesnePuaniGoster(((Tas) a).durumGuncelle(((Tas) a).etkiHesapla(b)));
                ((OzelKagit) b).nesnePuaniGoster(((OzelKagit) b).durumGuncelle(((OzelKagit) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((OzelKagit) b).etkiHesapla(a));
                bilgisayar2.skorGoster(((Tas) a).etkiHesapla(b));
                if (((Tas) a).getDayaniklilik() <= 20) {
                    ((OzelKagit) b).setSeviyePuani(((OzelKagit) b).getSeviyePuani() + 20);
                    System.out.println(" Ozel Kagıt son seviye puanı:" + ((OzelKagit) b).getSeviyePuani());
                    System.out.println("Tas son seviye puanı:" + ((Tas) a).getSeviyePuani());
                }

              else  if (a instanceof AgirTas) {
                    ((AgirTas) a).nesnePuaniGoster(((AgirTas) a).durumGuncelle(((AgirTas) a).etkiHesapla(b)));
                    ((OzelKagit) b).nesnePuaniGoster(((OzelKagit) b).durumGuncelle(((OzelKagit) b).etkiHesapla(a)));
                    bilgisayar1.skorGoster(((OzelKagit) b).etkiHesapla(a));
                    bilgisayar2.skorGoster(((AgirTas) a).etkiHesapla(b));
                    if (((AgirTas) a).getDayaniklilik() <= 20) {
                        ((OzelKagit) b).setSeviyePuani(((OzelKagit) b).getSeviyePuani() + 20);
                        System.out.println(" Ozel Kagıt son seviye puanı:" + ((OzelKagit) b).getSeviyePuani());
                        System.out.println(" Agir Tas son seviye puanı:" + ((AgirTas) a).getSeviyePuani());
                    }

                }

              else  if (a instanceof Kagit) {
                    ((Kagit) a).nesnePuaniGoster(((Kagit) a).durumGuncelle(((Kagit) a).etkiHesapla(b)));
                    ((OzelKagit) b).nesnePuaniGoster(((OzelKagit) b).durumGuncelle(((OzelKagit) b).etkiHesapla(a)));
                    bilgisayar1.skorGoster(((OzelKagit) b).etkiHesapla(a));
                    bilgisayar2.skorGoster(((Kagit) a).etkiHesapla(b));
                    System.out.println("Etki yok , berabere");

                }

             else   if (a instanceof OzelKagit) {
                    ((OzelKagit) a).nesnePuaniGoster(((OzelKagit) a).durumGuncelle(((OzelKagit) a).etkiHesapla(b)));
                    ((OzelKagit) b).nesnePuaniGoster(((OzelKagit) b).durumGuncelle(((OzelKagit) b).etkiHesapla(a)));
                    bilgisayar1.skorGoster(((OzelKagit) b).etkiHesapla(a));
                    bilgisayar2.skorGoster(((OzelKagit) a).etkiHesapla(b));
                    System.out.println("Etki yok , berabere");

                }

              else  if (a instanceof Makas) {
                    ((Makas) a).nesnePuaniGoster(((Makas) a).durumGuncelle(((Makas) a).etkiHesapla(b)));
                    ((OzelKagit) b).nesnePuaniGoster(((OzelKagit) b).durumGuncelle(((OzelKagit) b).etkiHesapla(a)));
                    bilgisayar1.skorGoster(((OzelKagit) b).etkiHesapla(a));
                    bilgisayar2.skorGoster(((Makas) a).etkiHesapla(b));
                    if (((OzelKagit) a).getDayaniklilik() <= 20) {
                        ((Makas) b).setSeviyePuani(((Makas) b).getSeviyePuani() + 20);
                        System.out.println(" Ozel Kagıt son seviye puanı:" + ((OzelKagit) b).getSeviyePuani());
                        System.out.println("Makas son seviye puanı:" + ((Makas) a).getSeviyePuani());
                    }

                }

             else   if (a instanceof UstaMakas) {
                    ((UstaMakas) a).nesnePuaniGoster(((UstaMakas) a).durumGuncelle(((UstaMakas) a).etkiHesapla(b)));
                    ((OzelKagit) b).nesnePuaniGoster(((OzelKagit) b).durumGuncelle(((OzelKagit) b).etkiHesapla(a)));
                    bilgisayar1.skorGoster(((OzelKagit) b).etkiHesapla(a));
                    bilgisayar2.skorGoster(((UstaMakas) a).etkiHesapla(b));
                    if (((OzelKagit) a).getDayaniklilik() <= 20) {
                        ((UstaMakas) b).setSeviyePuani(((UstaMakas) b).getSeviyePuani() + 20);
                        System.out.println(" Ozel Kagıt son seviye puanı:" + ((OzelKagit) b).getSeviyePuani());
                        System.out.println("Usta Makas son seviye puanı:" + ((UstaMakas) a).getSeviyePuani());
                    }
                }
            }
        }

        //////////////////////////////////////
      else  if (a instanceof AgirTas) {
            if (b instanceof Tas) {
                bilgisayar1.skorGoster(((AgirTas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((Tas) b).etkiHesapla(a));
                ((AgirTas) a).nesnePuaniGoster(((AgirTas) a).durumGuncelle(((AgirTas) a).etkiHesapla(b)));
                ((Tas) b).nesnePuaniGoster(((Tas) b).durumGuncelle(((Tas) b).etkiHesapla(a)));
                System.out.println("Beraber ");
            }
          else  if (b instanceof AgirTas) {
                bilgisayar1.skorGoster(((AgirTas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((AgirTas) b).etkiHesapla(a));
                ((AgirTas) a).nesnePuaniGoster(((AgirTas) a).durumGuncelle(((AgirTas) a).etkiHesapla(b)));
                ((AgirTas) b).nesnePuaniGoster(((AgirTas) b).durumGuncelle(((AgirTas) b).etkiHesapla(a)));
                System.out.println("Beraber ");
            }

         else   if (b instanceof Makas) {
                bilgisayar1.skorGoster(((AgirTas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((Makas) b).etkiHesapla(a));
                ((AgirTas) a).nesnePuaniGoster(((AgirTas) a).durumGuncelle(((AgirTas) a).etkiHesapla(b)));
                ((Makas) b).nesnePuaniGoster(((Makas) b).durumGuncelle(((Makas) b).etkiHesapla(a)));
                if (((Makas) b).getDayaniklilik() <= 20) {
                    ((AgirTas) a).setSeviyePuani(((AgirTas) a).getSeviyePuani() + 20);
                    System.out.println("Agir Tas son seviye puanı:" + ((AgirTas) a).getSeviyePuani());
                    System.out.println("Makas son seviye puanı:" + ((Makas) b).getSeviyePuani());
                }
            }

         else   if (b instanceof UstaMakas) {
                bilgisayar1.skorGoster(((AgirTas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((UstaMakas) b).etkiHesapla(a));
                ((AgirTas) a).nesnePuaniGoster(((AgirTas) a).durumGuncelle(((AgirTas) a).etkiHesapla(b)));
                ((UstaMakas) b).nesnePuaniGoster(((UstaMakas) b).durumGuncelle(((UstaMakas) b).etkiHesapla(a)));
                if (((UstaMakas) b).getDayaniklilik() <= 20) {
                    ((AgirTas) a).setSeviyePuani(((AgirTas) a).getSeviyePuani() + 20);
                    System.out.println(" Agir Tas son seviye puanı:" + ((AgirTas) a).getSeviyePuani());
                    System.out.println("Usta Makas son seviye puanı:" + ((Makas) a).getSeviyePuani());
                }
            }

         else   if (b instanceof Kagit) {
                bilgisayar1.skorGoster(((AgirTas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((Kagit) b).etkiHesapla(a));
                ((AgirTas) a).nesnePuaniGoster(((AgirTas) a).durumGuncelle(((AgirTas) a).etkiHesapla(b)));
                ((Kagit) b).nesnePuaniGoster(((Kagit) b).durumGuncelle(((Kagit) b).etkiHesapla(a)));
                if (((AgirTas) a).getDayaniklilik() <= 20) {
                    ((Kagit) b).setSeviyePuani(((Kagit) b).getSeviyePuani() + 20);
                    System.out.println(" Agir Tas son seviye puanı:" + ((AgirTas) a).getSeviyePuani());
                    System.out.println("Kagit son seviye puanı:" + ((Kagit) b).getSeviyePuani());
                }
            }

         else   if (b instanceof OzelKagit) {
                bilgisayar1.skorGoster(((AgirTas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((OzelKagit) b).etkiHesapla(a));
                ((AgirTas) a).nesnePuaniGoster(((AgirTas) a).durumGuncelle(((AgirTas) a).etkiHesapla(b)));
                ((OzelKagit) b).nesnePuaniGoster(((OzelKagit) b).durumGuncelle(((OzelKagit) b).etkiHesapla(a)));
                if (((AgirTas) a).getDayaniklilik() <= 20) {
                    ((OzelKagit) b).setSeviyePuani(((OzelKagit) b).getSeviyePuani() + 20);
                    System.out.println(" Agir Tas son seviye puanı:" + ((AgirTas) a).getSeviyePuani());
                    System.out.println(" Ozel Kagit son seviye puanı:" + ((OzelKagit) b).getSeviyePuani());
                }
            }

        }
        ////////////////////////////////////////////
     else   if (b instanceof AgirTas) {
            if (a instanceof OzelKagit) {
                ((OzelKagit) a).nesnePuaniGoster(((OzelKagit) a).durumGuncelle(((OzelKagit) a).etkiHesapla(b)));
                ((AgirTas) b).nesnePuaniGoster(((AgirTas) b).durumGuncelle(((AgirTas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((OzelKagit) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((AgirTas) b).etkiHesapla(a));
                if (((AgirTas) b).getDayaniklilik() <= 20) {
                    ((OzelKagit) a).setSeviyePuani(((OzelKagit) a).getSeviyePuani() + 20);
                    System.out.println(" Ozel Kagit son seviye puanı:" + ((OzelKagit) a).getSeviyePuani());
                    System.out.println(" Agir Tas son seviye puanı:" + ((AgirTas) b).getSeviyePuani());
                }
            }

        else    if (a instanceof Kagit) {
                ((Kagit) a).nesnePuaniGoster(((Kagit) a).durumGuncelle(((Kagit) a).etkiHesapla(b)));
                ((AgirTas) b).nesnePuaniGoster(((AgirTas) b).durumGuncelle(((AgirTas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((Kagit) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((AgirTas) b).etkiHesapla(a));
                if (((AgirTas) b).getDayaniklilik() <= 20) {
                    ((Kagit) a).setSeviyePuani(((Kagit) a).getSeviyePuani() + 20);
                    System.out.println("  Kagit son seviye puanı:" + ((Kagit) a).getSeviyePuani());
                    System.out.println(" Agir Tas son seviye puanı:" + ((AgirTas) b).getSeviyePuani());
                }
            }

          else  if (a instanceof Makas) {
                ((Makas) a).nesnePuaniGoster(((Makas) a).durumGuncelle(((Makas) a).etkiHesapla(b)));
                ((AgirTas) b).nesnePuaniGoster(((AgirTas) b).durumGuncelle(((AgirTas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((Makas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((AgirTas) b).etkiHesapla(a));
                if (((Makas) a).getDayaniklilik() <= 20) {
                    ((AgirTas) b).setSeviyePuani(((AgirTas) b).getSeviyePuani() + 20);
                    System.out.println("  Makas son seviye puanı:" + ((Makas) a).getSeviyePuani());
                    System.out.println(" Agir Tas son seviye puanı:" + ((AgirTas) b).getSeviyePuani());
                }
            }
         else   if (a instanceof UstaMakas) {
                ((UstaMakas) a).nesnePuaniGoster(((UstaMakas) a).durumGuncelle(((UstaMakas) a).etkiHesapla(b)));
                ((AgirTas) b).nesnePuaniGoster(((AgirTas) b).durumGuncelle(((AgirTas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((UstaMakas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((AgirTas) b).etkiHesapla(a));
                if (((UstaMakas) a).getDayaniklilik() <= 20) {
                    ((AgirTas) b).setSeviyePuani(((AgirTas) b).getSeviyePuani() + 20);
                    System.out.println("  Usta Makas son seviye puanı:" + ((UstaMakas) a).getSeviyePuani());
                    System.out.println(" Agir Tas son seviye puanı:" + ((AgirTas) b).getSeviyePuani());
                }
            }

         else   if (a instanceof Tas) {
                ((Tas) a).nesnePuaniGoster(((Tas) a).durumGuncelle(((Tas) a).etkiHesapla(b)));
                ((AgirTas) b).nesnePuaniGoster(((AgirTas) b).durumGuncelle(((AgirTas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((Tas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((AgirTas) b).etkiHesapla(a));
                System.out.println("Durum berabere ");
            }

         else   if (a instanceof AgirTas) {
                ((AgirTas) a).nesnePuaniGoster(((AgirTas) a).durumGuncelle(((AgirTas) a).etkiHesapla(b)));
                ((AgirTas) b).nesnePuaniGoster(((AgirTas) b).durumGuncelle(((AgirTas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((AgirTas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((AgirTas) b).etkiHesapla(a));
                System.out.println("Etki yok ,berabere");
            }

        }
        /////////////////////////////////
      else  if (a instanceof UstaMakas) {
            if (b instanceof UstaMakas) {
                ((UstaMakas) a).nesnePuaniGoster(((UstaMakas) a).durumGuncelle(((UstaMakas) a).etkiHesapla(b)));
                ((UstaMakas) b).nesnePuaniGoster(((UstaMakas) b).durumGuncelle(((UstaMakas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((UstaMakas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((UstaMakas) b).etkiHesapla(a));
                System.out.println("Beraber ");
            }

          else  if (b instanceof Makas) {
                ((UstaMakas) a).nesnePuaniGoster(((UstaMakas) a).durumGuncelle(((UstaMakas) a).etkiHesapla(b)));
                ((Makas) b).nesnePuaniGoster(((Makas) b).durumGuncelle(((Makas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((UstaMakas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((Makas) b).etkiHesapla(a));
                System.out.println("Beraber ");
            }

          else  if (b instanceof Tas) {
                ((UstaMakas) a).nesnePuaniGoster(((UstaMakas) a).durumGuncelle(((UstaMakas) a).etkiHesapla(b)));
                ((Tas) b).nesnePuaniGoster(((Tas) b).durumGuncelle(((Tas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((UstaMakas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((Tas) b).etkiHesapla(a));
                if (((UstaMakas) a).getDayaniklilik() <= 20) {
                    ((Tas) b).setSeviyePuani(((Tas) b).getSeviyePuani() + 20);
                    System.out.println("  Tas son seviye puanı:" + ((Tas) b).getSeviyePuani());
                    System.out.println(" Usta Makas son seviye puanı:" + ((UstaMakas) a).getSeviyePuani());
                }
            }

          else  if (b instanceof AgirTas) {
                ((UstaMakas) a).nesnePuaniGoster(((UstaMakas) a).durumGuncelle(((UstaMakas) a).etkiHesapla(b)));
                ((AgirTas) b).nesnePuaniGoster(((AgirTas) b).durumGuncelle(((AgirTas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((UstaMakas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((AgirTas) b).etkiHesapla(a));
                if (((UstaMakas) b).getDayaniklilik() <= 20) {
                    ((AgirTas) b).setSeviyePuani(((AgirTas) b).getSeviyePuani() + 20);
                    System.out.println("Agir Tas son seviye puanı:" + ((AgirTas) b).getSeviyePuani());
                    System.out.println(" Usta Makas son seviye puanı:" + ((UstaMakas) a).getSeviyePuani());
                }
            }

          else  if (b instanceof Kagit) {
                ((UstaMakas) a).nesnePuaniGoster(((UstaMakas) a).durumGuncelle(((UstaMakas) a).etkiHesapla(b)));
                ((Kagit) b).nesnePuaniGoster(((Kagit) b).durumGuncelle(((Kagit) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((UstaMakas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((Kagit) b).etkiHesapla(a));
                if (((Kagit) b).getDayaniklilik() <= 20) {
                    ((UstaMakas) a).setSeviyePuani(((UstaMakas) a).getSeviyePuani() + 20);
                    System.out.println("Kagit son seviye puanı:" + ((Kagit) b).getSeviyePuani());
                    System.out.println(" Usta Makas son seviye puanı:" + ((UstaMakas) a).getSeviyePuani());
                }
            }

         else   if (b instanceof OzelKagit) {
                ((UstaMakas) a).nesnePuaniGoster(((UstaMakas) a).durumGuncelle(((UstaMakas) a).etkiHesapla(b)));
                ((OzelKagit) b).nesnePuaniGoster(((OzelKagit) b).durumGuncelle(((OzelKagit) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((UstaMakas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((OzelKagit) b).etkiHesapla(a));
                if (((OzelKagit) b).getDayaniklilik() <= 20) {
                    ((UstaMakas) a).setSeviyePuani(((UstaMakas) a).getSeviyePuani() + 20);
                    System.out.println(" Ozel Kagit son seviye puanı:" + ((OzelKagit) b).getSeviyePuani());
                    System.out.println(" Usta Makas son seviye puanı:" + ((UstaMakas) a).getSeviyePuani());
                }
            }
        }
        ///////////////////////////////////////

     else   if (b instanceof UstaMakas) {
            if (a instanceof UstaMakas) {
                ((UstaMakas) b).nesnePuaniGoster(((UstaMakas) b).durumGuncelle(((UstaMakas) b).etkiHesapla(a)));
                ((UstaMakas) a).nesnePuaniGoster(((UstaMakas) a).durumGuncelle(((UstaMakas) a).etkiHesapla(b)));
                bilgisayar1.skorGoster(((UstaMakas) b).etkiHesapla(a));
                bilgisayar2.skorGoster(((UstaMakas) a).etkiHesapla(b));
                System.out.println("Beraber ");
            }

         else   if (a instanceof Makas) {
                ((UstaMakas) b).nesnePuaniGoster(((UstaMakas) b).durumGuncelle(((UstaMakas) b).etkiHesapla(a)));
                ((Makas) a).nesnePuaniGoster(((Makas) a).durumGuncelle(((Makas) a).etkiHesapla(b)));
                bilgisayar1.skorGoster(((UstaMakas) b).etkiHesapla(a));
                bilgisayar2.skorGoster(((Makas) a).etkiHesapla(b));
                System.out.println("Beraber ");
            }

         else   if (a instanceof Tas) {
                ((UstaMakas) b).nesnePuaniGoster(((UstaMakas) b).durumGuncelle(((UstaMakas) b).etkiHesapla(a)));
                ((Tas) a).nesnePuaniGoster(((Tas) a).durumGuncelle(((Tas) a).etkiHesapla(b)));
                bilgisayar1.skorGoster(((UstaMakas) b).etkiHesapla(a));
                bilgisayar2.skorGoster(((Tas) a).etkiHesapla(b));
                if (((UstaMakas) b).getDayaniklilik() <= 20) {
                    ((Tas) a).setSeviyePuani(((Tas) a).getSeviyePuani() + 20);
                    System.out.println("  Tas son seviye puanı:" + ((Tas) a).getSeviyePuani());
                    System.out.println(" Usta Makas son seviye puanı:" + ((UstaMakas) b).getSeviyePuani());
                }
            }

          else  if (a instanceof AgirTas) {
                ((UstaMakas) b).nesnePuaniGoster(((UstaMakas) b).durumGuncelle(((UstaMakas) b).etkiHesapla(a)));
                ((AgirTas) a).nesnePuaniGoster(((AgirTas) a).durumGuncelle(((AgirTas) a).etkiHesapla(b)));
                bilgisayar1.skorGoster(((UstaMakas) b).etkiHesapla(a));
                bilgisayar2.skorGoster(((AgirTas) a).etkiHesapla(b));
                if (((UstaMakas) b).getDayaniklilik() <= 20) {
                    ((AgirTas) a).setSeviyePuani(((AgirTas) a).getSeviyePuani() + 20);
                    System.out.println("Agir Tas son seviye puanı:" + ((AgirTas) a).getSeviyePuani());
                    System.out.println(" Usta Makas son seviye puanı:" + ((UstaMakas) b).getSeviyePuani());
                }
            }

         else   if (a instanceof Kagit) {
                ((UstaMakas) b).nesnePuaniGoster(((UstaMakas) b).durumGuncelle(((UstaMakas) b).etkiHesapla(a)));
                ((Kagit) a).nesnePuaniGoster(((Kagit) a).durumGuncelle(((Kagit) a).etkiHesapla(b)));
                bilgisayar1.skorGoster(((UstaMakas) b).etkiHesapla(a));
                bilgisayar2.skorGoster(((Kagit) a).etkiHesapla(b));
                if (((Kagit) a).getDayaniklilik() <= 20) {
                    ((UstaMakas) b).setSeviyePuani(((UstaMakas) b).getSeviyePuani() + 20);
                    System.out.println("Kagit son seviye puanı:" + ((Kagit) a).getSeviyePuani());
                    System.out.println(" Usta Makas son seviye puanı:" + ((UstaMakas) b).getSeviyePuani());
                }
            }

         else   if (a instanceof OzelKagit) {
                ((UstaMakas) b).nesnePuaniGoster(((UstaMakas) b).durumGuncelle(((UstaMakas) b).etkiHesapla(a)));
                ((OzelKagit) a).nesnePuaniGoster(((OzelKagit) a).durumGuncelle(((OzelKagit) a).etkiHesapla(b)));
                bilgisayar1.skorGoster(((UstaMakas) b).etkiHesapla(a));
                bilgisayar2.skorGoster(((OzelKagit) a).etkiHesapla(b));
                if (((OzelKagit) a).getDayaniklilik() <= 20) {
                    ((UstaMakas) b).setSeviyePuani(((UstaMakas) b).getSeviyePuani() + 20);
                    System.out.println(" Ozel Kagit son seviye puanı:" + ((OzelKagit) a).getSeviyePuani());
                    System.out.println(" Usta Makas son seviye puanı:" + ((UstaMakas) b).getSeviyePuani());
                }
            }
        }

    }

    public static void battleUser(ArrayList list3, ArrayList list1, int i) {
        ArrayList lista = null;
        bilgisayar1.nesneListesi = list1;
        Object a = bilgisayar1.nesneSec(bilgisayar1.nesneListesi);
        kullanıcı.nesneListesi = list3;
        System.out.println("**********Seçim**********");
        System.out.println("Destenizden seçim yapınız.");
        Object b = kullanıcı.nesneSec(kullanıcı.nesneListesi);
        System.out.println(b);

        if (i < 5) {
            if (!((Nesne) a).isNesneKullanildiMi()) {
                ((Nesne) a).setNesneKullanildiMi(true);
            } else {
                while (((Nesne) a).isNesneKullanildiMi()) {
                    a = bilgisayar1.nesneSec(bilgisayar1.nesneListesi);
                }
                ((Nesne) a).setNesneKullanildiMi(true);
            }

        } else {
            a = bilgisayar1.nesneSec(bilgisayar1.nesneListesi);

        }
        System.out.println("Bilgisayarın seçimi: " + a);

        if (a instanceof Tas) {
            if (b instanceof Kagit) {
                ((Tas) a).nesnePuaniGoster(((Tas) a).durumGuncelle(((Tas) a).etkiHesapla(b)));
                ((Kagit) b).nesnePuaniGoster(((Kagit) b).durumGuncelle(((Kagit) b).etkiHesapla(a)));

                bilgisayar1.skorGoster(((Kagit) b).etkiHesapla(a));
                bilgisayar2.skorGoster(((Tas) a).etkiHesapla(b));

                if (((Tas) a).getDayaniklilik() <= 20) {
                    ((Kagit) b).setSeviyePuani(((Kagit) b).getSeviyePuani() + 20);
                    System.out.println("Kagıt son seviye puanı:" + ((Kagit) b).getSeviyePuani());
                    System.out.println("Tas son seviye puanı:" + ((Tas) a).getSeviyePuani());
                    if (((Kagit) b).getSeviyePuani() >= 30) {
                        bilgisayar2.nesneListesi.add(new OzelKagit(2.0, ((Kagit) b).getNufuz(), ((Kagit) b).getDayaniklilik(), ((Kagit) b).getSeviyePuani(), ((Kagit) b).getName()));
                        bilgisayar2.nesneListesi.remove(b);
                    }
                }
            }
         else   if (b instanceof Tas) {

                ((Tas) a).nesnePuaniGoster(((Tas) a).durumGuncelle(((Tas) a).etkiHesapla(b)));
                ((Tas) b).nesnePuaniGoster(((Tas) b).durumGuncelle(((Tas) b).etkiHesapla(a)));

                System.out.println("Etki yok , berabere");

            }
         else   if (b instanceof Makas) {

                bilgisayar1.skorGoster(((Tas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((Makas) b).etkiHesapla(a));

                ((Tas) a).nesnePuaniGoster(((Tas) a).durumGuncelle(((Tas) a).etkiHesapla(b)));
                ((Makas) b).nesnePuaniGoster(((Makas) b).durumGuncelle(((Makas) b).etkiHesapla(a)));
                if (((Makas) b).getDayaniklilik() <= 20) {
                    ((Tas) a).setSeviyePuani(((Tas) a).getSeviyePuani() + 20);
                    System.out.println("Tas son seviye puanı:" + ((Tas) a).getSeviyePuani());
                    System.out.println("Makas son seviye puanı:" + ((Makas) b).getSeviyePuani());
                    if (((Tas) a).getSeviyePuani() >= 30) {
                        bilgisayar1.nesneListesi.add(new AgirTas());
                        bilgisayar1.nesneListesi.remove(a);
                    }
                }
            }
        }

       else if (a instanceof Makas) {
            if (b instanceof Kagit) {
                ((Makas) a).nesnePuaniGoster(((Makas) a).durumGuncelle(((Makas) a).etkiHesapla(b)));
                ((Kagit) b).nesnePuaniGoster(((Kagit) b).durumGuncelle(((Kagit) b).etkiHesapla(a)));

                bilgisayar1.skorGoster(((Makas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((Kagit) b).etkiHesapla(a));
                if (((Kagit) b).getDayaniklilik() <= 20) {
                    ((Makas) a).setSeviyePuani(((Makas) a).getSeviyePuani() + 20);
                    System.out.println("Makas son seviye puanı:" + ((Makas) a).getSeviyePuani());
                    System.out.println("Kagıt son seviye puanı:" + ((Kagit) b).getSeviyePuani());
                    if (((Makas) a).getSeviyePuani() >= 30) {
                        bilgisayar1.nesneListesi.add(new UstaMakas());
                        bilgisayar1.nesneListesi.remove(a);

                    }
                }

            }

          else  if (b instanceof Tas) {
                ((Makas) a).nesnePuaniGoster(((Makas) a).durumGuncelle(((Makas) a).etkiHesapla(b)));
                ((Tas) b).nesnePuaniGoster(((Tas) b).durumGuncelle(((Tas) b).etkiHesapla(a)));

                bilgisayar1.skorGoster(((Makas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((Tas) b).etkiHesapla(a));
                if (((Makas) a).getDayaniklilik() <= 20) {
                    ((Tas) b).setSeviyePuani(((Tas) b).getSeviyePuani() + 20);
                    System.out.println("Tas son seviye puanı:" + ((Tas) b).getSeviyePuani());
                    System.out.println("Makas son seviye puanı:" + ((Makas) a).getSeviyePuani());
                    if (((Tas) b).getSeviyePuani() >= 30) {
                        bilgisayar2.nesneListesi.add(new AgirTas());
                        bilgisayar2.nesneListesi.remove(b);
                        System.out.println(bilgisayar2.nesneListesi);

                    }
                }

            }
          else  if (b instanceof Makas) {
                ((Makas) a).nesnePuaniGoster(((Makas) a).durumGuncelle(((Makas) a).etkiHesapla(b)));
                ((Makas) b).nesnePuaniGoster(((Makas) b).durumGuncelle(((Makas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((Makas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((Makas) b).etkiHesapla(a));
                System.out.println("Etki yok ,berabere");
            }
        }

      else  if (a instanceof Kagit) {
            if (b instanceof Kagit) {
                ((Kagit) a).nesnePuaniGoster(((Kagit) a).durumGuncelle(((Kagit) a).etkiHesapla(b)));
                ((Kagit) b).nesnePuaniGoster(((Kagit) b).durumGuncelle(((Kagit) b).etkiHesapla(a)));

                System.out.println("Etki yok,berabere");
            }

          else  if (b instanceof Tas) {
                ((Kagit) a).nesnePuaniGoster(((Kagit) a).durumGuncelle(((Kagit) a).etkiHesapla(b)));
                ((Tas) b).nesnePuaniGoster(((Tas) b).durumGuncelle(((Tas) b).etkiHesapla(a)));

                bilgisayar1.skorGoster(((Kagit) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((Tas) b).etkiHesapla(a));
                if (((Tas) b).getDayaniklilik() <= 20) {
                    ((Kagit) a).setSeviyePuani(((Kagit) a).getSeviyePuani() + 20);
                    System.out.println("Kagıt son seviye puanı:" + ((Kagit) a).getSeviyePuani());
                    System.out.println("Tas son seviye puanı:" + ((Tas) b).getSeviyePuani());
                    if (((Kagit) a).getSeviyePuani() >= 30) {
                        bilgisayar1.nesneListesi.add(new OzelKagit());
                        bilgisayar1.nesneListesi.remove(a);
                        System.out.println(bilgisayar1.nesneListesi);

                    }

                }

            }
          else  if (b instanceof Makas) {
                ((Kagit) a).nesnePuaniGoster(((Kagit) a).durumGuncelle(((Kagit) a).etkiHesapla(b)));
                ((Makas) b).nesnePuaniGoster(((Makas) b).durumGuncelle(((Makas) b).etkiHesapla(a)));

                bilgisayar1.skorGoster(((Kagit) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((Makas) b).etkiHesapla(a));

                if (((Kagit) a).getDayaniklilik() <= 20) {
                    ((Makas) b).setSeviyePuani(((Makas) b).getSeviyePuani() + 20);
                    System.out.println("Makas son seviye puanı:" + ((Makas) b).getSeviyePuani());
                    System.out.println("Kagıt son seviye puanı:" + ((Kagit) a).getSeviyePuani());
                    if (((Makas) b).getSeviyePuani() >= 30) {
                        bilgisayar2.nesneListesi.add(new UstaMakas());
                        bilgisayar2.nesneListesi.remove(b);

                    }
                }

            }

        }

      else  if (a instanceof OzelKagit) {
            if (b instanceof Kagit) {
                System.out.println("Etki yok .berabere ");
            }

           else  if (b instanceof OzelKagit) {
                System.out.println("Etki yok .berabere ");
            }
            else if (b instanceof UstaMakas) {
                ((UstaMakas) b).nesnePuaniGoster(((UstaMakas) b).durumGuncelle(((UstaMakas) b).etkiHesapla(a)));
                ((OzelKagit) a).nesnePuaniGoster(((OzelKagit) a).durumGuncelle(((OzelKagit) a).etkiHesapla(b)));
                bilgisayar1.skorGoster(((UstaMakas) b).etkiHesapla(a));
                bilgisayar2.skorGoster(((OzelKagit) a).etkiHesapla(b));
                if (((OzelKagit) b).getDayaniklilik() <= 20) {
                    ((UstaMakas) a).setSeviyePuani(((UstaMakas) a).getSeviyePuani() + 20);
                    System.out.println("  Usta Makas son seviye puanı:" + ((UstaMakas) b).getSeviyePuani());
                    System.out.println(" Ozel Kagit son seviye puanı:" + ((OzelKagit) a).getSeviyePuani());
                }
            }

          else  if (b instanceof Makas) {
                ((Makas) b).nesnePuaniGoster(((Makas) b).durumGuncelle(((Makas) b).etkiHesapla(a)));
                ((OzelKagit) a).nesnePuaniGoster(((OzelKagit) a).durumGuncelle(((OzelKagit) a).etkiHesapla(b)));
                bilgisayar1.skorGoster(((Makas) b).etkiHesapla(a));
                bilgisayar2.skorGoster(((OzelKagit) a).etkiHesapla(b));
                if (((OzelKagit) a).getDayaniklilik() <= 20) {
                    ((Makas) b).setSeviyePuani(((Makas) a).getSeviyePuani() + 20);
                    System.out.println("  Usta Makas son seviye puanı:" + ((Makas) b).getSeviyePuani());
                    System.out.println(" Ozel Kagit son seviye puanı:" + ((OzelKagit) a).getSeviyePuani());
                }
            }

          else  if (b instanceof Tas) {
                ((Tas) b).nesnePuaniGoster(((Tas) b).durumGuncelle(((Tas) b).etkiHesapla(a)));
                ((OzelKagit) a).nesnePuaniGoster(((OzelKagit) a).durumGuncelle(((OzelKagit) a).etkiHesapla(b)));
                bilgisayar1.skorGoster(((Tas) b).etkiHesapla(a));
                bilgisayar2.skorGoster(((OzelKagit) a).etkiHesapla(b));
                if (((Tas) b).getDayaniklilik() <= 20) {
                    ((OzelKagit) a).setSeviyePuani(((OzelKagit) a).getSeviyePuani() + 20);
                    System.out.println("  Tas son seviye puanı:" + ((Tas) b).getSeviyePuani());
                    System.out.println(" Ozel Kagit son seviye puanı:" + ((OzelKagit) a).getSeviyePuani());
                }
            }

          else  if (b instanceof AgirTas) {
                ((AgirTas) b).nesnePuaniGoster(((AgirTas) b).durumGuncelle(((AgirTas) b).etkiHesapla(a)));
                ((OzelKagit) a).nesnePuaniGoster(((OzelKagit) a).durumGuncelle(((OzelKagit) a).etkiHesapla(b)));
                bilgisayar1.skorGoster(((AgirTas) b).etkiHesapla(a));
                bilgisayar2.skorGoster(((OzelKagit) a).etkiHesapla(b));
                if (((AgirTas) b).getDayaniklilik() <= 20) {
                    ((OzelKagit) a).setSeviyePuani(((OzelKagit) a).getSeviyePuani() + 20);
                    System.out.println(" Agir Tas son seviye puanı:" + ((AgirTas) b).getSeviyePuani());
                    System.out.println(" Ozel Kagit son seviye puanı:" + ((OzelKagit) a).getSeviyePuani());
                }
            }

        }

        ////////////////////////////////////////
      else  if (b instanceof OzelKagit) {
            if (a instanceof Tas) {
                ((Tas) a).nesnePuaniGoster(((Tas) a).durumGuncelle(((Tas) a).etkiHesapla(b)));
                ((OzelKagit) b).nesnePuaniGoster(((OzelKagit) b).durumGuncelle(((OzelKagit) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((OzelKagit) b).etkiHesapla(a));
                bilgisayar2.skorGoster(((Tas) a).etkiHesapla(b));
                if (((Tas) a).getDayaniklilik() <= 20) {
                    ((OzelKagit) b).setSeviyePuani(((OzelKagit) b).getSeviyePuani() + 20);
                    System.out.println(" Ozel Kagıt son seviye puanı:" + ((OzelKagit) b).getSeviyePuani());
                    System.out.println("Tas son seviye puanı:" + ((Tas) a).getSeviyePuani());
                }

              else  if (a instanceof AgirTas) {
                    ((AgirTas) a).nesnePuaniGoster(((AgirTas) a).durumGuncelle(((AgirTas) a).etkiHesapla(b)));
                    ((OzelKagit) b).nesnePuaniGoster(((OzelKagit) b).durumGuncelle(((OzelKagit) b).etkiHesapla(a)));
                    bilgisayar1.skorGoster(((OzelKagit) b).etkiHesapla(a));
                    bilgisayar2.skorGoster(((AgirTas) a).etkiHesapla(b));
                    if (((AgirTas) a).getDayaniklilik() <= 20) {
                        ((OzelKagit) b).setSeviyePuani(((OzelKagit) b).getSeviyePuani() + 20);
                        System.out.println(" Ozel Kagıt son seviye puanı:" + ((OzelKagit) b).getSeviyePuani());
                        System.out.println(" Agir Tas son seviye puanı:" + ((AgirTas) a).getSeviyePuani());
                    }

                }

              else  if (a instanceof Kagit) {
                    ((Kagit) a).nesnePuaniGoster(((Kagit) a).durumGuncelle(((Kagit) a).etkiHesapla(b)));
                    ((OzelKagit) b).nesnePuaniGoster(((OzelKagit) b).durumGuncelle(((OzelKagit) b).etkiHesapla(a)));
                    bilgisayar1.skorGoster(((OzelKagit) b).etkiHesapla(a));
                    bilgisayar2.skorGoster(((Kagit) a).etkiHesapla(b));
                    System.out.println("Etki yok , berabere");

                }

             else   if (a instanceof OzelKagit) {
                    ((OzelKagit) a).nesnePuaniGoster(((OzelKagit) a).durumGuncelle(((OzelKagit) a).etkiHesapla(b)));
                    ((OzelKagit) b).nesnePuaniGoster(((OzelKagit) b).durumGuncelle(((OzelKagit) b).etkiHesapla(a)));
                    bilgisayar1.skorGoster(((OzelKagit) b).etkiHesapla(a));
                    bilgisayar2.skorGoster(((OzelKagit) a).etkiHesapla(b));
                    System.out.println("Etki yok , berabere");

                }

              else  if (a instanceof Makas) {
                    ((Makas) a).nesnePuaniGoster(((Makas) a).durumGuncelle(((Makas) a).etkiHesapla(b)));
                    ((OzelKagit) b).nesnePuaniGoster(((OzelKagit) b).durumGuncelle(((OzelKagit) b).etkiHesapla(a)));
                    bilgisayar1.skorGoster(((OzelKagit) b).etkiHesapla(a));
                    bilgisayar2.skorGoster(((Makas) a).etkiHesapla(b));
                    if (((OzelKagit) a).getDayaniklilik() <= 20) {
                        ((Makas) b).setSeviyePuani(((Makas) b).getSeviyePuani() + 20);
                        System.out.println(" Ozel Kagıt son seviye puanı:" + ((OzelKagit) b).getSeviyePuani());
                        System.out.println("Makas son seviye puanı:" + ((Makas) a).getSeviyePuani());
                    }

                }

             else   if (a instanceof UstaMakas) {
                    ((UstaMakas) a).nesnePuaniGoster(((UstaMakas) a).durumGuncelle(((UstaMakas) a).etkiHesapla(b)));
                    ((OzelKagit) b).nesnePuaniGoster(((OzelKagit) b).durumGuncelle(((OzelKagit) b).etkiHesapla(a)));
                    bilgisayar1.skorGoster(((OzelKagit) b).etkiHesapla(a));
                    bilgisayar2.skorGoster(((UstaMakas) a).etkiHesapla(b));
                    if (((OzelKagit) a).getDayaniklilik() <= 20) {
                        ((UstaMakas) b).setSeviyePuani(((UstaMakas) b).getSeviyePuani() + 20);
                        System.out.println(" Ozel Kagıt son seviye puanı:" + ((OzelKagit) b).getSeviyePuani());
                        System.out.println("Usta Makas son seviye puanı:" + ((UstaMakas) a).getSeviyePuani());
                    }
                }
            }
        }

        //////////////////////////////////////
      else  if (a instanceof AgirTas) {
            if (b instanceof Tas) {
                bilgisayar1.skorGoster(((AgirTas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((Tas) b).etkiHesapla(a));
                ((AgirTas) a).nesnePuaniGoster(((AgirTas) a).durumGuncelle(((AgirTas) a).etkiHesapla(b)));
                ((Tas) b).nesnePuaniGoster(((Tas) b).durumGuncelle(((Tas) b).etkiHesapla(a)));
                System.out.println("Beraber ");
            }
          else  if (b instanceof AgirTas) {
                bilgisayar1.skorGoster(((AgirTas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((AgirTas) b).etkiHesapla(a));
                ((AgirTas) a).nesnePuaniGoster(((AgirTas) a).durumGuncelle(((AgirTas) a).etkiHesapla(b)));
                ((AgirTas) b).nesnePuaniGoster(((AgirTas) b).durumGuncelle(((AgirTas) b).etkiHesapla(a)));
                System.out.println("Beraber ");
            }

         else   if (b instanceof Makas) {
                bilgisayar1.skorGoster(((AgirTas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((Makas) b).etkiHesapla(a));
                ((AgirTas) a).nesnePuaniGoster(((AgirTas) a).durumGuncelle(((AgirTas) a).etkiHesapla(b)));
                ((Makas) b).nesnePuaniGoster(((Makas) b).durumGuncelle(((Makas) b).etkiHesapla(a)));
                if (((Makas) b).getDayaniklilik() <= 20) {
                    ((AgirTas) a).setSeviyePuani(((AgirTas) a).getSeviyePuani() + 20);
                    System.out.println("Agir Tas son seviye puanı:" + ((AgirTas) a).getSeviyePuani());
                    System.out.println("Makas son seviye puanı:" + ((Makas) b).getSeviyePuani());
                }
            }

         else   if (b instanceof UstaMakas) {
                bilgisayar1.skorGoster(((AgirTas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((UstaMakas) b).etkiHesapla(a));
                ((AgirTas) a).nesnePuaniGoster(((AgirTas) a).durumGuncelle(((AgirTas) a).etkiHesapla(b)));
                ((UstaMakas) b).nesnePuaniGoster(((UstaMakas) b).durumGuncelle(((UstaMakas) b).etkiHesapla(a)));
                if (((UstaMakas) b).getDayaniklilik() <= 20) {
                    ((AgirTas) a).setSeviyePuani(((AgirTas) a).getSeviyePuani() + 20);
                    System.out.println(" Agir Tas son seviye puanı:" + ((AgirTas) a).getSeviyePuani());
                    System.out.println("Usta Makas son seviye puanı:" + ((Makas) a).getSeviyePuani());
                }
            }

         else   if (b instanceof Kagit) {
                bilgisayar1.skorGoster(((AgirTas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((Kagit) b).etkiHesapla(a));
                ((AgirTas) a).nesnePuaniGoster(((AgirTas) a).durumGuncelle(((AgirTas) a).etkiHesapla(b)));
                ((Kagit) b).nesnePuaniGoster(((Kagit) b).durumGuncelle(((Kagit) b).etkiHesapla(a)));
                if (((AgirTas) a).getDayaniklilik() <= 20) {
                    ((Kagit) b).setSeviyePuani(((Kagit) b).getSeviyePuani() + 20);
                    System.out.println(" Agir Tas son seviye puanı:" + ((AgirTas) a).getSeviyePuani());
                    System.out.println("Kagit son seviye puanı:" + ((Kagit) b).getSeviyePuani());
                }
            }

         else   if (b instanceof OzelKagit) {
                bilgisayar1.skorGoster(((AgirTas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((OzelKagit) b).etkiHesapla(a));
                ((AgirTas) a).nesnePuaniGoster(((AgirTas) a).durumGuncelle(((AgirTas) a).etkiHesapla(b)));
                ((OzelKagit) b).nesnePuaniGoster(((OzelKagit) b).durumGuncelle(((OzelKagit) b).etkiHesapla(a)));
                if (((AgirTas) a).getDayaniklilik() <= 20) {
                    ((OzelKagit) b).setSeviyePuani(((OzelKagit) b).getSeviyePuani() + 20);
                    System.out.println(" Agir Tas son seviye puanı:" + ((AgirTas) a).getSeviyePuani());
                    System.out.println(" Ozel Kagit son seviye puanı:" + ((OzelKagit) b).getSeviyePuani());
                }
            }

        }
        ////////////////////////////////////////////
     else   if (b instanceof AgirTas) {
            if (a instanceof OzelKagit) {
                ((OzelKagit) a).nesnePuaniGoster(((OzelKagit) a).durumGuncelle(((OzelKagit) a).etkiHesapla(b)));
                ((AgirTas) b).nesnePuaniGoster(((AgirTas) b).durumGuncelle(((AgirTas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((OzelKagit) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((AgirTas) b).etkiHesapla(a));
                if (((AgirTas) b).getDayaniklilik() <= 20) {
                    ((OzelKagit) a).setSeviyePuani(((OzelKagit) a).getSeviyePuani() + 20);
                    System.out.println(" Ozel Kagit son seviye puanı:" + ((OzelKagit) a).getSeviyePuani());
                    System.out.println(" Agir Tas son seviye puanı:" + ((AgirTas) b).getSeviyePuani());
                }
            }

        else    if (a instanceof Kagit) {
                ((Kagit) a).nesnePuaniGoster(((Kagit) a).durumGuncelle(((Kagit) a).etkiHesapla(b)));
                ((AgirTas) b).nesnePuaniGoster(((AgirTas) b).durumGuncelle(((AgirTas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((Kagit) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((AgirTas) b).etkiHesapla(a));
                if (((AgirTas) b).getDayaniklilik() <= 20) {
                    ((Kagit) a).setSeviyePuani(((Kagit) a).getSeviyePuani() + 20);
                    System.out.println("  Kagit son seviye puanı:" + ((Kagit) a).getSeviyePuani());
                    System.out.println(" Agir Tas son seviye puanı:" + ((AgirTas) b).getSeviyePuani());
                }
            }

          else  if (a instanceof Makas) {
                ((Makas) a).nesnePuaniGoster(((Makas) a).durumGuncelle(((Makas) a).etkiHesapla(b)));
                ((AgirTas) b).nesnePuaniGoster(((AgirTas) b).durumGuncelle(((AgirTas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((Makas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((AgirTas) b).etkiHesapla(a));
                if (((Makas) a).getDayaniklilik() <= 20) {
                    ((AgirTas) b).setSeviyePuani(((AgirTas) b).getSeviyePuani() + 20);
                    System.out.println("  Makas son seviye puanı:" + ((Makas) a).getSeviyePuani());
                    System.out.println(" Agir Tas son seviye puanı:" + ((AgirTas) b).getSeviyePuani());
                }
            }
         else   if (a instanceof UstaMakas) {
                ((UstaMakas) a).nesnePuaniGoster(((UstaMakas) a).durumGuncelle(((UstaMakas) a).etkiHesapla(b)));
                ((AgirTas) b).nesnePuaniGoster(((AgirTas) b).durumGuncelle(((AgirTas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((UstaMakas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((AgirTas) b).etkiHesapla(a));
                if (((UstaMakas) a).getDayaniklilik() <= 20) {
                    ((AgirTas) b).setSeviyePuani(((AgirTas) b).getSeviyePuani() + 20);
                    System.out.println("  Usta Makas son seviye puanı:" + ((UstaMakas) a).getSeviyePuani());
                    System.out.println(" Agir Tas son seviye puanı:" + ((AgirTas) b).getSeviyePuani());
                }
            }

         else   if (a instanceof Tas) {
                ((Tas) a).nesnePuaniGoster(((Tas) a).durumGuncelle(((Tas) a).etkiHesapla(b)));
                ((AgirTas) b).nesnePuaniGoster(((AgirTas) b).durumGuncelle(((AgirTas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((Tas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((AgirTas) b).etkiHesapla(a));
                System.out.println("Durum berabere ");
            }

         else   if (a instanceof AgirTas) {
                ((AgirTas) a).nesnePuaniGoster(((AgirTas) a).durumGuncelle(((AgirTas) a).etkiHesapla(b)));
                ((AgirTas) b).nesnePuaniGoster(((AgirTas) b).durumGuncelle(((AgirTas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((AgirTas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((AgirTas) b).etkiHesapla(a));
                System.out.println("Etki yok ,berabere");
            }

        }
        /////////////////////////////////
      else  if (a instanceof UstaMakas) {
            if (b instanceof UstaMakas) {
                ((UstaMakas) a).nesnePuaniGoster(((UstaMakas) a).durumGuncelle(((UstaMakas) a).etkiHesapla(b)));
                ((UstaMakas) b).nesnePuaniGoster(((UstaMakas) b).durumGuncelle(((UstaMakas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((UstaMakas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((UstaMakas) b).etkiHesapla(a));
                System.out.println("Beraber ");
            }

          else  if (b instanceof Makas) {
                ((UstaMakas) a).nesnePuaniGoster(((UstaMakas) a).durumGuncelle(((UstaMakas) a).etkiHesapla(b)));
                ((Makas) b).nesnePuaniGoster(((Makas) b).durumGuncelle(((Makas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((UstaMakas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((Makas) b).etkiHesapla(a));
                System.out.println("Beraber ");
            }

          else  if (b instanceof Tas) {
                ((UstaMakas) a).nesnePuaniGoster(((UstaMakas) a).durumGuncelle(((UstaMakas) a).etkiHesapla(b)));
                ((Tas) b).nesnePuaniGoster(((Tas) b).durumGuncelle(((Tas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((UstaMakas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((Tas) b).etkiHesapla(a));
                if (((UstaMakas) a).getDayaniklilik() <= 20) {
                    ((Tas) b).setSeviyePuani(((Tas) b).getSeviyePuani() + 20);
                    System.out.println("  Tas son seviye puanı:" + ((Tas) b).getSeviyePuani());
                    System.out.println(" Usta Makas son seviye puanı:" + ((UstaMakas) a).getSeviyePuani());
                }
            }

          else  if (b instanceof AgirTas) {
                ((UstaMakas) a).nesnePuaniGoster(((UstaMakas) a).durumGuncelle(((UstaMakas) a).etkiHesapla(b)));
                ((AgirTas) b).nesnePuaniGoster(((AgirTas) b).durumGuncelle(((AgirTas) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((UstaMakas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((AgirTas) b).etkiHesapla(a));
                if (((UstaMakas) b).getDayaniklilik() <= 20) {
                    ((AgirTas) b).setSeviyePuani(((AgirTas) b).getSeviyePuani() + 20);
                    System.out.println("Agir Tas son seviye puanı:" + ((AgirTas) b).getSeviyePuani());
                    System.out.println(" Usta Makas son seviye puanı:" + ((UstaMakas) a).getSeviyePuani());
                }
            }

          else  if (b instanceof Kagit) {
                ((UstaMakas) a).nesnePuaniGoster(((UstaMakas) a).durumGuncelle(((UstaMakas) a).etkiHesapla(b)));
                ((Kagit) b).nesnePuaniGoster(((Kagit) b).durumGuncelle(((Kagit) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((UstaMakas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((Kagit) b).etkiHesapla(a));
                if (((Kagit) b).getDayaniklilik() <= 20) {
                    ((UstaMakas) a).setSeviyePuani(((UstaMakas) a).getSeviyePuani() + 20);
                    System.out.println("Kagit son seviye puanı:" + ((Kagit) b).getSeviyePuani());
                    System.out.println(" Usta Makas son seviye puanı:" + ((UstaMakas) a).getSeviyePuani());
                }
            }

         else   if (b instanceof OzelKagit) {
                ((UstaMakas) a).nesnePuaniGoster(((UstaMakas) a).durumGuncelle(((UstaMakas) a).etkiHesapla(b)));
                ((OzelKagit) b).nesnePuaniGoster(((OzelKagit) b).durumGuncelle(((OzelKagit) b).etkiHesapla(a)));
                bilgisayar1.skorGoster(((UstaMakas) a).etkiHesapla(b));
                bilgisayar2.skorGoster(((OzelKagit) b).etkiHesapla(a));
                if (((OzelKagit) b).getDayaniklilik() <= 20) {
                    ((UstaMakas) a).setSeviyePuani(((UstaMakas) a).getSeviyePuani() + 20);
                    System.out.println(" Ozel Kagit son seviye puanı:" + ((OzelKagit) b).getSeviyePuani());
                    System.out.println(" Usta Makas son seviye puanı:" + ((UstaMakas) a).getSeviyePuani());
                }
            }
        }
        ///////////////////////////////////////

     else   if (b instanceof UstaMakas) {
            if (a instanceof UstaMakas) {
                ((UstaMakas) b).nesnePuaniGoster(((UstaMakas) b).durumGuncelle(((UstaMakas) b).etkiHesapla(a)));
                ((UstaMakas) a).nesnePuaniGoster(((UstaMakas) a).durumGuncelle(((UstaMakas) a).etkiHesapla(b)));
                bilgisayar1.skorGoster(((UstaMakas) b).etkiHesapla(a));
                bilgisayar2.skorGoster(((UstaMakas) a).etkiHesapla(b));
                System.out.println("Beraber ");
            }

         else   if (a instanceof Makas) {
                ((UstaMakas) b).nesnePuaniGoster(((UstaMakas) b).durumGuncelle(((UstaMakas) b).etkiHesapla(a)));
                ((Makas) a).nesnePuaniGoster(((Makas) a).durumGuncelle(((Makas) a).etkiHesapla(b)));
                bilgisayar1.skorGoster(((UstaMakas) b).etkiHesapla(a));
                bilgisayar2.skorGoster(((Makas) a).etkiHesapla(b));
                System.out.println("Beraber ");
            }

         else   if (a instanceof Tas) {
                ((UstaMakas) b).nesnePuaniGoster(((UstaMakas) b).durumGuncelle(((UstaMakas) b).etkiHesapla(a)));
                ((Tas) a).nesnePuaniGoster(((Tas) a).durumGuncelle(((Tas) a).etkiHesapla(b)));
                bilgisayar1.skorGoster(((UstaMakas) b).etkiHesapla(a));
                bilgisayar2.skorGoster(((Tas) a).etkiHesapla(b));
                if (((UstaMakas) b).getDayaniklilik() <= 20) {
                    ((Tas) a).setSeviyePuani(((Tas) a).getSeviyePuani() + 20);
                    System.out.println("  Tas son seviye puanı:" + ((Tas) a).getSeviyePuani());
                    System.out.println(" Usta Makas son seviye puanı:" + ((UstaMakas) b).getSeviyePuani());
                }
            }

          else  if (a instanceof AgirTas) {
                ((UstaMakas) b).nesnePuaniGoster(((UstaMakas) b).durumGuncelle(((UstaMakas) b).etkiHesapla(a)));
                ((AgirTas) a).nesnePuaniGoster(((AgirTas) a).durumGuncelle(((AgirTas) a).etkiHesapla(b)));
                bilgisayar1.skorGoster(((UstaMakas) b).etkiHesapla(a));
                bilgisayar2.skorGoster(((AgirTas) a).etkiHesapla(b));
                if (((UstaMakas) b).getDayaniklilik() <= 20) {
                    ((AgirTas) a).setSeviyePuani(((AgirTas) a).getSeviyePuani() + 20);
                    System.out.println("Agir Tas son seviye puanı:" + ((AgirTas) a).getSeviyePuani());
                    System.out.println(" Usta Makas son seviye puanı:" + ((UstaMakas) b).getSeviyePuani());
                }
            }

         else   if (a instanceof Kagit) {
                ((UstaMakas) b).nesnePuaniGoster(((UstaMakas) b).durumGuncelle(((UstaMakas) b).etkiHesapla(a)));
                ((Kagit) a).nesnePuaniGoster(((Kagit) a).durumGuncelle(((Kagit) a).etkiHesapla(b)));
                bilgisayar1.skorGoster(((UstaMakas) b).etkiHesapla(a));
                bilgisayar2.skorGoster(((Kagit) a).etkiHesapla(b));
                if (((Kagit) a).getDayaniklilik() <= 20) {
                    ((UstaMakas) b).setSeviyePuani(((UstaMakas) b).getSeviyePuani() + 20);
                    System.out.println("Kagit son seviye puanı:" + ((Kagit) a).getSeviyePuani());
                    System.out.println(" Usta Makas son seviye puanı:" + ((UstaMakas) b).getSeviyePuani());
                }
            }

         else   if (a instanceof OzelKagit) {
                ((UstaMakas) b).nesnePuaniGoster(((UstaMakas) b).durumGuncelle(((UstaMakas) b).etkiHesapla(a)));
                ((OzelKagit) a).nesnePuaniGoster(((OzelKagit) a).durumGuncelle(((OzelKagit) a).etkiHesapla(b)));
                bilgisayar1.skorGoster(((UstaMakas) b).etkiHesapla(a));
                bilgisayar2.skorGoster(((OzelKagit) a).etkiHesapla(b));
                if (((OzelKagit) a).getDayaniklilik() <= 20) {
                    ((UstaMakas) b).setSeviyePuani(((UstaMakas) b).getSeviyePuani() + 20);
                    System.out.println(" Ozel Kagit son seviye puanı:" + ((OzelKagit) a).getSeviyePuani());
                    System.out.println(" Usta Makas son seviye puanı:" + ((UstaMakas) b).getSeviyePuani());
                }
            }
        }
}
}
