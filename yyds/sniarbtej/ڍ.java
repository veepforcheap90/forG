package yyds.sniarbtej;

import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ylt.pmn.zubdqvgt;

public final class ڍ extends יּ {
  private static final Reader ᐨẏ = new ͺใ();
  
  private static final Object ٴӵ = new Object();
  
  public final List<Object> ᴵʖ = new ArrayList();
  
  public ڍ(ᐧｴ paramᐧｴ) {
    super(ᐨẏ);
    this.ᴵʖ.add(paramᐧｴ);
  }
  
  public final void ᵘ() {
    ᐨẏ((כ)כ.ᐨẏ);
    ˋℷ ˋℷ = (ˋℷ)ՙᗮ();
    this.ᴵʖ.add(ˋℷ.iterator());
  }
  
  public final void ˑܥ() {
    ᐨẏ(כ.ˊ);
    ˍɫ();
    ˍɫ();
  }
  
  public final void ᐨ() {
    ᐨẏ(כ.ᴵʖ);
    ʻṪ ʻṪ = (ʻṪ)ՙᗮ();
    this.ᴵʖ.add((ʻṪ = ʻṪ).ᐨẏ.entrySet().iterator());
  }
  
  public final void ﾞঽ() {
    ᐨẏ(כ.ﾞл);
    ˍɫ();
    ˍɫ();
  }
  
  public final boolean hasNext() {
    כ כ;
    return (!zubdqvgt.G(כ = ᐨẏ(), כ.ﾞл) && !zubdqvgt.G(כ, כ.ˊ));
  }
  
  public final כ ᐨẏ() {
    while (true) {
      if (this.ᴵʖ.isEmpty())
        return כ.ʾܪ; 
      Object object;
      if (object = ՙᗮ() instanceof Iterator) {
        boolean bool = this.ᴵʖ.get(this.ᴵʖ.size() - 2) instanceof ʻṪ;
        if ((object = object).hasNext()) {
          if (bool)
            return כ.ʿᵉ; 
          this.ᴵʖ.add(object.next());
          continue;
        } 
        return bool ? כ.ﾞл : כ.ˊ;
      } 
      if (object instanceof ʻṪ)
        return כ.ᴵʖ; 
      if (object instanceof ˋℷ)
        return (כ)כ.ᐨẏ; 
      if (object instanceof ﭘ) {
        ﭘ ﭘ;
        if (((ﭘ)(object = ﭘ = (ﭘ)object)).ﾞл instanceof String)
          return כ.ʹﮃ; 
        if (((ﭘ)(object = ﭘ)).ﾞл instanceof Boolean)
          return כ.ˍɫ; 
        if (((ﭘ)(object = ﭘ)).ﾞл instanceof Number)
          return כ.ՙᗮ; 
        throw new AssertionError();
      } 
      if (object instanceof ڊ)
        return כ.ʽ; 
      if (zubdqvgt.G(object, ٴӵ)) {
        "␖謇䕇⑫᷎嶰?ᒕ㔯Ò㐗鮀⹘넶ὢ?˴⏑".toCharArray()[15] = (char)("␖謇䕇⑫᷎嶰?ᒕ㔯Ò㐗鮀⹘넶ὢ?˴⏑".toCharArray()[15] ^ 0x4824);
        throw new IllegalStateException(ˍɫ$יς.J("␖謇䕇⑫᷎嶰?ᒕ㔯Ò㐗鮀⹘넶ὢ?˴⏑".toCharArray(), (short)26583, (short)1, (byte)3));
      } 
      throw new AssertionError();
    } 
  }
  
  public Object ՙᗮ() {
    return this.ᴵʖ.get(this.ᴵʖ.size() - 1);
  }
  
  private Object ˍɫ() {
    return this.ᴵʖ.remove(this.ᴵʖ.size() - 1);
  }
  
