package yuyu.web.controller.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yuyu.web.entity.system.AjaxResult;
import yuyu.web.service.system.MenuService;

/**
 　　* @description: 菜单相关控制器
 　　* @param
 　　* @return
 　　* @author yu.xu
 　　* @date 2019/7/9 17:07
 　　*/
@RestController
@RequestMapping("system")
public class MenuController {

    @Autowired
    MenuService menuService;


    /**
     * 　　* @description: 获取所有表名
     * 　　* @param []
     * 　　* @return java.lang.String
     * 　　* @author yu.xu
     * 　　* @date 2019/7/8 15:26
     *
     */
    @RequestMapping("getAllMenu")
    public AjaxResult getTableName(){

        return new AjaxResult(AjaxResult.Type.SUCCESS,"Menus",menuService.getAllMenu());

    }

}
