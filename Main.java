public class Main{
    public static void main(){  
        warrior w = new warrior();
        w.fight();
        System.out.println("-----------------------------");

        // 02
        // Interface — Polymorphic Reference
        Ifighter2 f = new warrior2();
        f.fighter();

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
