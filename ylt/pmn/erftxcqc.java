package ylt.pmn;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class erftxcqc extends FilterInputStream {
  ofvanvcs v;
  
  private byte[] T = new byte[1];
  
  public erftxcqc(InputStream paramInputStream, ofvanvcs paramofvanvcs) {
    super(paramInputStream);
    this.v = paramofvanvcs;
  }
  
  public synchronized int read() throws IOException {
    return (read(this.T, 0, 1) == -1) ? -1 : (this.T[0] & 0xFF);
  }
  
  public boolean markSupported() {
    return false;
  }
  
  public int read(byte[] paramArrayOfbyte) throws IOException {
    return read(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    paramInt2 = super.read(paramArrayOfbyte, paramInt1, paramInt2);
    if (paramInt2 > 0)
      this.v.f(paramArrayOfbyte, paramInt1, paramInt2); 
    return paramInt2;
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\ylt\pmn\erftxcqc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */