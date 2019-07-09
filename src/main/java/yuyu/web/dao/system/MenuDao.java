package yuyu.web.dao.system;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import yuyu.web.entity.system.MenuEntity;

import java.util.List;

/**
 　　* @description: 系统菜单Dao
 　　* @param
 　　* @return
 　　* @author yu.xu
 　　* @date 2019/7/9 16:55
 　　*/
@Repository
@Mapper
public interface MenuDao {

    /**
     　　* @description: TODO
     　　* @param []
     　　* @return java.util.List<yuyu.web.entity.system.MenuEntity>
     　　* @author yu.xu
     　　* @date 2019/7/9 17:03
     　　*/
    List<MenuEntity> getAllMenu();

}
