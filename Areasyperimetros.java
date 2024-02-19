public class Areasyperimetros {
    public static void main(String[] args){
        double radio, area, perimetro;
        radio=15;
        area=Math.pow(radio,2)*Math.PI;
        perimetro=2*radio*Math.PI;
        System.out.println("El circulo de radio: "+radio+" tiene un area de: "+area);
        System.out.println("El circulo de radio: "+radio+" tiene un perimetro de: "+perimetro);
    }
}
