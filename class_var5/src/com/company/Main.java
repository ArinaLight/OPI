package com.company;
public class Main {

    public static void main(String[] args) {
        Home[] home = new Home[5];
        home[0] = new Home();
        home[1] = new Home();
        home[2] = new Home(47.5, 31.3, 10, false,"кирпичный дом", 5, 9, 55000);
        home[3] = new Home(50, 36, 8, false, "кирпичный дом", 9, 12, 60000);
        home[4] = new Home(40.7, 30, 8, true, "панельный дом", 2,7,40000);

        System.out.println("Дома с лоджией");
        for(int a=0; a<5; a++){
            home[a].first(a);
        }
        System.out.println("Кирпичные дома с площадью кухни больше 8 кв. ед.");
        for(int a=0; a<5; a++){
            home[a].second(a);
        }
    }
}

class Home{
    double square;
    double live;
    double kitchen;
    boolean loggia;
    String type;
    int floor;
    int district;
    int price;

    Home(double sq, double l, double k, boolean log, String t, int f, int d, int p){
        square=sq;
        live=l;
        kitchen=k;
        loggia=log;
        type=t;
        floor=f;
        district=d;
        price=p;
    }
    Home() {
        square=55;
        live=45;
        kitchen=10;
        loggia=true;
        type="панельный дом";
        floor=5;
        district=12;
        price=50000;
    }
    void first(int a){
        if(loggia ==true){
            int b = a+1;
            System.out.println("№"+b);
            System.out.println(square);
            System.out.println(price );
            System.out.println(district);
        }
    }
    void second(int a){
        if(kitchen>8 && type=="кирпичный дом"){
            int b = a+1;
            System.out.println("№"+b);
            System.out.println(square);
            System.out.println(price );
            System.out.println(district);
        }
    }
}
