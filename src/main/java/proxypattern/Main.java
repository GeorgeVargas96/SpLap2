package proxypattern;

public class Main {
    public static void main(String []args){
        long startTime = System.currentTimeMillis();
//        Image img1 = new Image("Pamela Anderson");
//        Image img2 = new Image("Kim Kardashian");
//        Image img3 = new Image("Kirby Griffin");

        ImageProxy img1 = new ImageProxy("Pamela Anderson");
        ImageProxy img2 = new ImageProxy("Kim Kardashian");
        ImageProxy img3 = new ImageProxy("Kirby Griffin");


        Section playboyS1 = new Section("Front Cover");
        playboyS1.addContent(img1);
        Section playboyS2 = new Section("Summer Girls");
        playboyS2.addContent(img2);
        playboyS2.addContent(img3);
        Book playboy = new Book("Playboy");
        playboy.addContent(playboyS1);
        playboy.addContent(playboyS2);
        long endTime = System.currentTimeMillis();
        System.out.println("Creation of the content took " + (endTime -
                startTime) + " milliseconds");
        startTime = System.currentTimeMillis();
        playboyS1.print();
        endTime = System.currentTimeMillis();
        System.out.println("Printing of the section 1 took " + (endTime -
                startTime) + " milliseconds");
        startTime = System.currentTimeMillis();
        playboyS1.print();
        endTime = System.currentTimeMillis();
        System.out.println("Printing again the section 1 took " + (endTime -
                startTime) + " milliseconds");
    }
}
