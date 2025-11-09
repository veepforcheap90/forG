package yyds.sniarbtej;

final class ﾞл {
  private static final int ﾞл = 6;
  
  int ʿᵉ;
  
  ᴵʖ[] ᐨẏ = new ᴵʖ[6];
  
  final void ᐨẏ(ᴵʖ paramᴵʖ) {
    // Byte code:
    //   0: aload_1
    //   1: astore_1
    //   2: aload_1
    //   3: ifnull -> 131
    //   6: aload_0
    //   7: aload_1
    //   8: astore_3
    //   9: astore_2
    //   10: iconst_0
    //   11: istore #4
    //   13: iload #4
    //   15: aload_2
    //   16: getfield ʿᵉ : I
    //   19: if_icmpge -> 52
    //   22: aload_2
    //   23: getfield ᐨẏ : [Lyyds/sniarbtej/ᴵʖ;
    //   26: iload #4
    //   28: aaload
    //   29: getfield ᐨẏ : Ljava/lang/String;
    //   32: aload_3
    //   33: getfield ᐨẏ : Ljava/lang/String;
    //   36: invokevirtual equals : (Ljava/lang/Object;)Z
    //   39: ifeq -> 46
    //   42: iconst_1
    //   43: goto -> 53
    //   46: iinc #4, 1
    //   49: goto -> 13
    //   52: iconst_0
    //   53: ifne -> 123
    //   56: aload_0
    //   57: aload_1
    //   58: astore_3
    //   59: dup
    //   60: astore_2
    //   61: getfield ʿᵉ : I
    //   64: aload_2
    //   65: getfield ᐨẏ : [Lyyds/sniarbtej/ᴵʖ;
    //   68: arraylength
    //   69: if_icmplt -> 106
    //   72: aload_2
    //   73: getfield ᐨẏ : [Lyyds/sniarbtej/ᴵʖ;
    //   76: arraylength
    //   77: bipush #6
    //   79: iadd
    //   80: anewarray yyds/sniarbtej/ᴵʖ
    //   83: astore #4
    //   85: aload_2
    //   86: getfield ᐨẏ : [Lyyds/sniarbtej/ᴵʖ;
    //   89: iconst_0
    //   90: aload #4
    //   92: iconst_0
    //   93: aload_2
    //   94: getfield ʿᵉ : I
    //   97: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   100: aload_2
    //   101: aload #4
    //   103: putfield ᐨẏ : [Lyyds/sniarbtej/ᴵʖ;
    //   106: aload_2
    //   107: getfield ᐨẏ : [Lyyds/sniarbtej/ᴵʖ;
    //   110: aload_2
    //   111: dup
    //   112: getfield ʿᵉ : I
    //   115: dup_x1
    //   116: iconst_1
    //   117: iadd
    //   118: putfield ʿᵉ : I
    //   121: aload_3
    //   122: aastore
    //   123: aload_1
    //   124: getfield ᐨẏ : Lyyds/sniarbtej/ᴵʖ;
    //   127: astore_1
    //   128: goto -> 2
    //   131: return
  }
  
  final ᴵʖ[] ᐨẏ() {
    ᴵʖ[] arrayOfᴵʖ = new ᴵʖ[this.ʿᵉ];
    System.arraycopy(this.ᐨẏ, 0, arrayOfᴵʖ, 0, this.ʿᵉ);
    return arrayOfᴵʖ;
  }
  
  private boolean ᐨẏ(ᴵʖ paramᴵʖ) {
    for (byte b = 0; b < this.ʿᵉ; b++) {
      if ((this.ᐨẏ[b]).ᐨẏ.equals(paramᴵʖ.ᐨẏ))
        return true; 
    } 
    return false;
  }
  
  private void ˊ(ᴵʖ paramᴵʖ) {
    if (this.ʿᵉ >= this.ᐨẏ.length) {
      ᴵʖ[] arrayOfᴵʖ = new ᴵʖ[this.ᐨẏ.length + 6];
      System.arraycopy(this.ᐨẏ, 0, arrayOfᴵʖ, 0, this.ʿᵉ);
      this.ᐨẏ = arrayOfᴵʖ;
    } 
    this.ᐨẏ[this.ʿᵉ++] = paramᴵʖ;
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ﾞл.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */