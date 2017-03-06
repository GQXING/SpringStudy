package cn.gqx.test;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


//测试，日志传播行为
@Repository
public class LogDao {
	@Resource
	private JdbcTemplate jdbcTemplate;
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void save() {
		jdbcTemplate.update("insert into t_log values('保存数据了')");
	}
}
