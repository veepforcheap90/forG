package yyds.sniarbtej;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

final class ﾞﮢ implements Serializable, ParameterizedType {
  private final Type ˊ;
  
  private final Type ᴵʖ;
  
  private final Type[] ˊ;
  
  private static final long ᐨẏ = 0L;
  
  public ﾞﮢ(Type paramType1, Type paramType2, Type... paramVarArgs) {
    if (paramType2 instanceof Class) {
      Class<?> clazz;
      boolean bool = (Modifier.isStatic((clazz = (Class)paramType2).getModifiers()) || clazz.getEnclosingClass() == null) ? true : false;
      ˌᑦ.ﾞл((paramType1 != null || bool));
    } 
    this.ˊ = (paramType1 == null) ? null : (Type[])ˑỲ.ᐨẏ(paramType1);
    this.ᴵʖ = ˑỲ.ᐨẏ(paramType2);
    this.ˊ = (Type[])paramVarArgs.clone();
    for (byte b = 0; b < this.ˊ.length; b++) {
      ˌᑦ.ˊ(this.ˊ[b]);
      ˑỲ.ˊ(this.ˊ[b]);
      this.ˊ[b] = ˑỲ.ᐨẏ(this.ˊ[b]);
    } 
  }
  
  public final Type[] getActualTypeArguments() {
    return (Type[])this.ˊ.clone();
  }
  
  public final Type getRawType() {
    return this.ᴵʖ;
  }
  
  public final Type getOwnerType() {
    return (Type)this.ˊ;
  }
  
  public final boolean equals(Object paramObject) {
    return (paramObject instanceof ParameterizedType && ˑỲ.ᐨẏ(this, (ParameterizedType)paramObject));
  }
  
  public final int hashCode() {
    return Arrays.hashCode((Object[])this.ˊ) ^ this.ᴵʖ.hashCode() ^ ˑỲ.ᴵʖ(this.ˊ);
  }
  
  public final String toString() {
    StringBuilder stringBuilder;
    (stringBuilder = new StringBuilder(30 * (this.ˊ.length + 1))).append(ˑỲ.ᐨẏ(this.ᴵʖ));
    if (this.ˊ.length == 0)
      return stringBuilder.toString(); 
    "歘箭".toCharArray()[0] = (char)("歘箭".toCharArray()[0] ^ 0x73A);
    stringBuilder.append(ˏȓ$ᴵЃ.E("歘箭".toCharArray(), (short)28722, (short)2, (short)4)).append(ˑỲ.ᐨẏ(this.ˊ[0]));
    for (byte b = 1; b < this.ˊ.length; b++) {
      "ᡯુ".toCharArray()[1] = (char)("ᡯુ".toCharArray()[1] ^ 0xB94);
      stringBuilder.append(ˏȓ$ᴵЃ.E("ᡯુ".toCharArray(), (short)3735, (short)1, (short)3)).append(ˑỲ.ᐨẏ(this.ˊ[b]));
    } 
    "哬᭞".toCharArray()[0] = (char)("哬᭞".toCharArray()[0] ^ 0x660E);
    return stringBuilder.append(ˏȓ$ᴵЃ.E("哬᭞".toCharArray(), (short)26336, (short)3, (short)5)).toString();
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ﾞﮢ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */