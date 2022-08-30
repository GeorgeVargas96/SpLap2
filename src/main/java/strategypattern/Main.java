package strategypattern;

public class Main {
    public static void main(String []args){
//        Section cap1 = new Section("Capitolul 1");
//        Paragraph p1 = new Paragraph("Paragraph 1");
//        cap1.addContent(p1);
//        Paragraph p2 = new Paragraph("Paragraph 2");
//        cap1.addContent(p2);
//        Paragraph p3 = new Paragraph("Paragraph 3");
//        cap1.addContent(p3);
//        Paragraph p4 = new Paragraph("Paragraph 4");
//        cap1.addContent(p4);
//        System.out.println("Printing without Alignment");
//        System.out.println();
//        cap1.print();
//        p1.setStrategy(new AlignCenter());
//        p2.setStrategy(new AlignRight());
//        p3.setStrategy(new AlignLeft());
//        System.out.println();
//        System.out.println("Printing with Alignment");
//        System.out.println();
//        cap1.print();

        Section testSec=new Section("Sec");
        Image img=new Image("D:/Img//website.jpg");
        testSec.addContent(img);
        testSec.print();
    }
}
