package testtask.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testtask.bean.HelloWorld;
import testtask.mapper.HelloWorldMapper;

/**
 * Created by Galiya on 13.05.2017.
 */

@Service
public class HelloServiceImpl implements HelloService{

@Autowired
    private HelloWorldMapper mapper;

    public HelloWorld selectHello(Integer id) {
        return mapper.selectHello(id);
    }
}
