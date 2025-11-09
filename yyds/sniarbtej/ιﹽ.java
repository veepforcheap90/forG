package yyds.sniarbtej;

import ylt.pmn.zubdqvgt;

final class ιﹽ<T> extends ٴۉ<T> {
  private final יỉ<T> ᐨẏ;
  
  private final ˊᴄ<T> ᐨẏ;
  
  private final ˑĴ ˊ;
  
  private final ʸ<T> ᐨẏ;
  
  private final ˌ々 ᐨẏ;
  
  private ٴۉ<T> ˊ;
  
  private ιﹽ(יỉ<T> paramיỉ, ˊᴄ<T> paramˊᴄ, ˑĴ paramˑĴ, ʸ<T> paramʸ, ˌ々 paramˌ々) {
    this.ᐨẏ = (ˌ々)paramיỉ;
    this.ᐨẏ = (ˌ々)paramˊᴄ;
    this.ˊ = (ٴۉ<T>)paramˑĴ;
    this.ᐨẏ = (ˌ々)paramʸ;
    this.ᐨẏ = paramˌ々;
  }
  
  public final T ᐨẏ(יּ paramיּ) {
    ᐧｴ ᐧｴ1;
    ˌ々 ˌ々1;
    ᐧｴ ᐧｴ2;
    return (this.ᐨẏ == null) ? ᐨẏ().ᐨẏ(paramיּ) : ((ᐧｴ2 = ᐧｴ1 = ˏɪ.ᐨẏ(paramיּ) instanceof ڊ) ? null : this.ᐨẏ.ᐨẏ(ᐧｴ1, ((ʸ)(ˌ々1 = this.ᐨẏ)).ՙᗮ, (ـﾗ)((ˑĴ)this.ˊ).ᐨẏ));
  }
  
  public final void ᐨẏ(Ⴡ paramჁ, T paramT) {
    if (this.ᐨẏ == null) {
      ᐨẏ().ᐨẏ(paramჁ, paramT);
      return;
    } 
    if (paramT == null) {
      paramჁ.ʿᵉ();
      return;
    } 
    ᐧｴ ᐧｴ;
    ˌ々 ˌ々1;
    ˏɪ.ˊ(ᐧｴ = this.ᐨẏ.ᐨẏ(paramT, ((ʸ)(ˌ々1 = this.ᐨẏ)).ՙᗮ, ((ˑĴ)this.ˊ).ᐨẏ), paramჁ);
  }
  
  private ٴۉ<T> ᐨẏ() {
    ٴۉ<T> ٴۉ1;
    return ((ٴۉ1 = this.ˊ) != null) ? ٴۉ1 : (this.ˊ = this.ˊ.<T>ᐨẏ(this.ᐨẏ, (ʸ<T>)this.ᐨẏ));
  }
  
  public static ˌ々 ᐨẏ(ʸ<?> paramʸ, Object paramObject) {
    return new ˏҫ(paramObject, paramʸ, false, null, (byte)0);
  }
  
  public static ˌ々 ˊ(ʸ<?> paramʸ, Object paramObject) {
    ʸ<?> ʸ1;
    boolean bool = zubdqvgt.G((ʸ1 = paramʸ).ՙᗮ, (ʸ1 = paramʸ).ᐨم) ? true : false;
    return new ˏҫ(paramObject, paramʸ, bool, null, (byte)0);
  }
  
  public static ˌ々 ᐨẏ(Class<?> paramClass, Object paramObject) {
    return new ˏҫ(paramObject, null, false, paramClass, (byte)0);
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ιﹽ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */