package com.DARP.x00026919;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> PersonalItems = new ArrayList<>();
        ArrayList<Item> CommonItems = new ArrayList<>();
        byte opc = 0, opc2 = 0, opc3 = 0;
        do {
            try {//Todos los try catch para evitar que se cierre por quedar en blanco opc1, 2, o 3
                opc = Byte.parseByte(JOptionPane.showInputDialog(menu()));
                switch (opc) {
                    case 1:
                        do {
                            try {
                                opc2 = Byte.parseByte(JOptionPane.showInputDialog("Ítem a agregar:\n1. Arma\n2. Munición (flechas)\n3. Poción\n4. Elixir\n5. No agregar"));
                                switch (opc2) {
                                    case 1://///Case 1 agrega las armas
                                        do {
                                            try {
                                                opc3 = Byte.parseByte(JOptionPane.showInputDialog("Tipo:\n1. Arco\n2. Espada\n3. Báculo\n4. Orbe\n5. Daga\n6. No agregar"));
                                                if (opc3 < 1 || opc3 > 6) JOptionPane.showMessageDialog(null, "Opción inválida");
                                                else if (opc3 <= 5) PersonalItems.add(agregarItem(opc2, opc3));///////opc2 indica qué se agregará y opc3 que arma
                                            } catch (NumberFormatException e) {
                                                JOptionPane.showMessageDialog(null, "Opción inválida");////Si se ingresa algo que no sea un número indicará error
                                            }
                                        } while (opc3 != 6);
                                        break;
                                    case 2: PersonalItems.add(agregarItem(opc2, opc3)); break; ////Case 2 agrega la munición
                                    case 3: ////Case 3 agrega las pociones, las pociones son tipo Vida
                                        do {
                                            try {
                                                opc3 = Byte.parseByte(JOptionPane.showInputDialog("Agregar:\n1. Poción suave\n2. Poción media\n3. Poción fuerte\n4. Regresar"));
                                                if (opc3 < 1 || opc3 > 4)
                                                    JOptionPane.showMessageDialog(null, "Opción inválida");
                                                else if (opc3 <= 3) PersonalItems.add(agregarItem(opc2, opc3));////opc3 envia el tipo de poción que quiero
                                            } catch (NumberFormatException e) {
                                                JOptionPane.showMessageDialog(null, "Opción inválida");
                                            }
                                        } while (opc3 != 4);
                                        break;
                                    case 4: ////Case 4 agrega elixires, los elixires son tipo Mana
                                        do {
                                            try {
                                                opc3 = Byte.parseByte(JOptionPane.showInputDialog("Agregar:\n1. Elixir suave\n2. Elixir medio\n3. Elixir total\n4. Regresar"));
                                                if (opc3 < 1 || opc3 > 4) JOptionPane.showMessageDialog(null, "Opción inválida");
                                                else if (opc3 <= 3) PersonalItems.add(agregarItem(opc2, opc3));////opc3 envia el tipo de elixir que quiero
                                            } catch (NumberFormatException e) {
                                                JOptionPane.showMessageDialog(null, "Opción inválida");
                                            }
                                        } while (opc3 != 4);
                                        break;
                                    case 5: break;
                                    default: JOptionPane.showMessageDialog(null, "Opción inválida");
                                }///Termina menú de agregar armas
                            }
                            catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Opción inválida");
                            }
                        } while (opc2 != 5);
                        break;///Termina case 1 del menú principal
                    case 2:
                        if (PersonalItems.isEmpty()) JOptionPane.showMessageDialog(null, "Inventario vacío"); //Todos los menús verifican si hay almenos un ítem agregado
                        else {
                            do {
                                try {
                                    opc2 = Byte.parseByte(JOptionPane.showInputDialog("1. Copiar por ID\n2. Regresar\nOpción:"));
                                    switch (opc2) {
                                        case 1:
                                            CommonItems.add(compartirItem(PersonalItems));
                                            CommonItems.removeIf(cI -> cI == null); //Se eliminará el elemento si se retorna un valor nulo
                                            break;
                                        case 2:
                                            break;
                                        default:
                                            JOptionPane.showMessageDialog(null, "Opción inválida");
                                    }
                                } catch (NumberFormatException e){
                                    JOptionPane.showMessageDialog(null, "Opción inválida");
                                }
                            }while (opc2 != 2);
                        }
                        break;////Termina duplicar a CommonItems
                    case 3:
                        do {
                            try {
                                opc2 = Byte.parseByte(JOptionPane.showInputDialog("Buscar en:\n1. Objetos personales\n2. Objetos comunes\n3. Regresar\nOpción:"));
                                switch (opc2) {//Menú para preguntar en que lista buscar ID
                                    case 1: buscarId(PersonalItems); break;
                                    case 2: buscarId(CommonItems); break;
                                    case 3: break;
                                    default: JOptionPane.showMessageDialog(null, "Opción inválida");
                                }
                            } catch (NumberFormatException e){
                                JOptionPane.showMessageDialog(null, "Opción inválida");
                            }
                        }while (opc2 != 3);
                        break;////Termina menú de búsqueda por ID
                    case 4:
                        do {
                            try {
                                opc2 = Byte.parseByte(JOptionPane.showInputDialog("Buscar en:\n1. Objetos personales\n2. Objetos comunes\n3. Regresar\nOpción:"));
                                switch (opc2) {//Menú para preguntar en que lista buscar el tipo
                                    case 1: buscarTipo(PersonalItems); break;
                                    case 2: buscarTipo(CommonItems); break;
                                    case 3: break;
                                    default: JOptionPane.showMessageDialog(null, "Opción inválida");
                                }
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Opción inválida");
                            }
                        }while (opc2 != 3);
                        break;////Termina menú para buscar por tipo
                    case 5:
                        do {
                            try {
                                opc2 = Byte.parseByte(JOptionPane.showInputDialog("Buscar en:\n1. Objetos personales\n2. Objetos comunes\n3. Regresar\nOpción:"));
                                switch (opc2) {//Menú para preguntar en que lista borra ID
                                    case 1: borrarId(PersonalItems); break;
                                    case 2: borrarId(CommonItems); break;
                                    case 3: break;
                                    default: JOptionPane.showMessageDialog(null, "Opción inválida");
                                }
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Opción inválida");
                            }
                        }while (opc2 != 3);
                        break;////Termina menú para borrar por ID
                    case 6:
                        do {
                            try {
                                opc2 = Byte.parseByte(JOptionPane.showInputDialog("Buscar en:\n1. Objetos personales\n2. Objetos comunes\n3. Regresar\nOpción:"));
                                switch (opc2) {//Menú para preguntar en que lista borrar el tipo
                                    case 1: borrarTipo(PersonalItems); break;
                                    case 2: borrarTipo(CommonItems); break;
                                    case 3: break;
                                    default: JOptionPane.showMessageDialog(null, "Opción inválida");
                                }
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Opción inválida");
                            }
                        }while (opc2 != 3);
                        break;////Termina menú para borrar por tipo
                    case 7: mostrarInventario(PersonalItems, CommonItems); break; // Menú extra para mostrar todos los objetos, primero PersonalItems y después CommonItems
                    case 8: JOptionPane.showMessageDialog(null, "Partida guardada"); break;//Salir
                    default: JOptionPane.showMessageDialog(null, "Opción inválida"); break;
                }
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Opción inválida");
            }
        }while (opc != 8);
    }
    static String menu(){//Se imprime el menú
        return "1. Agregar ítem\n2. Compartir ítem\n3. Buscar ítem por ID\n4. Buscar ítem por tipo\n" +
                "5. Borrar ítem por ID\n6. Borrar ítem por tipo\n7.Mostrar inventarios\n8. Guardar partida y salir\nOpción:";
    }

    static Item agregarItem(byte opc, byte opc2) {
        switch (opc) {
            case 1://Case 1 agrega armas
                switch (opc2) {//"Menú para agregar los distintos tipos de armas"
                    case 1://Se agregan armas con el nivel más básico
                        JOptionPane.showMessageDialog(null, "Arma agregada");
                        return new Weapon("Arco del novato", 45, "Pareciera que la cuerda podría romperse en cualquier momento", "Arco", "Dos manos");
                    case 2:
                        JOptionPane.showMessageDialog(null, "Arma agregada");
                        return new Weapon("La Desafilada", 62, "Con una buena afilada estará lista para el combate", "Espada", "Una mano");
                    case 3:
                        JOptionPane.showMessageDialog(null, "Arma agregada");
                        return new Weapon("Rama de árbol", 8, "Si te quedas sin magia todavía puedes golpear con él", "Báculo", "Una mano");
                    case 4:
                        JOptionPane.showMessageDialog(null, "Arma agregada");
                        return new Weapon("Cánica gigante", 15, "Ten cuidado de no dejarla caer en una pendiente", "Orbe", "Una mano");
                    case 5:
                        JOptionPane.showMessageDialog(null, "Arma agregada");
                        return new Weapon("Cuchillo para mantequilla", 6, "Recuerda devolverlo limpio", "Daga", "Una mano");
                }
                break;
            case 2://Case 2 agrega munición
                JOptionPane.showMessageDialog(null, "Se agregó un carcaj con 20 flechas");
                return new Ammo("Flecha", 1, "Proyectil", 20);
            case 3://Case 3 agrega pociones
                switch (opc2) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "15 pociones suaves agregadas");
                        return new Potion("Poción suave", "Bajo", "Vida", 20, "Recuperas 10 HP al tomarla", 15);
                    case 2:
                        JOptionPane.showMessageDialog(null, "10 pociones medias agregadas");
                        return new Potion("Poción media", "Normal", "Vida", 35, "Recuperas 40 HP al tomarla", 10);
                    case 3:
                        JOptionPane.showMessageDialog(null, "5 pociones fuertes agregada");
                        return new Potion("Poción fuerte", "Superior", "Vida", 35, "Te sentirás como nuevo después de tomarla", 5);
                }
                break;
            case 4://Case 4 agrega elixires
                switch (opc2) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "15 elixires suaves agregados");
                        return new Elixir("Elixir suave", "Bajo", "Mana", 30, "Recuperas 25 MP al tomarlo", 15);
                    case 2:
                        JOptionPane.showMessageDialog(null, "10 elixires medios agregados");
                        return new Elixir("Elixir medio", "Normal", "Mana", 40, "Recuperas 40 MP al tomarla", 10);
                    case 3:
                        JOptionPane.showMessageDialog(null, "5 elixires totales agregados");
                        return new Elixir("Elixir total", "Superior", "Mana", 120, "Recuperas todo tu MP", 5);
                }
                break;
        }
        return null;
    }

    static Item compartirItem(ArrayList<Item> PersonalItems){
        boolean flag = true;
        int idCompartir;
        idCompartir = Integer.parseInt(JOptionPane.showInputDialog("ID del objeto:"));
        int finalIdCompartir = idCompartir;
        for (Item pI : PersonalItems) {
            if (pI.getId() == finalIdCompartir) {
                JOptionPane.showMessageDialog(null, "Objeto compartido");
                return pI;
            }
            else flag = false;
        }
        if (!flag) JOptionPane.showMessageDialog(null, "ID no encontrado");//Mensaje en caso no exista un objeto con el ID
        return null;
    }

    static void buscarId(ArrayList<Item> ListaItems) {
        byte opc = 0;
        int id;
        if (ListaItems.isEmpty()) JOptionPane.showMessageDialog(null, "Inventario vacío");//Comprobación de instancias
        else {
            do {
                try {
                    opc = Byte.parseByte(JOptionPane.showInputDialog("1. Buscar objeto\n2. Regresar\nOpción:"));
                    if (opc == 1) {
                        id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del objeto:"));
                        int finalId = id;
                        ListaItems.forEach(lI -> {
                            if (lI.getId() == finalId)
                                JOptionPane.showMessageDialog(null, lI.toString());//Solo muestra mensaje si se encuentra el objeto, en caso contrario solo regresa al menú
                        });
                    } else if (opc < 1 || opc > 2) JOptionPane.showMessageDialog(null, "Opción inválida");
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Opción inválida");
                }
            } while (opc != 2);
        }
    }

    static void buscarTipo(ArrayList<Item> ListaItems) {
        byte opc = 0;
        if (ListaItems.isEmpty()) JOptionPane.showMessageDialog(null, "Inventario vacío");//Comprobación de instancias
        else {
            do {
                try {
                    opc = Byte.parseByte(JOptionPane.showInputDialog("Buscar:\n1. Arcos\n2. Espadas\n3. Báculos\n4. Orbes\n5. Dagas\n" +
                            "6. Munición\n7. Pociones\n8. Elixires\n9. Regresar\nOpción:"));
                    switch (opc) {
                        case 1:
                            ListaItems.forEach(pI -> {
                                if (pI instanceof Weapon) {//Comprueba la clase
                                    if (((Weapon) pI).getType().equals("Arco"))//Compruba el tipo de arma
                                        JOptionPane.showMessageDialog(null, pI);//Solo muestra mensaje si se encuentra el objeto
                                }                                                               //Regresa al menú si no se encuentra el objeto
                            });
                            break;
                        case 2:
                            ListaItems.forEach(pI -> {
                                if (pI instanceof Weapon) {
                                    if (((Weapon) pI).getType().equals("Espada"))
                                        JOptionPane.showMessageDialog(null, pI);
                                }
                            });
                            break;
                        case 3:
                            ListaItems.forEach(pI -> {
                                if (pI instanceof Weapon) {
                                    if (((Weapon) pI).getType().equals("Báculo"))
                                        JOptionPane.showMessageDialog(null, pI);
                                }
                            });
                            break;
                        case 4:
                            ListaItems.forEach(pI -> {
                                if (pI instanceof Weapon) {
                                    if (((Weapon) pI).getType().equals("Orbe"))
                                        JOptionPane.showMessageDialog(null, pI);
                                }
                            });
                            break;
                        case 5:
                            ListaItems.forEach(pI -> {
                                if (pI instanceof Weapon) {
                                    if (((Weapon) pI).getType().equals("Daga"))
                                        JOptionPane.showMessageDialog(null, pI);
                                }
                            });
                            break;
                        case 6:
                            ListaItems.forEach(pI -> {
                                if (pI instanceof Ammo) {
                                    JOptionPane.showMessageDialog(null, pI);
                                }
                            });
                            break;
                        case 7:
                            ListaItems.forEach(pI -> {
                                if (pI instanceof Potion) {//Con las pociones/elixires se muestran los tres niveles de pociones/elixires
                                    if (((Potion) pI).getType().equals("Vida"))
                                        JOptionPane.showMessageDialog(null, pI);
                                }
                            });
                            break;
                        case 8:
                            ListaItems.forEach(pI -> {
                                if (pI instanceof Elixir) {
                                    if (((Elixir) pI).getType().equals("Mana"))
                                        JOptionPane.showMessageDialog(null, pI);
                                }
                            });
                            break;
                        case 9: break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción inválida");
                            break;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Opción inválida");
                }
            } while (opc != 9);
        }
    }

    static void borrarId(ArrayList<Item> ListaItems) {
        int idBorrar;
        byte opc = 0;
        if (ListaItems.isEmpty()) JOptionPane.showMessageDialog(null, "Inventario vacío");//Comrpobación de instancias
        else {
            do {
                try {
                    opc = Byte.parseByte(JOptionPane.showInputDialog("1. Borrar objeto\n2. Regresar\nOpción"));
                    if (opc == 1) {
                        idBorrar = Integer.parseInt(JOptionPane.showInputDialog("ID del objeto a borrar:"));
                        int finalIdBorrar = idBorrar;
                        if (ListaItems.removeIf(pI -> pI.getId() == finalIdBorrar))//Aprovechando el retorno de booleanos para un if
                            JOptionPane.showMessageDialog(null, "Objeto eleminado");
                        else JOptionPane.showMessageDialog(null, "ID no encontrado");
                    } else if (opc < 1 || opc > 2) JOptionPane.showMessageDialog(null, "Opción inválida");
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Opción inválida");
                }
            } while (opc != 2);
        }
    }

    static void borrarTipo(ArrayList<Item> ListaItems) {
        byte opc = 0;
        if (ListaItems.isEmpty()) JOptionPane.showMessageDialog(null, "Inventario vacío");//Comprobación de instancias
        else {
            do {
                try {
                    opc = Byte.parseByte(JOptionPane.showInputDialog("Eliminar:\n1. Arcos\n2. Espadas\n3. Báculos\n4. Orbes\n" +
                            "5. Dagas\n6. Munición\n7. Pociones\n8. Elixires\n9. Regresar\nOpción"));//Menú
                    switch (opc) {
                        case 1:
                            if (ListaItems.removeIf(pI -> {////Aprovechando retorno de booleanos para un if
                                if (pI instanceof Weapon) {//Comprueba la clase
                                    return ((Weapon) pI).getType().equals("Arco");//Comprueba el tipo de arma
                                } else return false;
                            })) JOptionPane.showMessageDialog(null, "Objeto eliminado");
                            else JOptionPane.showMessageDialog(null, "No hay objetos de este tipo");
                            break;
                        case 2:
                            if (ListaItems.removeIf(pI -> {
                                if (pI instanceof Weapon) {
                                    return ((Weapon) pI).getType().equals("Espada");
                                } else return false;
                            })) JOptionPane.showMessageDialog(null, "Objeto eliminado");
                            else JOptionPane.showMessageDialog(null, "No hay objetos de este tipo");
                            break;
                        case 3:
                            if (ListaItems.removeIf(pI -> {
                                if (pI instanceof Weapon) {
                                    return ((Weapon) pI).getType().equals("Báculo");
                                } else return false;
                            })) JOptionPane.showMessageDialog(null, "Objeto eliminado");
                            else JOptionPane.showMessageDialog(null, "No hay objetos de este tipo");
                            break;
                        case 4:
                            if (ListaItems.removeIf(pI -> {
                                if (pI instanceof Weapon) {
                                    return ((Weapon) pI).getType().equals("Orbe");
                                } else return false;
                            })) JOptionPane.showMessageDialog(null, "Objeto eliminado");
                            else JOptionPane.showMessageDialog(null, "No hay objetos de este tipo");
                            break;
                        case 5:
                            if (ListaItems.removeIf(pI -> {
                                if (pI instanceof Weapon) {
                                    return ((Weapon) pI).getType().equals("Daga");
                                } else return false;
                            })) JOptionPane.showMessageDialog(null, "Objeto eliminado");
                            else JOptionPane.showMessageDialog(null, "No hay objetos de este tipo");
                            break;
                        case 6://Con la munición solo comprueba si existe instancia de la clase
                            if (ListaItems.removeIf(pI -> pI instanceof Ammo)) JOptionPane.showMessageDialog(null, "Objeto eliminado");
                            else JOptionPane.showMessageDialog(null, "No hay objetos de este tipo");
                            break;
                        case 7://Con las pociones/elixires se eliminan los tres niveles de pociones/elixires
                            if (ListaItems.removeIf(pI -> {
                                if (pI instanceof Potion) {
                                    return ((Potion) pI).getType().equals("Vida");
                                } else return false;
                            })) JOptionPane.showMessageDialog(null, "Objeto eliminado");
                            else JOptionPane.showMessageDialog(null, "No hay objetos de este tipo");
                            break;
                        case 8:
                            if (ListaItems.removeIf(pI -> {
                                if (pI instanceof Elixir) {
                                    return ((Elixir) pI).getType().equals("Mana");
                                } else return false;
                            })) JOptionPane.showMessageDialog(null, "Objeto eliminado");
                            else JOptionPane.showMessageDialog(null, "No hay objetos de este tipo");
                            break;
                        case 9:
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción inválida");
                            break;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Opción inválida");
                }
            } while (opc != 9);
        }
    }

    static void mostrarInventario(ArrayList<Item> PersonalItems, ArrayList<Item> CommonItems) {
        if (PersonalItems.isEmpty()) JOptionPane.showMessageDialog(null, "Inventario vacío");//Comprobación de instancias
        else PersonalItems.forEach(pI -> JOptionPane.showMessageDialog(null, "Objetos personales:\n" + pI.toString()));
        if (CommonItems.isEmpty()) JOptionPane.showMessageDialog(null, "No hay objetos comunes");//Comprobación de instancias
        else CommonItems.forEach(cI -> JOptionPane.showMessageDialog(null, "Objetos comunes:\n" + cI.toString()));
    }
}
