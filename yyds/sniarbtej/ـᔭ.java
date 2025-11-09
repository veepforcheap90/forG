package yyds.sniarbtej;

import java.util.Map;

final class ـᔭ<K, V> implements Map.Entry<K, V> {
  ـᔭ<K, V> ʹﮃ;
  
  ـᔭ<K, V> ՙᗮ;
  
  ـᔭ<K, V> ˍɫ;
  
  ـᔭ<K, V> ﾞл;
  
  ـᔭ<K, V> ʽ;
  
  final K ʾ;
  
  final int ᒯ;
  
  V ﾞл;
  
  int ʿｪ;
  
  ـᔭ() {
    this.ʾ = null;
    this.ᒯ = -1;
    this.ﾞл = (V)(this.ʽ = this);
  }
  
  ـᔭ(ـᔭ<K, V> paramـᔭ1, K paramK, int paramInt, ـᔭ<K, V> paramـᔭ2, ـᔭ<K, V> paramـᔭ3) {
    this.ʹﮃ = paramـᔭ1;
    this.ʾ = paramK;
    this.ᒯ = paramInt;
    this.ʿｪ = 1;
    this.ﾞл = (V)paramـᔭ2;
    this.ʽ = paramـᔭ3;
    paramـᔭ3.ﾞл = (V)this;
    paramـᔭ2.ʽ = this;
  }
  
  public final K getKey() {
    return this.ʾ;
  }
  
  public final V getValue() {
    return this.ﾞл;
  }
  
  public final V setValue(V paramV) {
    V v = this.ﾞл;
    this.ﾞл = paramV;
    return v;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject instanceof Map.Entry) {
      paramObject = paramObject;
      return (((this.ʾ == null) ? (paramObject.getKey() == null) : this.ʾ.equals(paramObject.getKey())) && ((this.ﾞл == null) ? (paramObject.getValue() == null) : this.ﾞл.equals(paramObject.getValue())));
    } 
    return false;
  }
  
  public final int hashCode() {
    return ((this.ʾ == null) ? 0 : this.ʾ.hashCode()) ^ ((this.ﾞл == null) ? 0 : this.ﾞл.hashCode());
  }
  
  public final String toString() {
    "ｄࢅ".toCharArray()[0] = (char)("ｄࢅ".toCharArray()[0] ^ 0x40F);
    return (new StringBuilder()).append(this.ʾ).append(ˍɫ$יς.J("ｄࢅ".toCharArray(), (short)15994, (short)0, (byte)1)).append(this.ﾞл).toString();
  }
  
  public final ـᔭ<K, V> ﾞл() {
    ـᔭ<K, V> ـᔭ1;
    for (ـᔭ<K, V> ـᔭ2 = (ـᔭ1 = this).ՙᗮ; ـᔭ2 != null; ـᔭ2 = (ـᔭ1 = ـᔭ2).ՙᗮ);
    return ـᔭ1;
  }
  
  public final ـᔭ<K, V> ʿᵉ() {
    ـᔭ<K, V> ـᔭ1;
    for (ـᔭ<K, V> ـᔭ2 = (ـᔭ1 = this).ˍɫ; ـᔭ2 != null; ـᔭ2 = (ـᔭ1 = ـᔭ2).ˍɫ);
    return ـᔭ1;
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ـᔭ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */