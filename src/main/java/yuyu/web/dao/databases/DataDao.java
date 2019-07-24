package yuyu.web.dao.databases;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 　　* @description: 数据库相关dao
 * 　　* @param
 * 　　* @return
 * 　　* @author yu.xu
 * 　　* @date 2019/7/8 15:25
 *
 */
@Repository
@Mapper
public interface DataDao {

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
