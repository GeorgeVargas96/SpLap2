package lab3compositepattern;

import java.util.concurrent.TimeUnit;

public class Image implements Element{

    private String image;

    public Image(String image) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.image = image;
    }

    @Override
    public void print() {
        System.out.println("Image: "+image);
    }


}
