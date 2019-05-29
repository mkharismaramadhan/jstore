public class RunForYourLife implements Runnable {
    private String pemain;
    private Thread thread;
    private double angka;

    public RunForYourLife(String pemain, double angka)
    {
        this.pemain = pemain;
        this.angka = angka;
    }

    @Override
    public void run() {
        System.out.print(pemain + ", go!\n");
        try {
            for (int i=0; i<21 ; i++) {
                int random = (int) Math.round(LetsGo.getRandomNumber()*angka);
                System.out.println(pemain + " has passed checkpoint (" + i + ")");
                Thread.sleep(random);
            }
            } catch (InterruptedException e) {
                System.out.println(pemain+ " was interrupted");
        }
            System.out.println(pemain + " has finished!");
        }

        public void start() {

        if (thread == null){
            thread = new Thread(this, pemain);
            System.out.println(pemain + ", ready");
            System.out.println(pemain + ", set");
            thread.start();
        }
    }
}
