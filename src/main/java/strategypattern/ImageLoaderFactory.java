package strategypattern;

public class ImageLoaderFactory {

    private ImageLoader img;

    public void show(String path){
        img=new JPGImageLoader(path);
    }
}
