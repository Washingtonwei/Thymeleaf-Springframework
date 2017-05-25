package mwsu.springframework.domain;

/**
 * Created by bingyang.wei on 5/24/2017.
 */
public class ProductCategory {
    private Integer id;
    private String category;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
