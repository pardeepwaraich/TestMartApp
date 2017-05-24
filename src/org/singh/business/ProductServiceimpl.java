package org.singh.business;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceimpl {

    public List<String> getProductCategories() {

        List<String> categories = new ArrayList<>();

        categories.add("Books");
        categories.add("Movie");
        categories.add("Musics");
        return categories;

    }
}
