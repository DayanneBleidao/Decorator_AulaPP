public class AssinaturaDecorator implements IAssinatura {
  public IAssinatura assinatura;

  public AssinaturaDecorator(IAssinatura assinatura) {
    this.assinatura = assinatura;
  }

  @Override
  public void assinar() {
    this.assinatura.assinar();
  }
}