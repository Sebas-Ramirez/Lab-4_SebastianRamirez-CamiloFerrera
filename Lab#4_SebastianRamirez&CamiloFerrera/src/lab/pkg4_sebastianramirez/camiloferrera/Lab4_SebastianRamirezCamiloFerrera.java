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
    
    static void CRUD (int x){
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
                            System.out.println();
                            System.out.println("Ya hay un equipo con esta casa, seleccione otra.");
                            System.out.println();
                            casa = SeleccionarCasa();
                            validarcasa = ValidarCasa(casa);
                        }
                        equipos.add(new Equipo (casa,0,0));
                        System.out.println();
                        System.out.println("Equipo Añadido Exitosamente!");
                    } else {
                        System.out.println("Ya existen 4 equipos, con su respectiva casa.");
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
                    if (equipos.size() == 0){
                        System.out.println("No hay equipos creados, por lo tanto no se pueden crear jugadores");
                    } else {
                        System.out.print("Ingrese nombre: ");
                        sc.nextLine();
                        String nombre = sc.nextLine();
                        System.out.print("Ingrese años cursando en Hogwarts: ");
                        int años = sc.nextInt();
                        System.out.print("Ingrese numero de uniforme: ");
                        int numuniforme = sc.nextInt();
                        System.out.println();
                        String casa = SeleccionarCasa();                     
                        System.out.println();
                        
                        System.out.println("1. Guardián \n"
                                + "2. Golpeador \n"
                                + "3. Cazador \n"
                                + "4. Buscador");
                        System.out.print("Seleccione opción para su posición: ");
                        int opcionpos = sc.nextInt();
                        
                        while (opcionpos < 1 || opcionpos > 4) {
                            System.out.println();
                            System.out.println("Posicion no encontrada, intente de nuevo");
                            System.out.println();
                            System.out.println("1. Guardián \n"
                                + "2. Golpeador \n"
                                + "3. Cazador \n"
                                + "4. Buscador");
                            System.out.print("Seleccione opción para su posición: ");
                            opcionpos = sc.nextInt();
                        }
                        System.out.println();
                        
                        if (opcionpos == 1){
                            
                        }
                    }
                        
                    break;
                case "3":
                    Eliminar(jugadores);
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
                System.out.println("Casa modificada exitosamente!");
                break;
            case 2:
                for (int i = 0; i < jugadores.size(); i++) {
                    System.out.println((i+1) + ". " + jugadores.get(i));
                }
                System.out.print("Seleccione opción de jugador a añadir: ");
                opcion = sc.nextInt();
                opcion--;
                
                while (opcion < 0 || opcion >= jugadores.size()) {
                    System.out.println();
                    System.out.println("Jugador no encontrado, intente de nuevo.");
                    System.out.println();
                    for (int i = 0; i < jugadores.size(); i++) {
                        System.out.println((i+1) + ". " + jugadores.get(i));
                    }
                    System.out.print("Seleccione opción de jugador a añadir: ");
                    opcion = sc.nextInt();
                    opcion--;
                }
                System.out.println();
                
                boolean disponible = ValidarJugadoresEquipo(jugadores.get(opcion), equipos.get(opcionequipo).getJugadores());
                if (disponible == false) {
                    System.out.println("Ya hay suficientes jugadores en su posición, no se pudo añadir. ");
                } else {
                    equipos.get(opcionequipo).getJugadores().add(jugadores.get(opcion));
                    System.out.println("Jugador añadido exitosamente!");
                    equipos.get(opcionequipo).setPromedioagilidad();
                    equipos.get(opcionequipo).setPromfuerza();
                    equipos.get(opcionequipo).setPromvelocidad();
                }
                break;
            case 3:
                if (equipos.get(opcionequipo).getJugadores().size() == 0){
                    System.out.println("No hay jugadores en este equipo, por lo tanto no se puede elegir un capitan.");
                } else {
                    for (int i = 0; i < equipos.get(opcionequipo).getJugadores().size() ; i++) {
                        System.out.println((i+1) + ". " + equipos.get(opcionequipo).getJugadores().get(i).getNombre());
                    }
                    System.out.print("Seleccione opción de jugador para capitán: ");
                    int opcioncapitan = sc.nextInt();
                    opcioncapitan--;
                    
                    while (opcioncapitan < 0 || opcioncapitan >= equipos.get(opcionequipo).getJugadores().size()) {
                        System.out.println();
                        System.out.println("Jugador no entontrado, intente de nuevo.");
                        System.out.println();
                        for (int i = 0; i < equipos.get(opcionequipo).getJugadores().size() ; i++) {
                            System.out.println((i+1) + ". " + equipos.get(opcionequipo).getJugadores().get(i).getNombre());
                        }
                        System.out.print("Seleccione opción de jugador para capitán: ");
                        opcioncapitan = sc.nextInt();
                        opcioncapitan--;
                    }
                    System.out.println();
                    
                    equipos.get(opcionequipo).setCapitan(equipos.get(opcionequipo).getJugadores().get(opcioncapitan));
                    System.out.println("Capitan seleccionado exitosamente!");
                }
                break;
        }
    }
    
    static boolean ValidarJugadoresEquipo (Jugador x, ArrayList<Jugador> y){
        boolean disponible = true;
        int cont = 0;
        if (x instanceof Guardian){
            for (int i = 0; i < y.size() ; i++) {
                if (y.get(i) instanceof Guardian){
                    cont ++;
                }
            }
            
            if (cont == 1){
                disponible =  false;
            } 
        } else if (x instanceof Golpeadores){
            for (int i = 0; i < y.size() ; i++) {
                if (y.get(i) instanceof Golpeadores){
                    cont ++;
                }
            }
            
            if (cont == 2){
                disponible = false;
            }
        } else if (x instanceof Cazadores){
            for (int i = 0; i < y.size() ; i++) {
                if (y.get(i) instanceof Cazadores){
                    cont ++;
                }
            }
            
            if (cont == 3){
                disponible =  false;
            }
        } else if (x instanceof Buscador){
            for (int i = 0; i < y.size() ; i++) {
                if (y.get(i) instanceof Buscador){
                    cont ++;
                }
            }
            
            if (cont == 1){
                disponible =  false;
            } 
        }
        
        return disponible;
    }
}