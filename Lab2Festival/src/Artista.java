public class Artista{

    private int codigoA;
    private String nombreArt;
    private int duracion;
    private String generoMu;
    private int cantidadAsisten;

    public Artista(int codigo, String nombre, String genero, int duracion, int asistentes){
        this.codigoA = codigo;
        this.nombreArt = nombre;
        this.generoMu = genero;

        setDuracion(duracion);
        setCantidadasisten(asistenres);
    }

    public int getCodigo(){
        return codigoA;
    }

    public String getNombreArtista(){
        return nombreArt;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public int getDuracion(){
        return duracion;
    }

    public int getCantidadAsistentes(){
        return cantidadAsist;
    }

    public void setDuracion(int duracion){
        if (duracion <=0){
            throw new IllegalArgumentException("Tiene que ser mayor a 0 :(");
        }
        this.duracion = duracion;
    }

    public void setCantidadAsistentes(int asistentes){
        if(asistentes < 0){
            throw new IllegalArgumentException("No pueden ser menores a 0");
        }
        this.asistentesv = asistentes;
    }
}