package Layer.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import Layer.Entities.Entities;

public class RowMap implements RowMapper<Entities> {

	public Entities mapRow(ResultSet rs, int rowNum) throws SQLException { 
		return new Entities(rs.getString(1), rs.getString(2), rs.getString(3),
							rs.getString(4), rs.getString(5));


}

}
