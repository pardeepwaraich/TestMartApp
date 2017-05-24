package org.singh;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService
public class ProductCatalog{
    public List<String> getProductCategories(){
        List<String> categories = new ArrayList<>();

        categories.add("Shopping");
        categories.add("Grocery");
        categories.add("Liquor");

        return categories;
    }

}