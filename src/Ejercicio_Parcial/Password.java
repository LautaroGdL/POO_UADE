package Ejercicio_Parcial;

import java.util.*;

public class Password {

    private String clave;
    private int longitud = 8;

    public void Password() {
        this.clave = generarPassword();
    }

    public void Password(int longitud) {
        this.longitud = longitud;
        this.clave = generarPassword();
    }

    private String generarPassword() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < longitud; i++) {
            sb.append(caracteres.charAt(random.nextInt(caracteres.length())));
        }
        return sb.toString();
    }

    public String getClave() { return clave; }
    public int getLongitud() { return longitud; }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
        this.clave = generarPassword();
    }

    public boolean esFuerte() {
        int mayus = 0, minus = 0, nums = 0;
        for (char c : clave.toCharArray()) {
            if (Character.isUpperCase(c)) mayus++;
            else if (Character.isLowerCase(c)) minus++;
            else if (Character.isDigit(c)) nums++;
        }
        return mayus > 2 && minus > 1 && nums > 3;
    }

}
