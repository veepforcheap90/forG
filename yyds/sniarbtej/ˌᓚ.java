package yyds.sniarbtej;

import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import ylt.pmn.zubdqvgt;

public final class ˌᓚ implements Iterator<ᐧｴ> {
  private final יּ ᐨẏ;
  
  private final Object ᐨم;
  
  private ˌᓚ(String paramString) {
    this(new StringReader(paramString));
  }
  
  private ˌᓚ(Reader paramReader) {
    this.ᐨẏ = new יּ(paramReader);
    boolean bool = true;
    יּ יּ1;
    (יּ1 = this.ᐨẏ).ˎאּ = bool;
    this.ᐨم = new Object();
  }
  
  private ᐧｴ ˊ() {
    if (!hasNext())
      throw new NoSuchElementException(); 
    try {
      return ˏɪ.ᐨẏ(this.ᐨẏ);
    } catch (StackOverflowError stackOverflowError) {
      "㔏ᥫײ◚Ⰻ迯푏䋩?목瀣?꧱曈祕虧햟ꌂ썽섩﫧襂툩멝⊃됃讴㐉貺臜鹰귘眝".toCharArray()[32] = (char)("㔏ᥫײ◚Ⰻ迯푏䋩?목瀣?꧱曈祕虧햟ꌂ썽섩﫧襂툩멝⊃됃讴㐉貺臜鹰귘眝".toCharArray()[32] ^ 0x2A59);
      throw new ˑʖ(ˍɫ$יς.J("㔏ᥫײ◚Ⰻ迯푏䋩?목瀣?꧱曈祕虧햟ꌂ썽섩﫧襂툩멝⊃됃讴㐉貺臜鹰귘眝".toCharArray(), (short)26800, (short)1, (byte)0), stackOverflowError);
    } catch (OutOfMemoryError outOfMemoryError) {
      "⎱?ﴗ駩䪱㣳ܥ馿陀ޛ霖ߞ凃欆⩽삧⏳ሡﳫ₟᝴↝퟊ḁ㕩ﮄ建Ӱ䴔긼ɩ持".toCharArray()[21] = (char)("⎱?ﴗ駩䪱㣳ܥ馿陀ޛ霖ߞ凃欆⩽삧⏳ሡﳫ₟᝴↝퟊ḁ㕩ﮄ建Ӱ䴔긼ɩ持".toCharArray()[21] ^ 0x61C1);
      throw new ˑʖ(ˍɫ$יς.J("⎱?ﴗ駩䪱㣳ܥ馿陀ޛ霖ߞ凃欆⩽삧⏳ሡﳫ₟᝴↝퟊ḁ㕩ﮄ建Ӱ䴔긼ɩ持".toCharArray(), (short)13575, (short)4, (byte)3), outOfMemoryError);
    } catch (ˑʖ ˑʖ2) {
      ˑʖ ˑʖ1;
      throw ((ˑʖ1 = null).getCause() instanceof java.io.EOFException) ? new NoSuchElementException() : ˑʖ1;
    } 
  }
  
  public final boolean hasNext() {
    synchronized (this.ᐨم) {
      return !zubdqvgt.G(this.ᐨẏ.ᐨẏ(), כ.ʾܪ);
    } 
  }
  
  public final void remove() {
    throw new UnsupportedOperationException();
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ˌᓚ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */