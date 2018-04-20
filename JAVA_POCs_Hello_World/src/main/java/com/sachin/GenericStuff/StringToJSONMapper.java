package com.sachin.GenericStuff;

import org.json.JSONObject;

public class StringToJSONMapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "{\"loadts\":\"2018-03-29 05:23:38\",\"banner\":\"sears\",\"source\":\"RP\",\"price_change_request_id\":[\"S5abcbefdcf75007321f4508d\"],\"actio\":\"add\",\"offer_id\":\"6656\",\"store_group\":\"9300\",\"store_type\":\"S\",\"div_item\":[\"008-27417\"],\"deal_type\":\"PricePoint\",\"deal_value\":1.9,\"start_date\":\"2020-06-01\",\"start_time\":\"00:00:00\",\"end_date\":\"2020-06-05\",\"end_time\":\"23:59:59\",\"action_code\":\"A\",\"offer_base_price_type\":\"R\",\"product_level\":1,\"member_flag\":\"N\",\"always_wins\":\"Y\",\"points_offer_flag\":\"N\",\"is_deleted\":\"N\",\"is_whole_deleted\":\"N\",\"status\":0,\"message\":\"SUCCESS: Div Item Level Offer.  PROMOTION ADDED SUCCESSFULLY. RECORD DO NOT HAVE POINTS.\"}";
		
		try {
			JSONObject jsonO = new JSONObject(test);
			
			//if(jsonO.get("action").toString() != "delete")
			System.out.println(jsonO.get("action").toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
