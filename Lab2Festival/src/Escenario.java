public class Escenario{

    private int codigo;
    private String nombre;
    private String ubicacion;
    private int capacidadMax;
    private boolean estado;

    public Escenario(int codigo, String nombre, int capaciadadMax, boolean estado){
        if (capacidadMax <= 0){
            throw IllegalArgumentException("La capacidad no es valida")
        }
        this.codigo = codigo;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capacidadMax = capacidadMax;
        this.estado = estado;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getUbicacion(){
        return ubicacion;
    }

    public String getCapacidadmax(){
        return capacidadMax;
    }

    public boolean getEstado(){
        return estado;
    }

    //editar capacidad

    public void setCapacidad(){
        if(capacidad<=0){
            throw new IllegalArgumentException("Capacidad que no es valida");
        }
        this.capacidadMax = capacidad;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}