package bancoDeDados;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.IOException;
import java.util.List;

public class Conexao {
    private JdbcTemplate conexaoDoBanco;
    public Conexao() throws IOException {
        BasicDataSource dataSource = new BasicDataSource();

        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3308/dataSight");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");

        conexaoDoBanco = new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getConexaoDoBanco() throws IOException {
        return conexaoDoBanco;
    }

    public void selectBanco(){
        conexaoDoBanco.queryForObject("select 1", Integer.class);
    }

}
