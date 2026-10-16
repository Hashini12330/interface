import static java.lang.System.out;

public class Main{
    public static void main(){  
        warrior w = new warrior();
        w.fight();
        System.out.println("-----------------------------");

        // 02
        // Interface — Polymorphic Reference
        Ifighter2 f = new warrior2();
        f.fighter();
        System.out.println("-----------------------------");


        // 03
        // Interface — Default Method
        Dog d = new Dog();
        d.sound();
        System.out.println("-----------------------------");

        
        // 04
        // interface - static method
        Animal1.information();



    }
}

interface Ifighter{
    public void fight();
}


class warrior implements Ifighter{

    @Override 
    public void fight(){
        System.out.println("warrior is fighting");
    }
}


// 02
// Interface — Polymorphic Reference

interface Ifighter2{
    void fighter();
}

class warrior2 implements Ifighter2{
    @Override 
    public void fighter(){
        System.out.println("warrior fighting 02");
    }
}



// 03
// Interface — Default Method
interface Animal{
    default void sound(){
        out.println("Animal sound");
    }
}

class Dog implements Animal{
    // Animal does not need to impiment sound()
}


// 04
// interface - static method
interface Animal1{
    static void information(){  // information cannot override
        System.out.println("This is a static method");
    }
}


// 05
