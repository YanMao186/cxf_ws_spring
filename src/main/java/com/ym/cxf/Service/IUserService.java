package com.ym.cxf.Service;

import com.ym.cxf.domain.Car;
import com.ym.cxf.domain.User;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * @program: common_parent
 * @description:
 * @author: Mr.Yan
 * @create: 2019-05-27 09:00
 **/

/**
 * @WebService 使用类上面，标记类是 WebService 服务提供对象
 */
@WebService
public interface IUserService {
    /**
     * @WebMethod 使用方法上面，标记方法 是 WebService 服务提供方法
     */
    @WebMethod
    public String sayHello(String name);
    @WebMethod
    public List<Car> findCarsByUser(User user);
}
