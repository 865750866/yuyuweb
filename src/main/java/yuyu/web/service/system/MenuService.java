package yuyu.web.service.system;

import org.springframework.stereotype.Service;
import yuyu.web.entity.system.MenuEntity;

import java.util.List;

/**
 　　* @description: TODO
 　　* @param
 　　* @return
 　　* @author yu.xu
 　　* @date 2019/7/9 17:06
 　　*/
@Service
public interface MenuService {

    /**
     　　* @description: TODO
     　　* @param []
     　　* @return java.util.List<yuyu.web.entity.system.MenuEntity>
     　　* @author yu.xu
     　　* @date 2019/7/9 17:03
     　　*/
    List<MenuEntity> getAllMenu();


}
