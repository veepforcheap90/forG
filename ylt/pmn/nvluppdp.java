package ylt.pmn;

import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.jar.JarFile;

public class nvluppdp extends JarURLConnection {
  URLConnection t;
  
  public nvluppdp(URL paramURL) throws IOException {
    super(paramURL);
    this.t = paramURL.openConnection();
  }
  
  public void connect() throws IOException {
    this.t.connect();
  }
  
  public InputStream getInputStream() throws IOException {
    return new ofvanvcs(this.t.getInputStream());
  }
  
  public JarFile getJarFile() throws IOException {
    return ((JarURLConnection)this.t).getJarFile();
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\ylt\pmn\nvluppdp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */