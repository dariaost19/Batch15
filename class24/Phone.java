package class24;

import class20.Parent;

public abstract class Phone {
    // Create a phone class , create abstract methods displayPictures, unlock phone, sendText
    //create 2 child classes and provide specific implementation
    // write code to achieve runtime polymorphism
    abstract void displayPictures();
    abstract void unlockPhone();
    abstract void sendText();
}
class Iphone extends Phone{
    @Override
    void displayPictures() {
        System.out.println("Iphone can display pictures in Photos Folder");
    }

    @Override
    void unlockPhone() {
        System.out.println("You can use face ID to unlock phone");
    }

    @Override
    void sendText() {
        System.out.println("You can send texts via Imessage");
    }
}
class Samsung extends Phone{
    @Override
    void displayPictures() {
        System.out.println("Samsung can display pictures in Library");
    }

    @Override
    void unlockPhone() {
        System.out.println("To unlock you should enter password");
    }

    @Override
    void sendText() {
        System.out.println("you can send Text Messages");
    }
}
