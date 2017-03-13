package soapProject;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import model.Product;

@WebService(endpointInterface="soapProject.ProductCatalogInterface",portName="SoapProjectPort",
			serviceName="SoapService")
public class ProductCatalog implements ProductCatalogInterface {
	ProductCatalogImpl pci = new ProductCatalogImpl();
	/* (non-Javadoc)
	 * @see soapProject.ProductCatalogInterface#getProductCatalog()
	 */
	@Override
	public List<String> getProductCatalog(){
		return pci.getProductCatalog();
	}
	/* (non-Javadoc)
	 * @see soapProject.ProductCatalogInterface#getCatalog(java.lang.String)
	 */
	@Override
	public List<String> getCatalog(String category){
		return pci.getProducts(category);
	}
	/* (non-Javadoc)
	 * @see soapProject.ProductCatalogInterface#addProducts(java.lang.String, java.lang.String)
	 */
	@Override
	public List<String> addProducts(String category,String product){
		return pci.addProducts(category, product);
	}
	
	public List<Product> getProducts(String category){
		List<Product> products = new ArrayList<>();
		Product product = new Product("Book 1", "First Book", 123);
		Product product1 = new Product("Book 2", "Second Book", 200);
		products.add(product);
		products.add(product1);
		return products;
	}
}