  public void ᐨẏ(כ paramכ) {
    if (!zubdqvgt.G(ᐨẏ(), paramכ)) {
      "䌂꺷㔽柘獛ᜃ橡".toCharArray()[2] = (char)("䌂꺷㔽柘獛ᜃ橡".toCharArray()[2] ^ 0x1A3F);
      "꺑覃卖⺲됳ꣲ铘ﮒ烴".toCharArray()[0] = (char)("꺑覃卖⺲됳ꣲ铘ﮒ烴".toCharArray()[0] ^ 0x4E61);
      throw new IllegalStateException(ˍɫ$יς.J("䌂꺷㔽柘獛ᜃ橡".toCharArray(), (short)11617, (short)0, (byte)5) + paramכ + ˍɫ$יς.J("꺑覃卖⺲됳ꣲ铘ﮒ烴".toCharArray(), (short)29835, (short)3, (byte)3) + ᐨẏ());
    } 
  }
  
  public final String ͺо() {
    ᐨẏ(כ.ʿᵉ);
    Iterator<Map.Entry> iterator;
    Map.Entry entry = (iterator = (Iterator<Map.Entry>)ՙᗮ()).next();
    this.ᴵʖ.add(entry.getValue());
    return (String)entry.getKey();
  }
  
  public final String ٴӵ() {
    כ כ;
    if (!zubdqvgt.G(כ = ᐨẏ(), כ.ʹﮃ) && !zubdqvgt.G(כ, כ.ՙᗮ)) {
      "㌊㫪ϩ⦳廤ٜ伞昤嫞".toCharArray()[0] = (char)("㌊㫪ϩ⦳廤ٜ伞昤嫞".toCharArray()[0] ^ 0x2DD2);
      "㻲웠ﻁ膱ಪ纵ꝣꅀἕ".toCharArray()[5] = (char)("㻲웠ﻁ膱ಪ纵ꝣꅀἕ".toCharArray()[5] ^ 0x2E8D);
      throw new IllegalStateException(ᐨẏ$ᐝт.W("㌊㫪ϩ⦳廤ٜ伞昤嫞".toCharArray(), (short)14980, (byte)0, (short)3) + כ.ʹﮃ + ᐨẏ$ᐝт.W("㻲웠ﻁ膱ಪ纵ꝣꅀἕ".toCharArray(), (short)23774, (byte)1, (short)4) + כ);
    } 
    return ((ﭘ)ˍɫ()).ᐨم();
  }
  
  public final boolean ˈے() {
    ᐨẏ(כ.ˍɫ);
    return ((ﭘ)ˍɫ()).ᴵƚ();
  }
  
  public final void ۦ() {
    ᐨẏ(כ.ʽ);
    ˍɫ();
  }
  
  public final double ᴵʖ() {
    כ כ;
    if (!zubdqvgt.G(כ = ᐨẏ(), כ.ՙᗮ) && !zubdqvgt.G(כ, כ.ʹﮃ)) {
      "쨪?ឞ툷슼᭘긢ࡅᕬᣥ".toCharArray()[0] = (char)("쨪?ឞ툷슼᭘긢ࡅᕬᣥ".toCharArray()[0] ^ 0x12C);
      "돰\017㨒䚪䓂ᇈꅓ㯂䚲嫂".toCharArray()[6] = (char)("돰\017㨒䚪䓂ᇈꅓ㯂䚲嫂".toCharArray()[6] ^ 0x754B);
      throw new IllegalStateException(ᐝᵣ$ﾞﾇ.j("쨪?ឞ툷슼᭘긢ࡅᕬᣥ".toCharArray(), (short)13363, 2, (short)4) + כ.ՙᗮ + ᐝᵣ$ﾞﾇ.j("돰\017㨒䚪䓂ᇈꅓ㯂䚲嫂".toCharArray(), (short)20372, 4, (short)0) + כ);
    } 
    double d = ((ﭘ)ՙᗮ()).ᐨẏ();
    if (!ـﭔ() && (Double.isNaN(d) || Double.isInfinite(d))) {
      "ᤉ쌅渢ᦥ앓鮤ﮎꊡ衛踕㯁毚䒸ᄚ踂ꬖ薏학㵥ൊ쪨ꨆ\017춨ǿㅤ念囇⚙ﭢ檻䯦៙".toCharArray()[16] = (char)("ᤉ쌅渢ᦥ앓鮤ﮎꊡ衛踕㯁毚䒸ᄚ踂ꬖ薏학㵥ൊ쪨ꨆ\017춨ǿㅤ念囇⚙ﭢ檻䯦៙".toCharArray()[16] ^ 0x5001);
      throw new NumberFormatException(ᐝᵣ$ﾞﾇ.j("ᤉ쌅渢ᦥ앓鮤ﮎꊡ衛踕㯁毚䒸ᄚ踂ꬖ薏학㵥ൊ쪨ꨆ\017춨ǿㅤ念囇⚙ﭢ檻䯦៙".toCharArray(), (short)16283, 1, (short)2) + d);
    } 
    ˍɫ();
    return d;
  }
  
