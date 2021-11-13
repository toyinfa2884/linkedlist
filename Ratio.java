package dataStructures;

public class Ratio {
    protected int num;
    protected int den;
    public static final Ratio ZERO = new Ratio();

    private Ratio(){
        this(0, 1);
    }

    public Ratio(int num, int den){
        this.num = num;
        this.den = den;
    }
    public boolean equals(Object object){
        if(object == this){
            return true;
        } else
            if(!(object instanceof Ratio)){
                return false;
            }
            Ratio that = (Ratio)object;
            return (this.num * that.den == that.num * this.den);
    }
    public int getNum(){
        return num;
    }

    public  int getDen(){
        return den;
    }

    public String toString(){
        return String.format("%d/%d", num, den);
    }
    public  double value(){
        return  (double) num / den;
    }

    public static void main(String[] args) {
        System.out.println("Ratio.ZERO = " + Ratio.ZERO);
        System.out.println("Ratio.ZERO.value() = " + Ratio.ZERO.value());
        Ratio x = new Ratio(22,7);
        System.out.println("x = " + x);
        System.out.println("x.value() = " + x.value());
        System.out.println("x.equals(Ration.ZERO): " + x.equals(Ratio.ZERO));
        Ratio xx = new Ratio(44,14);
        System.out.println("xx = " + xx);
        System.out.println("xx.value() = " + xx.value());
        System.out.println("x.equals(xx): " + x.equals(xx));
    }
}
