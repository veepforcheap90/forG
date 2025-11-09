package yyds.sniarbtej;

public final class ˎאּ extends ˉｓ {
  private ᴵઽ ᐨẏ;
  
  private ˎאּ(ˉｓ paramˉｓ, ᴵઽ paramᴵઽ) {
    this(589824, paramˉｓ, paramᴵઽ);
  }
  
  protected ˎאּ(int paramInt, ˉｓ paramˉｓ, ᴵઽ paramᴵઽ) {
    super(paramInt, paramˉｓ);
    this.ᐨẏ = paramᴵઽ;
  }
  
  public final ᐨẏ ˊ() {
    ᐨẏ ᐨẏ;
    return ((ᐨẏ = super.ˊ()) == null) ? ᐨẏ : ᐨẏ((String)null, ᐨẏ);
  }
  
  public final ᐨẏ ᐨẏ(String paramString, boolean paramBoolean) {
    ᐨẏ ᐨẏ;
    return ((ᐨẏ = super.ᐨẏ(this.ᐨẏ.ˊ(paramString), paramBoolean)) == null) ? ᐨẏ : ᐨẏ(paramString, ᐨẏ);
  }
  
  public final ᐨẏ ᐨẏ(int paramInt, ˏɪ paramˏɪ, String paramString, boolean paramBoolean) {
    ᐨẏ ᐨẏ;
    return ((ᐨẏ = super.ᐨẏ(paramInt, paramˏɪ, this.ᐨẏ.ˊ(paramString), paramBoolean)) == null) ? ᐨẏ : ᐨẏ(paramString, ᐨẏ);
  }
  
  public final ᐨẏ ᐨẏ(int paramInt, String paramString, boolean paramBoolean) {
    ᐨẏ ᐨẏ;
    return ((ᐨẏ = super.ᐨẏ(paramInt, this.ᐨẏ.ˊ(paramString), paramBoolean)) == null) ? ᐨẏ : ᐨẏ(paramString, ᐨẏ);
  }
  
  public final void ᐨẏ(int paramInt1, int paramInt2, Object[] paramArrayOfObject1, int paramInt3, Object[] paramArrayOfObject2) {
    super.ᐨẏ(paramInt1, paramInt2, ᐨẏ(paramInt2, paramArrayOfObject1), paramInt3, ᐨẏ(paramInt3, paramArrayOfObject2));
  }
  
  private Object[] ᐨẏ(int paramInt, Object[] paramArrayOfObject) {
    if (paramArrayOfObject == null)
      return paramArrayOfObject; 
    Object[] arrayOfObject = null;
    for (byte b = 0; b < paramInt; b++) {
      if (paramArrayOfObject[b] instanceof String) {
        if (arrayOfObject == null) {
          arrayOfObject = new Object[paramInt];
          System.arraycopy(paramArrayOfObject, 0, arrayOfObject, 0, paramInt);
        } 
        arrayOfObject[b] = this.ᐨẏ.ᴵʖ((String)paramArrayOfObject[b]);
      } 
    } 
    return (arrayOfObject == null) ? paramArrayOfObject : arrayOfObject;
  }
  
  public final void ᐨẏ(int paramInt, String paramString1, String paramString2, String paramString3) {
    super.ᐨẏ(paramInt, this.ᐨẏ.ᴵʖ(paramString1), this.ᐨẏ.ʿᵉ(paramString1, paramString2), this.ᐨẏ.ˊ(paramString3));
  }
  
  public final void ᐨẏ(int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean) {
    if (this.ᐨẏ < 327680 && (paramInt & 0x100) == 0) {
      super.ᐨẏ(paramInt, paramString1, paramString2, paramString3, paramBoolean);
      return;
    } 
    super.ᐨẏ(paramInt, this.ᐨẏ.ᴵʖ(paramString1), this.ᐨẏ.ᐨẏ(paramString1, paramString2, paramString3), this.ᐨẏ.ﾞл(paramString3), paramBoolean);
  }
  
