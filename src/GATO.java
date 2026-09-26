public class GATO extends ANIMAL {
    boolean esInterior;

    public GATO() {
    }

    public GATO(boolean esInterior) {
        this.esInterior = esInterior;
    }

    public GATO(String nombre, int edad, double peso, String propietario, boolean esInterior) {
        super(nombre, edad, peso, propietario);
        this.esInterior = esInterior;
    }

    public boolean isEsInterior() {
        return esInterior;
    }

    public void setEsInterior(boolean esInterior) {
        this.esInterior = esInterior;
    }
    //METODO
    public double CalcularAlimentoDiario(){
        return getPeso()*15;
    }
    @Override
    public String toString() {
        String tipoGato;
        if (esInterior) {
            tipoGato = "Interior";
        } else {
            tipoGato = "Exterior";
        }

        return "========== GATO ==========\n\n" +
                super.toString() + "\n" +
                "Tipo: " + tipoGato + "\n\n" +
                "Alimento recomendado: " + (int)CalcularAlimentoDiario() + " gramos\n";
    }



















































}
