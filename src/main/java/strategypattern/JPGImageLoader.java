package strategypattern;

import ij.IJ;
import ij.ImagePlus;

public class JPGImageLoader implements ImageLoader{

    private ImagePlus img;


    public JPGImageLoader(String path){
        img= IJ.openImage(path);

    }
    @Override
    public void showImg(String path) {
        img.show();
    }
}
