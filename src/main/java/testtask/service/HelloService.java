package testtask.service;

import testtask.bean.HelloWorld;

/**
 * Created by Galiya on 13.05.2017.
 */
public interface HelloService {
    HelloWorld selectHello(Integer id);
}
