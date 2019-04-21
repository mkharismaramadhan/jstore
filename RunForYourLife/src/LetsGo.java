import static java.lang.Math.random;

public class LetsGo {

    public LetsGo() {
    }

    public static void main(String[] args) {
        //Lionel < Andres < Messi
        double weightLionel = 1;
        double weightAndres = 0.8;
        double weightMessi = 0.5;

        RunForYourLife lionel = new RunForYourLife("Lionel", weightLionel);
        RunForYourLife andres = new RunForYourLife("Andres", weightAndres);
        RunForYourLife messi = new RunForYourLife("Messii", weightMessi);

        lionel.start();
        andres.start();
        messi.start();
    }

    public static int getRandomNumber(){
        //Random Number Between 100-500
        return (int)(Math.random() * ((500 - 100) + 1)) + 100;
    }
}
