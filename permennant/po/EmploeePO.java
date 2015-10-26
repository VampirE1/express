package po;

import java.io.Serializable;
import java.util.ArrayList;

public class EmploeePO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String ID;//员工ID
	private String name;//员工姓名
	 private int age;//员工年龄
	 private String institution;//员工机构
	private double salary;//员工薪水
	private ArrayList<EmploeePO> emploee;
	
   public  EmploeePO(String ID){
	   this.ID=ID;
	   this.name=name;
	   this.age=age;
	   this.institution=institution;
	   this.salary=salary;
	    emploee = new ArrayList<EmploeePO>();
	}
   
}
