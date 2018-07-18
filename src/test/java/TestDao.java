import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.offcn.dao.StuDao;
import com.offcn.po.NewStudent;

public class TestDao {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-dao.xml");

		StuDao dao = context.getBean(StuDao.class);
		List<NewStudent> list = dao.getAllStu();
		for (NewStudent s : list) {
			System.out.println(s.getId()+" "+s.getName());
		}
	}

}
