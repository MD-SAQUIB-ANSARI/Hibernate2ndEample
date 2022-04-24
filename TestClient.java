package Class2nd.Hibernateclass;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class TestClient 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session s = sf.openSession();
    	
    	
		//Employee emp=new Employee();
		//emp.setEmpNo(107);
		//emp.setEmpName("Sam");
		//emp.setEmpSal(1234);
		//Employee emp1=(Employee)s.get("com.mypack.employe.Employee", 101);
		//Employee emp1=s.get(Employee.class, 107);
		Employee emp1=s.load(Employee.class, 107);    // isme Transaction ki koi need nhi hai, tabi comment bnya hai
		System.out.println(" Emploe No: "+emp1.getEmpNo());
		System.out.println(" Emploe Name: "+emp1.getEmpName());
		System.out.println(" Emploe Sal: "+emp1.getEmpSal());
		
		//System.out.println(" Object is... "+emp1 );
		//s.delete(emp);
		//s.saveOrUpdate(emp);
		//s.update(emp);
		//Object o=s.save(emp);
		//s.persist(emp);
		
		//Transaction t=s.beginTransaction();
		//t.commit();
		System.out.println(" Object sucessfulli add");
		//System.out.println("Mesg is... "+o);
		s.close();
		sf.close();
    }
}