  public final long ᴵʖ() {
    כ כ;
    if (!zubdqvgt.G(כ = ᐨẏ(), כ.ՙᗮ) && !zubdqvgt.G(כ, כ.ʹﮃ)) {
      "㫽鵿頻묍쁪᭥德".toCharArray()[5] = (char)("㫽鵿頻묍쁪᭥德".toCharArray()[5] ^ 0x38D);
      "㯀᦬肭ᑖ펧呃뽙靓緗㬻".toCharArray()[8] = (char)("㯀᦬肭ᑖ펧呃뽙靓緗㬻".toCharArray()[8] ^ 0x405F);
      throw new IllegalStateException(ˍɫ$יς.J("㫽鵿頻묍쁪᭥德".toCharArray(), (short)5834, (short)5, (byte)1) + כ.ՙᗮ + ˍɫ$יς.J("㯀᦬肭ᑖ펧呃뽙靓緗㬻".toCharArray(), (short)13690, (short)2, (byte)2) + כ);
    } 
    long l = ((ﭘ)ՙᗮ()).ˊ();
    ˍɫ();
    return l;
  }
  
  public final int ˊɼ() {
    כ כ;
    if (!zubdqvgt.G(כ = ᐨẏ(), כ.ՙᗮ) && !zubdqvgt.G(כ, כ.ʹﮃ)) {
      "讘駁㋉໹ᑄ䎝Ꞗ䀊宇".toCharArray()[4] = (char)("讘駁㋉໹ᑄ䎝Ꞗ䀊宇".toCharArray()[4] ^ 0x56FE);
      "໹ダ搴Ꚏ䄺繣ᘼ῔吸".toCharArray()[0] = (char)("໹ダ搴Ꚏ䄺繣ᘼ῔吸".toCharArray()[0] ^ 0x39EF);
      throw new IllegalStateException(ˏȓ$ᴵЃ.E("讘駁㋉໹ᑄ䎝Ꞗ䀊宇".toCharArray(), (short)29623, (short)5, (short)5) + כ.ՙᗮ + ˏȓ$ᴵЃ.E("໹ダ搴Ꚏ䄺繣ᘼ῔吸".toCharArray(), (short)6937, (short)0, (short)5) + כ);
    } 
    int i = ((ﭘ)ՙᗮ()).ٴᖟ();
    ˍɫ();
    return i;
  }
  
  public final void close() {
    this.ᴵʖ.clear();
    this.ᴵʖ.add(ٴӵ);
  }
  
  public final void ˏⅭ() {
    if (zubdqvgt.G(ᐨẏ(), כ.ʿᵉ)) {
      ͺо();
      return;
    } 
    ˍɫ();
  }
  
  public final String toString() {
    return getClass().getSimpleName();
  }
  
  public final void ـс() {
    ᐨẏ(כ.ʿᵉ);
    Iterator<Map.Entry> iterator;
    Map.Entry entry = (iterator = (Iterator<Map.Entry>)ՙᗮ()).next();
    this.ᴵʖ.add(entry.getValue());
    this.ᴵʖ.add(new ﭘ((String)entry.getKey()));
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ڍ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */