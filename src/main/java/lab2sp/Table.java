package lab2sp;

public class Table implements Element {

    private String tbl;

    public Table(String tbl) {
        this.tbl = tbl;
    }

    public void print(){
        System.out.println(tbl);
    }
}
