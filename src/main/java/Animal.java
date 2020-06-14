/**
 * @author Felipe Voigt
 * @version 1.0
 * @since 11/06/2020 - 19:43
 * @category Model
 */
public abstract class Animal {

    private String nome;
    private String raca;
    private int idade;
    private String castracao;

    public Animal(){
    }

    /**
     *
     * @param nome Recebe o nome do pet
     * @param raca Recebe a raça do pet
     * @param idade Recebe a idade do pet
     * @param castracao Recebe se o pet é castrado
     */
    public Animal(String nome,String raca,int idade,String castracao){
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.castracao =castracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCastracao() {
        return castracao;
    }

    public void setCastracao(String castracao) {
        this.castracao = castracao;
    }

    @Override
    public String toString(){
        return "Nome do pet: "+this.nome
                +"\nIdade do pet: "+this.idade+" Anos"
                +"\nRaça do pet: "+this.raca
                +"\nSeu pet é castrado:"+this.castracao
                ;
    }
}
