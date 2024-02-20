public class Salario {
    public static void main(String[] args){
        double horas,shoras,retencion,tretencion,sbruto,sneto;
        horas=48;
        shoras=5000;
        sbruto= horas*shoras;
        tretencion=0.125;
        retencion=sbruto*tretencion;
        sneto=sbruto-retencion;
        System.out.println("Horas trabajadas: "+ horas);
        System.out.println("Salario por hora: "+ shoras);
        System.out.println("Salario bruto: "+ sbruto);
        System.out.println("Salario neto: "+ sneto);
        System.out.println("Taza de retencion: "+ tretencion*100 + "%");
        System.out.println("Retencion: "+ retencion);
        
    }
}
