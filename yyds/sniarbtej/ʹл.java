package yyds.sniarbtej;

public final class ʹл extends ˉｓ implements ـﭔ {
  private int ˑС;
  
  private int ﾞเ;
  
  private ʹл(ˉｓ paramˉｓ) {
    this(589824, paramˉｓ);
  }
  
  private ʹл(int paramInt, ˉｓ paramˉｓ) {
    super(589824, paramˉｓ);
  }
  
  private int ᐧפ() {
    return this.ˑС;
  }
  
  private int ιˠ() {
    return this.ﾞเ;
  }
  
  public final void ʹﮃ(int paramInt) {
    this.ˑС++;
    this.ﾞเ++;
    super.ʹﮃ(paramInt);
  }
  
  public final void ˊ(int paramInt1, int paramInt2) {
    if (paramInt1 == 17) {
      this.ˑС += 3;
      this.ﾞเ += 3;
    } else {
      this.ˑС += 2;
      this.ﾞเ += 2;
    } 
    super.ˊ(paramInt1, paramInt2);
  }
  
  public final void ᴵʖ(int paramInt1, int paramInt2) {
    if (paramInt2 < 4 && paramInt1 != 169) {
      this.ˑС++;
      this.ﾞเ++;
    } else if (paramInt2 >= 256) {
      this.ˑС += 4;
      this.ﾞเ += 4;
    } else {
      this.ˑС += 2;
      this.ﾞเ += 2;
    } 
    super.ᴵʖ(paramInt1, paramInt2);
  }
  
  public final void ᐨẏ(int paramInt, String paramString) {
    this.ˑС += 3;
    this.ﾞเ += 3;
    super.ᐨẏ(paramInt, paramString);
  }
  
  public final void ᐨẏ(int paramInt, String paramString1, String paramString2, String paramString3) {
    this.ˑС += 3;
    this.ﾞเ += 3;
    super.ᐨẏ(paramInt, paramString1, paramString2, paramString3);
  }
  
  public final void ᐨẏ(int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean) {
    if (this.ᐨẏ < 327680 && (paramInt & 0x100) == 0) {
      super.ᐨẏ(paramInt, paramString1, paramString2, paramString3, paramBoolean);
      return;
    } 
    int i;
    if ((i = paramInt & 0xFFFFFEFF) == 185) {
      this.ˑС += 5;
      this.ﾞเ += 5;
    } else {
      this.ˑС += 3;
      this.ﾞเ += 3;
    } 
    super.ᐨẏ(paramInt, paramString1, paramString2, paramString3, paramBoolean);
  }
  
  public final void ᐨẏ(String paramString1, String paramString2, ʹō paramʹō, Object... paramVarArgs) {
    this.ˑС += 5;
    this.ﾞเ += 5;
    super.ᐨẏ(paramString1, paramString2, paramʹō, paramVarArgs);
  }
  
  public final void ᐨẏ(int paramInt, ᔪ paramᔪ) {
    this.ˑС += 3;
    if (paramInt == 167 || paramInt == 168) {
      this.ﾞเ += 5;
    } else {
      this.ﾞเ += 8;
    } 
    super.ᐨẏ(paramInt, paramᔪ);
  }
  
  public final void ˊ(Object paramObject) {
    if (paramObject instanceof Long || paramObject instanceof Double || (paramObject instanceof ʾܪ && ((ʾܪ)paramObject).ˍɫ() == 2)) {
      this.ˑС += 3;
      this.ﾞเ += 3;
    } else {
      this.ˑС += 2;
      this.ﾞเ += 3;
    } 
    super.ˊ(paramObject);
  }
  
  public final void ﾞл(int paramInt1, int paramInt2) {
    if (paramInt1 > 255 || paramInt2 > 127 || paramInt2 < -128) {
      this.ˑС += 6;
      this.ﾞเ += 6;
    } else {
      this.ˑС += 3;
      this.ﾞเ += 3;
    } 
    super.ﾞл(paramInt1, paramInt2);
  }
  
  public final void ᐨẏ(int paramInt1, int paramInt2, ᔪ paramᔪ, ᔪ... paramVarArgs) {
    this.ˑС += 13 + (paramVarArgs.length << 2);
    this.ﾞเ += 16 + (paramVarArgs.length << 2);
    super.ᐨẏ(paramInt1, paramInt2, paramᔪ, paramVarArgs);
  }
  
  public final void ᐨẏ(ᔪ paramᔪ, int[] paramArrayOfint, ᔪ[] paramArrayOfᔪ) {
    this.ˑС += 9 + (paramArrayOfint.length << 3);
    this.ﾞเ += 12 + (paramArrayOfint.length << 3);
    super.ᐨẏ(paramᔪ, paramArrayOfint, paramArrayOfᔪ);
  }
  
  public final void ˊ(String paramString, int paramInt) {
    this.ˑС += 4;
    this.ﾞเ += 4;
    super.ˊ(paramString, paramInt);
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ʹл.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */