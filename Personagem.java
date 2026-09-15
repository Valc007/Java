public abstract class Personagem {
   private String nome;
    private int vida;
    private String tipo;
    public Personagem(String nome){
        this.nome = nome;
        this.tipo = String.valueOf(this.getClass().getSimpleName());
        vida = 100;

    }
   public abstract void atacar(Personagem e);
   public abstract void defender();

   public String getNome(){
       return nome;
   }

    public int getVida() {
        return vida;
    }
    public String getTipo(){

       return tipo;
    }
    public void mostrarInfo(){
        System.out.println("Nombre: " + getNome());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Vida " + getVida());
   }
    public abstract boolean ataqueEspecial();

}
