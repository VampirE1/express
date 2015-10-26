package demo;

import java.rmi.RemoteException;

import strategybl.StrategyBlDriver;
import strategybl.StrategyBlStub;
import strategydata.StrategyDataDriver;
import strategydata.StrategyDataStub;
import documentdata.DocumentDataDriver;
import documentdata.DocumentDataStub;
import docunemtbl.DocumentBlDriver;
import docunemtbl.DocumentBlStub;
import emploeedata.EmploeeDataDriver;
import emploeedata.EmploeeDataStub;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws RemoteException
    {   DocumentBlStub documentblstub=new DocumentBlStub();
        DocumentBlDriver documentbldriver=new DocumentBlDriver();
        documentbldriver.drive(documentblstub);
        StrategyBlStub strategyblstub=new StrategyBlStub();
        StrategyBlDriver strategybldriver=new StrategyBlDriver();
        strategybldriver.drive(strategyblstub);
        DocumentDataStub documentdatastub=new DocumentDataStub();
        DocumentDataDriver documentdatadriver=new DocumentDataDriver();
        documentdatadriver.drive(documentdatastub);
        EmploeeDataStub emploeedatastub=new  EmploeeDataStub();
        EmploeeDataDriver emploeedatadriver=new EmploeeDataDriver();
        emploeedatadriver.drive(emploeedatastub);
        StrategyDataStub strategydatastub=new StrategyDataStub();
        StrategyDataDriver strategydatadriver=new StrategyDataDriver();
        strategydatadriver.drive(strategydatastub);
    }
    
}
