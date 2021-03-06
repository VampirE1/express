package emploeedataservice;

import java.rmi.RemoteException;

import po.EmploeePO;


public interface EmploeeDataService{
	public EmploeePO find(String ID ) throws RemoteException;
	
	public void insertEmp(String ID ) throws RemoteException;
	
	
	public void delete(String ID, EmploeePO po ) throws RemoteException;
	
	public void update(String ID, EmploeePO po ) throws RemoteException;
	
	public void modify(String ID, EmploeePO po ) throws RemoteException;
	
	
}

