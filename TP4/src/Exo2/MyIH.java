package Exo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by olivier on 23/10/2015.
 */
public class MyIH implements InvocationHandler {

    private Integer _integer;

    public MyIH(Integer i){
        _integer = i;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName() + " compared with  " + _integer);
        return method.invoke(_integer, args);
    }
}
