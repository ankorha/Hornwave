package com.gadgetsmend.vhicalowneralert;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class SaveSharedPreference {
    static final String PREF_VEHICLE_NO = "VehicleNo";

    static SharedPreferences getSharedPreferences(Context ctx) {
        return PreferenceManager.getDefaultSharedPreferences(ctx);
    }

    public static void setVehicleNo(Context ctx, String vehicle_no) {
        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
        editor.putString(PREF_VEHICLE_NO, vehicle_no);
        editor.commit();
    }

    public static String getVehicleNo(Context ctx) {
        return getSharedPreferences(ctx).getString(PREF_VEHICLE_NO, "");
    }

}