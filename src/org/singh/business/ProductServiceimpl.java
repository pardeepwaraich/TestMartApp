package org.singh.business;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceimpl {

    List<String> bookList = new ArrayList<>();
    List<String> musicList = new ArrayList<>();
    List<String> movieList = new ArrayList<>();

    public ProductServiceimpl(){
        musicList.add("Diljeet");
        musicList.add("Gippy");
        musicList.add("Gurdas");

        bookList.add("Love Story");
        bookList.add("Jinda Jatt");
        bookList.add("Welcome to Jungle");

        movieList.add("Hero");
        movieList.add("Heroine");
        movieList.add("Badshah");

       }

    public List<String> getProductCategories() {

        List<String> categories = new ArrayList<>();

        categories.add("Books");
        categories.add("Movie");
        categories.add("Musics");
        return categories;

    }

    public List<String> getProducts(String category){
        switch (category.toLowerCase()){
            case "books":
                return bookList;

            case "music":
                return musicList;

            case "movies":
                return movieList;
        }
        return null;
    }



}
