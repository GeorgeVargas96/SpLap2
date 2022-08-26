package lab2sp;

public class Image implements Element {
    private String img;

    public Image(String img) {
        this.img = img;
    }

    public void print(){
        System.out.println(img);
    }
}
