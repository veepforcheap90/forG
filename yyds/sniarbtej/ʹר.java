package yyds.sniarbtej;

import java.net.URI;
import java.net.URISyntaxException;
import ylt.pmn.zubdqvgt;

final class ʹר extends ٴۉ<URI> {
  private static URI ᐨẏ(יּ paramיּ) {
    if (zubdqvgt.G(paramיּ.ᐨẏ(), כ.ʽ)) {
      paramיּ.ۦ();
      return null;
    } 
    try {
      String str = paramיּ.ٴӵ();
      "蒳顐컥杖".toCharArray()[1] = (char)("蒳顐컥杖".toCharArray()[1] ^ 0x7645);
      return ˏȓ$ᴵЃ.E("蒳顐컥杖".toCharArray(), (short)22131, (short)1, (short)2).equals(str) ? null : new URI(str);
    } catch (URISyntaxException uRISyntaxException) {
      throw new ᙆ(uRISyntaxException);
    } 
  }
  
  private static void ᐨẏ(Ⴡ paramჁ, URI paramURI) {
    paramჁ.ˊ((paramURI == null) ? null : paramURI.toASCIIString());
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ʹר.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */