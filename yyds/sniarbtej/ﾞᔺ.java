package yyds.sniarbtej;

import java.lang.instrument.ClassFileTransformer;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public final class ﾞᔺ implements ClassFileTransformer {
  private final ˌᒥ ᐨẏ;
  
  private final List<ﹳӱ> ᵕ = new ArrayList<>();
  
  final Set<String> ᴵʖ = new TreeSet<>();
  
  public ﾞᔺ(ˌᒥ paramˌᒥ) {
    this.ᐨẏ = paramˌᒥ;
  }
  
  public final void ᐨẏ(ﹳӱ paramﹳӱ) {
    if (paramﹳӱ == null)
      return; 
    ˌᒥ ˌᒥ1;
    if ((ˌᒥ1 = this.ᐨẏ).ˎᴗ) {
      "熁筑雵쐣ꎁ봪ꇿ인쏖ㅆ齔뺣ฤ".toCharArray()[0] = (char)("熁筑雵쐣ꎁ봪ꇿ인쏖ㅆ齔뺣ฤ".toCharArray()[0] ^ 0x1660);
      "㿒걮죞봈悼㵥횫܉燌恫쥷?★ᣚ倇杷⥚砋黄倠⊫튾鱖剷菪嫳옊鍹↙귮ṷϣ㸿ﺋ澧槌઩⣳薦絬烜씢崐".toCharArray()[16] = (char)("㿒걮죞봈悼㵥횫܉燌恫쥷?★ᣚ倇杷⥚砋黄倠⊫튾鱖剷菪嫳옊鍹↙귮ṷϣ㸿ﺋ澧槌઩⣳薦絬烜씢崐".toCharArray()[16] ^ 0x7D45);
      System.out.println(ᐝᵣ$ﾞﾇ.j("熁筑雵쐣ꎁ봪ꇿ인쏖ㅆ齔뺣ฤ".toCharArray(), (short)30627, 0, (short)4) + paramﹳӱ.getClass().getName() + ᐝᵣ$ﾞﾇ.j("㿒걮죞봈悼㵥횫܉燌恫쥷?★ᣚ倇杷⥚砋黄倠⊫튾鱖剷菪嫳옊鍹↙귮ṷϣ㸿ﺋ澧槌઩⣳薦絬烜씢崐".toCharArray(), (short)29644, 1, (short)5));
      return;
    } 
    synchronized (this) {
      this.ᵕ.add(paramﹳӱ);
      this.ᴵʖ.add(paramﹳӱ.ᔪ().replace('/', '.'));
      return;
    } 
  }
  
  public final Set<String> ᐨẏ() {
    return this.ᴵʖ;
  }
  
  public final byte[] transform(ClassLoader paramClassLoader, String paramString, Class<?> paramClass, ProtectionDomain paramProtectionDomain, byte[] paramArrayOfbyte) {
    if (paramString == null)
      return paramArrayOfbyte; 
    Iterator<ﹳӱ> iterator = this.ᵕ.iterator();
    while (iterator.hasNext()) {
      ﹳӱ ﹳӱ;
      if ((ﹳӱ = iterator.next()).ʹﮃ(paramString))
        try {
          paramArrayOfbyte = ﹳӱ.ˍɫ(paramArrayOfbyte);
        } catch (Exception exception) {
          (ﹳӱ = null).printStackTrace();
        }  
    } 
    return paramArrayOfbyte;
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ﾞᔺ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */