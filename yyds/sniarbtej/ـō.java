package yyds.sniarbtej;

final class ـō<K, V> {
  private ـᔭ<K, V> ᴵʖ;
  
  final void ﾞл(ـᔭ<K, V> paramـᔭ) {
    ـᔭ<K, V> ـᔭ1 = null;
    for (paramـᔭ = paramـᔭ; paramـᔭ != null; paramـᔭ = paramـᔭ.ՙᗮ) {
      paramـᔭ.ʹﮃ = ـᔭ1;
      ـᔭ1 = paramـᔭ;
    } 
    this.ᴵʖ = ـᔭ1;
  }
  
  public final ـᔭ<K, V> ˊ() {
    ـᔭ<K, V> ـᔭ1;
    if ((ـᔭ1 = this.ᴵʖ) == null)
      return null; 
    ـᔭ<K, V> ـᔭ2;
    ـᔭ1 = (ـᔭ2 = ـᔭ1).ʹﮃ;
    ـᔭ2.ʹﮃ = null;
    for (ـᔭ<K, V> ـᔭ3 = ـᔭ2.ˍɫ; ـᔭ3 != null; ـᔭ3 = ـᔭ3.ՙᗮ) {
      ـᔭ3.ʹﮃ = ـᔭ1;
      ـᔭ1 = ـᔭ3;
    } 
    this.ᴵʖ = ـᔭ1;
    return ـᔭ2;
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ـō.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */