package Homework9;

public class Phone {

        //1) Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Samsung with specific  attributes and behaviors.
    String name;
    String manufacture;
    String model;
    String color;
    String memory;
    void call(){
        System.out.println("call");
    }
    void camera(){
        System.out.println("can do pictures");
    }
    void light(){
        System.out.println("you can use light");
    }
    void alarm(){
        System.out.println("alarm");
    }
    void weather(){
        System.out.println("it shows weather");
    }
    void message(){
        System.out.println("use of messenger");
    }

    public static void main(String[] args) {
       Phone Iphone=new Phone();
       Iphone.name="IPhone";
       Iphone.manufacture="China";
       Iphone.model="13Pro";
       Iphone.memory="1G";
       Iphone.color="Purple";
       Iphone.call();
       Iphone.message();
       Iphone.alarm();

       Phone Pixel=new Phone();
       Pixel.name="Google Pixel Phone";
       Pixel.manufacture="China";
       Pixel.model="6 Pro";
       Pixel.memory="128G";
       Pixel.color="black";
       Pixel.call();
       Pixel.light();
       Pixel.camera();

       Phone Samsung=new Phone();
       Samsung.name="Samsung";
       Samsung.manufacture="China";
       Samsung.model="S22";
       Samsung.memory="256G";
       Samsung.color="Deep blue";

       Samsung.weather();
       Samsung.alarm();
       Samsung.call();

    }


}

