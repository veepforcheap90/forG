package yyds.sniarbtej;

public final class ᐧפ {
  private static int ͺῘ = 0;
  
  private static int ﹳϯ = 1;
  
  private static int ˌᴿ = 2;
  
  private static int ˌᐣ = 3;
  
  private final byte[] ʿᵉ;
  
  private final int ـｔ;
  
  ᐧפ(byte[] paramArrayOfbyte, int paramInt) {
    this.ʿᵉ = paramArrayOfbyte;
    this.ـｔ = paramInt;
  }
  
  public final int ˈے() {
    return this.ʿᵉ[this.ـｔ];
  }
  
  public final int ՙᗮ(int paramInt) {
    return this.ʿᵉ[this.ـｔ + 2 * paramInt + 1];
  }
  
  public final int ˍɫ(int paramInt) {
    return this.ʿᵉ[this.ـｔ + 2 * paramInt + 2];
  }
  
  private static ᐧפ ᐨẏ(String paramString) {
    if (paramString == null || paramString.length() == 0)
      return null; 
    int i = paramString.length();
    ʿᵉ ʿᵉ;
    (ʿᵉ = new ʿᵉ(i)).ᐨẏ(0);
    byte b = 0;
    while (b < i) {
      char c;
      if ((c = paramString.charAt(b++)) == '[') {
        ʿᵉ.ᐨẏ(0, 0);
        continue;
      } 
      if (c == '.') {
        ʿᵉ.ᐨẏ(1, 0);
        continue;
      } 
      if (c == '*') {
        ʿᵉ.ᐨẏ(2, 0);
        continue;
      } 
      if (c >= '0' && c <= '9') {
        int j = c - 48;
        while (b < i) {
          if ((c = paramString.charAt(b++)) >= '0' && c <= '9') {
            j = j * 10 + c - 48;
            continue;
          } 
          if (c != ';')
            throw new IllegalArgumentException(); 
        } 
        ʿᵉ.ᐨẏ(3, j);
        continue;
      } 
      throw new IllegalArgumentException();
    } 
    ʿᵉ.ˊ[0] = (byte)(ʿᵉ.ʹﮃ / 2);
    return new ᐧפ(ʿᵉ.ˊ, 0);
  }
  
  public final String toString() {
    ᐧפ ᐧפ1;
    byte b = (ᐧפ1 = this).ʿᵉ[ᐧפ1.ـｔ];
    StringBuilder stringBuilder = new StringBuilder(b << 1);
    for (byte b1 = 0; b1 < b; b1++) {
      byte b2 = b1;
      switch ((ᐧפ1 = this).ʿᵉ[ᐧפ1.ـｔ + 2 * b2 + 1]) {
        case 0:
          stringBuilder.append('[');
          break;
        case 1:
          stringBuilder.append('.');
          break;
        case 2:
          stringBuilder.append('*');
          break;
        case 3:
          b2 = b1;
          stringBuilder.append((ᐧפ1 = this).ʿᵉ[ᐧפ1.ـｔ + 2 * b2 + 2]).append(';');
          break;
        default:
          throw new AssertionError();
      } 
    } 
    return stringBuilder.toString();
  }
  
  static void ᐨẏ(ᐧפ paramᐧפ, ʿᵉ paramʿᵉ) {
    if (paramᐧפ == null) {
      paramʿᵉ.ᐨẏ(0);
      return;
    } 
    int i = (paramᐧפ.ʿᵉ[paramᐧפ.ـｔ] << 1) + 1;
    paramʿᵉ.ᐨẏ(paramᐧפ.ʿᵉ, paramᐧפ.ـｔ, i);
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ᐧפ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */