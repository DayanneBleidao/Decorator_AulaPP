public class Main {
  
  public static void main(String[] args) {
    IAssinatura assinaturaBase = new AssinaturaBase();
    assinaturaBase.assinar();

    System.out.println("\n");

    IAssinatura assinaturaPacote1 = new Pacote1(new AssinaturaBase());
    assinaturaPacote1.assinar();

    System.out.println("\n");

    IAssinatura assinaturaPacote1And2 = new Pacote2(new Pacote1(new AssinaturaBase()));
    assinaturaPacote1And2.assinar();

    System.out.println("\n");

    IAssinatura assinaturaTodosPacotes = new Pacote4(new Pacote3(new Pacote2(new Pacote1(new AssinaturaBase()))));

    assinaturaTodosPacotes.assinar();
  }
}