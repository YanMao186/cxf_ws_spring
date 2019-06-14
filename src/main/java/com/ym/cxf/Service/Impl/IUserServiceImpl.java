package com.ym.cxf.Service.Impl;

import com.ym.cxf.Service.IUserService;
import com.ym.cxf.domain.Car;
import com.ym.cxf.domain.User;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: common_parent
 * @description:
 * @author: Mr.Yan
 * @create: 2019-05-27 09:02
 * @WebService 注解设置 endPointInterface 接口服务完整类名， servicename 服务名称
 **/
@WebService(endpointInterface = "com.ym.cxf.Service.IUserService",serviceName = "userService")
public class IUserServiceImpl implements IUserService {
    @Override
    public String sayHello(String name) {
        return "Hello"+name;
    }

    @Override
    public List<Car> findCarsByUser(User user) {
        if ("xiaoming".equals(user.getUsername())) {
            List<Car> cars = new ArrayList<>();
            Car car1 = new Car();
            car1.setId(1);
            car1.setCarName("大众途观");
            car1.setPrice(200000d);
            cars.add(car1);
            return cars;
        }else {
        return null;
        }
    }
}
