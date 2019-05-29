public class LetsGo {
    public static int getRandomNumber(){

        //Dengan asumsi soal 100500ms berarti 100 - 500 ms dikarenakan waktu 100500 ms sangat lama
        return (int)(Math.random() * ((5000 - 100) + 1)) + 100;

    }

    public static void main(String[] args) {
        double weightLionel = 1;
        double weightAndres = 0.75;
        double weightMessi = 0.5;

        RunForYourLife pemain1 = new RunForYourLife("Lionel", weightLionel);
        RunForYourLife pemain2 = new RunForYourLife("Andres", weightAndres);
        RunForYourLife pemain3 = new RunForYourLife("Messi", weightMessi);

        pemain1.start();
        pemain2.start();
        pemain3.start();
    }
}