package yuyu.web.service.system.menuserviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yuyu.web.dao.system.MenuDao;
import yuyu.web.entity.system.MenuEntity;
import yuyu.web.service.system.MenuService;
import yuyu.web.util.TreeUtils;

import java.util.List;

 /**
 　　* @description: TODO
 　　* @param
 　　* @return
 　　* @author yu.xu
 　　* @date 2019/7/9 17:07
 　　*/
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    MenuDao menuDao;

    /**
     　　* @description: TODO
     　　* @param []
     　　* @return java.util.List<yuyu.web.entity.system.MenuEntity>
     　　* @author yu.xu
     　　* @date 2019/7/9 17:03
     　　*/
    public List<MenuEntity> getAllMenu(){

        return TreeUtils.getChildPerms(menuDao.getAllMenu(),0);

    }




}
