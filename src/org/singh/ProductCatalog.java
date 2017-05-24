package org.singh;
import org.singh.business.ProductServiceimpl;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public class ProductCatalog{

    ProductServiceimpl productService = new ProductServiceimpl();

    @WebMethod
    public List<String> getProductCategories(){
        return productService.getProductCategories();

    }

    public List<String> getProduct(String category){
        return productService.getProducts(category);
    }

}