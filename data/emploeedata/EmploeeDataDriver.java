package emploeedata;

import java.rmi.RemoteException;

import po.EmploeePO;
import emploeedataservice.EmploeeDataService;

public class EmploeeDataDriver {
	public void drive(EmploeeDataService EmploeeDataStub) throws RemoteException{
		  EmploeeDataStub.find("231434");
		  EmploeeDataStub.insertEmp("231244");
		  EmploeeDataStub.delete("23144", new EmploeePO("2314231"));
		  EmploeeDataStub.update("1324214", new EmploeePO("2314231"));
		  EmploeeDataStub.modify("2134241", new EmploeePO("2314231"));
	  }
}
