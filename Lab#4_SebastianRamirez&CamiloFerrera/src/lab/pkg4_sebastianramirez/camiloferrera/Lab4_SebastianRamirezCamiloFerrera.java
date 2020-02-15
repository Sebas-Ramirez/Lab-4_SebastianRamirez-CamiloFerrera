package lab.pkg4_sebastianramirez.camiloferrera;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Lab4_SebastianRamirezCamiloFerrera {
    static Scanner sc = new Scanner (System.in);
    static ArrayList<Equipo> equipos = new ArrayList();
    static ArrayList<Jugador> jugadores = new ArrayList();
    static Random random = new Random();
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
                    CRUD(2);
                    break;
                case "3":
                    simulacion();
                    break;
                case "0":
                    System.exit(0);
                    
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
                    if (equipos.size() == 0){
                        System.out.println("No hay equipos creados, vaya al CRUD Equipos a crearlos.");
                    } else {
                             for (int i = 0; i < equipos.size(); i++) {
                            System.out.println((i+1) + ". " + equipos.get(i));
                        }
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
                        System.out.println("No hay equipos creados, por lo tanto no se pueden crear jugadores.");
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
                            System.out.print("Ingrese agildad: ");
                            int agilidad = sc.nextInt();
                            System.out.println();
                            jugadores.add(new Guardian (agilidad,nombre,casa,años,numuniforme));
                        } else if (opcionpos == 2){
                            System.out.print("Ingrese musculatura (1-15): ");
                            int musculatura = sc.nextInt();
                            System.out.print("Ingrese reflejos (1-10): ");
                            int reflejos = sc.nextInt();
                                                      
                            while (musculatura < 1 || musculatura > 15) {
                                System.out.println();
                                System.out.println("El rango debe estar entre 1-15 en la musculatura");
                                System.out.println();
                                System.out.print("Ingrese musculatura (1-15): ");
                                musculatura = sc.nextInt();
                            }
                            while (reflejos < 1 || reflejos > 10)  {
                                System.out.println();
                                System.out.println("El rango debe esyat entre 1-10 en los reflejos");
                                System.out.println();
                                System.out.print("Ingrese reflejos (1-10): ");
                                reflejos = sc.nextInt();
                            }
                            System.out.println();
                            jugadores.add(new Golpeadores(musculatura,reflejos,nombre,casa,años,numuniforme));
                        } else if (opcionpos == 3){
                            System.out.print("Ingrese peso: ");
                            int peso = sc.nextInt();
                            System.out.print("Ingrese reflejos (1-10): ");
                            int reflejos = sc.nextInt();
                            while (reflejos < 1 || reflejos > 10)  {
                                System.out.println();
                                System.out.println("El rango debe esyat entre 1-10 en los reflejos");
                                System.out.println();
                                System.out.print("Ingrese reflejos (1-10): ");
                                reflejos = sc.nextInt();
                            }
                            System.out.println();
                            
                            jugadores.add(new Cazadores(peso,reflejos,nombre,casa,años,numuniforme));
                        } else if (opcionpos == 4){
                            System.out.print("Ingrese peso: ");
                            int peso = sc.nextInt();
                            System.out.println();
                            
                            jugadores.add(new Buscador (peso,nombre,casa,años,numuniforme));
                        }
                        System.out.println("Jugador creado exitosamente!");
                    }
                        
                    break;
                case "2":
                    ModificarJugadores();
                    break;
                case "3":
                    Eliminar(jugadores);
                    break;
                case "4":
                    if (jugadores.size() == 0){
                        System.out.println("No hay jugadores creados aqui, vaya al CRUD Jugadores a crearlos.");
                    } else {
                        for (int i = 0; i < jugadores.size(); i++) {
                            System.out.println((i+1) + ". " + jugadores.get(i));
                        }
                    }
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
        if (x.size() == 0){
            System.out.println("No hay nada creado aqui, regresando al menu principal...");
        } else {
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
        
    }
    
    static void ModificarEquipos(){
        if (equipos.size() == 0){
            System.out.println("No hay equipos creados, vaya al CRUD Equipos a crearlos.");
        } else {
            for (int i = 0; i < equipos.size(); i++) {
                System.out.println((i+1) + ". " + equipos.get(i).getCasa());
            }
            System.out.print("Seleccione equipo a modificar: ");
            int opcionequipo = sc.nextInt();
            opcionequipo--;

            while (opcionequipo >= equipos.size() || opcionequipo < 0) {
                System.out.println();
                System.out.println("Equipo no encontrado, intente de nuevo.");
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
                    + "2. Añadir Jugadores \n"
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
                        System.out.println();
                        equipos.get(opcionequipo).setCasa(casa);
                        System.out.println("Casa modificada exitosamente!");
                    } else {
                        System.out.println("Ya estan ocupadas las cuatro casas, no se puede modificar.");
                    }
                    break;
                case 2:
                    if (jugadores.size() == 0){
                        System.out.println("No hay jugadores creados, vaya al CRUD Jugadores");
                    } else {
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
                            System.out.println("Ya hay suficientes jugadores en su posición, no se pudo añadir.");
                        } else {
                            boolean camisavalida = ValidarNumeroCamisa(jugadores.get(opcion), equipos.get(opcionequipo).getJugadores());
                            if (camisavalida == true){
                                if (equipos.get(opcionequipo).getCasa().equals(jugadores.get(opcion).getCasa())){
                                    System.out.println("Este jugador no pertenece a la casa del equipo, no se puede añadir.");
                                } else {
                                    equipos.get(opcionequipo).getJugadores().add(jugadores.get(opcion));
                                    System.out.println("Jugador añadido exitosamente!");
                                    equipos.get(opcionequipo).setPromedioagilidad();
                                    equipos.get(opcionequipo).setPromfuerza();
                                    equipos.get(opcionequipo).setPromvelocidad();
                                }
                            } else {
                                System.out.println("Ya hay un jugador con su numero de camisa, no se pudo añador.");
                            }
                        }
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
            
    }
    static void ModificarJugadores(){
        if (jugadores.size() == 0){
            System.out.println("No hay jugadores creados, vaya al CRUD Jugadores a crearlos.");
        } else {
            for (int i = 0; i < jugadores.size(); i++) {
                System.out.println((i+1) + ". " + jugadores.get(i).getNombre());
            }
            System.out.println("Seleccione jugador a modificar: ");
            int opcionjugador = sc.nextInt();
            opcionjugador--;
            while (opcionjugador < 0 || opcionjugador >= jugadores.size() ) {
                System.out.println();
                System.out.println("Jugador no encontrado, intente de nuevo.");
                System.out.println();
                System.out.println("Seleccione jugador a modificar: ");
                opcionjugador = sc.nextInt();
                opcionjugador--;
            }
            System.out.println();

            System.out.println("1. Nombre \n"
                    + "2. Años en Hogwarts");
            System.out.print("Seleccione opción de atributo a modificar: ");
            int opcionatr = sc.nextInt();

            while (opcionatr < 0 || opcionatr > 2) {
                System.out.println();
                System.out.println("Atributo a modificar no encontrado, intente de nuevo.");
                System.out.println();
                System.out.println("1. Nombre \n"
                        + "2. Años en Hogwarts");
                System.out.print("Seleccione opción de atributo a modificar: ");
                opcionatr = sc.nextInt();
            }
            System.out.println();
            
            switch (opcionatr) {
                case 1:
                    System.out.print("Ingrese nuevo nombre: ");
                    sc.nextLine();
                    String nombre = sc.next();
                    jugadores.get(opcionjugador).setNombre(nombre);
                    break;
                case 2:
                    System.out.print("Ingrese años cursando en Hogwarts: ");
                    int años = sc.nextInt();
                    jugadores.get(opcionjugador).setAñocurso(años);
                    break;
            }
            System.out.println();
            
            System.out.println("Atributo modificado exitosamente!");
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
    static boolean ValidarNumeroCamisa(Jugador x, ArrayList<Jugador> y){
        boolean valido = true;
        for (int i = 0; i < y.size(); i++) {
            if (x.getNumuniforme() == y.get(i).getNumuniforme()){
                valido = false;
                break;
            }
        }
        return valido;
    }
    static void simulacion(){
        for (int i = 0; i < equipos.size(); i++) {
            System.out.println("["+i+"] "+equipos.get(i).getCasa());  
        }
        System.out.print("Ingrese el indice de la casa: ");
        int casa = sc.nextInt();
        for (int i = 0; i < equipos.get(casa).getJugadores().size(); i++) {
            System.out.println("["+i+"] "+equipos.get(casa).getJugadores().get(i).getNombre());
        }
        System.out.print("Ingrese la posicion del jugador que desea utilizar: ");
        int pos = sc.nextInt();
        boolean juego;
        int casaJ2=random.nextInt(),jugadorJ2=random.nextInt();
        System.out.println("1. Jugar Normal\n"
                + "2. Hacer Trampa\n"
                + "Ingrese su opcion: ");
        switch (sc.nextInt()) {
            case 1:
                if (equipos.get(casa).getJugadores().get(pos) instanceof Guardian) {
                    if (equipos.get(casa).getJugadores().get(pos).getAgilidad()<equipos.get(casaJ2).getJugadores().get(jugadorJ2).getVelocidad_inicial()) {
                        juego = true;
                        System.out.println(""+equipos.get(casa).getJugadores().get(pos).getNombre()+"("+equipos.get(casa).getJugadores().get(pos).getCasa()
                                +"intento tapar el gol "+juego);
                        if (juego) {
                            equipos.get(casa).getJugadores().get(pos).setAgilidad(equipos.get(casa).getJugadores().get(pos).getAgilidad()+8);
                        }
                    }          
                }else if(equipos.get(casa).getJugadores().get(pos) instanceof Golpeadores){
                    System.out.println("1. Atacar\n"
                            + "2. Defender\n"
                            + "Ingrese opcion: ");
                    switch (sc.nextInt()) {
                        case 1:
                            if (equipos.get(casa).getJugadores().get(pos).getFuerza()*2+1 < equipos.get(casaJ2).getJugadores().get(jugadorJ2).getFuerza()*2) {
                                juego = true;
                                System.out.println(""+equipos.get(casa).getJugadores().get(pos).getNombre()+"("+equipos.get(casa).getJugadores().get(pos).getCasa()
                                +" intento atacar "+juego);
                                if (juego) {
                                    equipos.get(casa).getJugadores().get(pos).setFuerza(equipos.get(casa).getJugadores().get(pos).getFuerza()+10);
                                }
                            }
                            break;
                        case 2:
                            if (equipos.get(casa).getJugadores().get(pos).getAgilidad()/2+7 > equipos.get(casaJ2).getJugadores().get(jugadorJ2).getAgilidad()) {
                                juego = true;
                                System.out.println(""+equipos.get(casa).getJugadores().get(pos).getNombre()+"("+equipos.get(casa).getJugadores().get(pos).getCasa()
                                +" intento defender "+juego);
                                if (juego) {
                                    equipos.get(casa).getJugadores().get(pos).setAgilidad(equipos.get(casa).getJugadores().get(pos).getAgilidad()+10);
                                }
                            }
                            break;
                        default:
                            throw new AssertionError();
                    } 
                }else if(equipos.get(casa).getJugadores().get(pos) instanceof Cazadores){
                    if (equipos.get(casa).getJugadores().get(pos).getAgilidad()+equipos.get(casa).getJugadores().get(pos).getVelocidad_inicial()>=equipos.get(casaJ2).getJugadores().get(jugadorJ2).getAgilidad()) {
                        juego = true;
                        System.out.println(""+equipos.get(casa).getJugadores().get(pos).getNombre()+"("+equipos.get(casa).getJugadores().get(pos).getCasa()
                                +"intento meter el gol "+juego);
                        if (juego) {
                            equipos.get(casa).getJugadores().get(pos).setAgilidad(equipos.get(casa).getJugadores().get(pos).getAgilidad()+6);
                            equipos.get(casa).getJugadores().get(pos).setVelocidad_inicial(equipos.get(casa).getJugadores().get(pos).getVelocidad_inicial()+6);
                        }
                    }     
                }else if(equipos.get(casa).getJugadores().get(pos) instanceof Buscador){
                    if(equipos.get(casa).getJugadores().get(pos).getVelocidad_inicial()/14+14>=equipos.get(casaJ2).getJugadores().get(jugadorJ2).getVelocidad_inicial()){
                        juego = true;
                         System.out.println(""+equipos.get(casa).getJugadores().get(pos).getNombre()+"("+equipos.get(casa).getJugadores().get(pos).getCasa()
                                +"intento atrapar la snitch "+juego);
                    }
                }equipos.get(casa).getJugadores().get(pos).setVelocidad_inicial(equipos.get(casa).getJugadores().get(pos).getVelocidad_inicial()+1);
                break;
            case 2:
                if(equipos.get(casa).getJugadores().get(pos) instanceof Buscador){
                    int chance = random.nextInt(101);
                    System.out.println(""+equipos.get(casa).getJugadores().get(pos).getNombre()+"("+equipos.get(casa).getJugadores().get(pos).getCasa()
                                +" intento intento atraer la snitch ");
                    if (chance>0&&chance<=5) {
                        System.out.println(""+equipos.get(casa).getJugadores().get(pos).getNombre()+"("+equipos.get(casa).getJugadores().get(pos).getCasa()
                                +" atrapo la snitch ");
                        System.out.println("Ganaron el juego");
                    }else{
                        System.out.println("Perdieron el juego y quedan descalificados");
                        break;
                    }
                }else if(equipos.get(casa).getJugadores().get(pos) instanceof Golpeadores){
                    int chance = random.nextInt(101);
                    if (chance>0&&chance<=22) {
                        System.out.println(""+equipos.get(casa).getJugadores().get(pos).getNombre()+"("+equipos.get(casa).getJugadores().get(pos).getCasa()
                                +" creo una burbuja magica ");
                        equipos.get(casa).getJugadores().get(pos).setAgilidad(equipos.get(casa).getJugadores().get(pos).getAgilidad()+10);
                        equipos.get(casa).getJugadores().get(pos).setFuerza(equipos.get(casa).getJugadores().get(pos).getFuerza()+10);
                    }else{
                        equipos.get(casa).getJugadores().get(pos).setAgilidad(equipos.get(casa).getJugadores().get(pos).getAgilidad()-15);
                        equipos.get(casa).getJugadores().get(pos).setFuerza(equipos.get(casa).getJugadores().get(pos).getFuerza()-10);
                        break;
                    }
                }else if(equipos.get(casa).getJugadores().get(pos) instanceof Cazadores){
                    int chance  = random.nextInt(101);
                    if (chance>0||chance<=10) {
                        equipos.get(casa).getJugadores().get(pos).setAgilidad(equipos.get(casa).getJugadores().get(pos).getAgilidad()+8);
                        equipos.get(casa).getJugadores().get(pos).setVelocidad_inicial(equipos.get(casa).getJugadores().get(pos).getVelocidad_inicial()+5);
                    }else{
                        equipos.get(casa).getJugadores().get(pos).setVelocidad_inicial(3);
                    } 
                }else if (equipos.get(casa).getJugadores().get(pos) instanceof Guardian){
                    int chance = random.nextInt(101);
                    if (chance>0||chance<=13) {
                        
                    }
                }
                break;
            default:
                throw new AssertionError();   
        }
    }
}