  public final void ᐨẏ(String paramString1, String paramString2, ʹō paramʹō, Object... paramVarArgs) {
    Object[] arrayOfObject = new Object[paramVarArgs.length];
    for (byte b = 0; b < paramVarArgs.length; b++)
      arrayOfObject[b] = this.ᐨẏ.ᐨẏ(paramVarArgs[b]); 
    super.ᐨẏ(this.ᐨẏ.ﾞл(paramString1, paramString2), this.ᐨẏ.ﾞл(paramString2), (ʹō)this.ᐨẏ.ᐨẏ(paramʹō), arrayOfObject);
  }
  
  public final void ᐨẏ(int paramInt, String paramString) {
    super.ᐨẏ(paramInt, this.ᐨẏ.ᴵʖ(paramString));
  }
  
  public final void ˊ(Object paramObject) {
    super.ˊ(this.ᐨẏ.ᐨẏ(paramObject));
  }
  
  public final void ˊ(String paramString, int paramInt) {
    super.ˊ(this.ᐨẏ.ˊ(paramString), paramInt);
  }
  
  public final ᐨẏ ˊ(int paramInt, ˏɪ paramˏɪ, String paramString, boolean paramBoolean) {
    ᐨẏ ᐨẏ;
    return ((ᐨẏ = super.ˊ(paramInt, paramˏɪ, this.ᐨẏ.ˊ(paramString), paramBoolean)) == null) ? ᐨẏ : ᐨẏ(paramString, ᐨẏ);
  }
  
  public final void ᐨẏ(ᔪ paramᔪ1, ᔪ paramᔪ2, ᔪ paramᔪ3, String paramString) {
    super.ᐨẏ(paramᔪ1, paramᔪ2, paramᔪ3, (paramString == null) ? null : this.ᐨẏ.ᴵʖ(paramString));
  }
  
  public final ᐨẏ ᴵʖ(int paramInt, ˏɪ paramˏɪ, String paramString, boolean paramBoolean) {
    ᐨẏ ᐨẏ;
    return ((ᐨẏ = super.ᴵʖ(paramInt, paramˏɪ, this.ᐨẏ.ˊ(paramString), paramBoolean)) == null) ? ᐨẏ : ᐨẏ(paramString, ᐨẏ);
  }
  
  public final void ᐨẏ(String paramString1, String paramString2, String paramString3, ᔪ paramᔪ1, ᔪ paramᔪ2, int paramInt) {
    super.ᐨẏ(paramString1, this.ᐨẏ.ˊ(paramString2), this.ᐨẏ.ˊ(paramString3, true), paramᔪ1, paramᔪ2, paramInt);
  }
  
  public final ᐨẏ ᐨẏ(int paramInt, ˏɪ paramˏɪ, ᔪ[] paramArrayOfᔪ1, ᔪ[] paramArrayOfᔪ2, int[] paramArrayOfint, String paramString, boolean paramBoolean) {
    ᐨẏ ᐨẏ;
    return ((ᐨẏ = super.ᐨẏ(paramInt, paramˏɪ, paramArrayOfᔪ1, paramArrayOfᔪ2, paramArrayOfint, this.ᐨẏ.ˊ(paramString), paramBoolean)) == null) ? ᐨẏ : ᐨẏ(paramString, ᐨẏ);
  }
  
  @Deprecated
  private ᐨẏ ᐨẏ(ᐨẏ paramᐨẏ) {
    return new ʴ(this.ᐨẏ, null, paramᐨẏ, this.ᐨẏ);
  }
  
  private ᐨẏ ᐨẏ(String paramString, ᐨẏ paramᐨẏ) {
    return (new ʴ(this.ᐨẏ, paramString, paramᐨẏ, this.ᐨẏ)).ˊ(ᐨẏ(paramᐨẏ));
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ˎאּ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */