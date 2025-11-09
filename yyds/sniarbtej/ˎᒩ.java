package yyds.sniarbtej;

final class ˎᒩ<K, V> {
  private ـᔭ<K, V> ˊ;
  
  private int ﾞﻠ;
  
  private int ˌᐝ;
  
  private int ʿᵉ;
  
  final void ˈے(int paramInt) {
    int i = (Integer.highestOneBit(paramInt) << 1) - 1;
    this.ﾞﻠ = i - paramInt;
    this.ʿᵉ = 0;
    this.ˌᐝ = 0;
    this.ˊ = null;
  }
  
  final void ᴵʖ(ـᔭ<K, V> paramـᔭ) {
    paramـᔭ.ՙᗮ = paramـᔭ.ʹﮃ = paramـᔭ.ˍɫ = null;
    paramـᔭ.ʿｪ = 1;
    if (this.ﾞﻠ > 0 && (this.ʿᵉ & 0x1) == 0) {
      this.ʿᵉ++;
      this.ﾞﻠ--;
      this.ˌᐝ++;
    } 
    paramـᔭ.ʹﮃ = this.ˊ;
    this.ˊ = paramـᔭ;
    this.ʿᵉ++;
    if (this.ﾞﻠ > 0 && (this.ʿᵉ & 0x1) == 0) {
      this.ʿᵉ++;
      this.ﾞﻠ--;
      this.ˌᐝ++;
    } 
    for (int i = 4; (this.ʿᵉ & i - 1) == i - 1; i <<= 1) {
      if (this.ˌᐝ == 0) {
        ـᔭ<K, V> ـᔭ1;
        ـᔭ<K, V> ـᔭ2;
        ـᔭ<K, V> ـᔭ3 = (ـᔭ2 = (ـᔭ1 = this.ˊ).ʹﮃ).ʹﮃ;
        ـᔭ2.ʹﮃ = ـᔭ3.ʹﮃ;
        this.ˊ = ـᔭ2;
        ـᔭ2.ՙᗮ = ـᔭ3;
        ـᔭ2.ˍɫ = ـᔭ1;
        ـᔭ1.ʿｪ++;
        ـᔭ3.ʹﮃ = ـᔭ2;
        ـᔭ1.ʹﮃ = ـᔭ2;
      } else if (this.ˌᐝ == 1) {
        ـᔭ<K, V> ـᔭ1;
        ـᔭ<K, V> ـᔭ2 = (ـᔭ1 = this.ˊ).ʹﮃ;
        this.ˊ = ـᔭ2;
        ـᔭ2.ˍɫ = ـᔭ1;
        ـᔭ1.ʿｪ++;
        ـᔭ1.ʹﮃ = ـᔭ2;
        this.ˌᐝ = 0;
      } else if (this.ˌᐝ == 2) {
        this.ˌᐝ = 0;
      } 
    } 
  }
  
  final ـᔭ<K, V> ᐨẏ() {
    ـᔭ<K, V> ـᔭ1;
    if ((ـᔭ1 = this.ˊ).ʹﮃ != null)
      throw new IllegalStateException(); 
    return ـᔭ1;
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ˎᒩ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */