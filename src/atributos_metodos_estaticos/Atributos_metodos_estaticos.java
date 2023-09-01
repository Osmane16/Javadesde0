package atributos_metodos_estaticos;

public class Atributos_metodos_estaticos {

    public static void main(String[] args) {
        
        Empleado emplo1 = new Empleado("Emplo1", "apellido_emplo1", 57, 5000);
        Empleado emplo2 = new Empleado("Emplo2", "apellido_emplo2", 50, 6000);
        Empleado emplo3 = new Empleado("Emplo3", "apellido_emplo3", 62, 7000);
        
        System.out.println(Empleado.Plus);
        
        emplo1.plus();
        emplo2.plus();
        emplo3.plus();
        
        System.out.println(emplo1.toString());
        System.out.println(emplo2.toString());
        System.out.println(emplo3.toString());
        
        Empleado.setPlus(100);
        
        emplo1.plus();
        emplo2.plus();
        emplo3.plus();
        
        System.out.println(emplo1.toString());
        System.out.println(emplo2.toString());
        System.out.println(emplo3.toString());
       
    }
    
}
