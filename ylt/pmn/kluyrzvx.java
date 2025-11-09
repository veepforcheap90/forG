package ylt.pmn;

import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.util.HashMap;
import java.util.Map;

public class kluyrzvx implements URLStreamHandlerFactory {
  private final Map<String, URLStreamHandler> H = new HashMap<String, URLStreamHandler>();
  
  public kluyrzvx(String paramString, URLStreamHandler paramURLStreamHandler) {
    try {
      Method method = URL.class.getDeclaredMethod("getURLStreamHandler", new Class[] { String.class });
      method.setAccessible(true);
      this.H.put("jar", new haleruhk((URLStreamHandler)method.invoke((Object)null, new Object[] { "jar" })));
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    this.H.put(paramString, paramURLStreamHandler);
  }
  
  public kluyrzvx() {
    try {
      Method method = URL.class.getDeclaredMethod("getURLStreamHandler", new Class[] { String.class });
      method.setAccessible(true);
      this.H.put("jar", new haleruhk((URLStreamHandler)method.invoke((Object)null, new Object[] { "jar" })));
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void addHandler(String paramString, URLStreamHandler paramURLStreamHandler) {
    this.H.put(paramString, paramURLStreamHandler);
  }
  
  public URLStreamHandler createURLStreamHandler(String paramString) {
    return this.H.get(paramString);
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\ylt\pmn\kluyrzvx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */