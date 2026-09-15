public class Mago extends Personagem {
    public void atacar(Personagem e){
        System.out.println(getNome() + " lançou um feitizo no " + e.getTipo() + " " + e.getNome());

    }
    public void defender(){}
    public boolean ataqueEspecial(){
        return true;
    }
    public Mago(String nome){
        super(nome);
    }

}
