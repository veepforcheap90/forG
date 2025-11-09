package yyds.sniarbtej;

import java.util.Map;

final class ˎǰ<K, V> implements Map.Entry<K, V> {
  ˎǰ<K, V> ʿᵉ;
  
  ˎǰ<K, V> ʹﮃ;
  
  ˎǰ<K, V> ՙᗮ;
  
  ˎǰ<K, V> ᴵʖ;
  
  ˎǰ<K, V> ˍɫ;
  
  final K ʾ;
  
  V ﾞл;
  
  int ʿｪ;
  
  ˎǰ() {
    this.ʾ = null;
    this.ᴵʖ = this.ˍɫ = this;
  }
  
  ˎǰ(ˎǰ<K, V> paramˎǰ1, K paramK, ˎǰ<K, V> paramˎǰ2, ˎǰ<K, V> paramˎǰ3) {
    this.ʿᵉ = paramˎǰ1;
    this.ʾ = paramK;
    this.ʿｪ = 1;
    this.ᴵʖ = paramˎǰ2;
    this.ˍɫ = paramˎǰ3;
    paramˎǰ3.ᴵʖ = this;
    paramˎǰ2.ˍɫ = this;
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
    "䛯壾".toCharArray()[0] = (char)("䛯壾".toCharArray()[0] ^ 0x27F7);
    return (new StringBuilder()).append(this.ʾ).append(ˍɫ$יς.J("䛯壾".toCharArray(), (short)7177, (short)0, (byte)4)).append(this.ﾞл).toString();
  }
  
  public final ˎǰ<K, V> ˊ() {
    ˎǰ<K, V> ˎǰ1;
    for (ˎǰ<K, V> ˎǰ2 = (ˎǰ1 = this).ʹﮃ; ˎǰ2 != null; ˎǰ2 = (ˎǰ1 = ˎǰ2).ʹﮃ);
    return ˎǰ1;
  }
  
  public final ˎǰ<K, V> ᴵʖ() {
    ˎǰ<K, V> ˎǰ1;
    for (ˎǰ<K, V> ˎǰ2 = (ˎǰ1 = this).ՙᗮ; ˎǰ2 != null; ˎǰ2 = (ˎǰ1 = ˎǰ2).ՙᗮ);
    return ˎǰ1;
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ˎǰ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */