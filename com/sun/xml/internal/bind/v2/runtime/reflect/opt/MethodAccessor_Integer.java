package com.sun.xml.internal.bind.v2.runtime.reflect.opt;

import com.sun.xml.internal.bind.v2.runtime.reflect.Accessor;

public class MethodAccessor_Integer extends Accessor {
  public MethodAccessor_Integer() { super(Integer.class); }
  
  public Object get(Object paramObject) { return Integer.valueOf(((Bean)paramObject).get_int()); }
  
  public void set(Object paramObject1, Object paramObject2) { ((Bean)paramObject1).set_int((paramObject2 == null) ? Const.default_value_int : ((Integer)paramObject2).intValue()); }
}


/* Location:              D:\software\jd-gui\jd-gui-windows-1.6.3\rt.jar!\com\sun\xml\internal\bind\v2\runtime\reflect\opt\MethodAccessor_Integer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */