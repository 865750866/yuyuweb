package yuyu.web.service.databases.dataserviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yuyu.web.dao.databases.DataDao;
import yuyu.web.service.databases.DataService;

import java.util.List;

@Service
public class DataServiceImpl implements DataService {

    @Autowired
    DataDao dataDao;

    /**
     * 　　* @description: 获取所有表名
     * 　　* @param []
     * 　　* @return java.lang.String
     * 　　* @author yu.xu
     * 　　* @date 2019/7/8 15:26
     *
     */
    @Override
    public List<String> getTableName() {
        return dataDao.getTableName();
    }
}
