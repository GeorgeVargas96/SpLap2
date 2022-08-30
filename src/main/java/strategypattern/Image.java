package strategypattern;

import java.util.concurrent.TimeUnit;

public class Image implements Element {

    private String path;

    private ImageLoaderFactory imageLoaderFactory;

    public Image(String image) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        imageLoaderFactory=new ImageLoaderFactory();
        this.path = image;
    }

    @Override
    public void print() {

        System.out.println("Image: "+ path);
        imageLoaderFactory.show(path);
    }


}
