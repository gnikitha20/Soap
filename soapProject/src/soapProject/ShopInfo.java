package soapProject;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService
@SOAPBinding(style=Style.DOCUMENT, use=Use.LITERAL)
public class ShopInfo {
	@WebMethod
	@WebResult(partName="output")
	public String getShopInfo(@WebParam(partName="Input") String property) throws InvalidInputException{
		String response="Invalid Property";
		if("ShopName".equalsIgnoreCase(property)){
			response = "Test Mart";
		}else if("since".equals(property)){
			response= " Since 2012";
		}
		else {
			throw new InvalidInputException("Invalid Input", "Invalid Input Provided");
					
		}
		return response;
	}
}
