
public class Teacher extends Person {

    private double hsl;
    

    private static final double LUONG_CO_BAN = 1800000;
    

    public Teacher(String name, int age, double hsl) {
        super(name, age);
        this.hsl = hsl;
    }
    
 
    public double getHsl() {
        return hsl;
    }
    
    public void setHsl(double hsl) {
        this.hsl = hsl;
    }
    
    public double tinhLuong() {
        return LUONG_CO_BAN * hsl;
    }
}