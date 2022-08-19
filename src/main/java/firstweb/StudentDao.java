package firstweb;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.ModelAttribute;

public class StudentDao {
	private JdbcTemplate template;

	public boolean save(@ModelAttribute("student") Student s) {
		String save = "insert into student value (?,?,?,?)";
		return template.execute(save, new PreparedStatementCallback<Boolean>() {
			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setInt(1, s.getId());
				ps.setString(2, s.getName());
				ps.setString(3, s.getSex());
				ps.setString(4, s.getAddress());
				ps.execute();
				return ps.execute();
			}
		});
	}

	public Student getByID(int id) {
		return template.query("select * from student", new ResultSetExtractor<Student>() {

			@Override
			public Student extractData(ResultSet rs) throws SQLException, DataAccessException {
				Student s = new Student();
				while (rs.next()) {
					if (rs.getInt(1) == id) {
						s.setId(id);
						s.setName(rs.getString(2));
						s.setSex(rs.getString(3));
						s.setAddress(rs.getString(4));
					}
				}
				return s;
			}

		});
	}

	public boolean delete(int id) {
		return template.execute("delete from student where id='?'", new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setInt(1, id);
				return ps.execute();
			}
		});
	}

	public List<Student> getAll() {
		return template.query("select * from student", new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student s = new Student();
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setSex(rs.getString(3));
				s.setAddress(rs.getString(4));
				return s;
			}

		});
	}

	public boolean update(@ModelAttribute("student") Student s) {
		return template.execute("update student set name=? , sex=? , address=? where id = ?",
				new PreparedStatementCallback<Boolean>() {

					@Override
					public Boolean doInPreparedStatement(PreparedStatement ps)
							throws SQLException, DataAccessException {
						ps.setString(1, s.getName());
						ps.setString(2, s.getSex());
						ps.setString(3, s.getAddress());
						ps.setInt(4, s.getId());

						return ps.execute();
					}
				});

	}

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

}
