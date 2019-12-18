package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


@SpringBootApplication
@MapperScan("top.lrshuai.annotation.mapper")
public class DemoApplication {

	/*public static void main(String[] args) throws Exception{
		//SpringApplication.run(DemoApplication.class, args);
		Class.forName(" com.mysql.jdbc.Driver");//指定连接类型
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","root");///world
		PreparedStatement preparedStatement=connection.prepareStatement("select * from digui");
		ResultSet resultSet=preparedStatement.executeQuery();
		if(resultSet.next()){
			int row=resultSet.getRow();
			System.out.println(row);
		}
	}*/




}
