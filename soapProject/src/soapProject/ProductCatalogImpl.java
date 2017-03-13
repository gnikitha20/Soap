package soapProject;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalogImpl {
	private List<String> bookList = new ArrayList<>();
	private List<String> movieList = new ArrayList<>();
	private List<String> musicList = new ArrayList<>();
	
	public ProductCatalogImpl(){
		bookList.add("Inferno");
		bookList.add("JoyLand");
		bookList.add("Game Of Thrones");

		movieList.add("Oz the great and powerful");
		movieList.add("Dispecable Me");
		movieList.add("Superman Returns");

		musicList.add("Random Access Memories");
		musicList.add("Night Visions");
		musicList.add("Unorthodox Juke Box");
	}
	
	public List<String> getProductCatalog(){
		List<String> catalog= new ArrayList<>();
		catalog.add("Books");
		catalog.add("Movies");
		catalog.add("Music");
		return catalog;
	}
	public List<String> getProducts(String category){
		switch (category.toLowerCase()){
			case "books" : 
				return bookList;
			case "music":
				return musicList;
			case "movies":
				return movieList;
	}
	return null;
	}
	public List<String> addProducts(String category, String product){
		switch (category.toLowerCase()){
		case "books" : 
			bookList.add(product);
			return bookList;
		case "music":
			musicList.add(product);
			return musicList;
		case "movies":
			movieList.add(product);
			return movieList;
		}
		return null;
}
}

