public class Main {

    public static void main(String[] args) {

        Fighther marc = new Fighther("Marc" , 15 , 100, 90, 0);
        Fighther alex = new Fighther("Alex" , 10 , 95, 100, 0);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();


    }
}