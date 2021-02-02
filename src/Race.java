public class Race {
    static int val;

    public Race(int v){
        this.val = v;
    }

    public void go() throws InterruptedException{
        Inc Tp = new Inc();
        Desc Tm = new Desc();
        Tp.start();
        Tm.start();
        //Les deux Threads sont lancés en parallèles
        Tp.join();
        Tm.join();
        System.out.println(val);
    }
}
