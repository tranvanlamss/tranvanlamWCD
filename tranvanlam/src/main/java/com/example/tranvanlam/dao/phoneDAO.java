package com.example.tranvanlam.dao;

import com.example.tranvanlam.database.ConnectionUtil;
import com.example.tranvanlam.model.Phone;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class phoneDAO {
    Connection connection = ConnectionUtil.getConnection();

    public String insertPhone(Phone phone){
        String sql = "INSERT INTO phones(name, brand, price, description) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, phone.getName());
            ps.setString(2, phone.getBrand());
            ps.setInt(3, phone.getPrice());
            ps.setString(4, phone.getDescription());
            int isSuccess = ps.executeUpdate();
            if (isSuccess > 0 ){
                return "Success";
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return "Fail";
    }

    public List<Phone> getPhone(){
        List<Phone> list = new ArrayList<>();
        String sql = "SELECT * FROM phones";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                Phone phone = new Phone();
                phone.setName(rs.getString("name"));
                phone.setBrand(rs.getString("brand"));
                phone.setPrice(rs.getInt("price"));
                phone.setDescription(rs.getString("description"));
                list.add(phone);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    public List<Phone> getEmployeeById(int id){
        List<Phone> list = new ArrayList<>();
        String sql = "SELECT * FROM phones WHERE id = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()){

                Phone phone = new Phone();
                phone.setName(rs.getString("name"));
                phone.setBrand(rs.getString("brand"));
                phone.setPrice(rs.getInt("price"));
                phone.setDescription(rs.getString("description"));
                list.add(phone);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    public String updatePhone(Phone phone){
        String sql = "UPDATE phones SET  name = ?,brand = ?, price = ?, description = ? WHERE id = ?";
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, phone.getName());
            ps.setString(2, phone.getBrand());
            ps.setInt(3, phone.getPrice());
            ps.setString(4, phone.getDescription());
            int isSuccess = ps.executeUpdate();
            if (isSuccess > 0){
                return  "Success";
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return "Fail";
    }


}
