package it.miaBanca.sportello.model;

public class Dipendente extends Persona {

    private float salario;

    public void setSalario(float salario) {
        this.salario=salario;
    }

    Dipendente d1= new Dipendente ();


    public float getSalario() {
        return this.salario;
    }

    public float getTassoDiInteresse() {
        return 0.03F;
    }

}