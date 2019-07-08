package yuyu.web.service.databases;


import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 　　* @description: DataService
 * 　　* @param
 * 　　* @return
 * 　　* @author yu.xu
 * 　　* @date 2019/7/8 15:25
 *
 */
@Service
public interface DataService {

    /**
     * 　　* @description: 获取所有表名
     * 　　* @param []
     * 　　* @return java.lang.String
     * 　　* @author yu.xu
     * 　　* @date 2019/7/8 15:26
     *
     */
    List<String> getTableName();

}
