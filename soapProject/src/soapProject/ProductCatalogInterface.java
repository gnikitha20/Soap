package soapProject;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import model.Product;
@WebService(name="SoapProject",targetNamespace="SoapTarget")
@SOAPBinding(style=Style.DOCUMENT)
public interface ProductCatalogInterface {
	
	@WebMethod(action="fetch_categories",operationName="fetchCategories")
	public abstract List<String> getProductCatalog();
	
	@WebMethod
	public abstract List<String> getCatalog(String category);
	
	@WebMethod
	public abstract List<String> addProducts(String category, String product);
	
	@WebMethod
	@WebResult(name="Products")
	public abstract List<Product> getProducts(String category);

}