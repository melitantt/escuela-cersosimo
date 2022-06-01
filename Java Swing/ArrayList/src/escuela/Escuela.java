package escuela;
public class Escuela {
    
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("23" , "Penelope" , "7mo", "informatica");
        System.out.println(estudiante.getId());
        System.out.println(estudiante.getNombre());
        System.out.println(estudiante.getCurso());
        System.out.println(estudiante.getEspecialidad());
    }
    
}
