public class Persona {
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido){
        this.apellido=apellido;
        this.nombre=nombre;

    }

    public String cargarCajero(Cajero cajero,int monto){
        if (cajero.getSaldo()==0){
            cajero.setSaldo(cajero.getSaldo()+monto);
            return"Se ha cargado el cajero\nMonto Cajero:"+cajero.getSaldo();
        }else{
            return"No se puede cargar";
        }


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
