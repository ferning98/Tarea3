package com.ferncuy.tareas3;

public class Mascota {
    String nombre;
    int rating;
    int foto;
    public Mascota(String nombre, int raiting, int foto) {
        this.nombre = nombre;
        this.rating = raiting;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int raiting) {
        this.rating = raiting;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
