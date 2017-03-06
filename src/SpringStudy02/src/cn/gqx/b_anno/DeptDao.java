package cn.gqx.b_anno;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * daoʵ�֣�ʹ��spring��jdbc֧��
 * @author ������
 *
 */
@Repository
public class DeptDao {
	//��������ע��JdbcTemplate����\
	@Resource
	private JdbcTemplate jdbcTemplate;
	
	public void save(Dept dept){
		String sql="insert into t_Dept(deptName) values(?)";
		jdbcTemplate.update(sql,dept.getDeptName());
	}
}
