public class AreaofCircle {
    static double areaCricle(double r){
        double area=3.14*r*r;
        return area;
    }
    public static void main(String[] args){
        double res=areaCricle(4);
        System.out.println(res);
    }
}
