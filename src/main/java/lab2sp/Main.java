package lab2sp;

public class Main {

    public static void main(String []args){

        Book discoTitanic = new Book("Disco Titanic");
        Author rpGheo = new Author("Radu Pavel Gheo");
        discoTitanic.addAuthor(rpGheo);
        int indexChapterOne = discoTitanic.createChapter("Capitolul 1");
        Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
        int indexSubChapterOneOne = chp1.createSubChapter("Subcapitolul 1.1");
        SubChapter scOneOne = chp1.getSubChapter(indexSubChapterOneOne);
        scOneOne.createNewParagraph("lab2sp.Paragraph 1");
        scOneOne.createNewParagraph("lab2sp.Paragraph 2");
        scOneOne.createNewParagraph("lab2sp.Paragraph 3");
        scOneOne.createNewImage("lab2sp.Image 1");
        scOneOne.createNewParagraph("lab2sp.Paragraph 4");
        scOneOne.createNewTable("lab2sp.Table 1");
        scOneOne.createNewParagraph("lab2sp.Paragraph 5");
        scOneOne.print();

//        int indexSubCharTwo= chp1.createSubChapter("sdfsdf");
//        lab2sp.SubChapter two=chp1.getSubChapter(indexSubCharTwo);
//
//        two.createNewParagraph("lab2sp.Paragraph 3");
//        two.createNewImage("lab2sp.Image 1");
//
//        two.print();

//        discoTitanic.print();
    }


}
