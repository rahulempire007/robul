package instatag.com.b3ds.models;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;

/**
 * Created by RahulReign on 21-04-2018.
 */

public class Prefhelper{
        private static Prefhelper instance;

        private SharedPreferences sharedPreferences;
        private String role;

        private Prefhelper(Context context) {
            sharedPreferences = context.getSharedPreferences("FreshDaililiesPref", Context.MODE_PRIVATE);
        }

        public static Prefhelper getInstance(Context context) {
            if (instance == null)
                instance = new Prefhelper(context);
            return instance;
        }

    public Location getLoc() {
        Location loc=new Location("");
        loc.setLatitude(Double.parseDouble(sharedPreferences.getString("lat","")));
        loc.setLongitude(Double.parseDouble(sharedPreferences.getString("long","")));
        return loc;
    }

    public void setLoc(Location loc) {

        this.loc = loc;
    sharedPreferences.edit().putString("lat",""+0).apply();
    sharedPreferences.edit().putString("long",""+0).apply();


    }

    Location loc;
}
