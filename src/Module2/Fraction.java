package Module2;

public class Fraction {
    int x;
    int y;


    public Fraction(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void  display(){
        System.out.println(x+"/"+y);
    }
    Fraction div(double n){
        if (y>0){
            y= (int) (n*y);}
        return  new Fraction(x,y);
    }
    Fraction multiple (double n) {
        if (y>0){
        x= (int) (n*x);}
        return  new Fraction(x,y);
    }

    public static void main(String[] args) {
        Fraction f=new Fraction(3,4);

        f.display();
        f.multiple(3.5)      ;
        f.display();
        f.div(2.5);
        f.display();

    }
}
