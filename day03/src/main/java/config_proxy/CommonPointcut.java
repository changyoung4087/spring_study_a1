package config_proxy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CommonPointcut {

    @Pointcut("execution(* exam02_proxy..*(long))")
    public void cachedTarget(){ }
}
