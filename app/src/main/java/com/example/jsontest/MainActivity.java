package com.example.jsontest;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.jsontest.bean.ShopBean;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "hyc";
    String json = "{\"shop\":\n" +
            "[\n" +
            "{\"shopName\":\"电脑\",\"shopPrice\":\"213231\",\"shopId\":\"122\"},\n" +
            "{\"shopName\":\"衣服\",\"shopPrice\":\"21231\",\"shopId\":\"14\"},\n" +
            "{\"shopName\":\"冰箱\",\"shopPrice\":\"2213231\",\"shopId\":\"33\"}\n" +
            "]\n" +
            "}";
    List<ShopBean> list = new ArrayList<>();   //list存入多个对象

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * JsonToList
     *
     * @param view
     */
    public void jsonPlay(View view) {
        try {
            JSONObject jsonObject = new JSONObject(json);  //获取json对象
            JSONArray jsonArray = jsonObject.getJSONArray("shop"); //获取对象对应数组
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject childJson = jsonArray.getJSONObject(i);
                String name1 = childJson.getString("shopName");
                double name2 = childJson.getDouble("shopPrice");
                int name3 = childJson.getInt("shopId");
                Log.d(TAG, "商品名称---->>" + name1);
                Log.d(TAG, "商品价格---->>" + name2);
                Log.d(TAG, "商品ID---->>" + name3);

                ShopBean bean = new ShopBean();
                bean.setShopName(name1);
                bean.setShopPrice(name2);
                bean.setShopId(name3);
                list.add(bean);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    /**
     * ListToJson
     *
     * @param view
     */
    public void playListToJson(View view) {
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        //遍历list
        try {
            for (int i = 0; i < list.size(); i++) {
                JSONObject object = new JSONObject();
//取出对象
                object.put("shopName", list.get(i).getShopName());
                object.put("shopPrice", list.get(i).getShopPrice());
                object.put("shopId", list.get(i).getShopId());
//多个对象放入数组
                jsonArray.put(object);
            }
            jsonObject.put("shop", jsonArray);
            Log.d(TAG, "转换为Json---------->>" + jsonObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }
}