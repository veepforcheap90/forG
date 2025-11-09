package ylt.pmn;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

public class haleruhk extends URLStreamHandler {
  URLStreamHandler parent;
  
  public haleruhk(URLStreamHandler paramURLStreamHandler) {
    this.parent = paramURLStreamHandler;
  }
  
  protected URLConnection openConnection(URL paramURL) throws IOException {
    return new nvluppdp(new URL(paramURL, paramURL.toString(), this.parent));
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\ylt\pmn\haleruhk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */