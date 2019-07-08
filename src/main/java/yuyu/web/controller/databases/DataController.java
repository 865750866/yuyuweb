package yuyu.web.controller.databases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yuyu.web.service.databases.DataService;

import java.util.List;

/**
 * 　　* @description: 数据库相关Controller
 * 　　* @param
 * 　　* @return
 * 　　* @author yu.xu
 * 　　* @date 2019/7/8 15:30
 */
@RestController
@RequestMapping("databases")
public class DataController {

    @Autowired
    DataService dataService;

    /**
     * 　　* @description: 获取所有表名
     * 　　* @param []
     * 　　* @return java.util.List<java.lang.String>
     * 　　* @author yu.xu
     * 　　* @date 2019/7/8 15:33
     */
    @RequestMapping("getTableName")
    public List<String> getTableName() {
        return dataService.getTableName();
    }


}
