public class Main{
    public static void main(){  
        warrior w = new warrior();
        w.fight();


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