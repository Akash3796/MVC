package Layer.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Layer.Dao.EmpDao;
import Layer.Entities.Entities;

@Service
public class EmpService {
	
	@Autowired
	EmpDao ed;
	
	public boolean register(Entities e, String user) {
		
		 return ed.register(e, user);
	
	};
	
	
	public boolean update(Entities e) {
		
		 return ed.update(e);
	
	};
	
	
	public Entities delete(int id) {
		
		 return ed.delete(id);
	
	};
	
	
	public Entities select( int id) {
	
		return ed.select(id);

	};
	
	
	public List<Entities> selectAll(String user) {
		
		return ed.selectAll(user);

	};
	
}
