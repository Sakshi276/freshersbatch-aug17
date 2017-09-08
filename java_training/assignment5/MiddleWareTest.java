import java.lang.reflect.*;


class NameOpr
{
                public String getCapital(String country)
                {
                                return "Delhi";
                }
                
}

class MiddleWare
{
                public static Object invokeMethod(String className,String method,Class []paramTypes,Object []params)
                {
                                try
                                {
                                                Class cls=Class.forName(className);
                                                Object obj=cls.newInstance();
                                                Method m=cls.getDeclaredMethod(method,paramTypes);
                                                return m.invoke(obj,params);
                                }
                                catch(Exception e)
                                {
                                                e.printStackTrace();
                                                return null;
                                }
                }
}
public class MiddleWareTest
{
                public static void main(String []args){
                                Class[] paramInt = new Class[1];
                                paramInt[0] = String.class;
                                String capital=(String)MiddleWare.invokeMethod("NameOpr","getCapital",paramInt,new Object[]{"India"});
                                System.out.println("Capital is " + capital);
                }
}
