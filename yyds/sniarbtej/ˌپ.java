package yyds.sniarbtej;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

final class ˌپ implements Serializable, GenericArrayType {
  private final Type ᐨẏ;
  
  private static final long ᐨẏ = 0L;
  
  public ˌپ(Type paramType) {
    this.ᐨẏ = ˑỲ.ᐨẏ(paramType);
  }
  
  public final Type getGenericComponentType() {
    return this.ᐨẏ;
  }
  
  public final boolean equals(Object paramObject) {
    return (paramObject instanceof GenericArrayType && ˑỲ.ᐨẏ(this, (GenericArrayType)paramObject));
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ᐨẏ : Ljava/lang/reflect/Type;
    //   4: invokevirtual hashCode : ()I
    //   7: ireturn
  }
  
  public final String toString() {
    "쿹拱".toCharArray()[1] = (char)("쿹拱".toCharArray()[1] ^ 0x69FD);
    return ˑỲ.ᐨẏ(this.ᐨẏ) + ᐨẏ$ᐝт.W("쿹拱".toCharArray(), (short)24564, (byte)3, (short)1);
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ˌپ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */