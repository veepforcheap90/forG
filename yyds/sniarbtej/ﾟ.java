package yyds.sniarbtej;

public final class ﾟ extends ـᘢ {
  private final StringBuilder ᐨẏ;
  
  private boolean ʾܪ;
  
  private boolean ᐨم;
  
  private int ˉม = 1;
  
  public ﾟ() {
    this(new StringBuilder());
  }
  
  private ﾟ(StringBuilder paramStringBuilder) {
    super(589824);
    this.ᐨẏ = paramStringBuilder;
  }
  
  public final void ʾ(String paramString) {
    if (!this.ʾܪ) {
      this.ʾܪ = true;
      this.ᐨẏ.append('<');
    } 
    this.ᐨẏ.append(paramString);
    this.ᐨẏ.append(':');
  }
  
  public final ـᘢ ˊ() {
    return this;
  }
  
  public final ـᘢ ʿᵉ() {
    this.ᐨẏ.append(':');
    return this;
  }
  
  public final ـᘢ ˍɫ() {
    ۥ();
    return this;
  }
  
  public final ـᘢ ﾞл() {
    return this;
  }
  
  public final ـᘢ ʹﮃ() {
    ۥ();
    if (!this.ᐨم) {
      this.ᐨم = true;
      this.ᐨẏ.append('(');
    } 
    return this;
  }
  
  public final ـᘢ ՙᗮ() {
    ۥ();
    if (!this.ᐨم)
      this.ᐨẏ.append('('); 
    this.ᐨẏ.append(')');
    return this;
  }
  
  public final ـᘢ ᴵʖ() {
    this.ᐨẏ.append('^');
    return this;
  }
  
  public final void ᐨẏ(char paramChar) {
    this.ᐨẏ.append(paramChar);
  }
  
  public final void ͺо(String paramString) {
    this.ᐨẏ.append('T');
    this.ᐨẏ.append(paramString);
    this.ᐨẏ.append(';');
  }
  
  public final ـᘢ ᐨẏ() {
    this.ᐨẏ.append('[');
    return this;
  }
  
  public final void ʾܪ(String paramString) {
    this.ᐨẏ.append('L');
    this.ᐨẏ.append(paramString);
    this.ˉม <<= 1;
  }
  
  public final void ᐨم(String paramString) {
    ـไ();
    this.ᐨẏ.append('.');
    this.ᐨẏ.append(paramString);
    this.ˉม <<= 1;
  }
  
  public final void ʹл() {
    if ((this.ˉม & 0x1) == 0) {
      this.ˉม |= 0x1;
      this.ᐨẏ.append('<');
    } 
    this.ᐨẏ.append('*');
  }
  
  public final ـᘢ ᐨẏ(char paramChar) {
    if ((this.ˉม & 0x1) == 0) {
      this.ˉม |= 0x1;
      this.ᐨẏ.append('<');
    } 
    if (paramChar != '=')
      this.ᐨẏ.append(paramChar); 
    return ((this.ˉม & Integer.MIN_VALUE) == 0) ? this : new ﾟ(this.ᐨẏ);
  }
  
  public final void ᐨẏ() {
    ـไ();
    this.ᐨẏ.append(';');
  }
  
  public final String toString() {
    return this.ᐨẏ.toString();
  }
  
  private void ۥ() {
    if (this.ʾܪ) {
      this.ʾܪ = false;
      this.ᐨẏ.append('>');
    } 
  }
  
  private void ـไ() {
    if ((this.ˉม & 0x1) == 1)
      this.ᐨẏ.append('>'); 
    this.ˉม >>>= 1;
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ﾟ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */