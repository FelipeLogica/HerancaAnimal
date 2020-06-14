/**
 * @author Felipe Voigt
 * @version 1.0
 * @since 11/06/2020 - 19:42
 * @category Model
 */
public class Gato extends Animal {

    private String nivelDeParkour;
    private int vidasRestantes;
    private String nivelDeIndependencia;

    public Gato(){
        super();
    }

    /**
     *
     * @param nome Recebe o nome do pet
     * @param raca Recebe a raça do pet
     * @param idade Recebe a idade do pet
     * @param castracao Recebe se o pet é castrado
     * @param nivelDeParkour Recebe o nivel de parkuor do pet
     * @param vidasRestantes Recebe quantas vidas o pet tem
     * @param nivelDeIndependencia Recebe o nivel de independencia do pet
     */
    public Gato(String nome,String raca,int idade,String castracao,
                String nivelDeParkour,int vidasRestantes,
                String nivelDeIndependencia){

        super(nome,raca,idade,castracao);
        this.nivelDeParkour = nivelDeParkour;
        this.vidasRestantes = vidasRestantes;
        this.nivelDeIndependencia = nivelDeIndependencia;
    }

    public String getNivelDeParkour() {
        return nivelDeParkour;
    }

    public void setNivelDeParkour(String nivelDeParkour) {
        this.nivelDeParkour = nivelDeParkour;
    }

    public int getVidasRestantes() {
        return vidasRestantes;
    }

    public void setVidasRestantes(int vidasRestantes) {
        this.vidasRestantes = vidasRestantes;
    }

    public String getNivelDeIndependencia() {
        return nivelDeIndependencia;
    }

    public void setNivelDeIndependencia(String nivelDeIndependencia) {
        this.nivelDeIndependencia = nivelDeIndependencia;
    }

    /**
     *
     * @return Retorna o miado de um gato
     */
    public String miar() {
        return "Gato faz: miauuuuu";
    }

    /**
     *
     * @return Retorna o ronronar de um gato
     */
    public String ronronar() {
        return "Gato faz: Rrrrrrr";

    }
    @Override
    public String toString(){
        return "Nome do pet: "+this.getNome()
                +"\nIdade do pet: "+this.getIdade()
                +"\nRaça do pet: "+this.getRaca()
                +"\nSeu pet é castrado: "+this.getCastracao()
                +"\nNivel de parkuor: "+this.nivelDeParkour
                +"\nvidas restantes: "+this.vidasRestantes
                +"\nNivel de independencia do pet: "+this.nivelDeIndependencia
                ;
    }
}
