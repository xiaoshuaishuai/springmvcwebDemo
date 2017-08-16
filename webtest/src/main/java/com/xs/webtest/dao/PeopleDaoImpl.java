package com.xs.webtest.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.xs.webtest.domain.People;
@Repository
public class PeopleDaoImpl implements IPeopleDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<People> list() {
		return jdbcTemplate.query("select * from people", new Object[0], new RowMapper<People>() {

			public People mapRow(ResultSet rs, int rowNum) throws SQLException {
				People p = new People();
				p.setId(rs.getInt("id"));
				p.setNamep(rs.getString("namep"));
				p.setDecp(rs.getString("decp"));
				return p;
			}
		});
	}

}
