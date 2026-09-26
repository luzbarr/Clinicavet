
    public class ANIMAL {
        private String nombre;
        private  int edad;
        private double peso;
        private String propietario;

        public ANIMAL() {
        }

        public ANIMAL(String nombre, int edad, double peso, String propietario) {
            this.nombre = nombre;
            this.edad = edad;
            this.peso = peso;
            this.propietario = propietario;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public double getPeso() {
            return peso;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }

        public String getPropietario() {
            return propietario;
        }

        public void setPropietario(String propietario) {
            this.propietario = propietario;
        }

        @Override
        public String toString() {
            return "Nombre: " + nombre + "\n" +
                    "Edad: " + edad + " años\n" +
                    "Peso: " + peso + " kg\n" +
                    "Propietario: " + propietario;
        }
        public void mostrarInformacion(){
         System.out.println("nombre:"+ nombre);
         System.out.println ("edad:"+ edad +"años");
         System.out.println ("peso"+ peso +"kg");
         System.out.println("propietario:"+propietario);
        }
    }


