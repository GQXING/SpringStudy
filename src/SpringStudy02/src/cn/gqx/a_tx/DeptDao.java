package cn.gqx.a_tx;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * daoʵ�֣�ʹ��spring��jdbc֧��
 * @author ������
 *
 */
public class DeptDao {
	//��������ע��JdbcTemplate����
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void save(Dept dept){
		String sql="insert into t_Dept(deptName) values(?)";
		jdbcTemplate.update(sql,dept.getDeptName());
	}
}
