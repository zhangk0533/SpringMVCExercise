package com.zhangk.converts;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.zhangk.entity.Address;
import com.zhangk.entity.User;

@Component
public class UserConverts implements Converter<String, User> {

	@Override
	public User convert(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	public User convert(String source) {
		// TODO Auto-generated method stub
		String[] vals = source.split("-");
		if (vals != null && vals.length > 0) {
			String name  = vals[0];
			Integer age = Integer.parseInt(vals[1]);
			Integer gender = Integer.parseInt(vals[2]);
			String city = vals[3];
			String street = vals[4];
			Address address = new Address(city, street);
			User user = new User(0, name, age, gender, address);
			return user;

		}
		return null;
	}*/

}
