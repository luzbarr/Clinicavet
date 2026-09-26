public class PERRO extends ANIMAL {
    private String raza;

    public PERRO() {
    }

    public PERRO(String nombre, int edad, double peso, String propietario, String raza) {
        super(nombre, edad, peso, propietario);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    //METODOS
    public double CalculaDosisMedicamento(){
        return getPeso() *2;
    }
    @Override
    public String toString() {
        return "========== PERRO ==========\n\n" +
                super.toString() + "\n" +
                "Raza: " + raza + "\n\n" +
                "Dosis recomendada: " + (int)CalculaDosisMedicamento() + " ml\n";
    }
    }



