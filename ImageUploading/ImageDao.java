package com.Imadata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ImageDao {

	public static Connection getconnection()
	{
		Connection con=null;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/brassdata","root","");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return con;
	}
	
	public static java.util.List<ImageModel> getAll()
	{
		java.util.List<ImageModel> i = new ArrayList<ImageModel>();
		try {
			
			Connection con = ImageDao.getconnection();
			PreparedStatement ps= con.prepareStatement("Select im.Img_ID,it.IT_ID,it.IT_Name FROM tbl_image im, tbl_item_type it WHERE im.IT_ID = it.IT_ID");
			
			ResultSet rs = (ResultSet) ps.executeQuery();
			
			while(rs.next())
			{
				ImageModel d1 = new ImageModel();
				d1 = new ImageModel();
				d1.setId(rs.getInt("Img_ID"));
				d1.setItID(rs.getInt("IT_ID"));
				d1.setName(rs.getString("IT_Name"));
				i.add(d1);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return i;
	}
	
	public static int getITid(String nam)
	{
		int id=0;
		
		try {
			
			Connection con = ImageDao.getconnection();
			PreparedStatement ps = con.prepareStatement("Select IT_ID FROM tbl_item_type WHERE IT_Name=?");
			ps.setString(1, nam);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				id = rs.getInt("IT_ID");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		return id;
	}
}


