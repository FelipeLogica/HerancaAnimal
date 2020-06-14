/**
 * @author Felipe Voigt
 * @version 1.0
 * @since 11/06/2020 - 19:46
 * @category Model
 */
public class Cachorro extends Animal {

    private String porteFisico;
    private String temperamento;
    private String nivelDeHigiene;

    public Cachorro(){
        super();
    }

    /**
     *
     * @param nome Recebe o nome do pet
     * @param raca Recebe a raça do pet
     * @param idade Recebe a idade do pet
     * @param castracao Recebe se o pet é castrado
     * @param porteFisico Recebe o porte fisico do pet
     * @param temperamento Recebe o temperamento do pet
     * @param nivelDeHigiene Recebe o nivel de higiene do pet
     */
    public Cachorro(String nome,String raca,int idade,String castracao
                                ,String porteFisico, String temperamento
                                ,String nivelDeHigiene){

        super(nome,raca,idade,castracao);
        this.porteFisico = porteFisico;
        this.temperamento = temperamento;
        this.nivelDeHigiene = nivelDeHigiene;
    }

    public String getPorteFisico() {
        return porteFisico;
    }

    public void setPorteFisico(String porteFisico) {
        this.porteFisico = porteFisico;
    }

    public String getTemperamento() {
        return temperamento;
    }

    public void setTemperamento(String temperamento) {
        this.temperamento = temperamento;
    }

    public String getNivelDeHigiene() {
        return nivelDeHigiene;
    }

    public void setNivelDeHigiene(String nivelDeHigiene) {
        this.nivelDeHigiene = nivelDeHigiene;
    }

    /**
     *
     * @return Retorna um latido de cachorro
     */
    public String latir(){
        return "O cachorro faz: au au";
    }

    /**
     *
     * @return Retora o estado do cachorro apos rolar na lama
     */
    public String rolarNaLama(){
        this.nivelDeHigiene = "bem sujo";
        return "Seu cachorro agora esta "+this.nivelDeHigiene;
    }
    @Override
    public String toString(){
        return "Nome do pet: "+this.getNome()
                +"\nIdade do pet"+this.getIdade()
                +"\nRaça do pet: "+this.getRaca()
                +"\nSeu pet é castrado:"+this.getCastracao()
                +"\nPorte físico: "+this.porteFisico
                +"\nTemperamento do pet: "+this.temperamento
                +"\nNivel de higiene do pet: "+this.nivelDeHigiene
                ;
    }
}
