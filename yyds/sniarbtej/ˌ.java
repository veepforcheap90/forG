package yyds.sniarbtej;

final class ˌ extends ᴵƚ {
  final ˌх ᐨẏ;
  
  final int ʿλ;
  
  final int ᐝт;
  
  final int ɟ;
  
  int ﾞǰ;
  
  int ʿｱ;
  
  ˊ ᴵʖ;
  
  ˊ ﾞл;
  
  ˊ ʿᵉ;
  
  ˊ ʹﮃ;
  
  ᴵʖ ˊ;
  
  ˌ(ˌх paramˌх, int paramInt, String paramString1, String paramString2, String paramString3, Object paramObject) {
    super(589824);
    this.ᐨẏ = paramˌх;
    this.ʿλ = paramInt;
    this.ᐝт = paramˌх.ՙᗮ(paramString1);
    this.ɟ = paramˌх.ՙᗮ(paramString2);
    if (paramString3 != null)
      this.ﾞǰ = paramˌх.ՙᗮ(paramString3); 
    if (paramObject != null)
      this.ʿｱ = (paramˌх.ᐨẏ(paramObject)).ͺᴲ; 
  }
  
  public final ᐨẏ ᐨẏ(String paramString, boolean paramBoolean) {
    return paramBoolean ? (this.ᴵʖ = ˊ.ᐨẏ(this.ᐨẏ, paramString, this.ᴵʖ)) : (this.ﾞл = ˊ.ᐨẏ(this.ᐨẏ, paramString, this.ﾞл));
  }
  
  public final ᐨẏ ᐨẏ(int paramInt, ˏɪ paramˏɪ, String paramString, boolean paramBoolean) {
    return paramBoolean ? (this.ʿᵉ = ˊ.ᐨẏ(this.ᐨẏ, paramInt, paramˏɪ, paramString, this.ʿᵉ)) : (this.ʹﮃ = ˊ.ᐨẏ(this.ᐨẏ, paramInt, paramˏɪ, paramString, this.ʹﮃ));
  }
  
  public final void ᴵʖ(ᴵʖ paramᴵʖ) {
    paramᴵʖ.ᐨẏ = this.ˊ;
    this.ˊ = paramᴵʖ;
  }
  
  public final void ᐨẏ() {}
  
  final int ʽ() {
    int i = 8;
    if (this.ʿｱ != 0) {
      "xﻸ쉾쁆բ亙챋昳ꌕｻ좚䭋".toCharArray()[5] = (char)("xﻸ쉾쁆բ亙챋昳ꌕｻ좚䭋".toCharArray()[5] ^ 0x7E6F);
      this.ᐨẏ.ՙᗮ(ˍɫ$יς.J("xﻸ쉾쁆բ亙챋昳ꌕｻ좚䭋".toCharArray(), (short)32510, (short)0, (byte)1));
      i += 8;
    } 
    i = (i += ᴵʖ.ᐨẏ(this.ᐨẏ, this.ʿλ, this.ﾞǰ)) + ˊ.ᐨẏ(this.ᴵʖ, this.ﾞл, this.ʿᵉ, this.ʹﮃ);
    if (this.ˊ != null)
      i += this.ˊ.ᐨẏ(this.ᐨẏ); 
    return i;
  }
  
  final void ᐨẏ(ʿᵉ paramʿᵉ) {
    ˌх ˌх1;
    boolean bool;
    int i = (bool = ((ˌх1 = this.ᐨẏ).Ԇ < 49) ? true : false) ? 4096 : 0;
    paramʿᵉ.ˊ(this.ʿλ & (i ^ 0xFFFFFFFF)).ˊ(this.ᐝт).ˊ(this.ɟ);
    i = 0;
    if (this.ʿｱ != 0)
      i++; 
    if ((this.ʿλ & 0x1000) != 0 && bool)
      i++; 
    if (this.ﾞǰ != 0)
      i++; 
    if ((this.ʿλ & 0x20000) != 0)
      i++; 
    if (this.ᴵʖ != null)
      i++; 
    if (this.ﾞл != null)
      i++; 
    if (this.ʿᵉ != null)
      i++; 
    if (this.ʹﮃ != null)
      i++; 
    if (this.ˊ != null)
      i += this.ˊ.ᐨẏ(); 
    paramʿᵉ.ˊ(i);
    if (this.ʿｱ != 0) {
      "鶊륞珡㓖ᜁ鿭坴応?㪃Ᏹ料앰ㅩ".toCharArray()[5] = (char)("鶊륞珡㓖ᜁ鿭坴応?㪃Ᏹ料앰ㅩ".toCharArray()[5] ^ 0x2E82);
      paramʿᵉ.ˊ(this.ᐨẏ.ՙᗮ(ᐝᵣ$ﾞﾇ.j("鶊륞珡㓖ᜁ鿭坴応?㪃Ᏹ料앰ㅩ".toCharArray(), (short)16302, 1, (short)3))).ᴵʖ(2).ˊ(this.ʿｱ);
    } 
    ᴵʖ.ᐨẏ(this.ᐨẏ, this.ʿλ, this.ﾞǰ, paramʿᵉ);
    ˊ.ᐨẏ(this.ᐨẏ, this.ᴵʖ, this.ﾞл, this.ʿᵉ, this.ʹﮃ, paramʿᵉ);
    if (this.ˊ != null)
      this.ˊ.ᐨẏ(this.ᐨẏ, paramʿᵉ); 
  }
  
  final void ᐨẏ(ﾞл paramﾞл) {
    paramﾞл.ᐨẏ(this.ˊ);
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ˌ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */