package strategydata;

import java.rmi.RemoteException;

import strategydataservice.StrategyDataService;

public class StrategyDataDriver {
	double weight=2.0;
	String departureplace="南京";
	String destination="北京";
    public  void drive(StrategyDataService StrategyDataStub) throws RemoteException{
    	StrategyDataStub.observe("salary");
    	StrategyDataStub.calprice(weight, departureplace, destination);
    }
}
