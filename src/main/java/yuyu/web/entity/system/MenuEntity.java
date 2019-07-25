package yuyu.web.entity.system;

import java.util.ArrayList;
import java.util.List;

public class MenuEntity {

    Long id;
    String name;
    String url;
    Long parentId;

    //菜单孩子
    List<MenuEntity> children=new ArrayList<MenuEntity>();

    public List<MenuEntity> getChildren() {
        return children;
    }

    public void setChildren(List<MenuEntity> children) {
        this.children = children;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
}
