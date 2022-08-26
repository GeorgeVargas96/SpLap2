package proxypattern;



public class ImageProxy implements Element {

    private String url;

    private Image realImage;

    public ImageProxy(String url) {
        this.url = url;

    }

    public Image loadImage(){
        if(realImage==null)
            realImage=new Image(url);

        return realImage;
    }

    public void print(){
        this.loadImage().print();
    }
}
