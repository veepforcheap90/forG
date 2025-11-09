package ylt.pmn;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class lmyvayzu extends URLConnection {
  URLConnection q;
  
  public lmyvayzu(URL paramURL) throws IOException {
    super(paramURL);
    this.q = paramURL.openConnection();
  }
  
  public void connect() throws IOException {
    this.q.connect();
  }
  
  public InputStream getInputStream() throws IOException {
    InputStream inputStream = this.q.getInputStream();
    return (inputStream != null) ? new ofvanvcs(inputStream) : inputStream;
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\ylt\pmn\lmyvayzu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */