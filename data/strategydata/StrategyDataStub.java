package strategydata;

import java.rmi.RemoteException;

import strategydataservice.StrategyDataService;

public class StrategyDataStub implements StrategyDataService{

	public void observe(String stra) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("observe strategy successfully");
	}

	public double calprice(double weight, String departureplace,
			String destination) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("30.2");
		return 30.1;
	}

}
