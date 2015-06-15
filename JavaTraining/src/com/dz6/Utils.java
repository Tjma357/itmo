package com.dz6;

import java.util.ArrayList;

public class Utils {
	public static District getDistrictByName(ArrayList<District> districts,
			String name) {
		for (District dist : districts) {
			if (name.toLowerCase().equals(
					(dist.getDist() + " район").toLowerCase())) {
				return dist;
			}
		}
		return districts.get(0);
	}

	public static String getDistrictNameByCode(ArrayList<District> districts,
			int code) {
		for (District dist : districts) {
			if (code == dist.getCode()) {
				return dist.getDist();
			}
		}
		return "Неизвестный";
	}
}