package ylt.pmn;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

public class Handler extends URLStreamHandler {
  protected URLConnection openConnection(URL paramURL) throws IOException {
    "桵ុ손ჴ".toCharArray()[2] = (char)("桵ុ손ჴ".toCharArray()[2] ^ 0x9CC);
    if (paramURL.getProtocol().equals(aysbugry.d("桵ុ손ჴ".toCharArray(), (short)1782, false, (byte)5))) {
      URL uRL = new URL(paramURL.toString().substring(4));
      return new lmyvayzu(uRL);
    } 
    return paramURL.openConnection();
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\ylt\pmn\Handler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */