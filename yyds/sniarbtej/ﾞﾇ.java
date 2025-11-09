package yyds.sniarbtej;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import ylt.pmn.zubdqvgt;

final class ﾞﾇ implements Serializable, WildcardType {
  private final Type ﾞл;
  
  private final Type ʿᵉ;
  
  private static final long ᐨẏ = 0L;
  
  public ﾞﾇ(Type[] paramArrayOfType1, Type[] paramArrayOfType2) {
    ˌᑦ.ﾞл((paramArrayOfType2.length <= 1));
    ˌᑦ.ﾞл((paramArrayOfType1.length == 1));
    if (paramArrayOfType2.length == 1) {
      ˌᑦ.ˊ(paramArrayOfType2[0]);
      ˑỲ.ˊ(paramArrayOfType2[0]);
      ˌᑦ.ﾞл(zubdqvgt.G(paramArrayOfType1[0], Object.class));
      this.ʿᵉ = ˑỲ.ᐨẏ(paramArrayOfType2[0]);
      this.ﾞл = Object.class;
      return;
    } 
    ˌᑦ.ˊ(paramArrayOfType1[0]);
    ˑỲ.ˊ(paramArrayOfType1[0]);
    this.ʿᵉ = null;
    this.ﾞл = ˑỲ.ᐨẏ(paramArrayOfType1[0]);
  }
  
  public final Type[] getUpperBounds() {
    return new Type[] { this.ﾞл };
  }
  
  public final Type[] getLowerBounds() {
    return (this.ʿᵉ != null) ? new Type[] { this.ʿᵉ } : ˑỲ.ᐨẏ;
  }
  
  public final boolean equals(Object paramObject) {
    return (paramObject instanceof WildcardType && ˑỲ.ᐨẏ(this, (WildcardType)paramObject));
  }
  
  public final int hashCode() {
    return ((this.ʿᵉ != null) ? (31 + this.ʿᵉ.hashCode()) : 1) ^ 31 + this.ﾞл.hashCode();
  }
  
  public final String toString() {
    if (this.ʿᵉ != null) {
      "鵀⋷鐕㍇栖ඩ⴦".toCharArray()[4] = (char)("鵀⋷鐕㍇栖ඩ⴦".toCharArray()[4] ^ 0x6C22);
      return ˉﻤ$ͺſ.v("鵀⋷鐕㍇栖ඩ⴦".toCharArray(), (short)30388, 4, (short)2) + ˑỲ.ᐨẏ(this.ʿᵉ);
    } 
    if (zubdqvgt.G(this.ﾞл, Object.class)) {
      "떦嬀".toCharArray()[0] = (char)("떦嬀".toCharArray()[0] ^ 0x3854);
      return ˉﻤ$ͺſ.v("떦嬀".toCharArray(), (short)3128, 0, (short)4);
    } 
    "扞즞夊㪥跋滇⛦ㅏｋ竳".toCharArray()[5] = (char)("扞즞夊㪥跋滇⛦ㅏｋ竳".toCharArray()[5] ^ 0x5678);
    return ˉﻤ$ͺſ.v("扞즞夊㪥跋滇⛦ㅏｋ竳".toCharArray(), (short)17109, 1, (short)2) + ˑỲ.ᐨẏ(this.ﾞл);
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ﾞﾇ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */