package com.never_forget;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by sotra on 5/24/2017.
 */
public class reciver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent action) {
        Log.e("dev" , "rec");

        if(BluetoothDevice.ACTION_ACL_CONNECTED.equals(action.getAction())){
            Log.e("dev" , "conected");
            //Do something with bluetooth device connection
        } else if (BluetoothDevice.ACTION_ACL_DISCONNECTED.equals(action.getAction())){
            //Do something with bluetooth device disconnection
            Log.e("dev" , "disconected");

        }
    }
}
