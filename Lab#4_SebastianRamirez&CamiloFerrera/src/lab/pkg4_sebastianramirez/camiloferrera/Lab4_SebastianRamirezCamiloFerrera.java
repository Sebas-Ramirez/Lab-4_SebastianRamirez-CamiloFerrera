package lab.pkg4_sebastianramirez.camiloferrera;
import java.util.ArrayList;
import java.util.Scanner;
public class Lab4_SebastianRamirezCamiloFerrera {
    static Scanner sc = new Scanner (System.in);
    static ArrayList<Equipo> equipos = new ArrayList();
    static ArrayList<Jugador> jugadores = new ArrayList();
    public static void main(String[] args) {
        while (true) {
            System.out.println("1. CRUD Equipos \n"
                    + "2. CRUD Jugadores \n"
                    + "3. Simulación de Juego");
            System.out.print("Seleccione opción ó pulse [0] para salir del juego: ");
            String opcion = sc.next();
            System.out.println();
            
            switch (opcion) {
                case "1":
                    CRUD(1);
                    break;
                case "2":
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
                    break;
            }
            System.out.println();
        }
    }
    
    static void CRUD (int x) throws Exception{
        System.out.println("1. Crear \n"
                + "2. Modificar \n"
                + "3. Eliminar \n"
                + "4. Listar");
        System.out.print("Seleccione opción: ");
        String opcion = sc.next();
        System.out.println();
        
        if (x == 1){
            switch (opcion) {
                case "1":
                    if (equipos.size() < 4){
                        String casa = SeleccionarCasa();
                        boolean validarcasa = ValidarCasa(casa);
                        while (validarcasa == false) {
                            Excepcion e = new Excepcion();
                            e.Casa();
                        }
                        equipos.add(new Equipo (casa,0,0));
                        System.out.println();
                        System.out.println("Equipo Añadido Exitosamente");
                    } else {
                        System.out.println("Ya existen 4 equipos, con su respectiva casa");
                    }
                    break;
                case "2":
                    ModificarEquipos();
                    break;
                case "3":
                    Eliminar(equipos);
                    break;
                case "4":
                    for (int i = 0; i < equipos.size(); i++) {
                        System.out.println("* " + equipos.get(i));
                    }
                    break;
                default:
                    System.out.println("Opción Incorrecta, regresando al menu principal...");
                    break;
            }
        } else {
            switch (opcion) {
                case "1":
                    
                    break;
                default:
                    System.out.println("Opción Incorrecta, regresando al menu principal...");
                    break;
            }
        }
    }
    
    static boolean ValidarCasa (String casa){
        boolean disponible = true;
        for (int i = 0; i < equipos.size(); i++) {
            if (casa.equals(equipos.get(i).getCasa())){
                disponible = false;
                break;
            }
        }
        
        return disponible;
    }
    
    static String SeleccionarCasa (){
        System.out.println("1. Gryffindor \n"
                + "2. Slytherin \n"
                + "3. Revenclaw \n"
                + "4. Hufflepuff");
        System.out.print("Seleccione opción de casa: ");
        int opcion = sc.nextInt();
        
        while (opcion < 1 || opcion > 4) {
            System.out.println();
            System.out.println("Casa no encontrada, intente de nuevo...");
            System.out.println();
            System.out.println("1. Gryffindor \n"
                    + "2. Slytherin \n"
                    + "3. Revenclaw \n"
                    + "4. Hufflepuff");
            System.out.print("Seleccione opción de casa: ");
            opcion = sc.nextInt();
        }
        
        if (opcion == 1){
            return "Gryffindor";
        } else if (opcion == 2){
            return "Slytherin";
        } else if (opcion == 3){
            return "Revenclaw";
        } else {
            return "Hufflepuff";
        }
    }
    
    static void Eliminar (ArrayList x){
        for (int i = 0; i < x.size(); i++) {
            if (x.get(i) instanceof Equipo){
                System.out.println((i+1) + ". " + ((Equipo)x.get(i)).getCasa());
            } else if (x.get(i) instanceof Jugador){
                System.out.println((i+1) + ". " + ((Jugador)x.get(i)));
            }
        }
        System.out.print("Seleccione opción del que desea eliminar: ");
        int opcion = sc.nextInt();
        opcion --;
        
        while (opcion >= x.size() || opcion < 0) {
            System.out.println();
            System.out.println("Opción no encontrada, intente de nuevo...");
            System.out.println();
            for (int i = 0; i < x.size(); i++) {
                if (x.get(i) instanceof Equipo){
                    System.out.println((i+1) + ". " + ((Equipo)x.get(i)).getCasa());
                } else if (x.get(i) instanceof Jugador){
                    System.out.println((i+1) + ". " + ((Jugador)x.get(i)));
                }
            }
            System.out.print("Seleccione opción del que desea eliminar: ");
            opcion = sc.nextInt();
            opcion --;
        }
        System.out.println();
        
        x.remove(opcion);
        System.out.println("Se ha eliminado exitosamente.");
    }
    
    static void ModificarEquipos(){
        for (int i = 0; i < equipos.size(); i++) {
            System.out.println((i+1) + ". " + equipos.get(i).getCasa());
        }
        System.out.print("Seleccione equipo a modificar: ");
        int opcionequipo = sc.nextInt();
        opcionequipo--;
        while (opcionequipo >= equipos.size() || opcionequipo < 0) {
            System.out.println();
            System.out.println("Equipo no encontrado, intende de nuevo");
            System.out.println();
            for (int i = 0; i < equipos.size(); i++) {
                System.out.println((i+1) + ". " + equipos.get(i).getCasa());
            }
            System.out.print("Seleccione equipo a modificar: ");
            opcionequipo = sc.nextInt();
            opcionequipo--;
        }
        System.out.println();
        
        System.out.println("1. Casa \n"
                + "2. Jugadores \n"
                + "3. Capitan");
        System.out.print("Ingrese opción de atributo a modificar: ");
        int opcion = sc.nextInt();
        
        while (opcion < 1 || opcion > 3) {
            System.out.println();
            System.out.println("Opcion no valida, intente de nuevo.");
            System.out.println();
            System.out.println("1. Casa \n"
                    + "2. Añadir Jugadores \n"
                    + "3. Capitan");
            System.out.print("Ingrese opción de atributo a modificar: ");
            opcion = sc.nextInt();
        }
        System.out.println();
        
        switch (opcion) {
            case 1:
                String casa = SeleccionarCasa();
                boolean validarcasa = ValidarCasa(casa);
                while (validarcasa == false) {
                    System.out.println();
                    System.out.println("Ya hay un equipo con esta casa, seleccione otra.");
                    System.out.println();
                    casa = SeleccionarCasa();
                    validarcasa = ValidarCasa(casa);
                }
                System.out.println();
                equipos.get(opcionequipo).setCasa(casa);
                System.out.println("Casa modificada exitosamente");
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }
    
}