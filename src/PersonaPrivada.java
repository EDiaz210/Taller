public class PersonaPrivada {
    private String nombre;
    private int edad;
    private double  altura;


    public PersonaPrivada (String nombre, int edad, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public void mostrarDatos (){
        System.out.println("El usuario privado "+nombre+" tiene "+edad+" años y su altura es de "+altura+" cm. \nEs mayor de edad la persona? ");

    }


    public void esMayorDeEdad(){
        if (edad >= 18){
            boolean valor =true;
            System.out.println(valor);
        }
    }
}
