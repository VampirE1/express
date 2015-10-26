package documentdata;

import java.rmi.RemoteException;

import po.DocumentPO;
import documentdataservice.DocumentDataService;

public class DocumentDataDriver {
  public void drive(DocumentDataService DocumentDataStub) throws RemoteException{
	  DocumentDataStub.getAll();
	  DocumentDataStub.find("231424");
	  DocumentDataStub.insert(new DocumentPO("2314"));
	  DocumentDataStub.delete(new DocumentPO("2321"));
	  DocumentDataStub.update(new DocumentPO("23124"));
	  DocumentDataStub.findmore("21442");
	  DocumentDataStub.finish();
  }
}
