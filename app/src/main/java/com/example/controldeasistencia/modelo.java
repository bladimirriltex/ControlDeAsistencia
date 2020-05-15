package com.example.controldeasistencia;

public class modelo {
    private String nomCurso;
    private  String desCrurso;
    private int img;

    public modelo(String nomCurso, String desCrurso, int img) {
        this.nomCurso = nomCurso;
        this.desCrurso = desCrurso;
        this.img = img;
    }


    public String getNomCurso() {
        return nomCurso;
    }

    public void setNomCurso(String nomCurso) {
        this.nomCurso = nomCurso;
    }

    public String getDesCrurso() {
        return desCrurso;
    }

    public void setDesCrurso(String desCrurso) {
        this.desCrurso = desCrurso;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
