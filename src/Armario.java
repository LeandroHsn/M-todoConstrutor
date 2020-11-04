public class Armario {

    private String roupa; 
    private String colocarRoupa;

    public void setRoupa(String escolherRoupa){
        this.roupa = escolherRoupa;
    }
    public String getRoupa(){
        return roupa;
    }

    public void setGuardar(String guardarRoupa){
        this.colocarRoupa = guardarRoupa;
    }
    public String getGuardar(){
        return colocarRoupa;
    }

    public Armario(String roupa, String colocarRoupa){
        this.roupa = roupa;
        this.colocarRoupa = colocarRoupa;
    }
}

