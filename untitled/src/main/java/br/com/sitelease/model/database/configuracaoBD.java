package br.com.sitelease.model.database;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;

@Configuration
public class configuracaoBD {
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver"); //declara as configurações de acesso
        dataSource.setUrl("jdbc:postgresql://localhost:5432/loja");
        dataSource.setUsername("root");//usuario
        dataSource.setPassword("2001");//senha
        return dataSource;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabase(Database.POSTGRESQL); //driver do banco
        adapter.setShowSql(true); //mostrar no console o sql, é interessante
        adapter.setGenerateDdl(true);
       // adapter.setDatabasePlatform("org.hibernate.dialect.PostgreSQLDialect");
        adapter.setPrepareConnection(true);
        return adapter;
    }
}

/*

    DIFERENÇA ENTRE O JPA E O HIBERNATE

    1. JPA (java presistence api)

        Define um conjunto de regras e interfaces para mapeamento objeto-relacional
        (ORM), mas não implementa essas regras deretamente. É uma API padronizada
        que permite que voce trabalhe com persistência de dados em java, sem se
        preocupar com a implementação subjacente.

        Independencia de implementação: Como é uma especificação, podemos escolher
        diferentes implementações de JPA, como Hibernate, EclipseLink, OpenJPA, etc.

    2. Hibrenat

        É uma implentação do JPA: Hebernate é um framework que implementa a
        especificação JPA, além de fornecer funcionalidades adicionais que não
        fazem parte do JPA

        Oferece muitos recursos avançados que vão além do que a JPA especifica, como
        cahe de segundo nível, mapeamento de herança, e suporte a queries nativas
        SQL






 */