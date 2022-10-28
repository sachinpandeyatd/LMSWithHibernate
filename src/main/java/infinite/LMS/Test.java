package infinite.LMS;

import java.util.List;

public class Test {
	public static void main(String[] args) {
		DAO dao = new DAO();
		List<Leave> skds = dao.showSubordinatePendingLeaves(1000);
		System.out.println("dhsjak"+skds.size());
	}
}
