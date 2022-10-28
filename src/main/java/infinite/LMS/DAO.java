package infinite.LMS;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DAO {
	SessionFactory sessionFactory;
	
	public List<Employ> showEmploy() {
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession();
		
		Criteria criteria = session.createCriteria(Employ.class);
		List<Employ> employList = criteria.list();
		return employList;
	}
	
	public List<Employ> showEmploy(int id) {
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession();
		
		Query query = session.createQuery("from Employ where EMP_ID="+id);
		List<Employ> employList = query.list();
		return employList;
	}
	

	public List<Leave> showHistory(int id) {
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession();
		
		Query query = session.createQuery("from Leave where EMP_ID="+id);
		List<Leave> leaveHistory = query.list();
		return leaveHistory;
	}
	
	public List<Employ> subordinates(int mid) {
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession();
		
		Query query = session.createQuery("from Employ where EMP_MANAGER_ID="+mid);
		List<Employ> subordinateList = query.list();
		return subordinateList;
	}
	
	public List<Leave> showSubordinatePendingLeaves(int mid) {
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession();
		
		List<Employ> subordinateList = subordinates(mid);
		List<Leave> subordinatePendingLeaves = null;
		
		for (Employ employ : subordinateList) {
			Query query = session.createQuery("from Leave where LEAVE_STATUS = 'PENDING' AND EMP_ID="+ employ.getEmpId());
			
			if (query.list().size() > 0) {
				subordinatePendingLeaves = query.list();
			}
		}
		return subordinatePendingLeaves;
	}
	
//	public String approveOrDenyLeave(Leave leave) {
//		sessionFactory = SessionHelper.getConnection();
//		Session session = sessionFactory.openSession();
//		
//		Transaction transaction = session.beginTransaction();
//		session.Update(leave);
//		transaction.commit();
//		session.close();
//		
//		return "";
//	}
}
